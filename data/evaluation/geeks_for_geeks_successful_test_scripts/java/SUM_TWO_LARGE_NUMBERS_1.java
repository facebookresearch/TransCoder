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
public class SUM_TWO_LARGE_NUMBERS_1{
static String f_gold ( String str1 , String str2 ) {
  if ( str1 . length ( ) > str2 . length ( ) ) {
    String t = str1 ;
    str1 = str2 ;
    str2 = t ;
  }
  String str = "" ;
  int n1 = str1 . length ( ) , n2 = str2 . length ( ) ;
  int diff = n2 - n1 ;
  int carry = 0 ;
  for ( int i = n1 - 1 ;
  i >= 0 ;
  i -- ) {
    int sum = ( ( int ) ( str1 . charAt ( i ) - '0' ) + ( int ) ( str2 . charAt ( i + diff ) - '0' ) + carry ) ;
    str += ( char ) ( sum % 10 + '0' ) ;
    carry = sum / 10 ;
  }
  for ( int i = n2 - n1 - 1 ;
  i >= 0 ;
  i -- ) {
    int sum = ( ( int ) ( str2 . charAt ( i ) - '0' ) + carry ) ;
    str += ( char ) ( sum % 10 + '0' ) ;
    carry = sum / 10 ;
  }
  if ( carry > 0 ) str += ( char ) ( carry + '0' ) ;
  return new StringBuilder ( str ) . reverse ( ) . toString ( ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("G");
    param0.add("48578");
    param0.add("010");
    param0.add("KkGp");
    param0.add("48928969618416");
    param0.add("0101011010");
    param0.add("X");
    param0.add("10073867");
    param0.add("01110000000");
    param0.add("k ");
    List<String> param1 = new ArrayList<>();
    param1.add("FcAiuKhw");
    param1.add("5117561223135");
    param1.add("00000");
    param1.add("nSE");
    param1.add("88497275");
    param1.add("11");
    param1.add("MomtbuxLRR");
    param1.add("28");
    param1.add("0110");
    param1.add("aSSlhOYp");
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