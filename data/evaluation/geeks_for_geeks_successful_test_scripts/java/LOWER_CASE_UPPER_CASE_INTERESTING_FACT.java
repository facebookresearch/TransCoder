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
public class LOWER_CASE_UPPER_CASE_INTERESTING_FACT{
static String f_gold ( char [ ] in ) {
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    if ( 'a' <= in [ i ] & in [ i ] <= 'z' ) {
      in [ i ] = ( char ) ( in [ i ] - 'a' + 'A' ) ;
    }
  }
  return String . valueOf ( in ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'B','N','O','p','t'});
    param0.add(new char[]{'2','8','2','7','3','3','1','2','1','4','1','0','8','1','0','1','1','8','2','9','2','0','6','3','0','4','2','3','3','4','6','7','1','3','6','6','0','5','5','3'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'i','N','F','z','A','Y','v','o','p','t',' ','R','X','D','L','p','J','N','R','m','L','m','s','R','O','G','T','L','m','F','e','B','O','w','e','a','N','T','Z','j','r','n','n'});
    param0.add(new char[]{'0','0','1','1','2','2','2','3','3','4','4','4','5','5','6','6','7','8','8','8','8','9','9','9'});
    param0.add(new char[]{'1','1','0','0','1','1'});
    param0.add(new char[]{' ','A','G','G','H','I','M','M','Q','R','S','U','W','X','Y','a','a','b','b','c','d','e','e','f','h','h','h','i','j','s','s','t','v','w','w','w','y'});
    param0.add(new char[]{'5','0','4','9','6','8','2','5','8','7','5','2','4','7','9','7','8','6','9','2','0','1','0','7'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'X','g','S','C','q','E','L','v'});
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}