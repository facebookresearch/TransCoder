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
public class WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION{
static int f_gold ( int a , int b ) {
  if ( b == 0 ) return 1 ;
  int answer = a ;
  int increment = a ;
  int i , j ;
  for ( i = 1 ;
  i < b ;
  i ++ ) {
    for ( j = 1 ;
    j < a ;
    j ++ ) {
      answer += increment ;
    }
    increment = answer ;
  }
  return answer ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(66);
    param0.add(82);
    param0.add(12);
    param0.add(55);
    param0.add(34);
    param0.add(22);
    param0.add(13);
    param0.add(57);
    param0.add(76);
    param0.add(76);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(66);
    param1.add(38);
    param1.add(33);
    param1.add(26);
    param1.add(23);
    param1.add(98);
    param1.add(84);
    param1.add(94);
    param1.add(95);
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