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
public class COUNT_ROTATIONS_DIVISIBLE_8{
static int f_gold ( String n ) {
  int len = n . length ( ) ;
  int count = 0 ;
  if ( len == 1 ) {
    int oneDigit = n . charAt ( 0 ) - '0' ;
    if ( oneDigit % 8 == 0 ) return 1 ;
    return 0 ;
  }
  if ( len == 2 ) {
    int first = ( n . charAt ( 0 ) - '0' ) * 10 + ( n . charAt ( 1 ) - '0' ) ;
    int second = ( n . charAt ( 1 ) - '0' ) * 10 + ( n . charAt ( 0 ) - '0' ) ;
    if ( first % 8 == 0 ) count ++ ;
    if ( second % 8 == 0 ) count ++ ;
    return count ;
  }
  int threeDigit ;
  for ( int i = 0 ;
  i < ( len - 2 ) ;
  i ++ ) {
    threeDigit = ( n . charAt ( i ) - '0' ) * 100 + ( n . charAt ( i + 1 ) - '0' ) * 10 + ( n . charAt ( i + 2 ) - '0' ) ;
    if ( threeDigit % 8 == 0 ) count ++ ;
  }
  threeDigit = ( n . charAt ( len - 1 ) - '0' ) * 100 + ( n . charAt ( 0 ) - '0' ) * 10 + ( n . charAt ( 1 ) - '0' ) ;
  if ( threeDigit % 8 == 0 ) count ++ ;
  threeDigit = ( n . charAt ( len - 2 ) - '0' ) * 100 + ( n . charAt ( len - 1 ) - '0' ) * 10 + ( n . charAt ( 0 ) - '0' ) ;
  if ( threeDigit % 8 == 0 ) count ++ ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add(" MwBVIb");
    param0.add("37291205493");
    param0.add("0111111");
    param0.add("BrrQon");
    param0.add("226051");
    param0.add("1001101");
    param0.add("eREctoEen");
    param0.add("299967");
    param0.add("000111");
    param0.add("GJUYuqbampKo");
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