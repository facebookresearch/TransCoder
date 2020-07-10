// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE{
static String f_gold ( String text , String word ) {
  String [ ] word_list = text . split ( "\\s+" ) ;
  String result = "" ;
  String stars = "" ;
  for ( int i = 0 ;
  i < word . length ( ) ;
  i ++ ) stars += '*' ;
  int index = 0 ;
  for ( String i : word_list ) {
    if ( i . compareTo ( word ) == 0 ) word_list [ index ] = stars ;
    index ++ ;
  }
  for ( String i : word_list ) result += i + ' ' ;
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("IggvAXtmJ");
    param0.add("76711241128");
    param0.add("010");
    param0.add("HIKOn");
    param0.add("3680369217");
    param0.add("1111");
    param0.add("zIi");
    param0.add("06");
    param0.add("111");
    param0.add("NJNnrVU");
    List<String> param1 = new ArrayList<>();
    param1.add("kzHdEJuCaO");
    param1.add("5");
    param1.add("0101001");
    param1.add("XlnBwpx");
    param1.add("017523");
    param1.add("1011");
    param1.add("ONNXygON");
    param1.add("54171617");
    param1.add("0010001011001");
    param1.add("AGwmS");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}