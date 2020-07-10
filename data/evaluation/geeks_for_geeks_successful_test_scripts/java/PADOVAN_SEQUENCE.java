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
public class PADOVAN_SEQUENCE{
static int f_gold ( int n ) {
  int pPrevPrev = 1 , pPrev = 1 , pCurr = 1 , pNext = 1 ;
  for ( int i = 3 ;
  i <= n ;
  i ++ ) {
    pNext = pPrevPrev + pPrev ;
    pPrevPrev = pPrev ;
    pPrev = pCurr ;
    pCurr = pNext ;
  }
  return pNext ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(92);
    param0.add(29);
    param0.add(52);
    param0.add(55);
    param0.add(13);
    param0.add(83);
    param0.add(83);
    param0.add(10);
    param0.add(67);
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