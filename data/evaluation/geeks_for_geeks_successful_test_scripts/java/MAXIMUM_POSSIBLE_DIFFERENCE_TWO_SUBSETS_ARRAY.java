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
public class MAXIMUM_POSSIBLE_DIFFERENCE_TWO_SUBSETS_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int SubsetSum_1 = 0 , SubsetSum_2 = 0 ;
  for ( int i = 0 ;
  i <= n - 1 ;
  i ++ ) {
    boolean isSingleOccurance = true ;
    for ( int j = i + 1 ;
    j <= n - 1 ;
    j ++ ) {
      if ( arr [ i ] == arr [ j ] ) {
        isSingleOccurance = false ;
        arr [ i ] = arr [ j ] = 0 ;
        break ;
      }
    }
    if ( isSingleOccurance ) {
      if ( arr [ i ] > 0 ) SubsetSum_1 += arr [ i ] ;
      else SubsetSum_2 += arr [ i ] ;
    }
  }
  return Math . abs ( SubsetSum_1 - SubsetSum_2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,14,15,21,42,42,42,46,46,48,48,48,52,52,53,60,62,69,69,79,82,86,96});
    param0.add(new int[]{-54,4,-22,94,58,-28,-12,84,64,4,-34,16,-10,-32,50,-78,68,-52,-64,66,64,-28,-38,-18,-84,-66,-36,64,-12,44,48,8,42});
    param0.add(new int[]{0,0,0,1});
    param0.add(new int[]{63,49,18,36,21,30,45,87});
    param0.add(new int[]{-96,-78,-78,-72,-62,-56,-52,-44,-38,-38,-28,-22,-20,-12,-6,-6,-2,2,2,4,36,44,46,50,50,54,66,92});
    param0.add(new int[]{0,1,1,0,0,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,1,0,1,0,0,1,0,0,1,0,1,0,0,1,1,1,0});
    param0.add(new int[]{1,2,8,12,13,13,14,17,18,27,28,31,34,37,38,42,43,45,49,52,53,56,56,58,62,66,71,74,87,93,96,99});
    param0.add(new int[]{30,-28,-30,86,-8,-80,76,-2,28,30,82,84,-32,82,-88,-24,42,16,-32,-8,78,-8,-46,-6,-86,-86,-24,-12,-32,-72,84,-82,76,-84,80,-50,90,-50,-14,-82,78,48,-10,86,34,-20,-76,58});
    param0.add(new int[]{0,1});
    param0.add(new int[]{83,86,57,18,98,52,1,37,11,49,10,67,2,60,30,42,8,97,25,55,5,75,9,67});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(28);
    param1.add(2);
    param1.add(6);
    param1.add(18);
    param1.add(34);
    param1.add(25);
    param1.add(28);
    param1.add(1);
    param1.add(16);
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