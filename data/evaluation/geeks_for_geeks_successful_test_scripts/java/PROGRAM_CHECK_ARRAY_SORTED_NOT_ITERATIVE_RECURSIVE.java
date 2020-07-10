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
public class PROGRAM_CHECK_ARRAY_SORTED_NOT_ITERATIVE_RECURSIVE{
static int f_gold ( int arr [ ] , int n ) {
  if ( n == 1 || n == 0 ) return 1 ;
  if ( arr [ n - 1 ] < arr [ n - 2 ] ) return 0 ;
  return f_gold ( arr , n - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,19,21,28,32,35,44,51,55,62,80,80,83,90,93,93});
    param0.add(new int[]{84,-28,-42,38,-94,-70,34,54,38,-58,-54,-6,72,-32,-18,80,-6,-38,-30,-86,-10,14,92,-56,40,-58,-2,-6,-46,-80,72,-12,2,-64,36,98,-24});
    param0.add(new int[]{0,1,1,1});
    param0.add(new int[]{74,75,9,13,57,82,57,37,47,11,28,6,33,14,47,29,15,56,69,86,31,19,18,58,70,73,30,95,35,17,16,97,68,95,33,36,11,60,4,63,5,64,85,77,4});
    param0.add(new int[]{-96,-92,-84,-78,-74,-68,-66,-64,-62,-50,-48,-48,-46,-38,-28,-28,-26,-24,-24,-20,-14,-12,-4,16,18,28,32,48,50,62,70,72,78,90,92});
    param0.add(new int[]{0,1,0,1,0,0,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,0,0,1,1,1,0,1,1,1,1,1,1,0,1,0,1,1,1,0,0,1,0,1,1,1,0,0});
    param0.add(new int[]{6,8,11,21,29,31,41,50,56,56,69,69,74,79,86,88,93,95,99});
    param0.add(new int[]{10,-12,-36,72,-42,-94,38,-78,-4,6,12,6,-48});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{97,58,88,20,63,1,23,33,57,81,54,66,95,31,54,16,37,7,1,94,18,42,39,26,75,65,57,69,86,77,17,7,71,12,38,87,48,55,54,72,15,30,55});
    List<Integer> param1 = new ArrayList<>();
    param1.add(8);
    param1.add(21);
    param1.add(2);
    param1.add(31);
    param1.add(31);
    param1.add(38);
    param1.add(10);
    param1.add(6);
    param1.add(35);
    param1.add(29);
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