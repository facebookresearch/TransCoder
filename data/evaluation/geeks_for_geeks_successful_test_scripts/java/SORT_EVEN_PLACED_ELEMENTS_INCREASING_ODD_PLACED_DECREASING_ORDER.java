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
public class SPLIT_ARRAY_ADD_FIRST_PART_END{
public static void f_gold ( int arr [ ] , int n , int k ) {
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int x = arr [ 0 ] ;
    for ( int j = 0 ;
    j < n - 1 ;
    ++ j ) arr [ j ] = arr [ j + 1 ] ;
    arr [ n - 1 ] = x ;
  }
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{75});
    param0.add(new int[]{-58,-60,-38,48,-2,32,-48,-46,90,-54,-18,28,72,86,0,-2,-74,12,-58,90,-30,10,-88,2,-14,82,-82,-46,2,-74});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{45,51,26,36,10,62,62,56,61,67,86,97,31,93,32,1,14,25,24,30,1,44,7,98,56,68,53,59,30,90,79,22});
    param0.add(new int[]{-88,-72,-64,-46,-40,-16,-8,0,22,34,44});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,0,1,1,0,1,0,0,1,1,1,1,0});
    param0.add(new int[]{8,17,20,23,31,32,37,37,44,45,48,64,64,67,69,71,75,77,78,81,83,87,89,92,94});
    param0.add(new int[]{-8,-88,-68,48,8,50,30,-88,74,-16,6,74,36,32,22,96,-2,70,40,-46,98,34,2,94});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{80,14,35,25,60,86,45,95,32,29,94,6,63,66,38});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(27);
    param1.add(7);
    param1.add(23);
    param1.add(6);
    param1.add(23);
    param1.add(21);
    param1.add(23);
    param1.add(5);
    param1.add(9);
    List<Integer> param2 = new ArrayList<>();
    param2.add(0);
    param2.add(17);
    param2.add(7);
    param2.add(24);
    param2.add(6);
    param2.add(30);
    param2.add(20);
    param2.add(13);
    param2.add(8);
    param2.add(7);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{75});
    filled_function_param0.add(new int[]{-58,-60,-38,48,-2,32,-48,-46,90,-54,-18,28,72,86,0,-2,-74,12,-58,90,-30,10,-88,2,-14,82,-82,-46,2,-74});
    filled_function_param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{45,51,26,36,10,62,62,56,61,67,86,97,31,93,32,1,14,25,24,30,1,44,7,98,56,68,53,59,30,90,79,22});
    filled_function_param0.add(new int[]{-88,-72,-64,-46,-40,-16,-8,0,22,34,44});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,0,1,1,0,1,0,0,1,1,1,1,0});
    filled_function_param0.add(new int[]{8,17,20,23,31,32,37,37,44,45,48,64,64,67,69,71,75,77,78,81,83,87,89,92,94});
    filled_function_param0.add(new int[]{-8,-88,-68,48,8,50,30,-88,74,-16,6,74,36,32,22,96,-2,70,40,-46,98,34,2,94});
    filled_function_param0.add(new int[]{0,0,0,0,1,1,1,1,1});
    filled_function_param0.add(new int[]{80,14,35,25,60,86,45,95,32,29,94,6,63,66,38});
    List<Integer> filled_function_param1 = new ArrayList<>();
  	filled_function_param1.add(0);
    filled_function_param1.add(27);
    filled_function_param1.add(7);
    filled_function_param1.add(23);
    filled_function_param1.add(6);
    filled_function_param1.add(23);
    filled_function_param1.add(21);
    filled_function_param1.add(23);
    filled_function_param1.add(5);
    filled_function_param1.add(9);
    List<Integer> filled_function_param2 = new ArrayList<>();
    filled_function_param2.add(0);
    filled_function_param2.add(17);
    filled_function_param2.add(7);
    filled_function_param2.add(24);
    filled_function_param2.add(6);
    filled_function_param2.add(30);
    filled_function_param2.add(20);
    filled_function_param2.add(13);
    filled_function_param2.add(8);
    filled_function_param2.add(7);
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(filled_function_param0.get(i),filled_function_param1.get(i),filled_function_param2.get(i));
        f_gold(param0.get(i),param1.get(i),param2.get(i));
        if(Arrays.equals(param0.get(i), filled_function_param0.get(i)) && param1.get(i) == filled_function_param1.get(i) && param2.get(i) == filled_function_param2.get(i))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}