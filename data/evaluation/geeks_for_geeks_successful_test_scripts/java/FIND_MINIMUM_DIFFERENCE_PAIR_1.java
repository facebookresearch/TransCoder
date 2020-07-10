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
public class FIND_MINIMUM_DIFFERENCE_PAIR_1{
static int f_gold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  int diff = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) if ( arr [ i + 1 ] - arr [ i ] < diff ) diff = arr [ i + 1 ] - arr [ i ] ;
  return diff ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,25,44,46,54,60,81});
    param0.add(new int[]{82,68,-98,-66,-36,-42,98,-38,58,-6,-28,70,-24,18,16,10,92,44,28,-96,-72,24,28,-80,-4,38,88,76});
    param0.add(new int[]{1,1,1});
    param0.add(new int[]{87,25,80,45,44,20,48,47,51,54,68,47,89,95,15,29,5,45,2,64,53,96,94,22,23,43,61,75,74,50});
    param0.add(new int[]{-74,-48,-42,-26,-16,-12,0,4,8,18,46,46,62,70,74,88,92,96,98});
    param0.add(new int[]{0,1,1,1,0,1,1,0,0,1,1,1,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,0,0});
    param0.add(new int[]{27,42,59,80});
    param0.add(new int[]{-96,-94,10,-36,18,-40});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{96});
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(22);
    param1.add(2);
    param1.add(15);
    param1.add(18);
    param1.add(36);
    param1.add(2);
    param1.add(4);
    param1.add(12);
    param1.add(0);
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