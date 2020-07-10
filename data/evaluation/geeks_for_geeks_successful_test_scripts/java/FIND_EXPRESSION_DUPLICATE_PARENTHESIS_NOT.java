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
public class FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT{
static boolean f_gold ( String s ) {
  Stack < Character > Stack = new Stack < > ( ) ;
  char [ ] str = s . toCharArray ( ) ;
  for ( char ch : str ) {
    if ( ch == ')' ) {
      char top = Stack . peek ( ) ;
      Stack . pop ( ) ;
      int elementsInside = 0 ;
      while ( top != '(' ) {
        elementsInside ++ ;
        top = Stack . peek ( ) ;
        Stack . pop ( ) ;
      }
      if ( elementsInside < 1 ) {
        return true ;
      }
    }
    else {
      Stack . push ( ch ) ;
    }
  }
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("((a+b)+((c+d)))");
    param0.add("(((a+(b)))+(c+d))");
    param0.add("(((a+(b))+c+d))");
    param0.add("((a+b)+(c+d))");
    param0.add("(8582007)");
    param0.add("((a+(b))+(c+d))");
    param0.add("(PylsShEdKAE)");
    param0.add("886980680541");
    param0.add("001");
    param0.add("jsVmFeOq");
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