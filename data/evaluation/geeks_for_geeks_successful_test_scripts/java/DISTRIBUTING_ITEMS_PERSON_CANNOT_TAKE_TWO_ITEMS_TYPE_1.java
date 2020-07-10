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
public class DISTRIBUTING_ITEMS_PERSON_CANNOT_TAKE_TWO_ITEMS_TYPE_1{
static boolean f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > hash = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! hash . containsKey ( arr [ i ] ) ) hash . put ( arr [ i ] , 0 ) ;
    hash . put ( arr [ i ] , hash . get ( arr [ i ] ) + 1 ) ;
  }
  for ( Map . Entry x : hash . entrySet ( ) ) if ( ( int ) x . getValue ( ) > 2 * k ) return false ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,1,2,3,1});
    param0.add(new int[]{2,3,3,5,3,3});
    param0.add(new int[]{0,0,1,1,1});
    param0.add(new int[]{7,60,78,91,80,75,85,21,41,63,1,84,69,13,94,25,54,54,52,68,53,35,17,37,98,27,2,31});
    param0.add(new int[]{-96,-94,-82,-80,-78,-66,-36,-24,-18,-12,-2,-2,6,8,10,12,36,38,42,58,64,68,82,84,86,88,94});
    param0.add(new int[]{0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,0,1,0,1,1,0,0,0,0,1,1,0,0,0,1,0,0,1,1,1,0});
    param0.add(new int[]{16,19,25,25,32,37,48,59,60,60,71,74,77,81,91,94});
    param0.add(new int[]{-62,-94,72,-22,86,-80,64,98,-82,-50,12,-4,56,46,-80,2,-86,-44,-26,68,-94,-82,74,26,94,40,50,-40,-42,-10});
    param0.add(new int[]{0,0,0,0,0,1,1,1});
    param0.add(new int[]{83,57,2,47,70,22,49,51,25,57,32,7,8,99,6,86,24,79,42,43,1,24,68,11,24,12,43,40,14,45,11,46,12,80,66});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(6);
    param1.add(2);
    param1.add(24);
    param1.add(24);
    param1.add(34);
    param1.add(10);
    param1.add(20);
    param1.add(5);
    param1.add(21);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(2);
    param2.add(1);
    param2.add(2);
    param2.add(3);
    param2.add(2);
    param2.add(8);
    param2.add(4);
    param2.add(2);
    param2.add(33);
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