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
public class MINIMUM_NUMBER_PLATFORMS_REQUIRED_RAILWAYBUS_STATION{
static int f_gold ( int arr [ ] , int dep [ ] , int n ) {
  Arrays . sort ( arr ) ;
  Arrays . sort ( dep ) ;
  int plat_needed = 1 , result = 1 ;
  int i = 1 , j = 0 ;
  while ( i < n && j < n ) {
    if ( arr [ i ] <= dep [ j ] ) {
      plat_needed ++ ;
      i ++ ;
      if ( plat_needed > result ) result = plat_needed ;
    }
    else {
      plat_needed -- ;
      j ++ ;
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{8,24,28,64,75,86,93,95});
    param0.add(new int[]{2,-30,-8,-78,58,-42,-94,84,-58,14,78,34,30,6,-18,-92,0,94,-54,58,0,-86,66,86,8,-26,50,16,-30,-68,98,-28,-4,-6});
    param0.add(new int[]{0,0,0,0,0,0,1});
    param0.add(new int[]{51,5,48,61,71,2,4,35,50,76,59,64,81,5,21,95});
    param0.add(new int[]{-64,-52,44,52,90});
    param0.add(new int[]{0,0,1,0,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1});
    param0.add(new int[]{2,15,25,55,72,96,98});
    param0.add(new int[]{-60,30,-58,52,40,74,74,76,-72,-48,8,-56,-24,-40,-98,-76,-56,-20,30,-30,-34,4,-34});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{37,84,20,34,56,1,87,72});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{19,30,41,51,62,68,85,96});
    param1.add(new int[]{40,22,-24,80,-76,-4,-8,-34,96,-98,16,28,14,52,10,-10,-62,64,-48,10,-64,-90,-52,46,34,50,50,-84,68,-12,-44,28,-22,78});
    param1.add(new int[]{0,0,0,0,0,1,1});
    param1.add(new int[]{67,84,86,43,50,90,49,8,40,67,5,51,40,28,31,47});
    param1.add(new int[]{-62,-16,22,26,58});
    param1.add(new int[]{0,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0});
    param1.add(new int[]{3,6,11,19,26,37,39});
    param1.add(new int[]{-96,-40,-76,52,-20,-28,-64,-72,36,56,52,34,14,8,-50,6,-82,-98,-8,18,-76,-66,-22});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{68,62,84,54,15,29,70,96});
    List<Integer> param2 = new ArrayList<>();
    param2.add(6);
    param2.add(18);
    param2.add(6);
    param2.add(8);
    param2.add(3);
    param2.add(17);
    param2.add(6);
    param2.add(20);
    param2.add(22);
    param2.add(6);
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