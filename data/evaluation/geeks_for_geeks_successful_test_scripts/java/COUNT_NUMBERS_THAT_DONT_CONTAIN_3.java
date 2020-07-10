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
public class COUNT_NUMBERS_THAT_DONT_CONTAIN_3{
static int f_gold ( int n ) {
  if ( n < 3 ) return n ;
  if ( n >= 3 && n < 10 ) return n - 1 ;
  int po = 1 ;
  while ( n / po > 9 ) po = po * 10 ;
  int msd = n / po ;
  if ( msd != 3 ) return f_gold ( msd ) * f_gold ( po - 1 ) + f_gold ( msd ) + f_gold ( n % po ) ;
  else return f_gold ( msd * po - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(85);
    param0.add(86);
    param0.add(3);
    param0.add(35);
    param0.add(59);
    param0.add(38);
    param0.add(33);
    param0.add(15);
    param0.add(75);
    param0.add(74);
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