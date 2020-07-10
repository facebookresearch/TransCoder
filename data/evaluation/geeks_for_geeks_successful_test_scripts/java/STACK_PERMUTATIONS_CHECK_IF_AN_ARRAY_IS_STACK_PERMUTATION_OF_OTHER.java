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
public class STACK_PERMUTATIONS_CHECK_IF_AN_ARRAY_IS_STACK_PERMUTATION_OF_OTHER{
static boolean f_gold ( int ip [ ] , int op [ ] , int n ) {
  Queue < Integer > input = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    input . add ( ip [ i ] ) ;
  }
  Queue < Integer > output = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    output . add ( op [ i ] ) ;
  }
  Stack < Integer > tempStack = new Stack < > ( ) ;
  while ( ! input . isEmpty ( ) ) {
    int ele = input . poll ( ) ;
    if ( ele == output . peek ( ) ) {
      output . poll ( ) ;
      while ( ! tempStack . isEmpty ( ) ) {
        if ( tempStack . peek ( ) == output . peek ( ) ) {
          tempStack . pop ( ) ;
          output . poll ( ) ;
        }
        else break ;
      }
    }
    else {
      tempStack . push ( ele ) ;
    }
  }
  return ( input . isEmpty ( ) && tempStack . isEmpty ( ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,3,3,4,5,6,9,18,20,35,39,39,45,50,55,57,61,63,65,72,73,77,77,78,87,88,91,93,95,98});
    param0.add(new int[]{-86,10,-8,8,-24,-2,-84,-86,-54,50,56,-22,-8,-62,0,-50,-32});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{3,42,88,89,41,71,67,5,84,20,75,36,34,20,31,16,86,89,53,47,57,27,47,93,59,66,40,18,69,36,98,99,81});
    param0.add(new int[]{-98,-94,-94,-90,-88,-82,-80,-78,-78,-68,-58,-58,-52,-36,-30,-14,-12,-6,-2,-2,2,4,10,14,22,24,26,38,38,46,46,48,50,54,58,60,64,64,66,70,74,74,86,88,96,96});
    param0.add(new int[]{1,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1});
    param0.add(new int[]{19,37,44,65,72,87});
    param0.add(new int[]{88});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{5,8,53,60,85,94,77,53,81,54,67,48,56,49,16,1,85,6,55,98,62,36,4,7,64});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{2,5,7,13,16,23,24,25,27,31,31,33,34,35,38,46,49,49,51,52,58,61,62,66,68,71,73,78,91,94,98});
    param1.add(new int[]{-8,-46,22,-66,-94,-96,70,58,-4,-70,-96,34,-80,-26,-52,52,-76});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{16,61,39,99,71,73,35,47,62,80,1,49,54,35,39,55,7,6,85,84,11,51,38,4,72,10,33,65,64,32,16,99,9});
    param1.add(new int[]{-92,-92,-80,-72,-72,-72,-70,-68,-64,-56,-40,-38,-34,-24,-10,-8,-8,-2,0,2,4,6,14,14,18,20,34,36,36,38,38,42,48,56,64,70,72,76,76,76,76,78,84,90,94,96});
    param1.add(new int[]{0,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0});
    param1.add(new int[]{17,31,39,46,56,88});
    param1.add(new int[]{-30});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1});
    param1.add(new int[]{69,37,32,5,84,14,25,9,86,85,30,82,99,92,32,43,79,58,75,90,49,54,95,76,80});
    List<Integer> param2 = new ArrayList<>();
    param2.add(23);
    param2.add(16);
    param2.add(21);
    param2.add(19);
    param2.add(27);
    param2.add(19);
    param2.add(4);
    param2.add(0);
    param2.add(13);
    param2.add(12);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}