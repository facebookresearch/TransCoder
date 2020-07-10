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
class SORT_ARRAY_TWO_HALVES_SORTED{
static void f_gold ( int [ ] A , int n ) {
  Arrays . sort ( A ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,11,13,18,24,26,30,31,34,42,43,43,44,44,47,49,52,53,55,56,57,58,58,60,64,66,67,69,70,70,71,74,76,77,82,85,89,90,96,98});
    param0.add(new int[]{-78,81,87,14,25,24,-70,-92,-2,-43,11,-27,15,-80,-75,-81,-95,-25,28,-28,55,-60,-74,-73,90,-17,28,78,70,57,67,88,69,-67,-3,11,-84,-77,35,-74,-4,-88,-28,33});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{6,46,50,38,88,18,27,41,72,92,74,17,62,29,58,70,78,22,6,26,39,12,99,14,22,51,23,48,71,50,89,13,85,10,55,9,79,52,2,25,13,98,51,58,34,35,3,59,70});
    param0.add(new int[]{-98,-88,-76,-71,-71,-63,-59,-58,-57,-42,-40,-37,-36,-34,-33,-33,-27,-26,-23,-9,-8,-6,-5,-1,0,3,16,21,29,30,33,39,39,43,47,50,52,60,63,66,73,74,76,77,92,92,96,97});
    param0.add(new int[]{1,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,0,0,0,0,1,1,1,0,1,0});
    param0.add(new int[]{46,86});
    param0.add(new int[]{58,-31,37,-15,-89,-31,-1,-9,94,59,61,67,-6,74,65,15,88,-69,-89,-13,21,30,5});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{94,5,98,22,77,57,47,54,3,53,84,31});
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(31);
    param1.add(15);
    param1.add(46);
    param1.add(42);
    param1.add(31);
    param1.add(1);
    param1.add(21);
    param1.add(19);
    param1.add(10);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{2,3,11,13,18,24,26,30,31,34,42,43,43,44,44,47,49,52,53,55,56,57,58,58,60,64,66,67,69,70,70,71,74,76,77,82,85,89,90,96,98});
    filled_function_param0.add(new int[]{-78,81,87,14,25,24,-70,-92,-2,-43,11,-27,15,-80,-75,-81,-95,-25,28,-28,55,-60,-74,-73,90,-17,28,78,70,57,67,88,69,-67,-3,11,-84,-77,35,-74,-4,-88,-28,33});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{6,46,50,38,88,18,27,41,72,92,74,17,62,29,58,70,78,22,6,26,39,12,99,14,22,51,23,48,71,50,89,13,85,10,55,9,79,52,2,25,13,98,51,58,34,35,3,59,70});
    filled_function_param0.add(new int[]{-98,-88,-76,-71,-71,-63,-59,-58,-57,-42,-40,-37,-36,-34,-33,-33,-27,-26,-23,-9,-8,-6,-5,-1,0,3,16,21,29,30,33,39,39,43,47,50,52,60,63,66,73,74,76,77,92,92,96,97});
    filled_function_param0.add(new int[]{1,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,0,0,0,0,1,1,1,0,1,0});
    filled_function_param0.add(new int[]{46,86});
    filled_function_param0.add(new int[]{58,-31,37,-15,-89,-31,-1,-9,94,59,61,67,-6,74,65,15,88,-69,-89,-13,21,30,5});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{94,5,98,22,77,57,47,54,3,53,84,31});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(33);
    filled_function_param1.add(31);
    filled_function_param1.add(15);
    filled_function_param1.add(46);
    filled_function_param1.add(42);
    filled_function_param1.add(31);
    filled_function_param1.add(1);
    filled_function_param1.add(21);
    filled_function_param1.add(19);
    filled_function_param1.add(10);
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(filled_function_param0.get(i),filled_function_param1.get(i));
        f_gold(param0.get(i),param1.get(i));
        if(Arrays.equals(param0.get(i), filled_function_param0.get(i)) && param1.get(i) == filled_function_param1.get(i))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}