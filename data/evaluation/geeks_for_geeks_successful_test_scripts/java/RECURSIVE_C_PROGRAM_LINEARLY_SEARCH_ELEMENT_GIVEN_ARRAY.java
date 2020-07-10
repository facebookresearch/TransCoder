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
public class RECURSIVE_C_PROGRAM_LINEARLY_SEARCH_ELEMENT_GIVEN_ARRAY{
static int f_gold ( int arr [ ] , int l , int r , int x ) {
  if ( r < l ) return - 1 ;
  if ( arr [ l ] == x ) return l ;
  if ( arr [ r ] == x ) return r ;
  return f_gold ( arr , l + 1 , r - 1 , x ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{10,74,5});
    param0.add(new int[]{-90,72,36,96,42,0,-66,5});
    param0.add(new int[]{0,5});
    param0.add(new int[]{99,70,67,5});
    param0.add(new int[]{-98,-98,-26,-26,-24,-18,-16,80,5});
    param0.add(new int[]{1,1,1,1,0,1,5});
    param0.add(new int[]{1,5,12,12,17,17,12,95,96,98,5});
    param0.add(new int[]{50,-70,-30,-54,6,-10,70,84,5});
    param0.add(new int[]{0,1,5});
    param0.add(new int[]{59,21,28,3,14,5});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(7);
    param2.add(1);
    param2.add(3);
    param2.add(8);
    param2.add(6);
    param2.add(10);
    param2.add(8);
    param2.add(2);
    param2.add(5);
    List<Integer> param3 = new ArrayList<>();
    param3.add(1);
    param3.add(96);
    param3.add(-1);
    param3.add(3);
    param3.add(80);
    param3.add(1);
    param3.add(12);
    param3.add(27);
    param3.add(14);
    param3.add(28);
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
