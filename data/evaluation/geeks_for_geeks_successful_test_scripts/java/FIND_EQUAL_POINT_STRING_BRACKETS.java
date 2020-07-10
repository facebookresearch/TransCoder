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
public class FIND_EQUAL_POINT_STRING_BRACKETS{
static int f_gold ( String str ) {
  int len = str . length ( ) ;
  int open [ ] = new int [ len + 1 ] ;
  int close [ ] = new int [ len + 1 ] ;
  int index = - 1 ;
  open [ 0 ] = 0 ;
  close [ len ] = 0 ;
  if ( str . charAt ( 0 ) == '(' ) open [ 1 ] = 1 ;
  if ( str . charAt ( len - 1 ) == ')' ) close [ len - 1 ] = 1 ;
  for ( int i = 1 ;
  i < len ;
  i ++ ) {
    if ( str . charAt ( i ) == '(' ) open [ i + 1 ] = open [ i ] + 1 ;
    else open [ i + 1 ] = open [ i ] ;
  }
  for ( int i = len - 2 ;
  i >= 0 ;
  i -- ) {
    if ( str . charAt ( i ) == ')' ) close [ i ] = close [ i + 1 ] + 1 ;
    else close [ i ] = close [ i + 1 ] ;
  }
  if ( open [ len ] == 0 ) return len ;
  if ( close [ 0 ] == 0 ) return 0 ;
  for ( int i = 0 ;
  i <= len ;
  i ++ ) if ( open [ i ] == close [ i ] ) index = i ;
  return index ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("(())))(");
    param0.add("))");
    param0.add("((");
    param0.add("))(()(()()(");
    param0.add(")((()(()");
    param0.add("))(()");
    param0.add("()))");
    param0.add("()");
    param0.add("1100110");
    param0.add("dhfSnebD");
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