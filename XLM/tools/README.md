# Tools

In `TransCoder/XLM/tools/`, you will need to install fastBPE:
## fastBPE
To get and compile fastBPE:
```
git clone https://github.com/glample/fastBPE
cd fastBPE
g++ -std=c++11 -pthread -O3 fastBPE/main.cc -IfastBPE -o fast
```
To get the python API (requires Cython)
```
python setup.py install
```
