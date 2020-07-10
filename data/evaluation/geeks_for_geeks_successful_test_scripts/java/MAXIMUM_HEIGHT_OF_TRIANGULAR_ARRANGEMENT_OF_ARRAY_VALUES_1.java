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
public class MAXIMUM_HEIGHT_OF_TRIANGULAR_ARRANGEMENT_OF_ARRAY_VALUES_1{
static int f_gold ( int a [ ] , int n ) {
  return ( int ) Math . floor ( ( - 1 + Math . sqrt ( 1 + ( 8 * n ) ) ) / 2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,2,3,5,6,7,8,8,12,15,16,18,18,20,21,21,22,22,24,24,25,30,35,42,49,52,55,55,63,68,70,72,73,77,80,83,87,87,88,88,94,95,97});
    param0.add(new int[]{48,-72,84,-24,28,94,36,28,32,66,-62,64,6,-68,-12,46,4,98,18,86,-60,76,14,98});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{11,16,84,8,86,44,79,11,73,12,29,62,22,44,28,8,48,92,73,63,59,44,95,66});
    param0.add(new int[]{-94,-94,-92,-88,-86,-82,-80,-80,-78,-76,-56,-56,-50,-44,-42,-36,-36,-32,-32,-26,-14,-12,-6,12,24,28,34,38,42,42,46,50,56,62,62,74,84,92,94});
    param0.add(new int[]{0,1,0,1,0,1,1,0,1,1,1,0,0,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,1,1,1,1,0,0});
    param0.add(new int[]{2,2,3,3,3,4,5,13,16,18,21,22,27,28,32,34,36,37,41,42,43,51,52,52,54,54,61,65,67,67,68,71,75,77,77,78,80,81,81,84,86,90,90,93,93,94,99,99});
    param0.add(new int[]{54,-86});
    param0.add(new int[]{0,1});
    param0.add(new int[]{5,54,49,80,56,62,31,49,60,19,45,94,33,46,32});
    List<Integer> param1 = new ArrayList<>();
    param1.add(22);
    param1.add(12);
    param1.add(25);
    param1.add(14);
    param1.add(19);
    param1.add(24);
    param1.add(31);
    param1.add(1);
    param1.add(1);
    param1.add(8);
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