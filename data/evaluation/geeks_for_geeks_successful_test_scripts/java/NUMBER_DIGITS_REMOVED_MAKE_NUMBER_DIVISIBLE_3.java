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
public class NUMBER_DIGITS_REMOVED_MAKE_NUMBER_DIVISIBLE_3{
static int f_gold ( String num ) {
  int n = num . length ( ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum += ( int ) ( num . charAt ( i ) ) ;
  if ( sum % 3 == 0 ) return 0 ;
  if ( n == 1 ) return - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( sum % 3 == ( num . charAt ( i ) - '0' ) % 3 ) return 1 ;
  if ( n == 2 ) return - 1 ;
  return 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("wVVe");
    param0.add("850390909067");
    param0.add("1110");
    param0.add("NRSAazejUS");
    param0.add("297975");
    param0.add("1");
    param0.add("ThYMuVOm");
    param0.add("1874418087476");
    param0.add("11011001001");
    param0.add("YJ");
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