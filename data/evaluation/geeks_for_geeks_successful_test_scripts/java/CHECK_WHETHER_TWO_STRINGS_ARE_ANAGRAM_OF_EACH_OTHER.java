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
public class CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER{
static boolean f_gold ( char [ ] str1 , char [ ] str2 ) {
  int n1 = str1 . length ;
  int n2 = str2 . length ;
  if ( n1 != n2 ) return false ;
  Arrays . sort ( str1 ) ;
  Arrays . sort ( str2 ) ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) if ( str1 [ i ] != str2 [ i ] ) return false ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("LISTEN");
    param0.add("TRIANGLE");
    param0.add("test");
    param0.add("night");
    param0.add("Inch");
    param0.add("Dusty");
    param0.add("GJLMOOSTTXaabceefgllpwz");
    param0.add("41658699122772743330");
    param0.add("0000000000000000000000001111111111111111111");
    param0.add("ERioPYDqgTSz bVCW");
    List<String> param1 = new ArrayList<>();
    param1.add("SILENT");
    param1.add("INTEGRAL");
    param1.add("ttew");
    param1.add("thing");
    param1.add("Study");
    param1.add("1");
    param1.add("EJRXYajoy");
    param1.add("9931020");
    param1.add("0000000000000000000001111111111111111111111");
    param1.add("GLajZE");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i).toCharArray(),param1.get(i).toCharArray()) == f_gold(param0.get(i).toCharArray(),param1.get(i).toCharArray()))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}