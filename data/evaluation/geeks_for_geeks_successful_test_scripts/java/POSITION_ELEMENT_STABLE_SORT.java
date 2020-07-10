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
public class POSITION_ELEMENT_STABLE_SORT{
static int f_gold ( int arr [ ] , int n , int idx ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] < arr [ idx ] ) result ++ ;
    if ( arr [ i ] == arr [ idx ] && i < idx ) result ++ ;
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,8,9,12,15,16,18,28,28,31,33,36,36,37,40,41,44,44,46,50,50,50,52,52,54,55,60,61,65,68,71,75,75,78,81,84,87,89,90,92,94,97,97,98,98,99});
    param0.add(new int[]{-16,86,94,-86,-38,64,96,-64,94,10,-10,-62,-50,-46,-62,-32,-4,72,14,36,74,-66,46,82,-44,-22,-26,16,-8,0,-90,94,-50,22,-82,8,92,-84,-34,-36,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{66,8,30,84,36,96,45,63,23,23,14,34,86,51,18,97,21,39,96,70,28,96,78,68,88,66,13,24,74,94});
    param0.add(new int[]{-94,-90,-86,-86,-72,-72,-58,-50,-32,-22,-18,-10,-4,-2,-2,0,0,6,14,22,22,36,36,40,44,58,60,70,70,76,82,82,84,88,96});
    param0.add(new int[]{1,1,1,0,0,1,0,1,0,0,0,0,1,0,1,1,0,1,0,1,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1});
    param0.add(new int[]{3,5,6,7,8,10,17,20,20,26,27,27,27,32,32,38,40,44,45,45,45,45,47,50,57,57,57,58,62,63,63,67,68,73,75,76,77,79,79,80,85,88,89,89,89,94,96,98});
    param0.add(new int[]{98,-92,18,-18,44,-88,-90,-66,-38,78,-22,-46,-20,64,-10,54});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{14,17});
    List<Integer> param1 = new ArrayList<>();
    param1.add(37);
    param1.add(31);
    param1.add(30);
    param1.add(26);
    param1.add(17);
    param1.add(30);
    param1.add(42);
    param1.add(14);
    param1.add(19);
    param1.add(1);
    List<Integer> param2 = new ArrayList<>();
    param2.add(32);
    param2.add(27);
    param2.add(34);
    param2.add(21);
    param2.add(31);
    param2.add(36);
    param2.add(35);
    param2.add(12);
    param2.add(31);
    param2.add(1);
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