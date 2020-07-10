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
public class SEARCH_AN_ELEMENT_IN_A_SORTED_AND_PIVOTED_ARRAY{
static int f_gold ( int arr [ ] , int l , int h , int key ) {
  if ( l > h ) return - 1 ;
  int mid = ( l + h ) / 2 ;
  if ( arr [ mid ] == key ) return mid ;
  if ( arr [ l ] <= arr [ mid ] ) {
    if ( key >= arr [ l ] && key <= arr [ mid ] ) return f_gold ( arr , l , mid - 1 , key ) ;
    return f_gold ( arr , mid + 1 , h , key ) ;
  }
  if ( key >= arr [ mid ] && key <= arr [ h ] ) return f_gold ( arr , mid + 1 , h , key ) ;
  return f_gold ( arr , l , mid - 1 , key ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3});
    param0.add(new int[]{{30, 40, 50, 10, 20});
    param0.add(new int[]{40,50,55,67,70,4,5,6,7});
    param0.add(new int[]{14,41,38,67,99,11,96,52,4,29,22,57,3,45,14,76,70,38,93,5,74,50,18,17,20,34,51,69,86,73});
    param0.add(new int[]{-90,-88,-88,-82,-62,-44,-38,-38,-36,-34,-34,-32,-30,-28,-28,-26,-24,-20,-16,-16,-16,-6,-6,2,6,8,10,14,18,18,46,50,50,54,56,58,58,60,62,70,70,74,82,84,88,94,96});
    param0.add(new int[]{1,1,1,1,0,0,1,1,1,1,1,1,1,0});
    param0.add(new int[]{4,7,9,10,10,11,14,16,17,21,25,27,31,34,34,34,38,41,42,42,52,56,56,58,60,66,67,68,68,70,72,74,76,82,88,88,88,89,91,93,94,95,95});
    param0.add(new int[]{92,60,-60,64,18,70,56,34,58,14,28,-72,-22,-74,-46,-28,64,88,18,-50,-14,-20,64,6,-4,-98,60,98,84,-58,-98,66,80,68,-42,-58,82,90,-72,34,34,80,88,-64,66,-20,-26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{33,18,98,47,76,58,29,68,62,78,12,95,20,88,39,12,43,45,5,45,96,64,38,28,70,25,65,79,39});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(8);
    param2.add(4);
    param2.add(9);
    param2.add(16);
    param2.add(24);
    param2.add(10);
    param2.add(23);
    param2.add(25);
    param2.add(40);
    param2.add(16);
    List<Integer> param3 = new ArrayList<>();
    param3.add(3);
    param3.add(40);
    param3.add(67);
    param3.add(15);
    param3.add(24);
    param3.add(10);
    param3.add(39);
    param3.add(25);
    param3.add(29);
    param3.add(28);
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
