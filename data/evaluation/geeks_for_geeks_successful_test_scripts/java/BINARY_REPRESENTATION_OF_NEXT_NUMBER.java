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
public class BINARY_REPRESENTATION_OF_NEXT_NUMBER{
static String f_gold ( String num ) {
  int l = num . length ( ) ;
  int i ;
  for ( i = l - 1 ;
  i >= 0 ;
  i -- ) {
    if ( num . charAt ( i ) == '0' ) {
      num = num . substring ( 0 , i ) + '1' + num . substring ( i + 1 ) ;
      break ;
    }
    else {
      num = num . substring ( 0 , i ) + '0' + num . substring ( i + 1 ) ;
    }
  }
  if ( i < 0 ) {
    num = "1" + num ;
  }
  return num ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("DXh");
    param0.add("48703586411816");
    param0.add("0001");
    param0.add("yWg WvjNKS");
    param0.add("8408568459");
    param0.add("01");
    param0.add("DFECZ CWtN");
    param0.add("37742236");
    param0.add("001101");
    param0.add("LDxERLmYn");
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