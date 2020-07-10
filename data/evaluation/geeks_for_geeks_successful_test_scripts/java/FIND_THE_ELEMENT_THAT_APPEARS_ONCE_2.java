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
public class FIND_THE_ELEMENT_THAT_APPEARS_ONCE_2{
static int f_gold ( int a [ ] , int n ) {
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i : a ) {
    s . add ( i ) ;
  }
  int arr_sum = 0 ;
  for ( int i : a ) {
    arr_sum += i ;
  }
  int set_sum = 0 ;
  for ( int i : s ) {
    set_sum += i ;
  }
  return ( 3 * set_sum - arr_sum ) / 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,3,3,12,16,28,31,44,48,57,59,60,68,69,70,70,72,73,76,78,78,79,84,86,93,96});
    param0.add(new int[]{-2,-62,8,-96,-50,-70,-48,-20,76,-54,-62,8,30,-68,-64,-94,-10,-78,-68,-98,0,30,62,-40,-36,90,-46,38,28,-86,-20,12,56,-50,82,-18,-28,-62,88,-58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{85,33,83,92,40,53,18,39,17,71,15,85,44,12,56,77,54,87,11,74,11,9,73,72,64,98,18,13,74,64,59,44,95,56,6,96,47,36,35,51,30,39,91,74,68});
    param0.add(new int[]{-94,-90,-82,-80,-74,-40,-40,-38,-36,-28,-26,-20,-16,-14,-14,-10,-8,-8,10,14,18,22,22,28,28,30,74,82});
    param0.add(new int[]{1,1,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,1,1,0,1,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{2,6,6,12,13,13,15,16,24,25,29,36,42,44,47,47,47,48,51,51,55,55,55,58,58,60,61,62,62,64,66,70,70,75,76,77,78,78,79,80,80,82,83,83,84,85,90,99});
    param0.add(new int[]{-94,50,-86,-94,92,-50,74,-54,54,-20,-28,-44,-94,-80,-12,-38,64,-22,38,70,-4,62,66,88,-94,72,88,32,-80,60,-70,-74,-66,82,82});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{62,29,76,58,16,7,83,45,17,67,88,78,6,36,33,99,39,59,77,64,32,20,10,92,3,20,7,14,11,28});
    List<Integer> param1 = new ArrayList<>();
    param1.add(14);
    param1.add(26);
    param1.add(18);
    param1.add(35);
    param1.add(27);
    param1.add(35);
    param1.add(42);
    param1.add(34);
    param1.add(7);
    param1.add(26);
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