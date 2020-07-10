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
public class PROGRAM_PAGE_REPLACEMENT_ALGORITHMS_SET_2_FIFO{
static int f_gold ( int pages [ ] , int n , int capacity ) {
  HashSet < Integer > s = new HashSet < > ( capacity ) ;
  Queue < Integer > indexes = new LinkedList < > ( ) ;
  int page_faults = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . size ( ) < capacity ) {
      if ( ! s . contains ( pages [ i ] ) ) {
        s . add ( pages [ i ] ) ;
        page_faults ++ ;
        indexes . add ( pages [ i ] ) ;
      }
    }
    else {
      if ( ! s . contains ( pages [ i ] ) ) {
        int val = indexes . peek ( ) ;
        indexes . poll ( ) ;
        s . remove ( val ) ;
        s . add ( pages [ i ] ) ;
        indexes . add ( pages [ i ] ) ;
        page_faults ++ ;
      }
    }
  }
  return page_faults ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,4,6,7,8,11,13,18,26,35,36,37,45,46,46,47,48,49,51,52,53,56,61,74,75,77,80,83,85,86,87,90,93,95,97,98,99,99});
    param0.add(new int[]{78,-48,50,-20,-6,58,-8,66,72,68,4,80,58,-26,-82,-56,92,76,20,82,-46,86,38,60,-62,-48,76,8,-66,-4,-98,-96,-52,92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,78,94,42,62,83,7,62,60,94,16,28,50,15,18,71,86,47,62,89});
    param0.add(new int[]{-82,-70,-68,-56,-50,-44,4,18,28,30,30,42,66,78,80});
    param0.add(new int[]{1,1,0,0,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,0});
    param0.add(new int[]{4,5,13,15,18,28,32,40,46,46,55,57,61,63,65,68,77,79,79,96});
    param0.add(new int[]{-2,82,2,-74,-6,-24,54,-74,-98,8,-94,-60,-42,-38,36,-38,-58,-70,-28,-34,70,-6,-2,-76,-40,-4,0,-4,76,48,-34,-26,-48,-58,-88,-44,20,-22,78});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{4,90,28,71,69,45,92,63,72,76,47,85,36,59,88,46,28,19,50,31,63,13});
    List<Integer> param1 = new ArrayList<>();
    param1.add(36);
    param1.add(33);
    param1.add(19);
    param1.add(15);
    param1.add(9);
    param1.add(25);
    param1.add(17);
    param1.add(31);
    param1.add(26);
    param1.add(15);
    List<Integer> param2 = new ArrayList<>();
    param2.add(37);
    param2.add(23);
    param2.add(13);
    param2.add(11);
    param2.add(11);
    param2.add(25);
    param2.add(18);
    param2.add(24);
    param2.add(24);
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