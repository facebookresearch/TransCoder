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
public class CHECK_CHARACTERS_GIVEN_STRING_CAN_REARRANGED_FORM_PALINDROME_1{
static boolean f_gold ( String str ) {
  List < Character > list = new ArrayList < Character > ( ) ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( list . contains ( str . charAt ( i ) ) ) list . remove ( ( Character ) str . charAt ( i ) ) ;
    else list . add ( str . charAt ( i ) ) ;
  }
  if ( str . length ( ) % 2 == 0 && list . isEmpty ( ) || ( str . length ( ) % 2 == 1 && list . size ( ) == 1 ) ) return true ;
  else return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("abccba");
    param0.add("2674377254");
    param0.add("11");
    param0.add("abcdecba");
    param0.add("26382426486138");
    param0.add("111010111010");
    param0.add("hUInqJXNdbfP");
    param0.add("5191");
    param0.add("1110101101");
    param0.add("NupSrU xz");
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