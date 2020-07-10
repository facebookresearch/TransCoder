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
public class FIND_REPETITIVE_ELEMENT_1_N_1{
static int f_gold ( int [ ] arr , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum += arr [ i ] ;
  return sum - ( ( ( n - 1 ) * n ) / 2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,8,27,34,39,42,43,54,72});
    param0.add(new int[]{-38,-66,-38,-48,-96,74,-32,-62,-34,-32,-88,-12,-8,-4});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{88,86,23,81,76,16,94,64,59,50,71,62,10,89,73,64,65,96,83,40,99,40,77,33,14,62,6,89,74,96,93,29,15,93,9,58,98,76,23,23,70,99});
    param0.add(new int[]{-96,-94,-82,-64,-56,-40,-36,-34,-32,-24,-24,-22,-20,-20,-20,-18,-18,-12,-10,-6,16,20,20,22,26,30,36,46,46,50,50,52,64,64,64,68,72,74,76,92,96,98});
    param0.add(new int[]{0,1,1,1,1,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1});
    param0.add(new int[]{2,6,7,13,19,23,37,39,42,42,43,45,52,53,55,56,59,63,66,71,76,85,86,89,92,94,96,99});
    param0.add(new int[]{52,-56,-12,78,6,32,0,36,34,-54,-74,-32});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{10,42,50,5,74,81,30,76,6,34,86,4,77,71,96,22,34,50,35,16,60,11,21,38});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(9);
    param1.add(8);
    param1.add(31);
    param1.add(28);
    param1.add(25);
    param1.add(27);
    param1.add(11);
    param1.add(15);
    param1.add(13);
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