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
public class COUNT_INDEX_PAIRS_EQUAL_ELEMENTS_ARRAY_1{
public static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > hm = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( hm . containsKey ( arr [ i ] ) ) hm . put ( arr [ i ] , hm . get ( arr [ i ] ) + 1 ) ;
    else hm . put ( arr [ i ] , 1 ) ;
  }
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > it : hm . entrySet ( ) ) {
    int count = it . getValue ( ) ;
    ans += ( count * ( count - 1 ) ) / 2 ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,11,18,22,40,46,50,51,53,55,64,67,73,78,86});
    param0.add(new int[]{14,-98,98,58,-82,90,-80,-56,-30,-36,-56,-30,-58,68,72,-76,38,-90,-72,4,-32,32,-28,2,12,-72,54,2,0,-74,8,12,46,72,-84,-66,70,18,26,72,-26,44,-8,20,-32,-56,28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{93,23,62,64,31,78,99});
    param0.add(new int[]{-94,-94,-92,-86,-84,-76,-76,-68,-66,-56,-56,-54,-50,-46,-38,-34,-34,-30,-26,-18,-16,2,8,42,52,54,56,64,68,82,82,82,94,96,98});
    param0.add(new int[]{0});
    param0.add(new int[]{3,18,18,20,21,23,24,27,35,36,38,40,46,50,50,51,52,53,59,61,63,63,65,66,68,68,70,71,74,75,96,98});
    param0.add(new int[]{-68,40,16,50,36,42,-20,-46,-92,4,-18,-12,48,0,-46,64,-74,-50,42,44,-56,28,-10,78,62,70,-60,12,-44,-78});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{31,5});
    List<Integer> param1 = new ArrayList<>();
    param1.add(14);
    param1.add(24);
    param1.add(13);
    param1.add(4);
    param1.add(19);
    param1.add(0);
    param1.add(19);
    param1.add(23);
    param1.add(30);
    param1.add(1);
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