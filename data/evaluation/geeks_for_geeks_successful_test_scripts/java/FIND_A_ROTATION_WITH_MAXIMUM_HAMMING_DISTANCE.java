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
public class FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE{
static int f_gold ( int arr [ ] , int n ) {
  int brr [ ] = new int [ 2 * n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) brr [ i ] = arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) brr [ n + i ] = arr [ i ] ;
  int maxHam = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int currHam = 0 ;
    for ( int j = i , k = 0 ;
    j < ( i + n ) ;
    j ++ , k ++ ) if ( brr [ j ] != arr [ k ] ) currHam ++ ;
    if ( currHam == n ) return n ;
    maxHam = Math . max ( maxHam , currHam ) ;
  }
  return maxHam ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,18,22,28,34,35,39,44,45,67,73,75,79,81,83,89,93,96});
    param0.add(new int[]{52,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{24});
    param0.add(new int[]{-68,14,36,62});
    param0.add(new int[]{1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,1,0,1,1,0,1,0,0});
    param0.add(new int[]{7,10,19,22,24,28,29,39,46,55,62,66,68,73,74,76,83,84,85,99});
    param0.add(new int[]{-38,56,86,12,24,-90,-20,-46,38,92,-44,-74,54,50,46,50,-94,64,32,-84,70});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{61,89,8});
    List<Integer> param1 = new ArrayList<>();
    param1.add(12);
    param1.add(1);
    param1.add(21);
    param1.add(0);
    param1.add(2);
    param1.add(12);
    param1.add(15);
    param1.add(14);
    param1.add(8);
    param1.add(2);
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