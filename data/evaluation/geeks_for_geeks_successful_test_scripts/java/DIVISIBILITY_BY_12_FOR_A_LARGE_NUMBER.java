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
public class DIVISIBILITY_BY_12_FOR_A_LARGE_NUMBER{
static boolean f_gold ( String num ) {
  if ( num . length ( ) >= 3 ) {
    int d1 = ( int ) num . charAt ( num . length ( ) - 1 ) ;
    if ( d1 % 2 != 0 ) return false ;
    int d2 = ( int ) num . charAt ( num . length ( ) - 2 ) ;
    int sum = 0 ;
    for ( int i = 0 ;
    i < num . length ( ) ;
    i ++ ) sum += num . charAt ( i ) ;
    return ( sum % 3 == 0 && ( d2 * 10 + d1 ) % 4 == 0 ) ;
  }
  else {
    int number = Integer . parseInt ( num ) ;
    return ( number % 12 == 0 ) ;
  }
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("12244824607284961224");
    param0.add("392603977949");
    param0.add("11101001111");
    param0.add("92387493287593874594898678979792");
    param0.add("2233244912");
    param0.add("10101");
    param0.add("12");
    param0.add("254535361");
    param0.add("1");
    param0.add("hMPxVMpOBt");
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