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
public class NTH_EVEN_LENGTH_PALINDROME{
static String f_gold ( String n ) {
  String res = n ;
  for ( int j = n . length ( ) - 1 ;
  j >= 0 ;
  -- j ) res += n . charAt ( j ) ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("lSUhEvxcgfI");
    param0.add("77329283");
    param0.add("010111111");
    param0.add("Stazb");
    param0.add("0702");
    param0.add("01111111");
    param0.add("a");
    param0.add("359118754930");
    param0.add("11011010010");
    param0.add("rznb");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}