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
public class PROGRAM_CHECK_ARRAY_SORTED_NOT_ITERATIVE_RECURSIVE_1{
static boolean f_gold ( int arr [ ] , int n ) {
  if ( n == 0 || n == 1 ) return true ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) if ( arr [ i - 1 ] > arr [ i ] ) return false ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,8,8,16,19,19,21,23,26,33,34,36,38,39,41,41,45,47,52,52,55,57,60,60,60,61,69,69,70,70,72,73,73,75,78,81,84,84,85,88,88,89,90,91,97});
    param0.add(new int[]{2,-90,66,24,-18,70,34,18,84,-62});
    param0.add(new int[]{1,1});
    param0.add(new int[]{12,88,65,82,23,39,60,27,57,44,70,28,23,34,25,11,48,65,10,73,26,10,18,60,73,45,26,9,36,15,24,40,2,4,95,20,39,45});
    param0.add(new int[]{-38,38,40,72});
    param0.add(new int[]{1,0,0,0,1});
    param0.add(new int[]{11,15,16,17,17,17,22,23,23,25,27,28,28,31,33,36,38,40,42,44,46,49,51,51,52,60,62,65,67,71,74,77,77,78,78,79,83,83,86,86,87,87,87,88,91,92,97,97,97});
    param0.add(new int[]{-26,-90,-78,-76,-58,-64,-72,-34,-58,-48,78,-50,-30,26,-60,26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{56,51,63,30,10,88,23,1,48,4,28,44});
    List<Integer> param1 = new ArrayList<>();
    param1.add(22);
    param1.add(9);
    param1.add(1);
    param1.add(23);
    param1.add(2);
    param1.add(3);
    param1.add(44);
    param1.add(9);
    param1.add(23);
    param1.add(10);
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