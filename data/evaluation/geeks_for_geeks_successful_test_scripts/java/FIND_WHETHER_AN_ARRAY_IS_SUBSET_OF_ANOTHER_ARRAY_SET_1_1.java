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
public class FIND_WHETHER_AN_ARRAY_IS_SUBSET_OF_ANOTHER_ARRAY_SET_1_1{
static boolean f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n ) {
  int i = 0 , j = 0 ;
  if ( m < n ) return false ;
  Arrays . sort ( arr1 ) ;
  Arrays . sort ( arr2 ) ;
  while ( i < n && j < m ) {
    if ( arr1 [ j ] < arr2 [ i ] ) j ++ ;
    else if ( arr1 [ j ] == arr2 [ i ] ) {
      j ++ ;
      i ++ ;
    }
    else if ( arr1 [ j ] > arr2 [ i ] ) return false ;
  }
  if ( i < n ) return false ;
  else return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,10,10,10,13,17,23,24,25,28,30,33,37,49,49,50,57,60,60,63,63,64,65,65,72,81,84,85,85,94,96});
    param0.add(new int[]{12,30,-94,-92,-62,-18,-56,44,-50,-92,6,2,56,-90,0,0,18,86,-58,58,-54,62,-94,94,0,8,82,-68,-88,-18,8,-80,-42,18,62,-8,56,-76,-42,56,44,-2,-20,62,-14,74,-86,-76});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{94,26,32,20,46,55,9,51,57,80,45,38,68,12,90,10,80,65,12,52,51,86,64,57,93,19,30,92,85,82,24,26,36,56});
    param0.add(new int[]{-98,-90,-86,-86,-84,-84,-82,-80,-78,-72,-70,-68,-66,-64,-52,-52,-50,-38,-28,-26,-24,-14,-8,16,26,26,28,34,36,40,42,44,44,46,50,60,68,78,80,86,90,92,98});
    param0.add(new int[]{1,0,1,0,1,0,0,0,1,0,0,0,0,1,1,0,1,1});
    param0.add(new int[]{6,8,11,13,14,26,26,41,48,70,82,83,84,88,96});
    param0.add(new int[]{-88,80,62,76,48,92,18,-94,-62,98,-46,-50,70,32,68,-54,26,16,94,0,-84,2,-16,88,26,-38,18,64,90,80,76,2,14,-90,50,4,76,30});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{54,44,97,92,13,54,27,8,43,70,77,84,55,64,5,59,27,19,65,68,66,26,33,38,7});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{10,13,17,63});
    param1.add(new int[]{12, -18, 44});
    param1.add(new int[]{0,0,0});
    param1.add(new int[]{80,58,32,2});
    param1.add(new int[]{-99,-90,-90,-86});
    param1.add(new int[]{0,0,1,1});
    param1.add(new int[]{1,9,12,16});
    param1.add(new int[]{-76,-54,4,78});
    param1.add(new int[]{0,1,0,1});
    param1.add(new int[]{93,5,9,13});
    List<Integer> param2 = new ArrayList<>();
    param2.add(29);
    param2.add(46);
    param2.add(34);
    param2.add(17);
    param2.add(23);
    param2.add(10);
    param2.add(10);
    param2.add(27);
    param2.add(10);
    param2.add(19);
    List<Integer> param3 = new ArrayList<>();
    param3.add(4);
    param3.add(3);
    param3.add(3);
    param3.add(4);
    param3.add(4);
    param3.add(4);
    param3.add(4);
    param3.add(4);
    param3.add(4);
    param3.add(4);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}