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
public class CONVERTING_ONE_STRING_USING_APPEND_DELETE_LAST_OPERATIONS{
static boolean f_gold ( String str1 , String str2 , int k ) {
  if ( ( str1 . length ( ) + str2 . length ( ) ) < k ) return true ;
  int commonLength = 0 ;
  for ( int i = 0 ;
  i < Math . min ( str1 . length ( ) , str2 . length ( ) ) ;
  i ++ ) {
    if ( str1 == str2 ) commonLength ++ ;
    else break ;
  }
  if ( ( k - str1 . length ( ) - str2 . length ( ) + 2 * commonLength ) % 2 == 0 ) return true ;
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ZNHGro");
    param0.add("382880806774");
    param0.add("0");
    param0.add("lxHTRFCTSQ");
    param0.add("6399914758");
    param0.add("01100011100000");
    param0.add("WkGqlob");
    param0.add("46974006151");
    param0.add("1001001");
    param0.add("IJQ");
    List<String> param1 = new ArrayList<>();
    param1.add("jAdbtDUYQu");
    param1.add("65565");
    param1.add("00100010100");
    param1.add("sViXYE");
    param1.add("780990121");
    param1.add("0100");
    param1.add("NpQVdXzEtUZy");
    param1.add("74438");
    param1.add("1000010");
    param1.add("nFOHAeYEAp");
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(10);
    param2.add(2);
    param2.add(89);
    param2.add(9);
    param2.add(0);
    param2.add(6);
    param2.add(11);
    param2.add(15);
    param2.add(42);
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