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
public class SWAP_ALL_ODD_AND_EVEN_BITS{
static int f_gold ( int x ) {
  int even_bits = x & 0xAAAAAAAA ;
  int odd_bits = x & 0x55555555 ;
  even_bits >>= 1 ;
  odd_bits <<= 1 ;
  return ( even_bits | odd_bits ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(99);
    param0.add(94);
    param0.add(11);
    param0.add(3);
    param0.add(77);
    param0.add(57);
    param0.add(54);
    param0.add(66);
    param0.add(98);
    param0.add(36);
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