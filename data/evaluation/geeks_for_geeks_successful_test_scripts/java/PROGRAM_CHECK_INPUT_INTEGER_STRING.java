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
public class PROGRAM_CHECK_INPUT_INTEGER_STRING{
static boolean f_gold ( String s ) {
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) if ( Character . isDigit ( s . charAt ( i ) ) == false ) return false ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("MgTOyHo NT");
    param0.add("033675175");
    param0.add("011001");
    param0.add("XLlccG");
    param0.add("8223900094410");
    param0.add("000");
    param0.add("aupp");
    param0.add("90202721499");
    param0.add("110000100011");
    param0.add("MhYHsMQeLhG");
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