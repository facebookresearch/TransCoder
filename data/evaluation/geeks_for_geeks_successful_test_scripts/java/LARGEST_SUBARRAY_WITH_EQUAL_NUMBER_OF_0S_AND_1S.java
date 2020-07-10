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
public class LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S{
static int f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  int maxsize = - 1 , startindex = 0 ;
  int endindex = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    sum = ( arr [ i ] == 0 ) ? - 1 : 1 ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      if ( arr [ j ] == 0 ) sum += - 1 ;
      else sum += 1 ;
      if ( sum == 0 && maxsize < j - i + 1 ) {
        maxsize = j - i + 1 ;
        startindex = i ;
      }
    }
  }
  endindex = startindex + maxsize - 1 ;
  if ( maxsize == - 1 ) System . out . println ( "No such subarray" ) ;
  else System . out . println ( startindex + " to " + endindex ) ;
  return maxsize ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{56,8,67,35,19,82,81,66,10,24,82,2,42,48,18,63,48,74,60,64,64,95,95,20,95,55,63,96,54});
    param0.add(new int[]{78,67,1,78,48,83,17,19,21,44,99,68,16,54,9});
    param0.add(new int[]{3,69,97,21,12,67,45,53,77,70,26,43});
    param0.add(new int[]{21,80,29,22,77,64,42,4,71,75,62,27,30,36,66,37,49,97});
    param0.add(new int[]{18,66,9,90,21,95,74,48,44,9,43,17});
    param0.add(new int[]{42,41,87,3,64,25,96,55,99,57,32,64,10,75,69,95,11,36,15,2,78,70,14,54,11,28,55,47,27,85,47,62,97,68,44,70,12,27,36,85,76,91,17,75,83,34,32,89,55});
    param0.add(new int[]{44});
    param0.add(new int[]{1,43,28,17,30,46,89,51,15,70,96,79,65,55,8});
    param0.add(new int[]{25,91,68,4,35,49,33});
    param0.add(new int[]{14,86,22,42,94,54,28,41,48,8,82,84,99,92,33,75,38,31,59,86,21,6,77,89,79,83,57,26,89,45,60,55,60,76,76,6,40,57,38,44,7,98,64,65,88,73,88,99});
    List<Integer> param1 = new ArrayList<>();
    param1.add(26);
    param1.add(8);
    param1.add(9);
    param1.add(10);
    param1.add(10);
    param1.add(41);
    param1.add(0);
    param1.add(9);
    param1.add(4);
    param1.add(26);
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