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
public class MINIMUM_NUMBER_SUBSETS_DISTINCT_ELEMENTS{
public static int f_gold ( int ar [ ] , int n ) {
  int res = 0 ;
  Arrays . sort ( ar ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int count = 1 ;
    for ( ;
    i < n - 1 ;
    i ++ ) {
      if ( ar [ i ] == ar [ i + 1 ] ) count ++ ;
      else break ;
    }
    res = Math . max ( res , count ) ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,5,8,16,21,21,22,23,26,26,27,27,29,31,33,36,37,37,38,42,45,47,50,57,58,60,60,62,63,66,66,76,84,84,88,96,99});
    param0.add(new int[]{-30,-60,34,4,86,80,-96,-94,52,46,8,82,-94,-96,78,82,-22,-36,78,50,-46,-36,80,24,-14,94,-46,-38,82,4,-24,2,4,-82,-82,-18,-62,12,8,92,70,-10});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{38,47,84,49,48,62,48,41,38,48,92,16,99});
    param0.add(new int[]{-88,-64,-40,-38,-38,-16,16,20,28,40,56,58,60,68,74,92});
    param0.add(new int[]{1,1,0,1,0,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,0,0,0,1,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{14,24,82,87,95});
    param0.add(new int[]{-34,62,40,-84,52,-76,2,-58,94,22,2,-18,-88,62,-14,46,50,-58,-80,68,-64,90,-58,12,76,-40,40,-46,8,-80,4,-90,14,-10,64,-68});
    param0.add(new int[]{0,1,1,1});
    param0.add(new int[]{43,41,90,5,6,17,68,68,86,89});
    List<Integer> param1 = new ArrayList<>();
    param1.add(25);
    param1.add(35);
    param1.add(34);
    param1.add(6);
    param1.add(12);
    param1.add(29);
    param1.add(3);
    param1.add(34);
    param1.add(3);
    param1.add(7);
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