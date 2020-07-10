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
public class COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS{
static int f_gold ( String str ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( i == ( str . charAt ( i ) - 'a' ) || i == ( str . charAt ( i ) - 'A' ) ) {
      result ++ ;
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("lLkhFeZGcb");
    param0.add("ABcED");
    param0.add("geeksforgeeks");
    param0.add("Alphabetical");
    param0.add("abababab");
    param0.add("bcdefgxyz");
    param0.add("cBzaqx L");
    param0.add(" bcd");
    param0.add("11");
    param0.add("MqqKY");
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