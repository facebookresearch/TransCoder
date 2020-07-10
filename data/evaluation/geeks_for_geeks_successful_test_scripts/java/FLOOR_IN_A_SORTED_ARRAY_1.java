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
public class FLOOR_IN_A_SORTED_ARRAY_1{
static int f_gold ( int arr [ ] , int low , int high , int x ) {
  if ( low > high ) return - 1 ;
  if ( x >= arr [ high ] ) return high ;
  int mid = ( low + high ) / 2 ;
  if ( arr [ mid ] == x ) return mid ;
  if ( mid > 0 && arr [ mid - 1 ] <= x && x < arr [ mid ] ) return mid - 1 ;
  if ( x < arr [ mid ] ) return f_gold ( arr , low , mid - 1 , x ) ;
  return f_gold ( arr , mid + 1 , high , x ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,11,20,42,42,55,58,98,99});
    param0.add(new int[]{50,-90,-38,-46,-10,-22,-66,72,-52,38,90,34,-12,-44,-6,0,-20,-38,86,26,64,-24,40,90,-26,-2,-28,12,22,-14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{69,28,68,98,24,67,86,2,18,22,44,77,52,62,24,46});
    param0.add(new int[]{-96,-94,-88,-84,-68,-60,-52,-52,-42,-34,-32,-16,-12,-6,-6,-4,-2,0,16,18,38,58,70,72,76,78,90,92,98});
    param0.add(new int[]{0,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,1,1,1,1,1,0,0,1,0,0});
    param0.add(new int[]{1,6,7,9,10,11,19,19,22,22,26,34,36,37,37,38,39,40,49,54,60,62,65,67,71,76,78,79,82,82,89,95,97});
    param0.add(new int[]{76,-32,-98,-18,-80,74,-22,-82,40,-64,58,-18,-64,34,-44,-82,-46,62,-80,-76,32,44,-32,98,-26,62,16,86,-52,-72,-90,-30,6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{81,69,15,52,49,54,18,92,33,21,91,21,5,25,77,92,26,58,72,55,76,18,13,59,9,12,31,24,36,33,71,87,55,19,42,25});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(26);
    param1.add(11);
    param1.add(15);
    param1.add(22);
    param1.add(24);
    param1.add(22);
    param1.add(28);
    param1.add(28);
    param1.add(35);
    List<Integer> param2 = new ArrayList<>();
    param2.add(7);
    param2.add(28);
    param2.add(9);
    param2.add(11);
    param2.add(27);
    param2.add(15);
    param2.add(26);
    param2.add(31);
    param2.add(29);
    param2.add(19);
    List<Integer> param3 = new ArrayList<>();
    param3.add(6);
    param3.add(23);
    param3.add(18);
    param3.add(13);
    param3.add(20);
    param3.add(26);
    param3.add(25);
    param3.add(24);
    param3.add(30);
    param3.add(33);
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