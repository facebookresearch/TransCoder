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
public class MINIMUM_OPERATIONS_MAKE_GCD_ARRAY_MULTIPLE_K{
static int f_gold ( int a [ ] , int n , int k ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    if ( a [ i ] != 1 && a [ i ] > k ) {
      result = result + Math . min ( a [ i ] % k , k - a [ i ] % k ) ;
    }
    else {
      result = result + k - a [ i ] ;
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,7,27,32,36,37,44,48,50,64,86});
    param0.add(new int[]{-22,6,-20,60,-74,98,52,-22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{77,11,51,11,84,79,43,12,14,50,15,6,85,32,74,49,7,2,58});
    param0.add(new int[]{-90,-66,-64,-58,-46,-44,-32,-30,-30,-22,-18,-14,12,12,18,34,44,60,70,70,74,76,86,98,98});
    param0.add(new int[]{1,1,0,0,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,0,1,1});
    param0.add(new int[]{9,22,27,27,37,53,53,56,63,73,76,81,82});
    param0.add(new int[]{-46,60,80,80,42,-98,30,-48,4,-32,-78,40,52,26,88,4,22,62,88,-94,2,0,58,38,52,-50,-52,58,-62,30,-38,-8,-82,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{42,69,93,82,8,23,73,1,77,39,49,4,95,85});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(5);
    param1.add(23);
    param1.add(9);
    param1.add(12);
    param1.add(36);
    param1.add(10);
    param1.add(18);
    param1.add(19);
    param1.add(12);
    List<Integer> param2 = new ArrayList<>();
    param2.add(10);
    param2.add(4);
    param2.add(29);
    param2.add(17);
    param2.add(22);
    param2.add(31);
    param2.add(11);
    param2.add(19);
    param2.add(22);
    param2.add(13);
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