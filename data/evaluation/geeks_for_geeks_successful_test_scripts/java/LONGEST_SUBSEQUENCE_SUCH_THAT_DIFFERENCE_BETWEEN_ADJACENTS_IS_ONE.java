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
public class LONGEST_SUBSEQUENCE_SUCH_THAT_DIFFERENCE_BETWEEN_ADJACENTS_IS_ONE{
static int f_gold ( int arr [ ] , int n ) {
  int dp [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) dp [ i ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( ( arr [ i ] == arr [ j ] + 1 ) || ( arr [ i ] == arr [ j ] - 1 ) ) dp [ i ] = Math . max ( dp [ i ] , dp [ j ] + 1 ) ;
    }
  }
  int result = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( result < dp [ i ] ) result = dp [ i ] ;
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,13,15,17,18,20,22,24,28,34,37,43,46,47,49,51,52,54,58,64,65,77,78,79,87,90,92,93,94,97});
    param0.add(new int[]{-86,-56,76,86,42,-40,8,34,-48,-54,-80,6,42,48,76,-26,6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{5,22,15,26,29,47,22});
    param0.add(new int[]{-90,-84,-76,-76,-74,-74,-66,-58,-58,-56,-56,-44,-38,-36,-34,-32,-16,-10,2,6,24,24,24,34,36,54,60,68,70,76,88});
    param0.add(new int[]{0,1,1,1,0,0,1,0,1,0,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,1,0,1,1,1,1,0,0,0,1,0,0,1,1,1,0,0,1});
    param0.add(new int[]{1,3,12,12,12,12,14,17,18,19,23,27,28,30,35,38,42,44,45,48,52,59,61,64,65,69,73,76,77,82,83,85,87,99});
    param0.add(new int[]{-54,-20,24,-78,-58,64,34,70,-36,-24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{5,35,75,21,82,32,28,53,20,27,42,92,32,70,81,75,72,66,97,60,11,83,14,30,5,68,17,27,62,86,26,20,97,91,44,69});
    List<Integer> param1 = new ArrayList<>();
    param1.add(23);
    param1.add(15);
    param1.add(16);
    param1.add(5);
    param1.add(17);
    param1.add(26);
    param1.add(23);
    param1.add(8);
    param1.add(27);
    param1.add(20);
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