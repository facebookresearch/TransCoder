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
public class LEXICOGRAPHICALLY_NEXT_STRING{
public static String f_gold ( String str ) {
  if ( str == "" ) return "a" ;
  int i = str . length ( ) - 1 ;
  while ( str . charAt ( i ) == 'z' && i >= 0 ) i -- ;
  if ( i == - 1 ) str = str + 'a' ;
  else str = str . substring ( 0 , i ) + ( char ) ( ( int ) ( str . charAt ( i ) ) + 1 ) + str . substring ( i + 1 ) ;
  return str ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("amKIRzPiqLTIy");
    param0.add("68");
    param0.add("100");
    param0.add("f");
    param0.add("802205375");
    param0.add("0111");
    param0.add("GRjRYIvYwgua");
    param0.add("8139910006809");
    param0.add("100101");
    param0.add("rw");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}