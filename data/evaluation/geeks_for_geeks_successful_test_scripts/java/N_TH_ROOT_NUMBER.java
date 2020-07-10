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
public class N_TH_ROOT_NUMBER{
static double f_gold ( int A , int N ) {
  double xPre = Math . random ( ) % 10 ;
  double eps = 0.001 ;
  double delX = 2147483647 ;
  double xK = 0.0 ;
  while ( delX > eps ) {
    xK = ( ( N - 1.0 ) * xPre + ( double ) A / Math . pow ( xPre , N - 1 ) ) / ( double ) N ;
    delX = Math . abs ( xK - xPre ) ;
    xPre = xK ;
  }
  return xK ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(74);
    param0.add(29);
    param0.add(29);
    param0.add(18);
    param0.add(96);
    param0.add(3);
    param0.add(35);
    param0.add(51);
    param0.add(19);
    List<Integer> param1 = new ArrayList<>();
    param1.add(85);
    param1.add(1);
    param1.add(4);
    param1.add(11);
    param1.add(6);
    param1.add(92);
    param1.add(61);
    param1.add(85);
    param1.add(88);
    param1.add(54);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i),param1.get(i))) )/ (Math.abs(f_filled(param0.get(i),param1.get(i))) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}