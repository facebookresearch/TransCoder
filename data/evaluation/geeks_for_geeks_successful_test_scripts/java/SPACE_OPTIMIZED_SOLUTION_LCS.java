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
public class SPACE_OPTIMIZED_SOLUTION_LCS{
public static int f_gold ( String X , String Y ) {
  int m = X . length ( ) , n = Y . length ( ) ;
  int L [ ] [ ] = new int [ 2 ] [ n + 1 ] ;
  int bi = 0 ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    bi = i & 1 ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( i == 0 || j == 0 ) L [ bi ] [ j ] = 0 ;
      else if ( X . charAt ( i - 1 ) == Y . charAt ( j - 1 ) ) L [ bi ] [ j ] = L [ 1 - bi ] [ j - 1 ] + 1 ;
      else L [ bi ] [ j ] = Math . max ( L [ 1 - bi ] [ j ] , L [ bi ] [ j - 1 ] ) ;
    }
  }
  return L [ bi ] [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("YNpjSv");
    param0.add("736519");
    param0.add("11010000100010");
    param0.add("v ");
    param0.add("8311172");
    param0.add("100011101011");
    param0.add("u");
    param0.add("3943042");
    param0.add("101");
    param0.add("MpbfF OsizevaM");
    List<String> param1 = new ArrayList<>();
    param1.add("qtUkJn");
    param1.add("07592");
    param1.add("0");
    param1.add("qGBQT");
    param1.add("157219329531");
    param1.add("1000001111");
    param1.add("YzkubTqLhP");
    param1.add("3859");
    param1.add("00010000101010");
    param1.add("WgsFGaQwtp");
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