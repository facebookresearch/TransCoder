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
public class LENGTH_LONGEST_STRICT_BITONIC_SUBSEQUENCE{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > inc = new HashMap < Integer , Integer > ( ) ;
  HashMap < Integer , Integer > dcr = new HashMap < Integer , Integer > ( ) ;
  int len_inc [ ] = new int [ n ] ;
  int len_dcr [ ] = new int [ n ] ;
  int longLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int len = 0 ;
    if ( inc . containsKey ( arr [ i ] - 1 ) ) len = inc . get ( arr [ i ] - 1 ) ;
    len_inc [ i ] = len + 1 ;
    inc . put ( arr [ i ] , len_inc [ i ] ) ;
  }
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int len = 0 ;
    if ( dcr . containsKey ( arr [ i ] - 1 ) ) len = dcr . get ( arr [ i ] - 1 ) ;
    len_dcr [ i ] = len + 1 ;
    dcr . put ( arr [ i ] , len_dcr [ i ] ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( longLen < ( len_inc [ i ] + len_dcr [ i ] - 1 ) ) longLen = len_inc [ i ] + len_dcr [ i ] - 1 ;
  return longLen ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{78});
    param0.add(new int[]{-6,-18,-48,58,-54,76,80,-56,86,58,-86,-86,-88,32,12,58,58,-16,86,-24,84,86,36,18,30,-32,-4,-36,-72,-4,42,94});
    param0.add(new int[]{0,1});
    param0.add(new int[]{92,26,72,8,66,28,34,61,28});
    param0.add(new int[]{-86,-82,-76,-68,-66,-64,-62,-56,-48,-42,-38,-30,-22,-18,-10,-10,-4,-2,4,28,42,44,50,50,56,58,60,76,82,86,86,98});
    param0.add(new int[]{0,0,1,0,1,1,0,0,1,0,1,1,0,1,1,1,0,0,0,0,1,0});
    param0.add(new int[]{3,4,8,9,12,13,16,19,23,25,29,31,34,36,38,41,42,47,49,50,51,51,58,63,66,70,73,74,75,75,75,76,76,80,82,83,83,84,86,89,90,91,91,95,96});
    param0.add(new int[]{4,-76,60,48,-14,72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{66,80,79,72,1,67,20,67,32,40,22,64,58,67,10,21,37,49});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(18);
    param1.add(1);
    param1.add(5);
    param1.add(25);
    param1.add(17);
    param1.add(44);
    param1.add(3);
    param1.add(17);
    param1.add(15);
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