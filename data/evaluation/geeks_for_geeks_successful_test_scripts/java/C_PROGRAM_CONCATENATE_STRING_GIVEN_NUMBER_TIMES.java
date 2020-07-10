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
public class C_PROGRAM_CONCATENATE_STRING_GIVEN_NUMBER_TIMES{
static String f_gold ( String s , int n ) {
  String s1 = s ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) s += s1 ;
  return s ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("LPWsaI");
    param0.add("9037515104");
    param0.add("00100010010111");
    param0.add("SbwipuE");
    param0.add("574314109");
    param0.add("1101");
    param0.add("f");
    param0.add("068");
    param0.add("000011001");
    param0.add("BWbUtIkC");
    List<Integer> param1 = new ArrayList<>();
    param1.add(41);
    param1.add(72);
    param1.add(95);
    param1.add(27);
    param1.add(5);
    param1.add(70);
    param1.add(91);
    param1.add(50);
    param1.add(38);
    param1.add(79);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}