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
public class NUMBER_INDEXES_EQUAL_ELEMENTS_GIVEN_RANGE{
static int f_gold ( int a [ ] , int n , int l , int r ) {
  int count = 0 ;
  for ( int i = l ;
  i < r ;
  i ++ ) if ( a [ i ] == a [ i + 1 ] ) count += 1 ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,13,13,16,16,19,39,41,48,52,57,62,65,67,76,84,88,91,95,96,97,98});
    param0.add(new int[]{62,76,86,-8,84,-6,72,84,6,-50,-18,-94,54,90,-74,-64,-26,-14,-32,62,10,4,70,-28,8,18,4,-62,-76,84,-78,-4,84,98,58,-68,42,-6,34,-38,52,-84,78});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{11,75,98,29,62,53,48,91,86,66,48,94});
    param0.add(new int[]{-94,-84,-70,-70,-40,-40,-36,-24,10,48,62,74});
    param0.add(new int[]{1,0,1,1,0,1,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,0,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,0,0});
    param0.add(new int[]{1,2,6,7,10,11,13,19,19,25,29,30,32,34,35,45,45,46,47,48,48,53,58,61,64,65,67,75,76,81,81,84,84,85,86,94,94,96,99});
    param0.add(new int[]{-56,42,-34,-12,-86,82,-96,-66,30,16,-40,72,84,94,-48,-30,26,50,42,-44,-50,22,-38,8,34,94,2,16,-32,18,-58,12,-26,28,-62});
    param0.add(new int[]{0,0,0,0,1,1,1});
    param0.add(new int[]{6,29});
    List<Integer> param1 = new ArrayList<>();
    param1.add(18);
    param1.add(32);
    param1.add(10);
    param1.add(8);
    param1.add(11);
    param1.add(36);
    param1.add(25);
    param1.add(21);
    param1.add(4);
    param1.add(1);
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(38);
    param2.add(6);
    param2.add(6);
    param2.add(7);
    param2.add(40);
    param2.add(19);
    param2.add(30);
    param2.add(5);
    param2.add(1);
    List<Integer> param3 = new ArrayList<>();
    param3.add(17);
    param3.add(23);
    param3.add(6);
    param3.add(6);
    param3.add(8);
    param3.add(37);
    param3.add(37);
    param3.add(26);
    param3.add(5);
    param3.add(1);
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