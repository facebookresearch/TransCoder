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
public class SEARCH_INSERT_AND_DELETE_IN_A_SORTED_ARRAY{
static int f_gold ( int arr [ ] , int low , int high , int key ) {
  if ( high < low ) return - 1 ;
  int mid = ( low + high ) / 2 ;
  if ( key == arr [ mid ] ) return mid ;
  if ( key > arr [ mid ] ) return f_gold ( arr , ( mid + 1 ) , high , key ) ;
  return f_gold ( arr , low , ( mid - 1 ) , key ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,10,73,91,98});
    param0.add(new int[]{30,24,24,-8,64,50,46,-76,26,8,-92,-78,40,-86,96,14,60,38,6,-72,-6,-20,26,-26,0,2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{30,79,3,76,18});
    param0.add(new int[]{-96,-90,-88,-84,-78,-78,-70,-68,-66,-66,-64,-64,-58,-56,-52,-42,-40,-38,-36,-30,-30,-28,-14,-8,0,14,16,22,24,26,36,40,40,48,48,50,52,54,54,58,64,74,82,88,94});
    param0.add(new int[]{1,1,0,0,0,1,1,1,0,0,1,0,1,0,0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,1,1,0,1});
    param0.add(new int[]{2,8,8,14,15,16,17,17,18,18,24,25,25,26,36,37,39,39,40,44,46,47,51,54,56,57,57,61,61,67,68,69,72,76,77,81,82,82,82,85,85,87,94,94,98,99});
    param0.add(new int[]{-4,84,20,-84,-6,-78,20,56,40,0,98,80,-94,36,-6,-98,50,66,-12,-58,-34,68,-80,-30,-82,-76,-38,-60,92,94,48,-84,20,-66,-32,-92,16,-96,-68,94,-46,30,32,-34,96,-92,-96,-86,-22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{71,70,13,18,70,62,88,27,17,44,89,28,74,41,20,91,95,79,40,43,38,20,5});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(20);
    param1.add(30);
    param1.add(3);
    param1.add(35);
    param1.add(25);
    param1.add(33);
    param1.add(34);
    param1.add(19);
    param1.add(21);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(13);
    param2.add(27);
    param2.add(2);
    param2.add(30);
    param2.add(26);
    param2.add(40);
    param2.add(27);
    param2.add(13);
    param2.add(22);
    List<Integer> param3 = new ArrayList<>();
    param3.add(4);
    param3.add(21);
    param3.add(29);
    param3.add(2);
    param3.add(40);
    param3.add(30);
    param3.add(26);
    param3.add(34);
    param3.add(19);
    param3.add(22);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}