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
public class CHECK_IF_STRING_REMAINS_PALINDROME_AFTER_REMOVING_GIVEN_NUMBER_OF_CHARACTERS{
static boolean f_gold ( String str , int n ) {
  int len = str . length ( ) ;
  if ( len >= n ) return true ;
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ZCoQhuM");
    param0.add("7437725");
    param0.add("11");
    param0.add("buGlvR");
    param0.add("9");
    param0.add("101101010110");
    param0.add("YguiM");
    param0.add("8198");
    param0.add("11101");
    param0.add("hUInqJXNdbfP");
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(53);
    param1.add(30);
    param1.add(1);
    param1.add(92);
    param1.add(3);
    param1.add(18);
    param1.add(90);
    param1.add(71);
    param1.add(4);
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