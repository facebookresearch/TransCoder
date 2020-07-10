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
public class MINIMUM_SWAPS_REQUIRED_BRING_ELEMENTS_LESS_EQUAL_K_TOGETHER{
static int f_gold ( int arr [ ] , int n , int k ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) if ( arr [ i ] <= k ) ++ count ;
  int bad = 0 ;
  for ( int i = 0 ;
  i < count ;
  ++ i ) if ( arr [ i ] > k ) ++ bad ;
  int ans = bad ;
  for ( int i = 0 , j = count ;
  j < n ;
  ++ i , ++ j ) {
    if ( arr [ i ] > k ) -- bad ;
    if ( arr [ j ] > k ) ++ bad ;
    ans = Math . min ( ans , bad ) ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,12,15,30,33,34,53,66,73,74,76,77,85,90});
    param0.add(new int[]{-62,-20,-26,-24,92,66,-74,-4,18,-82,-36,92,-4,92,-80,56,-24,4,-48,-10,-14,-46,-16,-58,-58,-6,-68,-22,-82,-16,76,-30,-86,-38,-66,28,58,30,-44,-56});
    param0.add(new int[]{0,0,0,0,0,1,1});
    param0.add(new int[]{8,48,64,77,61,60,96,95,41,68,9,67,10,66,16,59,83,21,47,16,13,85,52,11,48,31,99,57,57,44,66,93,80,69,23,2,55,90});
    param0.add(new int[]{-80,-58,-40,-34,14,36,48,56,58,60,84,90,92,92});
    param0.add(new int[]{1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,0,1,0,1,0,1,1,0,1,0,0,0,1});
    param0.add(new int[]{4,4,8,9,13,17,18,19,21,22,22,23,27,28,30,44,46,48,53,53,55,60,61,62,68,70,70,71,73,80,82,82,85,88,90,93,99});
    param0.add(new int[]{-28,50,82,-32,32,-78,12,50,38,34,-10,6,86,-56,-2});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{37,88,83,91,11,39,98,70,93,74,24,90,66,3,6,28});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(24);
    param1.add(5);
    param1.add(36);
    param1.add(7);
    param1.add(26);
    param1.add(28);
    param1.add(13);
    param1.add(9);
    param1.add(12);
    List<Integer> param2 = new ArrayList<>();
    param2.add(8);
    param2.add(28);
    param2.add(6);
    param2.add(24);
    param2.add(8);
    param2.add(23);
    param2.add(36);
    param2.add(9);
    param2.add(8);
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