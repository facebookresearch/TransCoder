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
public class PROGRAM_FIND_STRING_START_END_GEEKS{
static boolean f_gold ( String str , String corner ) {
  int n = str . length ( ) ;
  int cl = corner . length ( ) ;
  if ( n < cl ) return false ;
  return ( str . substring ( 0 , cl ) . equals ( corner ) && str . substring ( n - cl , n ) . equals ( corner ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("geeksmanishgeeks");
    param0.add("shreyadhatwalia");
    param0.add("10000100");
    param0.add("abaa");
    param0.add("30645530");
    param0.add("0000011011001");
    param0.add("dkqEd");
    param0.add("48694119324654");
    param0.add("1101010010");
    param0.add("Ks");
    List<String> param1 = new ArrayList<>();
    param1.add("geeks");
    param1.add("abc");
    param1.add("100");
    param1.add("a");
    param1.add("30");
    param1.add("001");
    param1.add("d");
    param1.add("654");
    param1.add("11");
    param1.add("KsFLmngGGOmHKs");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}