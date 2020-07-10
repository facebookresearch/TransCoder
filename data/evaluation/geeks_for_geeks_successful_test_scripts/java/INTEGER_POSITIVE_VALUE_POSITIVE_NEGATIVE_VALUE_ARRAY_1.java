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
public class INTEGER_POSITIVE_VALUE_POSITIVE_NEGATIVE_VALUE_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  int neg = 0 , pos = 0 ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
    if ( arr [ i ] < 0 ) neg ++ ;
    else pos ++ ;
  }
  return ( sum / Math . abs ( neg - pos ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{49,98});
    param0.add(new int[]{82,66,-68,24,-10});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{56,3,18,5,20,56,47,29,60,98,60,40,42,2,54,56,91,8,93,14,31,27,61,49,23,12,71});
    param0.add(new int[]{-94,-94,-92,-86,-50,-48,-6,8,28,40,44,58,62,72,94});
    param0.add(new int[]{0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,0,0,1,1,1,0,1,0,1});
    param0.add(new int[]{16,56,56});
    param0.add(new int[]{74,-90,-92,30,-18,66,-66,22});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{21,64,82,78,30,34,35});
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(2);
    param1.add(8);
    param1.add(25);
    param1.add(12);
    param1.add(36);
    param1.add(1);
    param1.add(5);
    param1.add(7);
    param1.add(5);
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