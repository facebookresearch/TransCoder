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
public class MAXIMUM_SUBSEQUENCE_SUM_SUCH_THAT_NO_THREE_ARE_CONSECUTIVE{
static int f_gold ( int arr [ ] , int n ) {
  int sum [ ] = new int [ n ] ;
  if ( n >= 1 ) sum [ 0 ] = arr [ 0 ] ;
  if ( n >= 2 ) sum [ 1 ] = arr [ 0 ] + arr [ 1 ] ;
  if ( n > 2 ) sum [ 2 ] = Math . max ( sum [ 1 ] , Math . max ( arr [ 1 ] + arr [ 2 ] , arr [ 0 ] + arr [ 2 ] ) ) ;
  for ( int i = 3 ;
  i < n ;
  i ++ ) sum [ i ] = Math . max ( Math . max ( sum [ i - 1 ] , sum [ i - 2 ] + arr [ i ] ) , arr [ i ] + arr [ i - 1 ] + sum [ i - 3 ] ) ;
  return sum [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,6,8,9,10,10,16,17,17,20,21,22,23,28,29,32,36,37,40,41,42,43,47,47,48,48,49,49,52,52,53,59,61,64,65,79,79,81,87,91,92,98});
    param0.add(new int[]{98,76,-80,-30,82,52,-14,28,98,18,82,52,26,-62,-8});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{21,26,85,73,47,10,54,9,11,70,42,95,44,91});
    param0.add(new int[]{-94,-92,-90,-84,-76,-68,-60,-50,-34,-34,-20,-16,-6,18,50,54,66,70,96});
    param0.add(new int[]{1,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1});
    param0.add(new int[]{2,3,4,4,14,14,18,21,24,26,29,31,32,34,36,37,38,40,42,44,44,54,63,69,77,77,82,82,86,87,90,93,95});
    param0.add(new int[]{-46,64,-44,88,-74,54,40,-2,-24,94,40,-44,56,-54,-60,-86,-58,48,-90,12,-76,-30,94,-34,14,12,80,-40,60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{4,32,63,23,44,57,59,69,88,61,66,61,65,33,79,58,71,2,80,41,83,12,20,9,7,40,36,97,10,98,66,78,71,37,53});
    List<Integer> param1 = new ArrayList<>();
    param1.add(35);
    param1.add(7);
    param1.add(7);
    param1.add(12);
    param1.add(9);
    param1.add(16);
    param1.add(31);
    param1.add(22);
    param1.add(7);
    param1.add(26);
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