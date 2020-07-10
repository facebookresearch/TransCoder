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
public class BINARY_SEARCH{
static int f_gold ( int arr [ ] , int l , int r , int x ) {
  if ( r >= l ) {
    int mid = l + ( r - l ) / 2 ;
    if ( arr [ mid ] == x ) return mid ;
    if ( arr [ mid ] > x ) return f_gold ( arr , l , mid - 1 , x ) ;
    return f_gold ( arr , mid + 1 , r , x ) ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,4,4,8,9,13,13,15,18,27,30,32,42,48,50,52,56,66,69,69,77,84,84,93});
    param0.add(new int[]{52,-58,-22,-80,44,-52,-34,94,-34,-74,42,60,-62,70,98,32,10,94,26,56,-48,-50,42,2,46,28,-68,-16,-96,-12,66,-46,74,-60,-52,28,-92,-78,32,28,16,34,30,-60,-14});
    param0.add(new int[]{0,1});
    param0.add(new int[]{28,84,40,81});
    param0.add(new int[]{-66,-62,-60,-56,-56,-2,40,44,50,74,82,94});
    param0.add(new int[]{1,0,0,0,0,1,0,1,0,1,1});
    param0.add(new int[]{15,26,31,36,36,61,68,72,75,79,82,98});
    param0.add(new int[]{0,-82,-94,48,48,-96,14,66,76,-30,86,28,-28,-66,-64,92,-94,-66,86,26,8,94,-82,-80,4,-26,76,-46,72,88,-6,8,-30,40,-88,2,-40,-98,-22,-20,4,-12,54,-20,-36,12});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{81,47});
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(40);
    param1.add(1);
    param1.add(2);
    param1.add(8);
    param1.add(7);
    param1.add(6);
    param1.add(38);
    param1.add(12);
    param1.add(1);
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(35);
    param2.add(1);
    param2.add(2);
    param2.add(6);
    param2.add(7);
    param2.add(7);
    param2.add(33);
    param2.add(10);
    param2.add(1);
    List<Integer> param3 = new ArrayList<>();
    param3.add(22);
    param3.add(44);
    param3.add(1);
    param3.add(2);
    param3.add(8);
    param3.add(10);
    param3.add(8);
    param3.add(39);
    param3.add(6);
    param3.add(1);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}