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
public class COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS{
static int f_gold ( String s ) {
  int result = 0 ;
  int n = s . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i ;
  j < n ;
  j ++ ) if ( s . charAt ( i ) == s . charAt ( j ) ) result ++ ;
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("LZIKA");
    param0.add("0556979952");
    param0.add("110010");
    param0.add("kGaYfd");
    param0.add("413567670657");
    param0.add("01001");
    param0.add("EQPuFa");
    param0.add("48848378");
    param0.add("110");
    param0.add("PLehNeP");
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