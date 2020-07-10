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
public class DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS{
static String f_gold ( int n ) {
  if ( n == 0 ) return "0" ;
  String bin = "" ;
  while ( n > 0 ) {
    bin = ( ( n & 1 ) == 0 ? '0' : '1' ) + bin ;
    n >>= 1 ;
  }
  return bin ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(35);
    param0.add(17);
    param0.add(8);
    param0.add(99);
    param0.add(57);
    param0.add(39);
    param0.add(99);
    param0.add(14);
    param0.add(22);
    param0.add(7);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}