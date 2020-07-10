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
public class PROGRAM_CALCULATE_VOLUME_OCTAHEDRON{
static double f_gold ( double side ) {
  return ( ( side * side * side ) * ( Math . sqrt ( 2 ) / 3 ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(3355.322051344013);
    param0.add(-891.0551553192736);
    param0.add(8242.699647177868);
    param0.add(-9259.146104439229);
    param0.add(7712.806145993083);
    param0.add(-4998.858862079315);
    param0.add(9771.127582524628);
    param0.add(-5415.8106399098115);
    param0.add(670.0774772280249);
    param0.add(-7068.634369272122);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}