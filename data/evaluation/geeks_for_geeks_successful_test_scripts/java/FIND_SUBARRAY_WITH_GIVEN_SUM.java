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
public class FIND_SUBARRAY_WITH_GIVEN_SUM{
static int f_gold ( int arr [ ] , int n , int sum ) {
  int curr_sum , i , j ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    curr_sum = arr [ i ] ;
    for ( j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( curr_sum == sum ) {
        int p = j - 1 ;
        System . out . println ( "Sum found between indexes " + i + " and " + p ) ;
        return 1 ;
      }
      if ( curr_sum > sum || j == n ) break ;
      curr_sum = curr_sum + arr [ j ] ;
    }
  }
  System . out . println ( "No subarray found" ) ;
  return 0 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,8,8,10,15,18,19,22,25,26,30,32,35,36,40,41,43,48,53,57,59,63,64,68,71,76,76,77,78,89,96,97});
    param0.add(new int[]{-78,16,-16,-10,-2,-38,58,-72,-78,50,-68,-16,-96,82,70,2,-20});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{16,10,55,43,46,74,57,65,86,60,28,6,92});
    param0.add(new int[]{-98,-98,-90,-84,-84,-80,-76,-76,-70,-54,-48,-46,-44,-42,-38,-14,-12,-4,6,8,24,28,32,40,40,42,64,84,98});
    param0.add(new int[]{0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,1});
    param0.add(new int[]{2,10,40,45,56,66,66,70,75,83,93,98});
    param0.add(new int[]{-20,30,56,-68,54,-6,78,-86,88,-66,76,-66,62,78,22,46,-94,-10,18,16,-36,34,-98,-84,-40,98,82,10,12,54,-88});
    param0.add(new int[]{0,0,1,1});
    param0.add(new int[]{38,24,12});
    List<Integer> param1 = new ArrayList<>();
    param1.add(26);
    param1.add(9);
    param1.add(9);
    param1.add(10);
    param1.add(23);
    param1.add(12);
    param1.add(10);
    param1.add(30);
    param1.add(2);
    param1.add(1);
    List<Integer> param2 = new ArrayList<>();
    param2.add(23);
    param2.add(12);
    param2.add(11);
    param2.add(6);
    param2.add(19);
    param2.add(8);
    param2.add(10);
    param2.add(17);
    param2.add(2);
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