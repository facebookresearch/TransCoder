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
public class MAXIMIZE_ARRJ_ARRI_ARRL_ARRK_SUCH_THAT_I_J_K_L{
static int f_gold ( int [ ] arr , int n ) {
  if ( n < 4 ) {
    System . out . println ( "The array should have" + " atleast 4 elements" ) ;
  }
  int table1 [ ] = new int [ n + 1 ] ;
  int table2 [ ] = new int [ n ] ;
  int table3 [ ] = new int [ n - 1 ] ;
  int table4 [ ] = new int [ n - 2 ] ;
  Arrays . fill ( table1 , Integer . MIN_VALUE ) ;
  Arrays . fill ( table2 , Integer . MIN_VALUE ) ;
  Arrays . fill ( table3 , Integer . MIN_VALUE ) ;
  Arrays . fill ( table4 , Integer . MIN_VALUE ) ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    table1 [ i ] = Math . max ( table1 [ i + 1 ] , arr [ i ] ) ;
  }
  for ( int i = n - 2 ;
  i >= 0 ;
  i -- ) {
    table2 [ i ] = Math . max ( table2 [ i + 1 ] , table1 [ i + 1 ] - arr [ i ] ) ;
  }
  for ( int i = n - 3 ;
  i >= 0 ;
  i -- ) table3 [ i ] = Math . max ( table3 [ i + 1 ] , table2 [ i + 1 ] + arr [ i ] ) ;
  for ( int i = n - 4 ;
  i >= 0 ;
  i -- ) table4 [ i ] = Math . max ( table4 [ i + 1 ] , table3 [ i + 1 ] - arr [ i ] ) ;
  return table4 [ 0 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{18,27,36,51,67,70,71,72,79,85,86,89,93,94,97});
    param0.add(new int[]{4,70,88,90,-34,-4,-36,-38,16,-46,-60,-50,-72,-68,-42,-96,46,32,-80,46,-4,-86,-72,16,40,-74,78,-64,-38});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1});
    param0.add(new int[]{67,75,6,31,18,44,55,99,83,8});
    param0.add(new int[]{-94,-94,-84,-82,-74,-70,-70,-70,-56,-56,-52,-50,-48,-46,-44,-38,-36,-34,-34,-28,-26,-16,-16,0,0,2,2,4,6,10,24,30,32,32,34,36,48,62,64,78,78,84,90,92});
    param0.add(new int[]{0,1,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,0,1,1,0,1,1});
    param0.add(new int[]{1,6,15,20,21,23,24,25,25,40,44,46,59,61,63,68,69,69,72,76,76,79,79,87,88,89,94,94,99});
    param0.add(new int[]{8,70,-66,0,-82,-72,64,-88,40,10,24,-20,88});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{15,89,48,67,30,95,8,22,41,22,12,18,23,15,33,41,50,77,71,53,11,9,53,42,61,56,25,57,28,48,14,86,95,74,54,70,12,36,1,18,42,35,94,18,54,35,1,95,53});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(24);
    param1.add(8);
    param1.add(9);
    param1.add(36);
    param1.add(14);
    param1.add(16);
    param1.add(7);
    param1.add(28);
    param1.add(37);
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