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
public class FIND_REPEATING_ELEMENT_SORTED_ARRAY_SIZE_N{
static int f_gold ( int arr [ ] , int low , int high ) {
  if ( low > high ) return - 1 ;
  int mid = ( low + high ) / 2 ;
  if ( arr [ mid ] != mid + 1 ) {
    if ( mid > 0 && arr [ mid ] == arr [ mid - 1 ] ) return mid ;
    return f_gold ( arr , low , mid - 1 ) ;
  }
  return f_gold ( arr , mid + 1 , high ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{15,21,32,42,42,44,57,68,75,80,83,84});
    param0.add(new int[]{-60,-90,-88,-80,-86,18,54,56,84,42,-60,-90,52,-44,-62,-56,-16,28,22,-24,-36,-56,80,68,-16});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{87,43,74});
    param0.add(new int[]{-82,-66,-66,-62,-56,-52,-44,-42,-28,-22,-12,-6,-4,-2,18,26,26,28,42,42,56,58,78,90,92,94,96,96});
    param0.add(new int[]{0,1,1,1,1,1,0,1,1,1,1,0,0,1,0,0,1,0,1,1,1});
    param0.add(new int[]{6,9,14,17,22,31,32,33,36,39,42,43,46,46,46,47,49,53,60,61,67,68,72,75,77,77,84,84,85,89,94,94,95});
    param0.add(new int[]{-88,82,-10,-10,68,-86,70,92,-54,-10,-56});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{35,66,47,42,95,10,84,80,23,35,21,71,39,9,38,40,22,65});
    List<Integer> param1 = new ArrayList<>();
    param1.add(6);
    param1.add(23);
    param1.add(33);
    param1.add(2);
    param1.add(20);
    param1.add(19);
    param1.add(23);
    param1.add(7);
    param1.add(8);
    param1.add(14);
    List<Integer> param2 = new ArrayList<>();
    param2.add(11);
    param2.add(12);
    param2.add(32);
    param2.add(2);
    param2.add(21);
    param2.add(19);
    param2.add(19);
    param2.add(10);
    param2.add(8);
    param2.add(16);
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