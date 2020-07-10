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
public class OVERLAPPING_SUM_TWO_ARRAY{
static int f_gold ( int [ ] A , int [ ] B , int n ) {
  HashMap < Integer , Integer > hash = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( hash . containsKey ( A [ i ] ) ) hash . put ( A [ i ] , 1 + hash . get ( A [ i ] ) ) ;
    else hash . put ( A [ i ] , 1 ) ;
    if ( hash . containsKey ( B [ i ] ) ) hash . put ( B [ i ] , 1 + hash . get ( B [ i ] ) ) ;
    else hash . put ( B [ i ] , 1 ) ;
  }
  int sum = 0 ;
  for ( Map . Entry entry : hash . entrySet ( ) ) {
    if ( Integer . parseInt ( ( entry . getValue ( ) ) . toString ( ) ) == 1 ) sum += Integer . parseInt ( ( entry . getKey ( ) ) . toString ( ) ) ;
  }
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{13,31,63,75,90,92,94,98});
    param0.add(new int[]{-20});
    param0.add(new int[]{0,0,0,1,1,1});
    param0.add(new int[]{47,71,9,64,66,99,7,44,75,84,88,49,95,56,3,90,73,2});
    param0.add(new int[]{-76,-72,-70,-60,-44,-38,-38,-26,-16,-10,-4,-2,4,18,30,38,54,56,64,66,68,70,72,82,84});
    param0.add(new int[]{0,0,0,0,0,1,1,0,1,0,0,0,0,0,1,1,0,1,0,0,1,0,0,1,1,1});
    param0.add(new int[]{3,4,4,6,11,13,14,18,30,30,34,39,40,45,46,50,51,56,60,61,66,68,72,79,79,82,83,87,89,91,91,92,92,93,94});
    param0.add(new int[]{-14,12,98,34,58,-70,6,52,-50,96,-6});
    param0.add(new int[]{0,0,0,1,1,1,1,1});
    param0.add(new int[]{34,85,60,55,38,69,21,43,39,83,10,71,73,15,94,59,83,39,29,31,61,9,11,27,71,90,18,11,4,3,97,43,58,50,35,42,70,33,98,61,32,32,12,29});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{14,16,20,28,32,55,56,56});
    param1.add(new int[]{60});
    param1.add(new int[]{0,0,1,1,1,1});
    param1.add(new int[]{8,27,21,40,99,8,52,37,72,50,61,82,88,71,27,84,38,35});
    param1.add(new int[]{-80,-64,-50,-44,-34,-26,-24,-22,-6,-2,2,2,12,24,34,44,48,50,52,70,76,82,86,94,96});
    param1.add(new int[]{0,0,0,1,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0,1,1,0,0});
    param1.add(new int[]{3,7,15,15,21,23,30,32,35,38,38,41,41,41,44,45,49,52,60,60,63,66,66,70,72,74,74,75,79,81,87,88,89,93,96});
    param1.add(new int[]{50,-22,-82,40,-80,30,-58,-64,60,6,-28});
    param1.add(new int[]{0,0,1,1,1,1,1,1});
    param1.add(new int[]{74,10,95,67,59,17,32,87,87,12,22,45,50,35,25,51,10,86,75,4,74,43,92,63,60,28,32,72,66,61,43,48,20,89,55,59,22,85,73,43,7,65,53,98});
    List<Integer> param2 = new ArrayList<>();
    param2.add(6);
    param2.add(0);
    param2.add(5);
    param2.add(16);
    param2.add(16);
    param2.add(17);
    param2.add(22);
    param2.add(9);
    param2.add(5);
    param2.add(34);
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