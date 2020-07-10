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
public class FIND_LARGEST_D_IN_ARRAY_SUCH_THAT_A_B_C_D{
static int f_gold ( int [ ] S , int n ) {
  boolean found = false ;
  Arrays . sort ( S ) ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == j ) continue ;
      for ( int k = j + 1 ;
      k < n ;
      k ++ ) {
        if ( i == k ) continue ;
        for ( int l = k + 1 ;
        l < n ;
        l ++ ) {
          if ( i == l ) continue ;
          if ( S [ i ] == S [ j ] + S [ k ] + S [ l ] ) {
            found = true ;
            return S [ i ] ;
          }
        }
      }
    }
  }
  if ( found == false ) return Integer . MAX_VALUE ;
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{8,12,14,15,16,20,27,28,29,30,35,41,46,51,53,55,55,58,63,64,72,73,75,75,75,82,82,86,89,91,92,94,95,95,97,97,98});
    param0.add(new int[]{-62,48,-22,-44,-58,-50,-82,34,26,-2,86,-44,92,-96,42,-20,10,74,-56,-12,-28,-40});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1});
    param0.add(new int[]{84,58,10,67,77,66,10,47,65,55,54});
    param0.add(new int[]{-46,-28,-20,-18,4,8,18,38,90,90});
    param0.add(new int[]{0,1,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,1,1,0,0,1,0,0,0,0,1,0,1,0,0,1,1,0,1,1,0,0,1,0,0,1,0,1,0});
    param0.add(new int[]{11,13,14,21,26,28,36,39,41,42,43,44,49,49,57,58,59,59,63,64,67,69,70,75,78,79,83,83,86,91,92,93,96,96,96,97});
    param0.add(new int[]{74,52,-16,34,-88,62,54,46,-82,76,-48,54,50,-66,-18,78,-48,38,96,-32,-82,0,-76,46,-56,4,-30,-70,-62});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{55,74,18,4,68,66,33,61,66,92,21,9,49,14,99,87,74,6,11,25,5,58,56,20});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(19);
    param1.add(8);
    param1.add(5);
    param1.add(6);
    param1.add(35);
    param1.add(30);
    param1.add(16);
    param1.add(17);
    param1.add(23);
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