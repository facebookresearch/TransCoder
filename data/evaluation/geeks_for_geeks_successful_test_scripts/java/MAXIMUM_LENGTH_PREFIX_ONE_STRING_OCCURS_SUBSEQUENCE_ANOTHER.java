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
public class MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER{
static int f_gold ( String s , String t ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < t . length ( ) ;
  i ++ ) {
    if ( count == t . length ( ) ) break ;
    if ( t . charAt ( i ) == s . charAt ( count ) ) count ++ ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("nObYIOjEQZ");
    param0.add("84574");
    param0.add("1010001010010");
    param0.add("DjZtAfUudk");
    param0.add("550");
    param0.add("1110");
    param0.add("GywyxwH");
    param0.add("67318370914755");
    param0.add("11011000000101");
    param0.add("G");
    List<String> param1 = new ArrayList<>();
    param1.add("uARTDTQbmGI");
    param1.add("8538229");
    param1.add("11");
    param1.add("OewGm");
    param1.add("132744553919");
    param1.add("0101");
    param1.add("LPQqEqrDZiwY");
    param1.add("9928");
    param1.add("00000");
    param1.add("V");
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