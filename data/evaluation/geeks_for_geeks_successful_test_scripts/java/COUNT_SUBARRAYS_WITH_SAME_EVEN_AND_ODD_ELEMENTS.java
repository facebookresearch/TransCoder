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
public class COUNT_SUBARRAYS_WITH_SAME_EVEN_AND_ODD_ELEMENTS{
static int f_gold ( int [ ] arr , int n ) {
  int difference = 0 ;
  int ans = 0 ;
  int [ ] hash_positive = new int [ n + 1 ] ;
  int [ ] hash_negative = new int [ n + 1 ] ;
  hash_positive [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( arr [ i ] & 1 ) == 1 ) {
      difference ++ ;
    }
    else {
      difference -- ;
    }
    if ( difference < 0 ) {
      ans += hash_negative [ - difference ] ;
      hash_negative [ - difference ] ++ ;
    }
    else {
      ans += hash_positive [ difference ] ;
      hash_positive [ difference ] ++ ;
    }
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,8,12,13,14,19,20,22,28,30,31,31,32,34,34,39,39,43,45,46,47,62,63,63,65,66,69,69,71,76,79,82,83,88,89,92,93,95,97,97});
    param0.add(new int[]{20,-98,-44,-82,28,20,-76,-16,42,0,-88,74,56,6,-68,-30,28,88,58,-78,46,2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{44,4,29,83,28,75,58,89,40,38,29,45,21,87,97,42,95,20,48,38,15,67,23,81,50,53,64,67,30,13,52,56,87,10,80,38,31,19});
    param0.add(new int[]{-94,-94,-94,-90,-88,-86,-86,-82,-78,-76,-74,-68,-64,-62,-62,-60,-52,-48,-48,-46,-44,-44,-32,-28,-22,-12,-12,-8,-8,-4,4,6,10,14,28,40,42,52,56,60,60,60,64,68,70,82,82,84,96});
    param0.add(new int[]{1,0,0,0,1,0,1,1,1,0,0,0,1,0,0,1,1,1,0,1,1,1,0,0,1,1,0,1,1,1,1,0,1,1,0,0,1,1,1,1});
    param0.add(new int[]{6,16,21,26,34,35,44,46,46,86});
    param0.add(new int[]{86,12,80,46,-12,6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{71,94,91,19,85,5,87,96,66,17,95,5,32,17,93,48,46,24});
    List<Integer> param1 = new ArrayList<>();
    param1.add(26);
    param1.add(15);
    param1.add(24);
    param1.add(23);
    param1.add(48);
    param1.add(27);
    param1.add(7);
    param1.add(4);
    param1.add(15);
    param1.add(12);
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