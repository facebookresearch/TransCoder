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
public class PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING{
public static int f_gold ( String s , char c ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == c ) res ++ ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("mhjnKfd");
    param0.add("716662107");
    param0.add("01");
    param0.add("wPHSxIbnHakGRO");
    param0.add("721106");
    param0.add("111");
    param0.add("TIBFU");
    param0.add("0");
    param0.add("10");
    param0.add("lqq");
    List<Character> param1 = new ArrayList<>();
    param1.add('l');
    param1.add('6');
    param1.add('1');
    param1.add('n');
    param1.add('8');
    param1.add('0');
    param1.add('Q');
    param1.add('3');
    param1.add('0');
    param1.add('d');
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