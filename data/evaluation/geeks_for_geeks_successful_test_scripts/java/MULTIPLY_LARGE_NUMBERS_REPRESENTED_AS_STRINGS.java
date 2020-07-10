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
public class MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS{
static String f_gold ( String num1 , String num2 ) {
  int len1 = num1 . length ( ) ;
  int len2 = num2 . length ( ) ;
  if ( len1 == 0 || len2 == 0 ) return "0" ;
  int result [ ] = new int [ len1 + len2 ] ;
  int i_n1 = 0 ;
  int i_n2 = 0 ;
  for ( int i = len1 - 1 ;
  i >= 0 ;
  i -- ) {
    int carry = 0 ;
    int n1 = num1 . charAt ( i ) - '0' ;
    i_n2 = 0 ;
    for ( int j = len2 - 1 ;
    j >= 0 ;
    j -- ) {
      int n2 = num2 . charAt ( j ) - '0' ;
      int sum = n1 * n2 + result [ i_n1 + i_n2 ] + carry ;
      carry = sum / 10 ;
      result [ i_n1 + i_n2 ] = sum % 10 ;
      i_n2 ++ ;
    }
    if ( carry > 0 ) result [ i_n1 + i_n2 ] += carry ;
    i_n1 ++ ;
  }
  int i = result . length - 1 ;
  while ( i >= 0 && result [ i ] == 0 ) i -- ;
  if ( i == - 1 ) return "0" ;
  String s = "" ;
  while ( i >= 0 ) s += ( result [ i -- ] ) ;
  return s ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("OaITtzE");
    param0.add("88111031");
    param0.add("1100111");
    param0.add("eiWPbMrFx");
    param0.add("43701248");
    param0.add("100001111110");
    param0.add("jVgOapMp");
    param0.add("68337672");
    param0.add("00110101");
    param0.add("JqSh");
    List<String> param1 = new ArrayList<>();
    param1.add("RnYlJUqzk");
    param1.add("558471");
    param1.add("11111110111101");
    param1.add("tBAJaI");
    param1.add("4027");
    param1.add("11");
    param1.add("Xm");
    param1.add("56939");
    param1.add("1");
    param1.add("iAfjQRwuVyost");
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