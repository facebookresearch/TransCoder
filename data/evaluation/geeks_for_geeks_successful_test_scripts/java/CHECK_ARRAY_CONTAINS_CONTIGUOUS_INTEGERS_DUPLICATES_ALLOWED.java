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
public class CHECK_ARRAY_CONTAINS_CONTIGUOUS_INTEGERS_DUPLICATES_ALLOWED{
static boolean f_gold ( int arr [ ] , int n ) {
  int max = Integer . MIN_VALUE ;
  int min = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    max = Math . max ( max , arr [ i ] ) ;
    min = Math . min ( min , arr [ i ] ) ;
  }
  int m = max - min + 1 ;
  if ( m > n ) return false ;
  boolean visited [ ] = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) visited [ arr [ i ] - min ] = true ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) if ( visited [ i ] == false ) return false ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,4,19,25,65,72,75,83,90,92});
    param0.add(new int[]{46,2,28,-44,74,-36,-8,30,-96,60,52,-58,16,-38,78,38,-28,16,26,-42,48,40,6,72});
    param0.add(new int[]{0,1,1,1});
    param0.add(new int[]{50,21,9,29,86,2,82,49,34,18,77,83,44,67,85,58,15,85,22,3,39,67,42,37,6,35,18,57,41,32,39,30,41,68,84,36,64,36});
    param0.add(new int[]{-92,-82,-80,-78,-66,-66,-62,-58,-54,-52,-48,-30,-26,-22,-20,-20,-18,-14,-2,12,20,24,26,26,28,28,32,36,42,48,50,52,56,64,70,72,72,80,82,84,86,92});
    param0.add(new int[]{1,0,0,1,0,0,1,0,0,1,1,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,1,1,0,1,1,1,0,0,1,0,1,0,0,0,0});
    param0.add(new int[]{18,19,21,23,30,33,38,40,45,56,63,68,93,96});
    param0.add(new int[]{20,-90,-42,48,18,-46,82,-12,-88,82,62,24,20,64,-68,-34,-38,8,-54,-20,-92,34,-90,78,18,8,-6,10,98,-24,72,-92,76,-22,12,-44,2,68,-72,42,34,20,-48});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{81,25,50,48,35,38,49,21,47,94,94,55,23,45,92,23,93,33,64,9,90,64,81,17,2,73,8,7,35,36,72});
    List<Integer> param1 = new ArrayList<>();
    param1.add(8);
    param1.add(14);
    param1.add(2);
    param1.add(23);
    param1.add(26);
    param1.add(43);
    param1.add(8);
    param1.add(34);
    param1.add(8);
    param1.add(27);
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