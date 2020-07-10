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
public class HOW_TO_COMPUTE_MOD_OF_A_BIG_NUMBER{
static int f_gold ( String num , int a ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < num . length ( ) ;
  i ++ ) res = ( res * 10 + ( int ) num . charAt ( i ) - '0' ) % a ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("RElCP");
    param0.add("0139035510");
    param0.add("00011110");
    param0.add("TwanZWwLNXhFN");
    param0.add("6247009752778");
    param0.add("0100001011011");
    param0.add("NCh");
    param0.add("00714746542");
    param0.add("101000100");
    param0.add("MSTkXmlbPkV");
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(44);
    param1.add(86);
    param1.add(66);
    param1.add(55);
    param1.add(33);
    param1.add(75);
    param1.add(54);
    param1.add(93);
    param1.add(78);
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