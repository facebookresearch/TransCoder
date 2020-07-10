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
public class FIRST_ELEMENT_OCCURRING_K_TIMES_ARRAY{
static int f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > count_map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = 0 ;
    if ( count_map . get ( arr [ i ] ) != null ) {
      a = count_map . get ( arr [ i ] ) ;
    }
    count_map . put ( arr [ i ] , a + 1 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( count_map . get ( arr [ i ] ) == k ) {
      return arr [ i ] ;
    }
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,4,4,7,18,20,23,27,30,31,31,32,35,36,43,45,46,49,50,53,55,59,60,64,64,65,68,78,80,80,85,95});
    param0.add(new int[]{-26,32,36,6,64,24,-28,96});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{38,40,43,70,20,40,95,96,81,82});
    param0.add(new int[]{-68,-8,-8,16,24,54});
    param0.add(new int[]{1,0,1,0,0,0,1,0,1,0,0,0,1});
    param0.add(new int[]{13,18,19,28,31,34,49,49,53,57,58,62,75,76,77,78,80,84,84,85,87,91,98,99});
    param0.add(new int[]{-4,24,-86,-84,30,-16,12,-92,-68,22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{55,44,75,97,25,65,76,53,20,78,25,59,61,29,81,35,15,78,41,44,31,33,39,93,26,67});
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(6);
    param1.add(15);
    param1.add(9);
    param1.add(3);
    param1.add(6);
    param1.add(20);
    param1.add(6);
    param1.add(8);
    param1.add(23);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(3);
    param2.add(7);
    param2.add(1);
    param2.add(2);
    param2.add(4);
    param2.add(2);
    param2.add(5);
    param2.add(10);
    param2.add(20);
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