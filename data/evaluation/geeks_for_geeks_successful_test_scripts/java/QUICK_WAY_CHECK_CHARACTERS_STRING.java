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
public class QUICK_WAY_CHECK_CHARACTERS_STRING{
static boolean f_gold ( String s ) {
  int n = s . length ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) if ( s . charAt ( i ) != s . charAt ( 0 ) ) return false ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("");
    param0.add("ggg");
    param0.add("11");
    param0.add("KoYIHns");
    param0.add("232");
    param0.add("10111000011101");
    param0.add("DDDD");
    param0.add("11");
    param0.add("11111");
    param0.add("ewJvixQzu");
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