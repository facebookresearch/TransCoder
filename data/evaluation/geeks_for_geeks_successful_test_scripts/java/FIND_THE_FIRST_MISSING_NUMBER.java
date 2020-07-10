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
public class FIND_THE_FIRST_MISSING_NUMBER{
static int f_gold ( int array [ ] , int start , int end ) {
  if ( start > end ) return end + 1 ;
  if ( start != array [ start ] ) return start ;
  int mid = ( start + end ) / 2 ;
  if ( array [ mid ] == mid ) return f_gold ( array , mid + 1 , end ) ;
  return f_gold ( array , start , mid ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,6,7,9,11,14,18,30,30,32,32,34,37,44,45,45,48,48,48,52,58,60,63,67,69,69,81,83,87,89,97,99});
    param0.add(new int[]{88,-62,16,80,66,78,88,38,52,-96,48,98,96,-62,18,34,-58,30,-10,26,-98,48,-96,4,92,36,36,-36,-32,-70,62,-58,-58,-84,86,-98});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{79,99,79,85,61,58,62,61,39,87,39,74,36,70,30,43,20,52,54,50,81,98,42});
    param0.add(new int[]{-98,-72,-46,-44,-42,-40,-16,-4,62,70,74});
    param0.add(new int[]{1,1,0,1,0,0,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0});
    param0.add(new int[]{58});
    param0.add(new int[]{4,-84,-42,12,-50,42,-36,-38,-36,98,-2,20,6,-96,-78,24,34,88,0,74,0,-8,-86,-68,-42,98,-26,86,-70,-32,-82,78,46,58,84,4,-60,-90,-52,-78});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{8});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(19);
    param1.add(26);
    param1.add(20);
    param1.add(8);
    param1.add(26);
    param1.add(0);
    param1.add(37);
    param1.add(28);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(18);
    param2.add(26);
    param2.add(28);
    param2.add(20);
    param2.add(10);
    param2.add(23);
    param2.add(0);
    param2.add(31);
    param2.add(28);
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