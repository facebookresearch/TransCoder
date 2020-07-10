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
public class PROGRAM_FIND_SMALLEST_DIFFERENCE_ANGLES_TWO_PARTS_GIVEN_CIRCLE{
public static int f_gold ( int arr [ ] , int n ) {
  int l = 0 , sum = 0 , ans = 360 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
    while ( sum >= 180 ) {
      ans = Math . min ( ans , 2 * Math . abs ( 180 - sum ) ) ;
      sum -= arr [ l ] ;
      l ++ ;
    }
    ans = Math . min ( ans , 2 * Math . abs ( 180 - sum ) ) ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,4,5,5,13,14,14,16,19,20,30,31,32,33,35,38,38,42,44,44,48,48,52,58,60,64,65,66,68,69,70,70,71,72,73,79,81,83,83,84,86,87,88,88,91,92,95,95,98});
    param0.add(new int[]{-56,88,-50,70,20,58,42,-56,-52,-78,98,20,-26,4,20,-66,-46,-58,74,74,-72,2,16,-78,-4,10,58,60,-46,-2,32,-96,24,-6,90,-64,-24,-38,26,66,-42,-86,48,92,28,6,-54,-6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{52,67,62});
    param0.add(new int[]{-56,-22,32,42,66});
    param0.add(new int[]{1,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0});
    param0.add(new int[]{38,46,58,72});
    param0.add(new int[]{16,62,90,40,30,-56,-92,-56,60,42,-64,92,-30,-70,42,-48,-54,54,48,94,-44,-46,10,48,22,-24,-62,34,60,24,-60,50,40,34});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{86,43,74,84,86,14,45,7,92,36,79,13,67,18,96,77,13,22,28,36,57,56,99,57,8,48,5,79,65,64,96,6,36,91,53,55,11,12,80,99,50,40,4,9,52,41});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(29);
    param1.add(25);
    param1.add(1);
    param1.add(4);
    param1.add(10);
    param1.add(2);
    param1.add(20);
    param1.add(37);
    param1.add(40);
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