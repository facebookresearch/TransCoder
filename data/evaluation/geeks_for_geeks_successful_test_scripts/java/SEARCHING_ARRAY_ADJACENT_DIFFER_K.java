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
public class SEARCHING_ARRAY_ADJACENT_DIFFER_K{
static int f_gold ( int arr [ ] , int n , int x , int k ) {
  int i = 0 ;
  while ( i < n ) {
    if ( arr [ i ] == x ) return i ;
    i = i + Math . max ( 1 , Math . abs ( arr [ i ] - x ) / k ) ;
  }
  System . out . println ( "number is " + "not present!" ) ;
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,5,9,11,14,18,19,21,26,32,38,38,43,47,49,52,55,61,65,67,69,73,74,79,84,90,91,91,92,93,94,99});
    param0.add(new int[]{12,-86,-66,-50,-48,78,-92,-56,-2,66,64});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{10,87,39,87,45,33,5,37,70,69,88,78,90,3});
    param0.add(new int[]{-78,-70,-68,-60,-52,-34,-24,-4,12,18,58,58,64,76,84,94});
    param0.add(new int[]{0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,0});
    param0.add(new int[]{5,5,7,11,11,15,22,23,28,38,41,53,54,57,59,68,71,89});
    param0.add(new int[]{-4,0,60,-14,-48,54,-96,-68,-40,64,-50,-74,-20,-22,48,-48,42,62,66,84,54,-52,-52,6,46,-90,-18,90});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{30,91,34,44,3,76,43,75,49,33,74,72,68,79,26,62,23,5,32,75,82,25,7,19,32,87,87,94,34,62,3,32,59});
    List<Integer> param1 = new ArrayList<>();
    param1.add(22);
    param1.add(5);
    param1.add(35);
    param1.add(9);
    param1.add(14);
    param1.add(26);
    param1.add(16);
    param1.add(18);
    param1.add(9);
    param1.add(32);
    List<Integer> param2 = new ArrayList<>();
    param2.add(19);
    param2.add(10);
    param2.add(37);
    param2.add(8);
    param2.add(9);
    param2.add(36);
    param2.add(17);
    param2.add(14);
    param2.add(8);
    param2.add(30);
    List<Integer> param3 = new ArrayList<>();
    param3.add(26);
    param3.add(5);
    param3.add(43);
    param3.add(10);
    param3.add(13);
    param3.add(32);
    param3.add(16);
    param3.add(23);
    param3.add(9);
    param3.add(24);
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