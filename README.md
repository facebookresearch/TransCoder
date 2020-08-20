# TransCoder

Pytorch original implementation of TransCoder in [Unsupervised Translation of Programming Languages](https://arxiv.org/pdf/2006.03511.pdf)
![Model](https://dl.fbaipublicfiles.com/transcoder/TransCoder_Schema.jpg)

## Dependencies
- Python 3
- [NumPy](http://www.numpy.org/)
- [PyTorch](http://pytorch.org/)
- [fastBPE](https://github.com/fairinternal/TransCoder_release/tree/master/XLM/tools#fastbpe) (generate and apply BPE codes)
- [Moses](https://github.com/fairinternal/TransCoder_release/tree/master/XLM/tools#tokenizers) (scripts to clean and tokenize text only - no installation required)
- [Apex](https://github.com/nvidia/apex#quick-start) (for fp16 training)
- [libclang](https://pypi.org/project/clang/) (for C++ tokenization) 
- [submitit](https://pypi.org/project/submitit/) (to run the preprocessing pipeline on remote machine) 
- [six](https://pypi.org/project/six/) 
- [sacrebleu](https://pypi.org/project/sacrebleu/) (`pip install sacrebleu=="1.2.11"`)
 
If your `libclang.so` is not in `/usr/lib/llvm-7/lib/`, replace the path to `libclang.so` to the correct path in `clang.cindex.Config.set_library_path('path_to_libclang')` in `code_tokenizer.py` 

If you run the data preprocessing pipeline, you will have to compile fastBPE. Go in XLM/tools/fastBPE and carry out the steps described in the [ReadMe](https://github.com/facebookresearch/TransCoder/blob/master/XLM/tools/README.md).

## Translate
Transcompilation between Java, C++ and Python 3.

The model can be tested on new inputs using the translate.py script.

For instance, `python translate.py --src_lang cpp --tgt_lang java --model_path trained_model.pth < input_code.cpp` will translate the C++ code contained in input_code.cpp to Java.

## Download a pre-trained model 
The model checkpoint (.pth file) are provided.
We used the validation set to select the best checkpoint for each language pair, and choose the model to use to compute the test scores. 
We selected:
 - [this model](https://dl.fbaipublicfiles.com/transcoder/model_1.pth) for C++ -> Java, Java -> C++ and Java -> Python
 - [this model](https://dl.fbaipublicfiles.com/transcoder/model_2.pth) for C++ -> Python, Python -> C++ and Python -> Java

## Run an evaluation

- Download the [test and validation data](https://dl.fbaipublicfiles.com/transcoder/TransCoder_test_val_data.zip) and unzip it. In that folder, the test and validation data are preprocessed (tokenized , BPE applied) and binarized to be used directly in XLM and to test the released model. We also release the raw data [here](https://github.com/fairinternal/TransCoder_release/blob/master/README.md#validation-and-test-sets-release).
- put all the binarized data into `data/XLM-cpp-java-python-with-comments`
- run XLM/train.py in eval_only mode. 
For instance:

```
python XLM/train.py 
--n_heads 8 
--bt_steps 'python_sa-cpp_sa-python_sa,cpp_sa-python_sa-cpp_sa,java_sa-cpp_sa-java_sa,cpp_sa-java_sa-cpp_sa,python_sa-java_sa-python_sa,java_sa-python_sa-java_sa' # The evaluator will use this parameter to infer the languages to test on 
--max_vocab '-1'  
--word_blank '0.1' 
--n_layers 6  
--generate_hypothesis true 
--max_len 512 
--bptt 256  
--fp16 true 
--share_inout_emb true 
--tokens_per_batch 6000 
--has_sentences_ids true 
--eval_bleu true  
--split_data false  
--data_path 'path_to_TransCoder_folder/data/XLM-cpp-java-python-with-comments'  
--eval_computation true 
--batch_size 32 
--reload_model 'model_1.pth,model_1.pth'  
--amp 2  
--max_batch_size 128 
--ae_steps 'cpp_sa,python_sa,java_sa' 
--emb_dim 1024 
--eval_only True 
--beam_size 10 
--retry_mistmatching_types 1 
--dump_path '/tmp/' 
--exp_name='eval_final_model_wc_30' 
--lgs 'cpp_sa-java_sa-python_sa' 
--encoder_only=False
```

## Train a new model

### Data needed
Data you need to pretrain a model with MLM:
- training data (monolingual): source code in each language  , ex: train.python.pth (actually you have 8 of these `train.python.[0..7].pth` because data is split on 8 gpu)
- test / valid data (monolingual): source code in each language to test perplexity of model , ex: `test.python.pth` / `valid.python.pth`

Data you need to train AE and BT :
- training data (monolingual): functions standalone in each language, ex: `train.python_sa.[0..7].pth` 
- test / valid data (monolingual + parallel):
   - monolingual functions to test perplexity of model, ex: `test.python_sa.pth` / `valid.python_sa.pth`
   - parallel functions to test the translation model (with BLEU and unit tests), ex: `test.python_sa-cpp_sa.pth` / `valid.python_sa-cpp_sa.pth`

All of these data should be contain in one folder. The path is given in the --data argument.
We provide the parallel test and validation data. See section [Run an evaluation](https://github.com/fairinternal/TransCoder_release/blob/master/README.md#run-an-evaluation) and [Validation and Test Sets Release](https://github.com/fairinternal/TransCoder_release/blob/master/README.md#validation-and-test-sets-release). To obtain all the monolingual data (all code/functions // train/test/valid) see the following section.

NB : In our case, the training data is too large to fit on a single machine. Thus, we split it into 8 binarized files and at training, we split the data across 8 GPU. If your training data can fit on a single machine, regroup all your training data into a single file for instance `train.python.pth`


### Download/preprocess data

To get the monolingual data, first download cpp / java / python source code from Google BigQuery (https://cloud.google.com/blog/products/gcp/github-on-bigquery-analyze-all-the-open-source-code). To run our preprocessing pipeline, you need to donwlaod the raw source code on your machine in json format, and put each programming language in a dedicated folder. A sample of it is given in data/test_dataset. The pipeline extracts source code from json, tokenizes it, extracts functions, applies bpe, binarizes the data and creates symlink with appropriate name to be used directly in XLM. The folder that ends with .XLM-syml is the data path you give for XLM traning. You will have to add the test and valid parallel we provide in "Run an evaluation" data to that folder. 

To test the pipeline run ```pytest preprocessing/test_preprocess.py```, you will see the pipeline output in data/test_dataset folder.

To run the pipeline (either locally or on remote machine ), command example:

``` 
python -m preprocessing.preprocess 
absolute_path_to_TranscCoder/data/test_dataset # path to the root folder where you have the json
--lang1 java # languages to prepocess
--lang2 python #
--lang3 cpp # can be None if you want to preprocess only 2 languages
--keep_comments True # True if you want to keep code comments in you code, False to remove them
--bpe_train_size 0 # Set the size of the training data subset on which the bpe codes are trained. 0 -> parameter disabled and all training data are used
--test_size 10 # size of test/validation sets , usually 1000, here 10 to test the command on the json samples
--local True # True if you want to launch the pipeline locally , False to launch on remote machine. In that case it uses submitit
```

If you want to preprocess another programming language, you have to implement the functions tokenize_newlang, detokenize_newlang, extract_function_newlang, get_function_name_newlang in preprocessing/src/code_tokenizer.py and run the pipeline with newlang.

NB: If you run the pipeline for cpp/java/python with --keep-comments True, you dont need to train the bpe codes and vocab, they are provided in data/bpe.cpp-java-python.with_comments. In the folder where have your json folders, you simply have to add a folder cpp-java-python.with_comments and copy the codes and vocab files. The pipeline will see it and pass the BPE traing step. 

### Pretrain a model with MLM
Example: 

```
python XLM/train.py 

--n_heads 8 
--bt_steps '' 
--max_vocab 64000 
--word_mask_keep_rand '0.8,0.1,0.1' 
--word_blank 0 
--data_path 'path_to_TransCoder_folder/data/XLM-cpp-java-python-with-comments' 
--save_periodic 0 
--bptt 512 
--lambda_clm 1 
--ae_steps '' 
--fp16 true 
--share_inout_emb true 
--lambda_mlm 1 
--sinusoidal_embeddings false 
--word_shuffle 0 
--mlm_steps 'cpp,java,python' 
--attention_dropout 0 
--split_data false 
--length_penalty 1 
--max_epoch 100000 
--stopping_criterion '_valid_mlm_ppl,10' 
--lambda_bt 1 
--dump_path '/output_folder_path' 
--lambda_mt 1 
--epoch_size 100000 
--early_stopping false 
--gelu_activation false 
--n_layers 6 
--optimizer 'adam_inverse_sqrt,warmup_updates=10000,lr=0.0003,weight_decay=0.01' 
--validation_metrics _valid_mlm_ppl 
--eval_bleu false 
--dropout '0.1' 
--mt_steps '' 
--reload_emb '' 
--batch_size 32 
--context_size 0 
--word_dropout 0 
--reload_model '' 
--min_count 0 
--lgs 'cpp-java-python' 
--sample_alpha 0 
--word_pred '0.15' 
--amp 2 
--max_batch_size 0 
--clip_grad_norm 5 
--emb_dim 1024 
--encoder_only true 
--beam_size 1 
--clm_steps '' 
--exp_name mlm_cpp_java_python_with_coms 
--lambda_ae 1 
--lg_sampling_factor '-1' 
--eval_only false
```

### Train a model with the denoising auto-encoder and back-translation objectives
Example:

```
python XLM/train.py 
--n_heads 8 
--bt_steps 'python_sa-cpp_sa-python_sa,cpp_sa-python_sa-cpp_sa,java_sa-cpp_sa-java_sa,cpp_sa-java_sa-cpp_sa,python_sa-java_sa-python_sa,java_sa-python_sa-java_sa' 
--max_vocab '-1' 
--word_mask_keep_rand '0.8,0.1,0.1' 
--gen_tpb_multiplier 1 
--word_blank '0.1' 
--n_layers 6 
--save_periodic 1 
--dump_path '/output_folder_path' 
--max_len 512 
--bptt 256 
--lambda_clm 1 
--ae_steps 'cpp_sa,python_sa,java_sa' 
--fp16 true 
--share_inout_emb true 
--lambda_mlm 1 
--sinusoidal_embeddings false 
--mlm_steps '' 
--word_shuffle 3 
--tokens_per_batch 6000 
--has_sentences_ids true 
--attention_dropout 0 
--split_data false 
--length_penalty 1 
--max_epoch 10000000 
--stopping_criterion '' 
--lambda_bt 1 
--generate_hypothesis true 
--lambda_mt 1 
--epoch_size 30000 
--data_path 'path_to_TransCoder_folder/data/XLM-cpp-java-python-with-comments' 
--gelu_activation false 
--split_data_accross_gpu global 
--optimizer 'adam_inverse_sqrt,warmup_updates=10000,lr=0.0001,weight_decay=0.01' 
--eval_computation true 
--validation_metrics '' 
--eval_bleu true 
--dropout '0.1' 
--mt_steps '' 
--reload_emb '' 
--batch_size 32 
--context_size 0 
--word_dropout '0.1' 
--reload_model 'path_to_MLM_checkpoint,path_to_MLM_checkpoint' 
--min_count 0 
--eval_bleu_test_only false 
--group_by_size true 
--early_stopping false 
--sample_alpha 0 
--word_pred '0.15' 
--amp 2 
--max_batch_size 128 
--clip_grad_norm 5 
--emb_dim 1024 
--encoder_only false 
--lgs 'cpp_sa-java_sa-python_sa' 
--clm_steps '' 
--exp_name bt_with_comments_sa_final_modif_test 
--beam_size 1 
--lambda_ae '0:1,100000:0.1,300000:0' 
--lg_sampling_factor '-1' 
--eval_only false
```

## Train in multi GPU
To train a model in multi GPU replace `python XLM/train.py` with:

```
export NGPU=2; python -m torch.distributed.launch --nproc_per_node=$NGPU XLM/train.py
```

## Validation and Test Sets Release

We release our validation and test dataset. You can download the raw data [here](https://dl.fbaipublicfiles.com/transcoder/TransCoder_tokenized_test_set_functions.zip). 

The format of each line in each file is `<FUNCTION_ID> | <function>`. The function are tokenized. You can detokenize them with the script preprocessing/detokenize.py. You can extract the function id and use it to find the corresponding test script in `data/evaluation/geeks_for_geeks_successful_test_scripts/<language>` if it exists.

For instance, for the line `COUNT_SET_BITS_IN_AN_INTEGER_3 | <function>` in the file test.cpp.shuf.valid.tok, the corresponding test script can be found in `data/evaluation/geeks_for_geeks_successful_test_scripts/cpp/COUNT_SET_BITS_IN_AN_INTEGER_3.cpp`. 
If the script is missing, it means there was an issue with our automatically created tests for the corresponding function.

The code generated by your model can be tested by injecting it where the `TO_FILL` comment is in the test script.

## Little guide to download Github from Google Big Query

- Create a Google platform account ( you will have around 300 $ given for free , that is sufficient for Github)
- Create a Google Big Query project here
- In this project, create a dataset
- In this dataset, create one table per programming language. The results of each SQL request (one per language) will be stored in these tables.
- Before running your SQL request, make sure you change the query settings to save the query results in the dedicated table (more -> Query Settings -> Destination -> table for query results -> put table name)
- Run your SQL request (one per language and dont forget to change the table for each request)
- Export your results to google Cloud :
  - In google cloud storage, create a bucket and a folder per language into it
  - Export your table to this bucket ( EXPORT -> Export to GCS -> export format JSON , compression GZIP)
- To download the bucket on your machine, use the API gsutil:
  - pip install gsutil
  - gsutil config -> to config gsutil with your google account
  - gsutil -m cp -r gs://name_of_bucket/name_of_folder . -> copy your bucket on your machine

Example of query for python :
```
SELECT 
 f.repo_name,
 f.ref,
 f.path,
 c.copies,
 c.content
FROM `bigquery-public-data.github_repos.files` as f
  JOIN `bigquery-public-data.github_repos.contents` as c on f.id = c.id
WHERE 
  NOT c.binary
  AND f.path like '%.py'
```

Google link for more info here

## References
This Code was used to train and evaluate the TransCoder model in:

[1] M.A. Lachaux*, B. Roziere*, L. Chanussot, G. Lample [Unsupervised Translation of Programming Languages](https://arxiv.org/pdf/2006.03511.pdf).

\* Equal Contribution

```
@article{lachaux2020unsupervised,
  title={Unsupervised Translation of Programming Languages},
  author={Lachaux, Marie-Anne and Roziere, Baptiste and Chanussot, Lowik and Lample, Guillaume},
  journal={arXiv preprint arXiv:2006.03511},
  year={2020}
}
```

## License

`TransCoder` is under the license detailed in the Creative Commons Attribution-NonCommercial 4.0 International license. See LICENSE for more details.
