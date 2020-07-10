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
public class EFFICIENTLY_FIND_FIRST_REPEATED_CHARACTER_STRING_WITHOUT_USING_ADDITIONAL_DATA_STRUCTURE_ONE_TRAVERSAL{
static int f_gold ( String str ) {
  int checker = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  ++ i ) {
    int val = ( str . charAt ( i ) - 'a' ) ;
    if ( ( checker & ( 1 << val ) ) > 0 ) return i ;
    checker |= ( 1 << val ) ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("XFGfXTDgpIuerN");
    param0.add("5621946166");
    param0.add("11010110");
    param0.add("xL");
    param0.add("2575");
    param0.add("0100010");
    param0.add("SZmmQ");
    param0.add("9735892999350");
    param0.add("1001101101101");
    param0.add("oEXDbOU");
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