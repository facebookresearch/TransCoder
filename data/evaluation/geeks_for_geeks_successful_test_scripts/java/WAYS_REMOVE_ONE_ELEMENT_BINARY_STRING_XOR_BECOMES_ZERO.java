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
public class WAYS_REMOVE_ONE_ELEMENT_BINARY_STRING_XOR_BECOMES_ZERO{
static int f_gold ( String s ) {
  int one_count = 0 , zero_count = 0 ;
  char [ ] str = s . toCharArray ( ) ;
  int n = str . length ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( str [ i ] == '1' ) one_count ++ ;
  else zero_count ++ ;
  if ( one_count % 2 == 0 ) return zero_count ;
  return one_count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("KfcTJNP");
    param0.add("05312505872");
    param0.add("100111");
    param0.add("tDEEhKxrQ");
    param0.add("50824233019");
    param0.add("10001110010");
    param0.add("T SEZaNm MYQ");
    param0.add("838415739");
    param0.add("01110100");
    param0.add("WYQiAey H");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}