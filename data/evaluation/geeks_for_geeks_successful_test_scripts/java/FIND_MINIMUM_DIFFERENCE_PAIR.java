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
public class FIND_MINIMUM_DIFFERENCE_PAIR{
static int f_gold ( int [ ] arr , int n ) {
  int diff = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) if ( Math . abs ( ( arr [ i ] - arr [ j ] ) ) < diff ) diff = Math . abs ( ( arr [ i ] - arr [ j ] ) ) ;
  return diff ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,1,2,3,5,8,10,11,15,15,16,20,26,28,30,30,33,33,39,50,50,50,54,62,66,68,69,69,74,74,75,75,76,78,82,83,85,86,86,89,89,91,91,92,92,92,93,94,98});
    param0.add(new int[]{6,6,-20,88,-78,-18,74,72,80,76,-62,38});
    param0.add(new int[]{0,1,1,1,1});
    param0.add(new int[]{75,85,49,66,44,89,80,39,64,70,25,21,81,33,90,68,51});
    param0.add(new int[]{-96,-10,0,4,54,64});
    param0.add(new int[]{1,0,1,0,0,1,0,0,0,0,1,0,1,1,0,1,1,1,1,0,1,1,0,1,1,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,0});
    param0.add(new int[]{3,3,5,5,7,7,9,11,11,18,18,18,20,29,29,31,31,32,37,43,44,46,48,50,52,52,53,63,63,65,69,72,76,76,81,84,85,86,87,87,90,94,97,97});
    param0.add(new int[]{40,-46,72,-28,8,90,86,-90,8,-66,-98,6,42,86,88,42,-50,74,-34,-16,-94,-56,-18,-18,84,-44,34,80,96,42,-50,-92,70,80,62,-38,-4,68,54,-14,30,-18,-58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{15,41,32,19,68,36,61,59,5,91,53,95,10,64,15,32,14,64,48,70,85,19,83,2,33,58,93,88,21,88,45,45,18,8});
    List<Integer> param1 = new ArrayList<>();
    param1.add(32);
    param1.add(11);
    param1.add(3);
    param1.add(16);
    param1.add(3);
    param1.add(41);
    param1.add(27);
    param1.add(33);
    param1.add(26);
    param1.add(24);
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