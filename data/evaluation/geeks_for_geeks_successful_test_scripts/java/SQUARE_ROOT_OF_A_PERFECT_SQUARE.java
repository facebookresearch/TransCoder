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
public class SQUARE_ROOT_OF_A_PERFECT_SQUARE{
static float f_gold ( float n ) {
  float x = n ;
  float y = 1 ;
  double e = 0.000001 ;
  while ( x - y > e ) {
    x = ( x + y ) / 2 ;
    y = n / x ;
  }
  return x ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(1763.655093333857F);
    param0.add(-3544.737136289062F);
    param0.add(7893.209433000695F);
    param0.add(-3008.0331952533734F);
    param0.add(6155.190186637041F);
    param0.add(-5799.751467314729F);
    param0.add(8234.151546380555F);
    param0.add(-1829.5367705266551F);
    param0.add(5778.227173218819F);
    param0.add(-7785.473710863676F);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001F)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}