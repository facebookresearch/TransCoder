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
public class COMPOSITE_NUMBER{
static boolean f_gold ( int n ) {
  if ( n <= 1 ) System . out . println ( "False" ) ;
  if ( n <= 3 ) System . out . println ( "False" ) ;
  if ( n % 2 == 0 || n % 3 == 0 ) return true ;
  for ( int i = 5 ;
  i * i <= n ;
  i = i + 6 ) if ( n % i == 0 || n % ( i + 2 ) == 0 ) return true ;
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(62);
    param0.add(13);
    param0.add(29);
    param0.add(72);
    param0.add(30);
    param0.add(20);
    param0.add(10);
    param0.add(47);
    param0.add(91);
    param0.add(52);
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