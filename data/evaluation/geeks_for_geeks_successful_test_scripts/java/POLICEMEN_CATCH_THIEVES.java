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
public class POLICEMEN_CATCH_THIEVES{
static int f_gold ( char arr [ ] , int n , int k ) {
  int res = 0 ;
  ArrayList < Integer > thi = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > pol = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == 'P' ) pol . add ( i ) ;
    else if ( arr [ i ] == 'T' ) thi . add ( i ) ;
  }
  int l = 0 , r = 0 ;
  while ( l < thi . size ( ) && r < pol . size ( ) ) {
    if ( Math . abs ( thi . get ( l ) - pol . get ( r ) ) <= k ) {
      res ++ ;
      l ++ ;
      r ++ ;
    }
    else if ( thi . get ( l ) < pol . get ( r ) ) l ++ ;
    else r ++ ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'A','B','B','D','E','E','F','G','G','G','I','J','O','P','Q','Q','Q','Q','R','R','S','U','X','Y','Y','c','d','h','i','i','i','i','k','k','l','l','l','l','m','p','r','r','s','t','t','u','x','z'});
    param0.add(new char[]{'7','6','0','1','0','1'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'y','k','S','i','s','r','i','z','y','f','E','U','y','G','f','f','s','v','v','D','v','V','S','D','K','S','f','V','g','I','J','p','j','k','R','n','m','O','L','X','y','U','y','k','w'});
    param0.add(new char[]{'1','1','5','8','8'});
    param0.add(new char[]{'0','1','0','0','1','1','1','0','0','0','1','0','1','0','1','0','0','0','0','0','1','0','0','0','0','1','1','1','0','0','0','0','0','0'});
    param0.add(new char[]{'A','I','K','Q','Q','X','Z','f','g'});
    param0.add(new char[]{'7','0','6','9','7','5','1','3','9','8','0','0','1','3','9','2','5','5','2','7','9','3','3','9','3','8','5','5','0','4','6','2','7','4','0','4','6','4','2','3'});
    param0.add(new char[]{'0','0','0','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'D','C','P','H','G','o','u','P','T','G','E','U','n','E','U'});
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(3);
    param1.add(9);
    param1.add(24);
    param1.add(2);
    param1.add(23);
    param1.add(5);
    param1.add(35);
    param1.add(8);
    param1.add(11);
    List<Integer> param2 = new ArrayList<>();
    param2.add(45);
    param2.add(3);
    param2.add(10);
    param2.add(44);
    param2.add(2);
    param2.add(18);
    param2.add(8);
    param2.add(28);
    param2.add(10);
    param2.add(12);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}