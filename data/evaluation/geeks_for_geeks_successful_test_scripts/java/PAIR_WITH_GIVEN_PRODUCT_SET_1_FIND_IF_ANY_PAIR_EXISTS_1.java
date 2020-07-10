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
public class PAIR_WITH_GIVEN_PRODUCT_SET_1_FIND_IF_ANY_PAIR_EXISTS_1{
static boolean f_gold ( int arr [ ] , int n , int x ) {
  HashSet < Integer > hset = new HashSet < > ( ) ;
  if ( n < 2 ) return false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == 0 ) {
      if ( x == 0 ) return true ;
      else continue ;
    }
    if ( x % arr [ i ] == 0 ) {
      if ( hset . contains ( x / arr [ i ] ) ) return true ;
      hset . add ( arr [ i ] ) ;
    }
  }
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,3,7,23,23,25,27,37,42,53,56,58,61,69,78,79,84,85,86,90,93,95});
    param0.add(new int[]{-10,-18,88,-36,78,66,-70,-34,-88,-98,-70,-4,-94,-92,-76,-78,-30,-48,-72,86,-64,38,-80,20,70,-32,-90,74,-78,12,-54,88,38,-96,28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1});
    param0.add(new int[]{83,61,55,89,16,78,44,54,22,49,58,62,53,99,35,83,29,19,96,39,60,6,34,67,43,29,46,3,81,78,80,39,86,78,21});
    param0.add(new int[]{-96,-88,-80,-62,-58,-56,-54,-52,-34,-20,-6,-2,6,20,52,54,70,72,80,82,94});
    param0.add(new int[]{0,1,1,0,0,1,1,1});
    param0.add(new int[]{8,11,11,20,22,23,26,27,31,38,40,40,45,46,46,48,50,61,73,76,78,78,79,80,81,84,90,91,93,95});
    param0.add(new int[]{18});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{19,37,47,40,72,59,51,53,92,3,21,81,29,48,97,59,10,74,11,37,49,95,88,85,6,26,76,33});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(17);
    param1.add(9);
    param1.add(23);
    param1.add(18);
    param1.add(4);
    param1.add(24);
    param1.add(0);
    param1.add(37);
    param1.add(22);
    List<Integer> param2 = new ArrayList<>();
    param2.add(17);
    param2.add(22);
    param2.add(5);
    param2.add(27);
    param2.add(12);
    param2.add(6);
    param2.add(28);
    param2.add(0);
    param2.add(39);
    param2.add(21);
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