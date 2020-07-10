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
public class CONSTRUCT_LEXICOGRAPHICALLY_SMALLEST_PALINDROME{
static String f_gold ( char [ ] str , int len ) {
  int i = 0 , j = len - 1 ;
  for ( ;
  i < j ;
  i ++ , j -- ) {
    if ( str [ i ] == str [ j ] && str [ i ] != '*' ) continue ;
    else if ( str [ i ] == str [ j ] && str [ i ] == '*' ) {
      str [ i ] = 'a' ;
      str [ j ] = 'a' ;
      continue ;
    }
    else if ( str [ i ] == '*' ) {
      str [ i ] = str [ j ] ;
      continue ;
    }
    else if ( str [ j ] == '*' ) {
      str [ j ] = str [ i ] ;
      continue ;
    }
    System . out . println ( "Not Possible" ) ;
    return "" ;
  }
  return String . valueOf ( str ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'A','B','C','G','I','L','L','O','O','P','Q','S','W','Y','c','d','e','f','f','i','m','m','o','q','v','w','x','x','y','z'});
    param0.add(new char[]{'3','2','3','6','8','9','0','5','0','5','8','7','9','0','3','6','9','6','2','4','2','3','1','2','7','9','1','8','8','7','1','1','6','1'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'z','v','B','Y','n','K','h','C','T','L','g'});
    param0.add(new char[]{'1','2','5','6','7'});
    param0.add(new char[]{'0','0','1','0'});
    param0.add(new char[]{'D','n','r'});
    param0.add(new char[]{'0','9','9','1','2','1','5','3','7','5','9','2','4','4','8','9','6','4','2','8','8','5','5','7','1','7','6','2','2','2','3','3','7','9'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'E','s','I','S','h','H','i','m','v','B'});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(30);
    param1.add(27);
    param1.add(7);
    param1.add(4);
    param1.add(3);
    param1.add(1);
    param1.add(24);
    param1.add(21);
    param1.add(6);
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