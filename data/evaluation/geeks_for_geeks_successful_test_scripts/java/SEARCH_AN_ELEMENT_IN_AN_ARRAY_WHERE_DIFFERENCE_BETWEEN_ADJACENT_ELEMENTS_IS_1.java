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
public class SEARCH_AN_ELEMENT_IN_AN_ARRAY_WHERE_DIFFERENCE_BETWEEN_ADJACENT_ELEMENTS_IS_1{
static int f_gold ( int arr [ ] , int n , int x ) {
  int i = 0 ;
  while ( i < n ) {
    if ( arr [ i ] == x ) return i ;
    i = i + Math . abs ( arr [ i ] - x ) ;
  }
  System . out . println ( "number is not" + " present!" ) ;
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3});
    param0.add(new int[]{6,90});
    param0.add(new int[]{1, 2, 3, 4, 5, 4});
    param0.add(new int[]{97,35,60,96,3,67,72,95,55,9,69,28,15,91,31,59});
    param0.add(new int[]{-84,-78,-74,-70,-68,-60,-56,-54,-48,-46,-28,-16,-6,0,0,8,8,8,12,16,26,30,32,34,36,40,46,48,70,70,72,76,78,78,80,84,84,86});
    param0.add(new int[]{1,0,1,1,1,1,0,1,1,1,1});
    param0.add(new int[]{55,64,76,79,93,96});
    param0.add(new int[]{66,-90,98,-50,0,46,42,64,-96,-80,-96,20,-10,-84});
    param0.add(new int[]{0,0,0,0,0,0,1});
    param0.add(new int[]{94,4,34,87,32,3,92,68,57,76,24,33,3,4,30,70,49,30,72,82,16,53,6,24,92,96,89,28,21,8,36,9,40,85,51,1,63,68,74,26,40,3,9,32,67,4,6,73});
    List<Integer> param1 = new ArrayList<>();
    param1.add(12);
    param1.add(1);
    param1.add(6);
    param1.add(15);
    param1.add(22);
    param1.add(5);
    param1.add(4);
    param1.add(8);
    param1.add(6);
    param1.add(25);
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(1);
    param2.add(5);
    param2.add(9);
    param2.add(31);
    param2.add(7);
    param2.add(4);
    param2.add(13);
    param2.add(5);
    param2.add(25);
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
