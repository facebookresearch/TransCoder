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
public class LONGEST_COMMON_SUBSTRING_SPACE_OPTIMIZED_DP_SOLUTION{
static int f_gold ( String X , String Y ) {
  int m = X . length ( ) ;
  int n = Y . length ( ) ;
  int result = 0 ;
  int [ ] [ ] len = new int [ 2 ] [ n ] ;
  int currRow = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == 0 || j == 0 ) {
        len [ currRow ] [ j ] = 0 ;
      }
      else if ( X . charAt ( i - 1 ) == Y . charAt ( j - 1 ) ) {
        len [ currRow ] [ j ] = len [ ( 1 - currRow ) ] [ ( j - 1 ) ] + 1 ;
        result = Math . max ( result , len [ currRow ] [ j ] ) ;
      }
      else {
        len [ currRow ] [ j ] = 0 ;
      }
    }
    currRow = 1 - currRow ;
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("GeeksforGeeks");
    param0.add("333940");
    param0.add("1000");
    param0.add("Facebook");
    param0.add("2684247");
    param0.add("111");
    param0.add("abcdxyz");
    param0.add("625330958530");
    param0.add("01011000001111");
    param0.add("KXm");
    List<String> param1 = new ArrayList<>();
    param1.add("GeeksQuiz");
    param1.add("390");
    param1.add("0");
    param1.add("nice book");
    param1.add("1");
    param1.add("10");
    param1.add("xyzabcd");
    param1.add("412511");
    param1.add("1001010001");
    param1.add("gF");
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