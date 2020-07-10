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
public class CEILING_IN_A_SORTED_ARRAY_1{
static int f_gold ( int arr [ ] , int low , int high , int x ) {
  int mid ;
  if ( x <= arr [ low ] ) return low ;
  if ( x > arr [ high ] ) return - 1 ;
  mid = ( low + high ) / 2 ;
  if ( arr [ mid ] == x ) return mid ;
  else if ( arr [ mid ] < x ) {
    if ( mid + 1 <= high && x <= arr [ mid + 1 ] ) return mid + 1 ;
    else return f_gold ( arr , mid + 1 , high , x ) ;
  }
  else {
    if ( mid - 1 >= low && x > arr [ mid - 1 ] ) return mid ;
    else return f_gold ( arr , low , mid - 1 , x ) ;
  }
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,6,13,16,23,24,24,27,30,32,34,34,55,56,56,63,66,81,83,96});
    param0.add(new int[]{-28,-96,48,22,-12,72,48,-70,-96,-84,-62,22,18,-92,-74,14,28,52,64,72,16,-76,46});
    param0.add(new int[]{0,1});
    param0.add(new int[]{51,98,25,10,43,91,33,25,85,51,94,6,35,48,11,97,67,21,50,9,11,51,86,61,22,88,89,11});
    param0.add(new int[]{-94,-92,-88,-74,-52,-50,-48,-44,-40,-36,-32,-26,20,22,30,32,46,56,56,60,62,64,80,84,86,94,96,96});
    param0.add(new int[]{1,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0});
    param0.add(new int[]{4,5,5,13,26,40,46,51,58,60,64,66,68,69,71,74,78,81,83,88,88,90,98,99});
    param0.add(new int[]{92,6,-54,84,-10,32,50,40,-38,64,-64,-10,70,-68,-6,-16,68,34,-66,-82,84,98,50,82,78,4,34,-34,78,64,32,58,-94,40,50,0,-92,-36,10,-54,58,-78,-88,32,6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{80,67,30,35,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(11);
    param1.add(1);
    param1.add(20);
    param1.add(20);
    param1.add(15);
    param1.add(12);
    param1.add(23);
    param1.add(24);
    param1.add(2);
    List<Integer> param2 = new ArrayList<>();
    param2.add(11);
    param2.add(18);
    param2.add(1);
    param2.add(20);
    param2.add(15);
    param2.add(17);
    param2.add(17);
    param2.add(28);
    param2.add(17);
    param2.add(3);
    List<Integer> param3 = new ArrayList<>();
    param3.add(18);
    param3.add(21);
    param3.add(1);
    param3.add(15);
    param3.add(15);
    param3.add(22);
    param3.add(14);
    param3.add(28);
    param3.add(22);
    param3.add(2);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}