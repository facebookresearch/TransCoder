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
public class CHECK_ARRAY_MAJORITY_ELEMENT{
static boolean f_gold ( int a [ ] , int n ) {
  HashMap < Integer , Integer > mp = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( mp . containsKey ( a [ i ] ) ) mp . put ( a [ i ] , mp . get ( a [ i ] ) + 1 ) ;
  else mp . put ( a [ i ] , 1 ) ;
  for ( Map . Entry < Integer , Integer > x : mp . entrySet ( ) ) if ( x . getValue ( ) >= n / 2 ) return true ;
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,14,20,26,32,33,34,35,35,49,51,55,57,64,64,68,70,72,74,77,78,78,78,80,91,91,94});
    param0.add(new int[]{-14,-98,-36,68,-20,18,16,-50,66,98,12,-2,-68});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{29,96,94,67,87,65,27,21,60,49,73,85,9,17,72,3,73,69,95,3,30,88,54,94,40});
    param0.add(new int[]{-86,-80,-76,-76,-74,-62,-62,-56,-48,-36,-28,-22,-18,-18,-18,-16,-14,-12,-6,-2,10,14,18,24,32,32,40,40,40,42,46,48,50,56,56,56,68,76,84,94,96,96});
    param0.add(new int[]{0,1,1,1,0});
    param0.add(new int[]{5,8,9,12,14,16,19,29,32,32,37,38,38,39,40,41,43,45,47,51,53,58,58,63,64,65,69,83,84,86,92,93,96,98});
    param0.add(new int[]{-68,-50,-20,22,90,86,4,60,-88,82,-4,-54,36,-44,86});
    param0.add(new int[]{0,0,0,0,1,1,1,1});
    param0.add(new int[]{85,64,25,64,46,35,31,45,93,81,49,33,96,48,37});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(11);
    param1.add(22);
    param1.add(15);
    param1.add(23);
    param1.add(3);
    param1.add(17);
    param1.add(13);
    param1.add(6);
    param1.add(13);
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