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
public class MAXIMUM_CONSECUTIVE_NUMBERS_PRESENT_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  HashSet < Integer > S = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) S . add ( arr [ i ] ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( S . contains ( arr [ i ] ) ) {
      int j = arr [ i ] ;
      while ( S . contains ( j ) ) j ++ ;
      ans = Math . max ( ans , j - arr [ i ] ) ;
    }
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,5,9,24,28,31,49,54,67,85,86,94,97,97});
    param0.add(new int[]{-34,16,-80,-10,80,2,50,-74,-76,36,-84,-24,74,-54,-22,46,80,58,-8,70,24,-88,52,62,30,42,48,16,78,-82,64,-36,84,-72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{49,61,68,4,90,89,71,74,45,61,35,41,59});
    param0.add(new int[]{-42,-8,28,56,80,96});
    param0.add(new int[]{1,0,1,0,0,0,0,1,1,0,1,1,0,1,0,1,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,1,1});
    param0.add(new int[]{3,4,6,6,13,27,27,29,32,36,46,50,52,65,69,70,71,83,87,91});
    param0.add(new int[]{64,-76,28,6,56,18,32,-50,-20,18,-26,-90,32,50,-18,98,84,40,50,88,-70,-6,-24,-44,-96,-58,48,-78,-14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{50,48,61,87,7,78,93,44,16,88,98,15,73,93,43,46,42,34,1,35,79,35,84,60,18,79,17,4,78,1,20,64});
    List<Integer> param1 = new ArrayList<>();
    param1.add(11);
    param1.add(29);
    param1.add(13);
    param1.add(11);
    param1.add(4);
    param1.add(17);
    param1.add(10);
    param1.add(15);
    param1.add(15);
    param1.add(25);
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