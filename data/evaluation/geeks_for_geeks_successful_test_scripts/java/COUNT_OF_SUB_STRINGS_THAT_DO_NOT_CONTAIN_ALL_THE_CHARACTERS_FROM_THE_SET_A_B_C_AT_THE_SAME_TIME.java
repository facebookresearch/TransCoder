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
public class COUNT_OF_SUB_STRINGS_THAT_DO_NOT_CONTAIN_ALL_THE_CHARACTERS_FROM_THE_SET_A_B_C_AT_THE_SAME_TIME{
static int f_gold ( char str [ ] , int n ) {
  int ans = ( n * ( n + 1 ) ) / 2 ;
  int a_index = 0 ;
  int b_index = 0 ;
  int c_index = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( str [ i ] == 'a' ) {
      a_index = i + 1 ;
      ans -= Math . min ( b_index , c_index ) ;
    }
    else if ( str [ i ] == 'b' ) {
      b_index = i + 1 ;
      ans -= Math . min ( a_index , c_index ) ;
    }
    else {
      c_index = i + 1 ;
      ans -= Math . min ( a_index , b_index ) ;
    }
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'E','F','G','I','K','M','O','Q','Q','S','T','U','X','Z','a','b','c','d','e','f','h','h','i','j','l','m','s','s','t','x','y','y'});
    param0.add(new char[]{'1','3','5','6','6','4','6','1','8','0','3','8','3','5','9','6','8','5','7','2','3','7','1','7','6','1','8','9','3','6','7','0','8','5','8','3','2','6','7','4','5','1','3','3','7','5','6'});
    param0.add(new char[]{'0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'c','Z','s','F','v',' ','Y','e','u','I','P','y','j','o','n'});
    param0.add(new char[]{'0','0','2','2','3','3','4','5','6','6','6','7','8','9'});
    param0.add(new char[]{'0','1','0','1','1','1','1','0','0','0','1','1','0','0','0','0','0','0','1','1','1','1','0','1','0','1','1','1','1','1','0','0'});
    param0.add(new char[]{'E','G','G','J','L','O','O','S','T','U','V','V','Y','c','d','e','f','g','g','j','m','n','p','q','q','r','u','u','x'});
    param0.add(new char[]{'8','1','9','6','4','3','8','2','8','5','5','3','0','1','7','3','1','5','4','8','2','3','3','2','2','4','9','6','3','1','4','1','4','0','4','9','4','8','4','7'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'j','z','H','Q'});
    List<Integer> param1 = new ArrayList<>();
    param1.add(23);
    param1.add(24);
    param1.add(15);
    param1.add(9);
    param1.add(8);
    param1.add(19);
    param1.add(21);
    param1.add(36);
    param1.add(33);
    param1.add(2);
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