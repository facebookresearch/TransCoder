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
public class NUMBER_SUBSTRINGS_STRING{
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  return n * ( n + 1 ) / 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("gZFGZsHCimLf");
    param0.add("505357");
    param0.add("011011101");
    param0.add("ovfwP Osauz");
    param0.add("92132238746026");
    param0.add("01100");
    param0.add("RaOWYQRfiWKSyC");
    param0.add("861330202");
    param0.add("001100010");
    param0.add("uvpKlGUBLOMba");
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