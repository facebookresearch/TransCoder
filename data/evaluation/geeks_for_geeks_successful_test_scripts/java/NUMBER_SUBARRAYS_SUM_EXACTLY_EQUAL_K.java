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
public class NUMBER_SUBARRAYS_SUM_EXACTLY_EQUAL_K{
static int f_gold ( int arr [ ] , int n , int sum ) {
  HashMap < Integer , Integer > prevSum = new HashMap < > ( ) ;
  int res = 0 ;
  int currsum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    currsum += arr [ i ] ;
    if ( currsum == sum ) res ++ ;
    if ( prevSum . containsKey ( currsum - sum ) ) res += prevSum . get ( currsum - sum ) ;
    Integer count = prevSum . get ( currsum ) ;
    if ( count == null ) prevSum . put ( currsum , 1 ) ;
    else prevSum . put ( currsum , count + 1 ) ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{9,18,27,52,70,91});
    param0.add(new int[]{60,-88,-48,90,-28,20,18,34,-58,76,-78,-18,68,-48,8,34,60,-34,-10,32,78,-84,-22,54,-18,-82,-70,-58,-20,-76,88,-30,-6,68});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{67,39,22,32,59,44,86,26,46,60,99,12,32,46,16,22,45,85,21,92,77,50,65,23,93,26,23,20,32,83,60,22,11,45,99,31,72});
    param0.add(new int[]{-86,-84,-82,-82,-28,-12,4,24,62,72});
    param0.add(new int[]{1,0,0,1,0,1,1,1,0,1,1,1,0,0,1,1,1,1});
    param0.add(new int[]{8,20,25,27,28,28,30,31,32,36,39,41,51,53,53,54,56,58,59,77,78,85,88,92,99});
    param0.add(new int[]{60,40,-96,-76,-34,-18,38,-62,50,56,64,-94,-50,50,-80,42,-66,-42,68,70,78,-18,-24,-48,-92,64,14,24,-94,-98,18,44,-58});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{73,52,37,80,4,26,3,76,32,79,31,32,8,87,42,50,51});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(32);
    param1.add(11);
    param1.add(25);
    param1.add(7);
    param1.add(16);
    param1.add(13);
    param1.add(22);
    param1.add(11);
    param1.add(8);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(30);
    param2.add(11);
    param2.add(25);
    param2.add(5);
    param2.add(13);
    param2.add(18);
    param2.add(17);
    param2.add(8);
    param2.add(14);
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