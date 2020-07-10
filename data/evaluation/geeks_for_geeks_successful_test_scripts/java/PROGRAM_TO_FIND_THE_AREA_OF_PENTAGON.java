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
public class PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON{
static float f_gold ( float a ) {
  float area ;
  area = ( float ) ( Math . sqrt ( 5 * ( 5 + 2 * ( Math . sqrt ( 5 ) ) ) ) * a * a ) / 4 ;
  return area ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(2009.019461888707F);
    param0.add(-1480.5131394215787F);
    param0.add(357.7870347569567F);
    param0.add(-8040.293697508038F);
    param0.add(3821.882657293133F);
    param0.add(-6840.635072240347F);
    param0.add(1623.036598830132F);
    param0.add(-9714.00706195298F);
    param0.add(3916.454769669618F);
    param0.add(-669.068424712943F);
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