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
public class SUM_OF_ALL_SUBSTRINGS_OF_A_STRING_REPRESENTING_A_NUMBER{
public static int f_gold ( String num ) {
  int n = num . length ( ) ;
  int sumofdigit [ ] = new int [ n ] ;
  sumofdigit [ 0 ] = num . charAt ( 0 ) - '0' ;
  int res = sumofdigit [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int numi = num . charAt ( i ) - '0' ;
    sumofdigit [ i ] = ( i + 1 ) * numi + 10 * sumofdigit [ i - 1 ] ;
    res += sumofdigit [ i ] ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("rA");
    param0.add("552541909988");
    param0.add("000110001");
    param0.add("s wXTz");
    param0.add("4");
    param0.add("0001");
    param0.add("EdZPQyLD F");
    param0.add("926277661");
    param0.add("1010110");
    param0.add("RfLyITyEE");
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