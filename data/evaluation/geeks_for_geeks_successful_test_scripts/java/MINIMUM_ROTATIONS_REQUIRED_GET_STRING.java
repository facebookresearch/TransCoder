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
public class MINIMUM_ROTATIONS_REQUIRED_GET_STRING{
static int f_gold ( String str ) {
  String tmp = str + str ;
  int n = str . length ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    String substring = tmp . substring ( i , str . length ( ) ) ;
    if ( str == substring ) return i ;
  }
  return n ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("vdevdNdQSopPtj");
    param0.add("5");
    param0.add("100010101011");
    param0.add("tlDOvJHAyMllu");
    param0.add("06");
    param0.add("101");
    param0.add("DYgtU");
    param0.add("4");
    param0.add("00");
    param0.add("Dt");
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