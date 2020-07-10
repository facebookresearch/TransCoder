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
public class DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME{
static int f_gold ( char str [ ] , int l , int h ) {
  if ( l > h ) return Integer . MAX_VALUE ;
  if ( l == h ) return 0 ;
  if ( l == h - 1 ) return ( str [ l ] == str [ h ] ) ? 0 : 1 ;
  return ( str [ l ] == str [ h ] ) ? f_gold ( str , l + 1 , h - 1 ) : ( Integer . min ( f_gold ( str , l , h - 1 ) , f_gold ( str , l + 1 , h ) ) + 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'F','F','J','K','K','L','P','S','T','V','W','Y','b','d','j','l','t','u','x','y'});
    param0.add(new char[]{'0','1','8','8','8','4','4','3','9','6','5','2','8','2','0','2','6','0','7','7','3','2','4','5','9','7','2','4','1','8','7','9','8','0','8','5','4','2','3'});
    param0.add(new char[]{'1'});
    param0.add(new char[]{'g','y','r','M','v','z',' ','k','S','P','x','p','E','z','T','K','k','B','s','P','p','e','G','t','r','M','p',' ','H','a'});
    param0.add(new char[]{'0','1','1','1','1','1','1','2','2','2','2','3','3','3','3','3','4','4','4','5','5','5','5','5','6','6','6','6','6','6','6','7','8','8','8','9','9'});
    param0.add(new char[]{'1','1','0','1','0','1','0','1','0','1','1','1','1','1','1','0'});
    param0.add(new char[]{' ',' ',' ','B','C','C','D','I','K','O','P','R','T','V','W','a','b','d','j','y'});
    param0.add(new char[]{'5','0','8','6','9','3','0','3','2','0','6','2','3','7','8','9','2','0','1','9','4','1','3','1','9','2','3','4','1','2','3','8','1'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'X','B','E','v','K','t','k','K','Q','s','V','N','l','k','T','N','J','z','f','p','J','g','S','P','M','b','H','L','v','E','A','n','D','U','c','s','M','Q','P','g','g',' '});
    List<Integer> param1 = new ArrayList<>();
    param1.add(11);
    param1.add(19);
    param1.add(0);
    param1.add(24);
    param1.add(33);
    param1.add(13);
    param1.add(16);
    param1.add(31);
    param1.add(37);
    param1.add(26);
    List<Integer> param2 = new ArrayList<>();
    param2.add(11);
    param2.add(22);
    param2.add(0);
    param2.add(27);
    param2.add(34);
    param2.add(8);
    param2.add(14);
    param2.add(25);
    param2.add(35);
    param2.add(27);
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