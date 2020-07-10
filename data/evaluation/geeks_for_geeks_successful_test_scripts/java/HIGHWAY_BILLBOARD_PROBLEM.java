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
public class HIGHWAY_BILLBOARD_PROBLEM{
static int f_gold ( int m , int [ ] x , int [ ] revenue , int n , int t ) {
  int [ ] maxRev = new int [ m + 1 ] ;
  for ( int i = 0 ;
  i < m + 1 ;
  i ++ ) maxRev [ i ] = 0 ;
  int nxtbb = 0 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    if ( nxtbb < n ) {
      if ( x [ nxtbb ] != i ) maxRev [ i ] = maxRev [ i - 1 ] ;
      else {
        if ( i <= t ) maxRev [ i ] = Math . max ( maxRev [ i - 1 ] , revenue [ nxtbb ] ) ;
        else maxRev [ i ] = Math . max ( maxRev [ i - t - 1 ] + revenue [ nxtbb ] , maxRev [ i - 1 ] ) ;
        nxtbb ++ ;
      }
    }
    else maxRev [ i ] = maxRev [ i - 1 ] ;
  }
  return maxRev [ m ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(16);
    param0.add(39);
    param0.add(5);
    param0.add(10);
    param0.add(14);
    param0.add(32);
    param0.add(2);
    param0.add(22);
    param0.add(15);
    param0.add(8);
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{6,15,15,18,23,29,32,36,37,39,40,41,44,49,51,52,53,57,66,68,82,89,96});
    param1.add(new int[]{76,60,88,46,-20,-78,-22,54,-18,92,-42,-66,-90,-72,-48,22,-72,-42,-46,94,82,-78,14,86,10,-64,-78,66,78,-36,50,-20,-40,-12,10,-46,56,-18,4,-76,-64,74,22,34,4,-2});
    param1.add(new int[]{0,0,0,1,1,1,1,1,1,1});
    param1.add(new int[]{21,69,30,10,71,72,71,78,30,9,72,10,7,87,30,46,56,74,73,60,86});
    param1.add(new int[]{-76,-76,-66,-64,-62,-60,-52,-48,-42,-28,-14,-6,-6,16,20,20,38,46,58,60,70,72,86,98});
    param1.add(new int[]{1,1,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1,0,1,0,1,1,0,1,0,1});
    param1.add(new int[]{16,38,72,82});
    param1.add(new int[]{28,-76,42,-2,30,-10,52,66,26,96,96,-72,26,-86,-30,-78,32,-32,58,12,-72,8,34,-68,-28,-66});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{95,12,65,97,92,49,94,32,37,97,9,35});
    List<int [ ]> param2 = new ArrayList<>();
    param2.add(new int[]{1,2,5,5,24,26,31,32,33,41,57,59,71,75,79,87,87,88,92,94,96,96,99});
    param2.add(new int[]{28,8,-60,84,68,-54,-56,0,-68,-84,-6,92,-80,-24,86,-6,-44,82,74,90,-46,40,62,50,-42,38,78,94,46,-14,-48,66,70,52,10,-88,54,-10,98,34,16,-2,-62,-56,-40,86});
    param2.add(new int[]{0,0,0,0,0,0,0,1,1,1});
    param2.add(new int[]{72,45,7,30,76,35,75,72,4,7,55,56,7,52,48,27,11,76,66,48,33});
    param2.add(new int[]{-90,-82,-78,-76,-74,-52,-48,-44,-44,-40,-38,-14,-6,10,20,38,38,40,44,48,52,54,76,78});
    param2.add(new int[]{0,1,0,1,0,0,0,1,0,0,0,1,0,1,1,0,1,1,0,1,1,0,1,0,0,1,0,1,0,1,0,1,1,0,1,0,1});
    param2.add(new int[]{15,34,56,74});
    param2.add(new int[]{68,-38,34,20,40,78,52,80,58,-12,-18,10,40,34,20,-32,-8,-46,8,62,94,-30,-94,26,-40,64});
    param2.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param2.add(new int[]{25,32,14,49,90,37,92,1,8,75,50,9});
    List<Integer> param3 = new ArrayList<>();
    param3.add(12);
    param3.add(25);
    param3.add(9);
    param3.add(18);
    param3.add(15);
    param3.add(28);
    param3.add(2);
    param3.add(13);
    param3.add(25);
    param3.add(9);
    List<Integer> param4 = new ArrayList<>();
    param4.add(12);
    param4.add(27);
    param4.add(6);
    param4.add(20);
    param4.add(17);
    param4.add(36);
    param4.add(3);
    param4.add(16);
    param4.add(15);
    param4.add(8);
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