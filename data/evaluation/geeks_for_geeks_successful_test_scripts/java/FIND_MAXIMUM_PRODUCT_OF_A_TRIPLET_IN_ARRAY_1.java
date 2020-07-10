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
public class FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  if ( n < 3 ) {
    return - 1 ;
  }
  Arrays . sort ( arr ) ;
  return Math . max ( arr [ 0 ] * arr [ 1 ] * arr [ n - 1 ] , arr [ n - 1 ] * arr [ n - 2 ] * arr [ n - 3 ] ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,8,14,15,18,21,21,21,27,29,30,33,34,34,35,37,40,41,44,44,46,49,54,58,60,61,61,63,66,69,69,70,81,82,82,90,90,90,91,92,92,96,97,99});
    param0.add(new int[]{72,-32,-2,-76,-56,70,-52,12,-50,32,-98,48,-32,-90,-66,-98,56,-58,-88,50,-22,18,-60,68,70,28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{38,69,18,72,99,49,17,76,86,53,6,94,66,5,2,62,99,5,31,81,63,91,95,74,76,18,77});
    param0.add(new int[]{-92,-58,-8,20,24,24,42,98});
    param0.add(new int[]{0,1,1,0,1,0,0,1,0,1,0,0,1,1,0,1,0,0,1,1,0,0,0,1,0,0,0,1,1,1,0,0,1,0,0,0,1,1,0,1,1,1,1,0});
    param0.add(new int[]{46,64,81});
    param0.add(new int[]{4,-26,20,34,-4,-40,76,94,-14,-80,42,60,92,-96,44,58,34,68,96,-8,-18,-92});
    param0.add(new int[]{0,0,0,1,1,1,1,1});
    param0.add(new int[]{61,17,28,18,52,58,41,75,98,79,1,97,73,17,79,4,46,70,6,83,23,94,1});
    List<Integer> param1 = new ArrayList<>();
    param1.add(39);
    param1.add(18);
    param1.add(17);
    param1.add(21);
    param1.add(4);
    param1.add(38);
    param1.add(1);
    param1.add(17);
    param1.add(7);
    param1.add(19);
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