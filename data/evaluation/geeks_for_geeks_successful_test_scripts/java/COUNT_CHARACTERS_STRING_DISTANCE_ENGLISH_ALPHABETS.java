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
public class COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS{
static int f_gold ( String str ) {
  int result = 0 ;
  int n = str . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) if ( Math . abs ( str . charAt ( i ) - str . charAt ( j ) ) == Math . abs ( i - j ) ) result ++ ;
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("smnKL");
    param0.add("270083");
    param0.add("0");
    param0.add("kcZdsz");
    param0.add("483544224");
    param0.add("000011");
    param0.add("WysGCirMwKBzP");
    param0.add("3366");
    param0.add("110");
    param0.add("NlaMkpCjUgg");
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