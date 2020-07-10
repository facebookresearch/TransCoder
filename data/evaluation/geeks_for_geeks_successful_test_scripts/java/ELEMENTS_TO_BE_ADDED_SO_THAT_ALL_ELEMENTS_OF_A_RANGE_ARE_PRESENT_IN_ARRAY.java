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
public class ELEMENTS_TO_BE_ADDED_SO_THAT_ALL_ELEMENTS_OF_A_RANGE_ARE_PRESENT_IN_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int count = 0 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) if ( arr [ i ] != arr [ i + 1 ] && arr [ i ] != arr [ i + 1 ] - 1 ) count += arr [ i + 1 ] - arr [ i ] - 1 ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,4,5,7,7,9,13,15,18,19,25,27,27,29,32,36,48,51,53,53,55,65,66,67,72,74,74,76,77,79,80,81,82,83,83,86,87,97,98,98,99});
    param0.add(new int[]{34,6,-16,-26,-80,-90,-74,16,-84,64,-8,14,-52,-26,-90,-84,94,92,-88,-84,72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{25,29,12,79,23,92,54,43,26,10,43,39,32,12,62,13,13});
    param0.add(new int[]{-94,-86,-72,-64,-64,-58,-56,-56,-56,-56,-54,-54,-52,-42,-42,-40,-36,-32,-28,-22,-20,-18,-12,-8,-6,-4,0,2,4,10,16,30,32,48,48,60,70,74,76,84});
    param0.add(new int[]{1,1,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,1,0,1,0,1,1,0,0,1,0,1,1,1,0});
    param0.add(new int[]{4,5,8,12,16,16,17,20,20,23,26,26,27,28,32,34,40,40,41,41,44,45,47,49,51,52,54,57,60,62,63,64,66,68,69,70,71,76,77,80,80,80,90,91,92,94,96,98,99});
    param0.add(new int[]{66,-46,-92,-40,76,74,10,20,56,-46,88,-18,48,96,-48,-86,38,-98,50,4,-52,-38,14,-48,96,16,-74,-26,80,14,-92,-60,-78,-68,96,-72,-44,-92,2,60,4,48,84,-92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{49,84,66});
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(17);
    param1.add(24);
    param1.add(14);
    param1.add(35);
    param1.add(29);
    param1.add(42);
    param1.add(37);
    param1.add(17);
    param1.add(2);
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