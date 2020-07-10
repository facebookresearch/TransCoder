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
public class LONGEST_SUBARRAY_COUNT_1S_ONE_COUNT_0S{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > um = new HashMap < Integer , Integer > ( ) ;
  int sum = 0 , maxLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] == 0 ? - 1 : 1 ;
    if ( sum == 1 ) maxLen = i + 1 ;
    else if ( ! um . containsKey ( sum ) ) um . put ( sum , i ) ;
    if ( um . containsKey ( sum - 1 ) ) {
      if ( maxLen < ( i - um . get ( sum - 1 ) ) ) maxLen = i - um . get ( sum - 1 ) ;
    }
  }
  return maxLen ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,10,31,35});
    param0.add(new int[]{4,88,-72,28,-54,32,-34});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{39,22,15,10,34,87,46,83,74,77,61,90,43,67,64,72,92,52,68,53,67,32,82,76,76,47,74,47,8,80,85,58,75});
    param0.add(new int[]{-82,-58,-50,-30,-14,-4,-2,-2,0,22,36,58,70,80,80,82,84,90});
    param0.add(new int[]{1,0,1,0,0,1,1,1,0,0,1});
    param0.add(new int[]{4,11,17,21,21,22,30,31,36,37,39,40,45,46,47,48,52,53,53,60,60,65,66,66,67,67,87,88,91,97});
    param0.add(new int[]{-4,-60,-78,-50,64,18,0,76,12,86,-22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{4,39,50,37,71,66,55,34,1,41,34,99,69,31});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(6);
    param1.add(4);
    param1.add(26);
    param1.add(14);
    param1.add(7);
    param1.add(29);
    param1.add(7);
    param1.add(17);
    param1.add(11);
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