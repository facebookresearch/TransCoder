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
public class COUNT_POSSIBLE_DECODINGS_GIVEN_DIGIT_SEQUENCE_1{
static int f_gold ( char digits [ ] , int n ) {
  int count [ ] = new int [ n + 1 ] ;
  count [ 0 ] = 1 ;
  count [ 1 ] = 1 ;
  if ( digits [ 0 ] == '0' ) return 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    count [ i ] = 0 ;
    if ( digits [ i - 1 ] > '0' ) count [ i ] = count [ i - 1 ] ;
    if ( digits [ i - 2 ] == '1' || ( digits [ i - 2 ] == '2' && digits [ i - 1 ] < '7' ) ) count [ i ] += count [ i - 2 ] ;
  }
  return count [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'B','C','E','E','F','F','G','J','K','K','L','L','M','O','O','P','Q','R','V','X','Z','a','a','a','c','c','c','d','e','g','g','k','k','k','l','m','m','n','p','t','y','z'});
    param0.add(new char[]{'0','9','5','0','2','6','5','4','4','5','2','6','8','2','0','3','1','9','0','1','5'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'x','a','R','O','S','r','g','e','Y','Z','t'});
    param0.add(new char[]{'0','1','1','1','2','2','2','2','2','2','2','3','3','4','4','5','5','5','5','5','6','6','7','7','7','7','8','8'});
    param0.add(new char[]{'1','1','1','1','1','1'});
    param0.add(new char[]{' ',' ',' ','B','B','C','D','F','H','I','J','K','L','O','P','V','W','W','Z','Z','a','c','h','i','q','s','x'});
    param0.add(new char[]{'0','9','1','5','2','4','9','3'});
    param0.add(new char[]{'0','0','0','1','1','1'});
    param0.add(new char[]{'w','t','U','R','a','c','G'});
    List<Integer> param1 = new ArrayList<>();
    param1.add(31);
    param1.add(13);
    param1.add(19);
    param1.add(5);
    param1.add(21);
    param1.add(4);
    param1.add(26);
    param1.add(5);
    param1.add(4);
    param1.add(5);
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