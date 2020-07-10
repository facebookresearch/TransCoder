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
public class PRODUCT_MAXIMUM_FIRST_ARRAY_MINIMUM_SECOND{
public static int f_gold ( int arr1 [ ] , int arr2 [ ] , int n1 , int n2 ) {
  Arrays . sort ( arr1 ) ;
  Arrays . sort ( arr2 ) ;
  return arr1 [ n1 - 1 ] * arr2 [ 0 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,11,12,12,14,14,15,33,51,51,61,63,68,69,75,83,84,97});
    param0.add(new int[]{88,-10,-18,74,56,-36,-86,72,76,26,-36,10,-6,-80,-34,14,-82,74,48,-76,-78,-50,-62,-86,96,22,42,-28,18,6,58,-72,54});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{84,2,52,25,38,63,10,44,36,12,67,25,79,36,12,14,14,18,32,8,94,34,9,72,27,44,75,80,28,57,34,67,26,21,53,92,31,87,62});
    param0.add(new int[]{-64,-60,-36,-36,-34,-32,-18,-16,-2,6,22,36,42,46,52,54,70,94});
    param0.add(new int[]{0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,0,1,1,1,0,0,1,0,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,0,0,0,1,0,1,1,0,1,0});
    param0.add(new int[]{24,36,73});
    param0.add(new int[]{86,-46,76,66,38,24,-10,-10,-88,-22,54,12,42,20,-6,-44,-26,78,-46,-88,-6,-24,72,-38,26,84,-70,90,56,-4,94,-72,-44,-40,-8,18,4,-72,72,-72,-38});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{41,47,59,85,10,38,4,63,74,71,76,32,54,40,20,38,17,76,87,49,53,73,92,90,36,76,1,65,62,10,93,65});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{4,4,5,12,16,27,28,41,44,60,73,76,77,90,91,92,96,96});
    param1.add(new int[]{24,-26,38,28,94,64,-36,42,62,-50,-12,-18,-72,-76,26,-4,44,-98,32,-48,54,-66,-84,16,-12,-30,-58,42,-88,-40,66,-66,30});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{92,20,7,22,79,50,27,19,2,58,93,19,60,45,16,50,87,31,45,8,89,39,61,76,48,92,22,18,19,35,54,32,81,57,22,29,63,83,20});
    param1.add(new int[]{-96,-92,-64,-44,-22,-22,-22,-20,6,8,14,16,24,40,46,54,76,78});
    param1.add(new int[]{0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,1,1,0,1,0,0,1,1,1,0,1,0,1,0,0,1,1,1,1,0,1});
    param1.add(new int[]{5,41,60});
    param1.add(new int[]{-30,-38,58,-6,-2,-18,34,24,-52,56,-80,-82,20,64,54,-96,70,-78,78,54,6,-4,34,0,90,-74,-50,-40,16,-48,-4,78,80,-98,-12,-64,94,-42,-22,-34,96});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{62,30,71,1,83,88,62,50,88,80,22,98,62,43,84,21,23,89,78,5,36,21,17,30,54,88,66,48,83,12,4,50});
    List<Integer> param2 = new ArrayList<>();
    param2.add(10);
    param2.add(20);
    param2.add(40);
    param2.add(32);
    param2.add(11);
    param2.add(37);
    param2.add(2);
    param2.add(20);
    param2.add(38);
    param2.add(26);
    List<Integer> param3 = new ArrayList<>();
    param3.add(15);
    param3.add(27);
    param3.add(39);
    param3.add(19);
    param3.add(10);
    param3.add(44);
    param3.add(2);
    param3.add(28);
    param3.add(35);
    param3.add(22);
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