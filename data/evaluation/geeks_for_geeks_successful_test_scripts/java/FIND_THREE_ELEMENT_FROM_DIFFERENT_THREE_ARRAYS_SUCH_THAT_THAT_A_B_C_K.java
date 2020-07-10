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
public class FIND_THREE_ELEMENT_FROM_DIFFERENT_THREE_ARRAYS_SUCH_THAT_THAT_A_B_C_K{
static boolean f_gold ( int a1 [ ] , int a2 [ ] , int a3 [ ] , int n1 , int n2 , int n3 , int sum ) {
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) for ( int j = 0 ;
  j < n2 ;
  j ++ ) for ( int k = 0 ;
  k < n3 ;
  k ++ ) if ( a1 [ i ] + a2 [ j ] + a3 [ k ] == sum ) return true ;
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,9,10,19,24,25,26,30,36,43,44,49,52,62,66,69,72,77,80,80,82,84,90,93,94,98});
    param0.add(new int[]{-24,-80,-72,80,-96,-94,64,18,12,16,74,16,54,66,-96,-90,54,72,-32,-2,90,-18,-98,12,-42,-30,-82,-56,-86,40});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{28,15,21,28,85,68,24});
    param0.add(new int[]{-86,-82,-66,-44,-44,-38,-22,-6,-2,14,26,40,54,58,60,66,72,80,94,96,98});
    param0.add(new int[]{1,1,1,0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,0,1,1,0,0,0,1,0,1,1,1,0,0,1,0,1});
    param0.add(new int[]{44,53,85,85,86,88,93});
    param0.add(new int[]{70,-38,62,-34,74,-32,-58,-34,-54});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{41,64,39,96,54,54,57,4,82,43,44,56,1});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{4,8,17,20,22,25,27,30,31,33,35,35,38,41,49,51,60,61,66,67,69,82,84,85,86,88});
    param1.add(new int[]{30,-60,-24,18,40,44,-40,62,66,-38,50,-74,-42,-86,-82,-8,50,-72,-2,-48,-38,-20,-8,56,-32,68,94,80,-48,0});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param1.add(new int[]{57,46,47,49,16,81,60});
    param1.add(new int[]{-96,-86,-74,-56,-52,-42,-32,-22,-16,-10,-4,-4,10,42,48,52,58,62,84,90,96});
    param1.add(new int[]{0,1,1,1,1,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,1,0,1,1,0,1,0,1});
    param1.add(new int[]{4,5,8,15,29,40,91});
    param1.add(new int[]{48,-86,-18,14,88,92,-56,-8,-74});
    param1.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{44,58,40,87,22,82,8,81,88,42,15,14,81});
    List<int [ ]> param2 = new ArrayList<>();
    param2.add(new int[]{12,14,17,20,22,27,29,31,32,38,41,43,56,59,59,64,66,67,68,69,71,76,83,83,85,99});
    param2.add(new int[]{-24,80,50,-56,-92,20,86,-42,-30,96,40,-32,-64,54,-38,-72,-70,54,-28,98,60,98,-12,-30,-30,68,-66,68,-58,52});
    param2.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1});
    param2.add(new int[]{76,49,6,44,71,24,57});
    param2.add(new int[]{-92,-92,-90,-82,-62,-44,-42,-40,-38,-36,-22,-20,-8,12,22,26,30,44,54,64,86});
    param2.add(new int[]{1,0,1,0,0,0,1,1,1,0,1,1,1,0,0,0,1,1,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,0});
    param2.add(new int[]{30,53,71,75,76,82,84});
    param2.add(new int[]{8,8,32,76,76,94,22,-60,-42});
    param2.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param2.add(new int[]{64,20,24,42,37,46,6,47,12,93,8,5,11});
    List<Integer> param3 = new ArrayList<>();
    param3.add(25);
    param3.add(26);
    param3.add(14);
    param3.add(6);
    param3.add(13);
    param3.add(25);
    param3.add(5);
    param3.add(6);
    param3.add(15);
    param3.add(7);
    List<Integer> param4 = new ArrayList<>();
    param4.add(18);
    param4.add(22);
    param4.add(14);
    param4.add(5);
    param4.add(20);
    param4.add(25);
    param4.add(3);
    param4.add(6);
    param4.add(14);
    param4.add(8);
    List<Integer> param5 = new ArrayList<>();
    param5.add(16);
    param5.add(20);
    param5.add(14);
    param5.add(5);
    param5.add(17);
    param5.add(23);
    param5.add(4);
    param5.add(6);
    param5.add(10);
    param5.add(6);
    List<Integer> param6 = new ArrayList<>();
    param6.add(222);
    param6.add(21);
    param6.add(2);
    param6.add(73);
    param6.add(6);
    param6.add(0);
    param6.add(3);
    param6.add(7);
    param6.add(13);
    param6.add(10);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i),param5.get(i),param6.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i),param5.get(i),param6.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}