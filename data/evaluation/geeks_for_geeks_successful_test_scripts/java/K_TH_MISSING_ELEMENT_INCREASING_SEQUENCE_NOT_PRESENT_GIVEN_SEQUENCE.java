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
public class K_TH_MISSING_ELEMENT_INCREASING_SEQUENCE_NOT_PRESENT_GIVEN_SEQUENCE{
static int f_gold ( int a [ ] , int b [ ] , int k , int n1 , int n2 ) {
  LinkedHashSet < Integer > s = new LinkedHashSet < > ( ) ;
  for ( int i = 0 ;
  i < n2 ;
  i ++ ) s . add ( b [ i ] ) ;
  int missing = 0 ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    if ( ! s . contains ( a [ i ] ) ) missing ++ ;
    if ( missing == k ) return a [ i ] ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,9,9,13,38,41,50,59,64,64,72,78,79,80,84,92,94,98,99});
    param0.add(new int[]{-54,-80,-62,98,-68,42,98,80,-8,-6,26,0,-60,-24,-74,-48,4,-54,20,32,42,68,-50,58,-50,96,-34,22,56,-60,-10,-18,80,20,-50});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{85,44,60,86,26,22,95,47,43,24,30,37,22,33,6,56});
    param0.add(new int[]{-32,-18,2,54,72,92,94});
    param0.add(new int[]{1,0,1,0,1,0,1,0,1,0,1,1,1,0,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,0,1,0,1,1,1,0,0});
    param0.add(new int[]{3,9,13,14,16,19,20,21,23,26,27,27,28,29,31,36,37,38,41,42,45,46,52,56,63,65,70,70,72,72,76,77,78,78,79,82,83,86,87,87,90,93,93,94,96,96,97,98});
    param0.add(new int[]{-82,-62});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{26,5,60,53,35});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{5,9,11,21,24,27,30,35,38,39,40,45,48,48,51,58,61,91,92});
    param1.add(new int[]{90,-86,-82,92,-42,-34,10,-28,-78,8,66,96,-16,-22,-68,-36,-72,84,-54,-44,-80,-30,64,10,-60,-90,22,54,-88,74,-56,22,-24,-52,82});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param1.add(new int[]{66,76,38,91,57,50,12,21,90,17,18,78,23,12,90,81});
    param1.add(new int[]{-76,-68,-34,-24,8,12,32});
    param1.add(new int[]{0,0,1,1,1,0,0,0,0,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,0,1,1,0,1,0,0,1,1,0,1,0,1,1,0,1,1,0,1,0,1,0});
    param1.add(new int[]{2,5,6,7,9,11,11,13,17,18,20,20,26,27,35,35,36,37,41,42,45,46,48,49,50,50,54,54,56,60,62,63,65,67,68,68,70,72,74,74,78,79,80,80,86,89,97,99});
    param1.add(new int[]{48,32});
    param1.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{41,80,35,14,47});
    List<Integer> param2 = new ArrayList<>();
    param2.add(11);
    param2.add(24);
    param2.add(15);
    param2.add(12);
    param2.add(6);
    param2.add(29);
    param2.add(27);
    param2.add(1);
    param2.add(10);
    param2.add(3);
    List<Integer> param3 = new ArrayList<>();
    param3.add(9);
    param3.add(24);
    param3.add(15);
    param3.add(14);
    param3.add(3);
    param3.add(29);
    param3.add(39);
    param3.add(1);
    param3.add(14);
    param3.add(2);
    List<Integer> param4 = new ArrayList<>();
    param4.add(18);
    param4.add(21);
    param4.add(11);
    param4.add(10);
    param4.add(5);
    param4.add(37);
    param4.add(28);
    param4.add(1);
    param4.add(12);
    param4.add(3);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}