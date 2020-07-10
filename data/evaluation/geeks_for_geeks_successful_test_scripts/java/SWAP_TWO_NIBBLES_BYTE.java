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
public class SWAP_TWO_NIBBLES_BYTE{
static int f_gold ( int x ) {
  return ( ( x & 0x0F ) << 4 | ( x & 0xF0 ) >> 4 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(99);
    param0.add(66);
    param0.add(97);
    param0.add(95);
    param0.add(42);
    param0.add(95);
    param0.add(89);
    param0.add(3);
    param0.add(84);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}