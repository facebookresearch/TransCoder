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
class SORT_ARRAY_APPLYING_GIVEN_EQUATION{
static void f_gold ( int arr [ ] , int n , int A , int B , int C ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) arr [ i ] = A * arr [ i ] * arr [ i ] + B * arr [ i ] + C ;
  int index = - 1 ;
  int maximum = - 999999 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( maximum < arr [ i ] ) {
      index = i ;
      maximum = arr [ i ] ;
    }
  }
  int i = 0 , j = n - 1 ;
  int [ ] new_arr = new int [ n ] ;
  int k = 0 ;
  while ( i < index && j > index ) {
    if ( arr [ i ] < arr [ j ] ) new_arr [ k ++ ] = arr [ i ++ ] ;
    else new_arr [ k ++ ] = arr [ j -- ] ;
  }
  while ( i < index ) new_arr [ k ++ ] = arr [ i ++ ] ;
  while ( j > index ) new_arr [ k ++ ] = arr [ j -- ] ;
  new_arr [ n - 1 ] = maximum ;
  for ( int p = 0 ;
  p < n ;
  p ++ ) arr [ p ] = new_arr [ p ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{9,30,49,65,78,85,85,92});
    param0.add(new int[]{-48,89,-60,66,71,-37,47,-50,61,41,-22,-3,90,-57,77,-64,22,8,-90,-5,-94,-43,29,-29,86,-79,-8,27,-20,-44,16});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{87,70,77,87,73,81,66,19,83,7,63,42,42,59,20,73,17,27,47,2,63,62,19,17,69,39,82,71,81,39,36,40,45,4,25,69,30,76,68,88,29,73,68,51,24,14,69,18});
    param0.add(new int[]{-91,-85,-77,-73,-70,-68,-24,-21,-12,-1,9,29,48,52,56,63,88});
    param0.add(new int[]{0,0,0,1,1,0,1,1,1,1});
    param0.add(new int[]{4,5,9,14,18,20,22,23,25,28,30,31,34,35,36,38,38,39,44,48,49,51,54,55,59,64,66,71,72,72,73,76,78,82,82,84,92,93,95});
    param0.add(new int[]{40,6,33,8,78,-58,2,24,40,3,46,94,-26,8,22,-83,96,-29,-38,-59,19,62,98,-55,-42,79,26,62,-56,-85,-22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{3,68,40,48,54,35,95,56,89,40,77,68,46,78,13,27,6,17,36,99,81,2,77,52,66,52,92,43,90,22,55,67,99,60,58});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(18);
    param1.add(25);
    param1.add(33);
    param1.add(8);
    param1.add(7);
    param1.add(22);
    param1.add(20);
    param1.add(23);
    param1.add(28);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(20);
    param2.add(26);
    param2.add(42);
    param2.add(12);
    param2.add(8);
    param2.add(33);
    param2.add(16);
    param2.add(21);
    param2.add(21);
    List<Integer> param3 = new ArrayList<>();
    param3.add(5);
    param3.add(20);
    param3.add(15);
    param3.add(35);
    param3.add(8);
    param3.add(6);
    param3.add(19);
    param3.add(19);
    param3.add(19);
    param3.add(23);
    List<Integer> param4 = new ArrayList<>();
    param4.add(4);
    param4.add(23);
    param4.add(18);
    param4.add(41);
    param4.add(8);
    param4.add(7);
    param4.add(25);
    param4.add(16);
    param4.add(23);
    param4.add(23);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{9,30,49,65,78,85,85,92});
    filled_function_param0.add(new int[]{-48,89,-60,66,71,-37,47,-50,61,41,-22,-3,90,-57,77,-64,22,8,-90,-5,-94,-43,29,-29,86,-79,-8,27,-20,-44,16});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{87,70,77,87,73,81,66,19,83,7,63,42,42,59,20,73,17,27,47,2,63,62,19,17,69,39,82,71,81,39,36,40,45,4,25,69,30,76,68,88,29,73,68,51,24,14,69,18});
    filled_function_param0.add(new int[]{-91,-85,-77,-73,-70,-68,-24,-21,-12,-1,9,29,48,52,56,63,88});
    filled_function_param0.add(new int[]{0,0,0,1,1,0,1,1,1,1});
    filled_function_param0.add(new int[]{4,5,9,14,18,20,22,23,25,28,30,31,34,35,36,38,38,39,44,48,49,51,54,55,59,64,66,71,72,72,73,76,78,82,82,84,92,93,95});
    filled_function_param0.add(new int[]{40,6,33,8,78,-58,2,24,40,3,46,94,-26,8,22,-83,96,-29,-38,-59,19,62,98,-55,-42,79,26,62,-56,-85,-22});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{3,68,40,48,54,35,95,56,89,40,77,68,46,78,13,27,6,17,36,99,81,2,77,52,66,52,92,43,90,22,55,67,99,60,58});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(4);
    filled_function_param1.add(18);
    filled_function_param1.add(25);
    filled_function_param1.add(33);
    filled_function_param1.add(8);
    filled_function_param1.add(7);
    filled_function_param1.add(22);
    filled_function_param1.add(20);
    filled_function_param1.add(23);
    filled_function_param1.add(28);
    List<Integer> filled_function_param2 = new ArrayList<>();
    filled_function_param2.add(4);
    filled_function_param2.add(20);
    filled_function_param2.add(26);
    filled_function_param2.add(42);
    filled_function_param2.add(12);
    filled_function_param2.add(8);
    filled_function_param2.add(33);
    filled_function_param2.add(16);
    filled_function_param2.add(21);
    filled_function_param2.add(21);
    List<Integer> filled_function_param3 = new ArrayList<>();
    filled_function_param3.add(5);
    filled_function_param3.add(20);
    filled_function_param3.add(15);
    filled_function_param3.add(35);
    filled_function_param3.add(8);
    filled_function_param3.add(6);
    filled_function_param3.add(19);
    filled_function_param3.add(19);
    filled_function_param3.add(19);
    filled_function_param3.add(23);
    List<Integer> filled_function_param4 = new ArrayList<>();
    filled_function_param4.add(4);
    filled_function_param4.add(23);
    filled_function_param4.add(18);
    filled_function_param4.add(41);
    filled_function_param4.add(8);
    filled_function_param4.add(7);
    filled_function_param4.add(25);
    filled_function_param4.add(16);
    filled_function_param4.add(23);
    filled_function_param4.add(23);
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(filled_function_param0.get(i),filled_function_param1.get(i),filled_function_param2.get(i),filled_function_param3.get(i),filled_function_param4.get(i));
        f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i));
        if(Arrays.equals(param0.get(i), filled_function_param0.get(i)) && param1.get(i) == filled_function_param1.get(i) && param2.get(i) == filled_function_param2.get(i) && param3.get(i) == filled_function_param3.get(i) && param4.get(i) == filled_function_param4.get(i))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}