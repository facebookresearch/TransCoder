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
public class COUNT_NUMBER_OF_OCCURRENCES_OR_FREQUENCY_IN_A_SORTED_ARRAY{
static int f_gold ( int arr [ ] , int n , int x ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( x == arr [ i ] ) res ++ ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{16,18,24,27,34,36,41,43,43,52,59,76,86,87,90,91,94,96,98,98});
    param0.add(new int[]{64,66,-36});
    param0.add(new int[]{0,0,0});
    param0.add(new int[]{9,85,34,43,70,96,44,7,27,33,34,5,91,84,76,45,20,37,15,37,20,24,13,49,74,13,50,81,81,66,23,36,91,80,61,15,96,70,90,25,16,62,75,63,6,65,38,12});
    param0.add(new int[]{-98,-98,-98,-34,-32,-26,-12,0,18,52,68,72});
    param0.add(new int[]{1,1,0,0,1,1,0,0,1,0,0,1,0,0,1,1});
    param0.add(new int[]{1,3,6,6,10,12,15,16,21,22,23,29,33,37,40,40,43,52,55,59,64,65,71,72,80,83,86,86,88,88});
    param0.add(new int[]{-14,-30,-38,-38,-8,40,-34,2,-84,68,-42,38,-14,0,-64,12,-2,-38,-8,-44,-88,-34,-80,-36,82,70,96,-32,16,-52,-12,-46,-28,-86,30,-14,50,-44,22,30,-4,78,52});
    param0.add(new int[]{1,1,1,1});
    param0.add(new int[]{11,50,1,93,12,7,55,35,36,62,61,71,16});
    List<Integer> param1 = new ArrayList<>();
    param1.add(14);
    param1.add(1);
    param1.add(2);
    param1.add(43);
    param1.add(11);
    param1.add(11);
    param1.add(29);
    param1.add(39);
    param1.add(2);
    param1.add(11);
    List<Integer> param2 = new ArrayList<>();
    param2.add(43);
    param2.add(64);
    param2.add(0);
    param2.add(5);
    param2.add(-98);
    param2.add(1);
    param2.add(40);
    param2.add(26);
    param2.add(3);
    param2.add(8);
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