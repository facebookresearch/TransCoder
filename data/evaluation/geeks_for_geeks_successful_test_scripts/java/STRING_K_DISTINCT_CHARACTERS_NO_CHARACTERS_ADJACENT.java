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
public class STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT{
static String f_gold ( int n , int k ) {
  String res = "" ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) res = res + ( char ) ( 'a' + i ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n - k ;
  i ++ ) {
    res = res + ( char ) ( 'a' + count ) ;
    count ++ ;
    if ( count == k ) count = 0 ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(60);
    param0.add(56);
    param0.add(16);
    param0.add(42);
    param0.add(55);
    param0.add(64);
    param0.add(68);
    param0.add(88);
    param0.add(64);
    param0.add(42);
    List<Integer> param1 = new ArrayList<>();
    param1.add(71);
    param1.add(17);
    param1.add(16);
    param1.add(60);
    param1.add(56);
    param1.add(59);
    param1.add(24);
    param1.add(2);
    param1.add(94);
    param1.add(79);
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