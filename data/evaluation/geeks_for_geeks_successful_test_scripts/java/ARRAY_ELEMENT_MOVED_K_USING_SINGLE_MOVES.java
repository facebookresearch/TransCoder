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
public class ARRAY_ELEMENT_MOVED_K_USING_SINGLE_MOVES{
static int f_gold ( int a [ ] , int n , int k ) {
  if ( k >= n - 1 ) return n ;
  int best = 0 , times = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] > best ) {
      best = a [ i ] ;
      if ( i == 1 ) times = 1 ;
    }
    else times += 1 ;
    if ( times >= k ) return best ;
  }
  return best ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,5,5,9,10,10,11,14,23,27,31,32,33,33,33,37,39,41,41,42,42,43,47,60,61,68,73,73,73,78,80,80,82,83,86,87,89,92,94,98});
    param0.add(new int[]{80,-58,64,48,-16,60,-50,-52,62,-86,-96,52,26,-30,14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1});
    param0.add(new int[]{90,23,43,42,7,71,79});
    param0.add(new int[]{-96,-96,-90,-84,-68,-64,-56,-56,-50,-50,-48,-46,-28,-18,0,0,6,32,32,34,42,42,46,50,50,52,64,64,70,76,84,88});
    param0.add(new int[]{1,1,1});
    param0.add(new int[]{2,9,15,19,26,29,42,45,46,47,55,60,60,61,62,64,68,69,74,79,96});
    param0.add(new int[]{-32,12,80,42,80,8,58,-76,-42,-98,22,-90,-16,-4,-62,-32,28,12,78,-52,-84,78,88,-76,-52,68,-34,-16,-4,2,-78,-94,-22,34,6,-62,72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{52,19});
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(14);
    param1.add(7);
    param1.add(4);
    param1.add(28);
    param1.add(1);
    param1.add(14);
    param1.add(26);
    param1.add(26);
    param1.add(1);
    List<Integer> param2 = new ArrayList<>();
    param2.add(37);
    param2.add(13);
    param2.add(6);
    param2.add(4);
    param2.add(21);
    param2.add(2);
    param2.add(17);
    param2.add(31);
    param2.add(14);
    param2.add(1);
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