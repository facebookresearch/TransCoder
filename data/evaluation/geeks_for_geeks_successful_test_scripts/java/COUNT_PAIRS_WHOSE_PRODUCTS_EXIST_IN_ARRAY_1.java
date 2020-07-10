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
public class COUNT_PAIRS_WHOSE_PRODUCTS_EXIST_IN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  int result = 0 ;
  HashSet < Integer > Hash = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Hash . add ( arr [ i ] ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int product = arr [ i ] * arr [ j ] ;
      if ( Hash . contains ( product ) ) {
        result ++ ;
      }
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,10,17,17,18,20,27,28,29,29,31,32,41,43,45,46,63,66,69,69,70,75,87,95});
    param0.add(new int[]{-60});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{52,83,36,57,93,11,32,91,52});
    param0.add(new int[]{-98,-94,-90,-88,-76,-76,-64,-62,-60,-50,-46,-32,-24,-22,-20,-16,-4,-2,6,10,20,28,30,32,34,38,40,42,54,64,72,76,82,82,86,92,92,98,98});
    param0.add(new int[]{0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,1,0,1,0,1,1,1,0,1,0,0,0,1,0,0,0,1,0,1,1,1,0,1,1,0});
    param0.add(new int[]{2,3,10,12,15,23,26,28,29,30,31,31,33,33,35,41,45,48,50,50,53,53,56,65,66,67,68,68,72,72,75,76,79,82,90,94,94,95,97,99});
    param0.add(new int[]{14,36,-54,-54});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{5,69,37,80,21,98,70,70,74,95,6,67,44,55,52,89,84,99,65,52});
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(0);
    param1.add(9);
    param1.add(8);
    param1.add(22);
    param1.add(42);
    param1.add(35);
    param1.add(3);
    param1.add(12);
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