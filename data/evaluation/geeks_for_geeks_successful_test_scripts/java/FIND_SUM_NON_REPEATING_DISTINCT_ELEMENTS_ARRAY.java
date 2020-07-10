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
public class FIND_SUM_NON_REPEATING_DISTINCT_ELEMENTS_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! s . contains ( arr [ i ] ) ) {
      sum += arr [ i ] ;
      s . add ( arr [ i ] ) ;
    }
  }
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,6,8,10,21,22,27,32,35,36,43,44,46,48,49,55,60,61,69,69,71,72,73,78,88,94});
    param0.add(new int[]{80,94,16,-74,32,-64,-84,-66,-10});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{99,4,96,39,39,24,15,47,25,74,7,98,88,91,62,12,31,14,48,26,37,25,11,32,34,64,72,5,80,86,6});
    param0.add(new int[]{-86,-84,-84,-78,-78,-76,-74,-68,-66,-64,-60,-60,-56,-50,-42,-42,-38,-34,-32,-22,-16,-14,-10,-6,-6,4,4,26,36,36,54,62,64,68,70,76,76,76,84,92,92,94,96});
    param0.add(new int[]{1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1});
    param0.add(new int[]{3,3,5,8,32,33,35,35,42,48,67,71,71,74,77,80,94,96,96,97});
    param0.add(new int[]{-50,-18,-66,76,-54,96,98,26,42,64,-60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{70,21,44,82,62,41,86});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(6);
    param1.add(27);
    param1.add(15);
    param1.add(27);
    param1.add(25);
    param1.add(19);
    param1.add(9);
    param1.add(15);
    param1.add(3);
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