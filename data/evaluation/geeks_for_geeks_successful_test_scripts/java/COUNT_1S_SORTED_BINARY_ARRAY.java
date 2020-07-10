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
public class COUNT_1S_SORTED_BINARY_ARRAY{
static int f_gold ( int arr [ ] , int low , int high ) {
  if ( high >= low ) {
    int mid = low + ( high - low ) / 2 ;
    if ( ( mid == high || arr [ mid + 1 ] == 0 ) && ( arr [ mid ] == 1 ) ) return mid + 1 ;
    if ( arr [ mid ] == 1 ) return f_gold ( arr , ( mid + 1 ) , high ) ;
    return f_gold ( arr , low , ( mid - 1 ) ) ;
  }
  return 0 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,21,38,46,89,91});
    param0.add(new int[]{-48,46,12,-68,-82,-16,86,32,98,86,44,-86,60,-28,-60,-6,12,88,-82,-84,28,4,64,30,82,94,64,-34,-46,90,60,52,46,-24,10});
    param0.add(new int[]{0,0,1,1});
    param0.add(new int[]{19,99,62,68,41,32,55,20,1,18,5,73,10,17,7,19,18,51,88,47,36,80,3,75,35,67,7,83,36,70,19,95,15,61,99,88,26});
    param0.add(new int[]{-98,-98,-94,-92,-84,-74,-32,-14,0,0,6,36,48,50,52,60,64,68,72,84,86,88,96});
    param0.add(new int[]{1,0,0,0,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,1,1,1,0});
    param0.add(new int[]{2,4,4,8,9,13,16,16,18,19,20,21,22,26,27,28,29,30,37,40,40,41,48,51,54,54,55,61,66,67,68,74,75,77,77,80,80,81,82,84,84,86,88,90,91,95});
    param0.add(new int[]{18,78,96,10,82,66,60,-48,-96,72,-66,72,-6,-84,28,90,-50,70,-6,-30,-20,94,30,-56,-16,-52,-16,76,36,50,70,-22,76,-16,-84,-44,-14,-22,-78,86,-60,-4,-22,76,20,56});
    param0.add(new int[]{0});
    param0.add(new int[]{38,25,44,82,89,86,5,22});
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(27);
    param1.add(3);
    param1.add(33);
    param1.add(11);
    param1.add(14);
    param1.add(29);
    param1.add(29);
    param1.add(0);
    param1.add(5);
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(27);
    param2.add(3);
    param2.add(28);
    param2.add(14);
    param2.add(15);
    param2.add(36);
    param2.add(29);
    param2.add(0);
    param2.add(5);
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