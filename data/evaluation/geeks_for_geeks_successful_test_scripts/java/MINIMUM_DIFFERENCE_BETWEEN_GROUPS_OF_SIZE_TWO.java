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
public class MINIMUM_DIFFERENCE_BETWEEN_GROUPS_OF_SIZE_TWO{
static long f_gold ( long a [ ] , int n ) {
  Arrays . sort ( a ) ;
  int i , j ;
  Vector < Long > s = new Vector < > ( ) ;
  for ( i = 0 , j = n - 1 ;
  i < j ;
  i ++ , j -- ) s . add ( ( a [ i ] + a [ j ] ) ) ;
  long mini = Collections . min ( s ) ;
  long maxi = Collections . max ( s ) ;
  return Math . abs ( maxi - mini ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<long [ ]> param0 = new ArrayList<>();
    param0.add(new long[]{11L,12L,14L,15L,20L,21L,28L,28L,30L,33L,39L,39L,42L,43L,44L,45L,48L,53L,53L,58L,59L,67L,68L,70L,70L,72L,74L,76L,76L,81L,87L,91L});
    param0.add(new long[]{28L,-42L,-14L,0L,-56L,42L,14L,52L,58L,58L,92L,-62L,-14L,-12L,-84L,-30L,-94L,-70L,18L,-44L,88L,-60L});
    param0.add(new long[]{0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L});
    param0.add(new long[]{90L,8L,24L,31L,70L,61L,78L,67L,49L,28L,31L,4L,64L,66L,21L,61L,6L,49L,10L,46L,34L,31L,48L,28L,78L,70L,44L,9L,38L,2L,4L,36L,76L,37L,32L,97L,46L,85L,76L});
    param0.add(new long[]{-98L,-78L,-68L,-58L,-26L,-10L,32L,42L,90L,96L});
    param0.add(new long[]{1L,0L,0L,1L,0L,1L,1L,0L,0L,1L,0L,1L,1L,1L,1L,0L,1L,1L,0L,1L,1L,0L,0L,0L,1L,0L,1L,0L,1L,0L,0L,0L,1L,1L,0L,1L});
    param0.add(new long[]{8L,17L,23L,25L,29L,32L,35L,35L,52L,56L,57L,59L,70L,71L,77L,88L,96L});
    param0.add(new long[]{62L,-10L,82L,18L,46L});
    param0.add(new long[]{0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L});
    param0.add(new long[]{42L,71L,12L,33L,3L,58L,60L,60L,5L,52L,46L,53L,43L,50L,98L,53L,16L,82L,39L,93L,70L,13L,93L,69L,7L,92L,76L,11L,61L,48L,27L,28L,20L,76L,44L,24L,52L,56L,21L,82L,49L,5L,61L,76L,67L});
    List<Integer> param1 = new ArrayList<>();
    param1.add(31);
    param1.add(11);
    param1.add(19);
    param1.add(37);
    param1.add(8);
    param1.add(35);
    param1.add(16);
    param1.add(3);
    param1.add(20);
    param1.add(40);
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