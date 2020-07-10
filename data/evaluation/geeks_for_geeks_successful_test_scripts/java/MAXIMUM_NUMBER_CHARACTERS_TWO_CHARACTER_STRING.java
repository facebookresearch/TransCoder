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
public class MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING{
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  int res = - 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) if ( str . charAt ( i ) == str . charAt ( j ) ) res = Math . max ( res , Math . abs ( j - i - 1 ) ) ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("cI");
    param0.add("76478");
    param0.add("1");
    param0.add("tr");
    param0.add("10");
    param0.add("01");
    param0.add("Rmhzp");
    param0.add("5784080133917");
    param0.add("1100");
    param0.add("OK");
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