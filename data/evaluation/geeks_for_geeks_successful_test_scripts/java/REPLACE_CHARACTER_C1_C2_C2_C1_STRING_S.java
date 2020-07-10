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
public class REPLACE_CHARACTER_C1_C2_C2_C1_STRING_S{
static String f_gold ( String s , char c1 , char c2 ) {
  int l = s . length ( ) ;
  char [ ] arr = s . toCharArray ( ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    if ( arr [ i ] == c1 ) arr [ i ] = c2 ;
    else if ( arr [ i ] == c2 ) arr [ i ] = c1 ;
  }
  return String . valueOf ( arr ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("IZTSMw j");
    param0.add("7288334");
    param0.add("010110000");
    param0.add("b gJX");
    param0.add("734");
    param0.add("1");
    param0.add("xCaUKdhA");
    param0.add("4370992644981");
    param0.add("01010");
    param0.add("ZNIFGshaWA");
    List<Character> param1 = new ArrayList<>();
    param1.add('W');
    param1.add('6');
    param1.add('1');
    param1.add('t');
    param1.add('4');
    param1.add('1');
    param1.add('X');
    param1.add('5');
    param1.add('0');
    param1.add('Q');
    List<Character> param2 = new ArrayList<>();
    param2.add('k');
    param2.add('9');
    param2.add('1');
    param2.add('P');
    param2.add('4');
    param2.add('1');
    param2.add('S');
    param2.add('6');
    param2.add('1');
    param2.add('x');
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)).equals(f_gold(param0.get(i),param1.get(i),param2.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}