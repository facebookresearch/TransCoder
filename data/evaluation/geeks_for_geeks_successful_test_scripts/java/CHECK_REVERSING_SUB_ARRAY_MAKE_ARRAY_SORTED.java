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
public class CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED{
static boolean f_gold ( int arr [ ] , int n ) {
  int temp [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    temp [ i ] = arr [ i ] ;
  }
  Arrays . sort ( temp ) ;
  int front ;
  for ( front = 0 ;
  front < n ;
  front ++ ) {
    if ( temp [ front ] != arr [ front ] ) {
      break ;
    }
  }
  int back ;
  for ( back = n - 1 ;
  back >= 0 ;
  back -- ) {
    if ( temp [ back ] != arr [ back ] ) {
      break ;
    }
  }
  if ( front >= back ) {
    return true ;
  }
  do {
    front ++ ;
    if ( arr [ front - 1 ] < arr [ front ] ) {
      return false ;
    }
  }
  while ( front != back ) ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,9,9,16,17,22,32,40,45,53,57,58,66,69,76,80,91,93,94});
    param0.add(new int[]{52,-76,-18,86,56});
    param0.add(new int[]{0,0,1});
    param0.add(new int[]{66,44,98,44});
    param0.add(new int[]{-96,-62,-56,-46,-44,-38,-38,-26,-22,-22,-16,-12,-6,12,22,34,36,44,44,68,70,74,94});
    param0.add(new int[]{1,1,0,0,1,1,1,1,0,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,0,0,1,1});
    param0.add(new int[]{5,9,11,12,13,16,19,23,23,23,25,27,27,28,31,36,40,44,48,59,60,63,66,66,67,67,69,69,70,71,73,76,76,79,86,86,92,92,93,93});
    param0.add(new int[]{6,82,-88,-46,-60,70,-54,-96,-94,46,-52,48,-26,-50,-92,-92,6,-6,42,0,-66,-96,66,6,-68,-30,-54,76,60,30,72,-66,-12,-74});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{62,54,36,35,36,91,45,87,74,49,15,15,73,77,63,70,74,65,11,18});
    List<Integer> param1 = new ArrayList<>();
    param1.add(10);
    param1.add(3);
    param1.add(1);
    param1.add(2);
    param1.add(14);
    param1.add(27);
    param1.add(34);
    param1.add(28);
    param1.add(13);
    param1.add(16);
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