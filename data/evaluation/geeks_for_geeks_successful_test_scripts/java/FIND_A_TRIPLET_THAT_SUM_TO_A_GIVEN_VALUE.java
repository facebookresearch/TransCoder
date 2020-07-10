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
public class FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE{
static boolean f_gold ( int A [ ] , int arr_size , int sum ) {
  int l , r ;
  for ( int i = 0 ;
  i < arr_size - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < arr_size - 1 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < arr_size ;
      k ++ ) {
        if ( A [ i ] + A [ j ] + A [ k ] == sum ) {
          System . out . print ( "Triplet is " + A [ i ] + ", " + A [ j ] + ", " + A [ k ] ) ;
          return true ;
        }
      }
    }
  }
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{15,18,38,47,75,88});
    param0.add(new int[]{28,-2,62,38,86,-86,56,58,96,6,-28,8,68,-16,-80,-4,98,-92,4,-4,58,-62,46,64});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{19,77,17,91,6,35,22,4,30,23,97,56,78,16,22,23,95,57,43,27,47,44,23,10,3,94,55,22,93,32,89,28,64,22,13,24,38,44,6,1,80});
    param0.add(new int[]{-98,-98,-94,-88,-80,-74,-68,-68,-64,-44,-36,-24,-10,-8,-8,0,4,6,8,8,12,14,16,38,50,52,54,56,66,68,76,88});
    param0.add(new int[]{1,1,0,0,1,0,1,1});
    param0.add(new int[]{7,22,24,30,42,44,49,49,65,70,70,74,74,75,90,95,96});
    param0.add(new int[]{40,-76,-68,-86,-14,82,-20,54,-26,56,-24,-44,44,60,52,-20,80,-24,-90,-30,-2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{33,92,6,99,83,97,49,97,85,52});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(22);
    param1.add(27);
    param1.add(22);
    param1.add(18);
    param1.add(4);
    param1.add(8);
    param1.add(11);
    param1.add(15);
    param1.add(6);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(18);
    param2.add(23);
    param2.add(29);
    param2.add(19);
    param2.add(5);
    param2.add(13);
    param2.add(18);
    param2.add(17);
    param2.add(7);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}