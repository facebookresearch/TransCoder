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
public class LONGEST_COMMON_SUBSTRING{
static int f_gold ( char X [ ] , char Y [ ] , int m , int n ) {
  int LCStuff [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  int result = 0 ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( i == 0 || j == 0 ) LCStuff [ i ] [ j ] = 0 ;
      else if ( X [ i - 1 ] == Y [ j - 1 ] ) {
        LCStuff [ i ] [ j ] = LCStuff [ i - 1 ] [ j - 1 ] + 1 ;
        result = Integer . max ( result , LCStuff [ i ] [ j ] ) ;
      }
      else LCStuff [ i ] [ j ] = 0 ;
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'A','D','E','E','L','L','T','r','x'});
    param0.add(new char[]{'9','3','4','8','7','6','3','8','3','3','5','3','5','4','2','5','5','3','6','2','1','7','4','2','7','3','2','1','3','7','6','5','0','6','3','8','5','1','7','9','2','7'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'W','X','P','u','s','k','O','y','Q','i','t','z','F','f','s','N','K','m','I','M','g','e','E','P','b','Y','c','O',' ','G','F','x'});
    param0.add(new char[]{'0','1','2','4','5','7','7','7','8','8','9','9','9'});
    param0.add(new char[]{'0','0','1'});
    param0.add(new char[]{'A','C','F','G','G','H','I','K','K','N','O','Q','R','V','V','W','Y','a','a','c','d','k','k','m','o','p','t','u','y','y','y','z'});
    param0.add(new char[]{'0','0','0','2','8','3','5','1','0','7','7','9','9','4','8','9','5'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','1','1','1'});
    param0.add(new char[]{'B','o','R','k','Y','M','g','b','h','A','i','X','p','i','j','f','V','n','d','P','T','U','f','G','M','W','g','a','C','E','v','C',' '});
    List<char [ ]> param1 = new ArrayList<>();
    param1.add(new char[]{'D','F','H','O','g','o','u','v','w'});
    param1.add(new char[]{'5','5','3','7','8','0','9','8','5','8','5','1','4','4','0','2','9','2','3','1','1','3','6','1','2','0','5','4','3','7','5','5','8','1','1','4','8','1','7','5','5','4'});
    param1.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param1.add(new char[]{'e','R','P','W','d','a','A','j','H','v','T','w','x','I','d','o','z','K','B','M','J','L','a',' ','T','L','V','t','M','U','z','R'});
    param1.add(new char[]{'0','0','2','2','2','3','4','6','6','7','8','9','9'});
    param1.add(new char[]{'0','0','1'});
    param1.add(new char[]{' ',' ','B','C','C','C','D','E','I','J','M','N','P','T','U','U','V','V','W','W','Y','b','c','e','i','o','p','r','t','y','y','z'});
    param1.add(new char[]{'8','5','8','7','1','4','0','2','2','7','2','4','0','8','3','8','7'});
    param1.add(new char[]{'0','0','0','0','0','0','1','1','1','1','1'});
    param1.add(new char[]{'F','h','G','H','Q','Q','K','g','k','u','l','c','c','o','n','G','i','Z','d','b','c','b','v','t','S','t','P','A','K','g','G','i','m'});
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(41);
    param2.add(35);
    param2.add(31);
    param2.add(12);
    param2.add(1);
    param2.add(21);
    param2.add(13);
    param2.add(9);
    param2.add(19);
    List<Integer> param3 = new ArrayList<>();
    param3.add(4);
    param3.add(37);
    param3.add(29);
    param3.add(18);
    param3.add(8);
    param3.add(1);
    param3.add(23);
    param3.add(12);
    param3.add(9);
    param3.add(32);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}