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
public class DYNAMIC_PROGRAMMING_SET_13_CUTTING_A_ROD{
static int f_gold ( int price [ ] , int n ) {
  int val [ ] = new int [ n + 1 ] ;
  val [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int max_val = Integer . MIN_VALUE ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) max_val = Math . max ( max_val , price [ j ] + val [ i - j - 1 ] ) ;
    val [ i ] = max_val ;
  }
  return val [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,7,15,16,18,22,22,30,34,35,37,41,42,42,43,47,49,52,53,55,58,60,62,62,62,65,65,67,69,73,73,73,75,78,83,84,86,90,91,91,93,94,96});
    param0.add(new int[]{50,-30,-84,-2,-96,-54,-14,56,-48,70,38,-86,16,-48,66,34,36,40,40,36,-16,-92,30});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{79,33,54,12,53,9,29,45,85,20,6,52,8,26,43,42,17,54,8,70,5,71,1,81,42,59,42,63,8,86,29,16,72});
    param0.add(new int[]{-78,-64,-38,-22,2,8,28,32,58,72,72,90});
    param0.add(new int[]{1,0,1,1,1,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,0,1,1,0,0,0});
    param0.add(new int[]{1,3,6,7,10,17,18,22,23,24,28,31,37,43,48,54,56,65,70,71,73,74,79,84,87,95,96});
    param0.add(new int[]{-30,20,-72,-86,-8});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{96,99,20,87,17,13,45,65,33,13,59,77,35,79,20,51,69,71,55,37,23,35,82,70});
    List<Integer> param1 = new ArrayList<>();
    param1.add(37);
    param1.add(19);
    param1.add(29);
    param1.add(22);
    param1.add(11);
    param1.add(20);
    param1.add(21);
    param1.add(3);
    param1.add(21);
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