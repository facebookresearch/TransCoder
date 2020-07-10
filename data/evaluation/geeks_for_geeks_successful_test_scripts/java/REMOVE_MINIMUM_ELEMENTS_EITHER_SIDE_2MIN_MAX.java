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
public class REMOVE_MINIMUM_ELEMENTS_EITHER_SIDE_2MIN_MAX{
static int f_gold ( int arr [ ] , int n ) {
  int longest_start = - 1 , longest_end = 0 ;
  for ( int start = 0 ;
  start < n ;
  start ++ ) {
    int min = Integer . MAX_VALUE , max = Integer . MIN_VALUE ;
    for ( int end = start ;
    end < n ;
    end ++ ) {
      int val = arr [ end ] ;
      if ( val < min ) {
        min = val ;
      }
      if ( val > max ) {
        max = val ;
      }
      if ( 2 * min <= max ) {
        break ;
      }
      if ( end - start > longest_end - longest_start || longest_start == - 1 ) {
        longest_start = start ;
        longest_end = end ;
      }
    }
  }
  if ( longest_start == - 1 ) {
    return n ;
  }
  return ( n - ( longest_end - longest_start + 1 ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{32,50,66,73,76,87});
    param0.add(new int[]{68,74,16,40,6,-44,-36,94,6,-24,-4,-58,-16,24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{91,22});
    param0.add(new int[]{-84,-80,-78,-76,-58,-54,-52,-48,-42,-42,-40,-38,-34,-32,-28,-24,-6,2,2,4,10,14,16,18,26,26,36,40,50,52,62,64,72,74,84,90,94,96,98});
    param0.add(new int[]{1,0,1,1,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,0,1});
    param0.add(new int[]{10,19,25,29,32,37,40,43,43,44,46,51,51,54,56,58,63,79,83,86,87,97,97});
    param0.add(new int[]{-48,-28,10,30,78,-72,78,52,-52,-68,56,42,8,-42,16,-56,2,-90,-26,-28,-56,-2,80,-50,98,-64,-96,10,-10,44,98,-48,-88,42,30,24,38,-26,-52,-12,0,34,-82,-80,0,-84,-20});
    param0.add(new int[]{0,0,1,1,1,1,1,1});
    param0.add(new int[]{25,82});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(11);
    param1.add(11);
    param1.add(1);
    param1.add(35);
    param1.add(13);
    param1.add(11);
    param1.add(25);
    param1.add(6);
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