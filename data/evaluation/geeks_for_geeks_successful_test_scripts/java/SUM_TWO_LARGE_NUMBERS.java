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
public class SUM_TWO_LARGE_NUMBERS{
static String f_gold ( String str1 , String str2 ) {
  if ( str1 . length ( ) > str2 . length ( ) ) {
    String t = str1 ;
    str1 = str2 ;
    str2 = t ;
  }
  String str = "" ;
  int n1 = str1 . length ( ) , n2 = str2 . length ( ) ;
  str1 = new StringBuilder ( str1 ) . reverse ( ) . toString ( ) ;
  str2 = new StringBuilder ( str2 ) . reverse ( ) . toString ( ) ;
  int carry = 0 ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    int sum = ( ( int ) ( str1 . charAt ( i ) - '0' ) + ( int ) ( str2 . charAt ( i ) - '0' ) + carry ) ;
    str += ( char ) ( sum % 10 + '0' ) ;
    carry = sum / 10 ;
  }
  for ( int i = n1 ;
  i < n2 ;
  i ++ ) {
    int sum = ( ( int ) ( str2 . charAt ( i ) - '0' ) + carry ) ;
    str += ( char ) ( sum % 10 + '0' ) ;
    carry = sum / 10 ;
  }
  if ( carry > 0 ) str += ( char ) ( carry + '0' ) ;
  str = new StringBuilder ( str ) . reverse ( ) . toString ( ) ;
  return str ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("VkfzrPG");
    param0.add("0526110506447");
    param0.add("011010010");
    param0.add("sPAwZACc ");
    param0.add("3");
    param0.add("0101");
    param0.add("VTtNu");
    param0.add("2317170");
    param0.add("111111000010");
    param0.add("Ktt");
    List<String> param1 = new ArrayList<>();
    param1.add("rKZ");
    param1.add("903");
    param1.add("110100000");
    param1.add("liYMsojPiinOV");
    param1.add("611");
    param1.add("01110101011");
    param1.add("Wsmc");
    param1.add("898421173423");
    param1.add("01100001110111");
    param1.add("CTbbVX wGBkE");
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