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
public class WILDCARD_CHARACTER_MATCHING{
static boolean f_gold ( String first , String second ) {
  if ( first . length ( ) == 0 && second . length ( ) == 0 ) return true ;
  if ( first . length ( ) > 1 && first . charAt ( 0 ) == '*' && second . length ( ) == 0 ) return false ;
  if ( ( first . length ( ) > 1 && first . charAt ( 0 ) == '?' ) || ( first . length ( ) != 0 && second . length ( ) != 0 && first . charAt ( 0 ) == second . charAt ( 0 ) ) ) return f_gold ( first . substring ( 1 ) , second . substring ( 1 ) ) ;
  if ( first . length ( ) > 0 && first . charAt ( 0 ) == '*' ) return f_gold ( first . substring ( 1 ) , second ) || f_gold ( first , second . substring ( 1 ) ) ;
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("g*ks");
    param0.add("ge?ks*");
    param0.add("g*k");
    param0.add("*pqrs");
    param0.add("abc*bcd");
    param0.add("abc*c?d");
    param0.add("*c*d");
    param0.add("*?c*d");
    param0.add("?*1");
    param0.add("a*");
    List<String> param1 = new ArrayList<>();
    param1.add("geeks");
    param1.add("geeksforgeeks");
    param1.add("gee");
    param1.add("pqrst");
    param1.add("abcdhghgbcd");
    param1.add("abcd");
    param1.add("abcd");
    param1.add("abcd");
    param1.add("010111111001");
    param1.add("CBzHMjUGCUJD");
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