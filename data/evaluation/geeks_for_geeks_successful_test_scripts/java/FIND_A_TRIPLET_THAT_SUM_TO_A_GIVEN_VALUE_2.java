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
public class FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE_2{
static boolean f_gold ( int A [ ] , int arr_size , int sum ) {
  for ( int i = 0 ;
  i < arr_size - 2 ;
  i ++ ) {
    HashSet < Integer > s = new HashSet < Integer > ( ) ;
    int curr_sum = sum - A [ i ] ;
    for ( int j = i + 1 ;
    j < arr_size ;
    j ++ ) {
      if ( s . contains ( curr_sum - A [ j ] ) && curr_sum - A [ j ] != ( int ) s . toArray ( ) [ s . size ( ) - 1 ] ) {
        System . out . printf ( "Triplet is %d, %d, %d" , A [ i ] , A [ j ] , curr_sum - A [ j ] ) ;
        return true ;
      }
      s . add ( A [ j ] ) ;
    }
  }
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,6,8,8,9,11,13,13,15,17,21,24,38,38,42,43,46,46,47,54,55,56,57,58,60,60,60,62,63,63,65,66,67,67,69,81,84,84,85,86,95,99});
    param0.add(new int[]{20,-86,-24,38,-32,-64,-72,72,68,94,18,-60,-4,-18,-18,-70,6,-86,46,-16,46,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{13,96,31,39,23,39,50,10,21,64,41,54,44,97,24,91,79,86,38,49,77,71,8,98,85,36,37,65,42,48});
    param0.add(new int[]{-86,-68,-58,-56,-54,-54,-48,-40,-36,-32,-26,-16,-14,-12,-12,-4,-4,-4,0,10,22,22,30,54,62,68,88,88});
    param0.add(new int[]{0,1,1,1,1,0,0});
    param0.add(new int[]{8,8,9,13,20,24,29,52,53,96});
    param0.add(new int[]{18,-92,-10,26,58,-48,38,66,-98,-72,4,76,-52,20,60,-56,96,60,-10,-26,-64,-66,-22,-86,74,82,2,-14,76,82,40,70,-40,-2,-46,-38,22,98,58});
    param0.add(new int[]{1,1,1,1});
    param0.add(new int[]{72});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(21);
    param1.add(17);
    param1.add(17);
    param1.add(21);
    param1.add(5);
    param1.add(9);
    param1.add(30);
    param1.add(2);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(24);
    param2.add(20);
    param2.add(13);
    param2.add(18);
    param2.add(25);
    param2.add(3);
    param2.add(8);
    param2.add(30);
    param2.add(2);
    param2.add(0);
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