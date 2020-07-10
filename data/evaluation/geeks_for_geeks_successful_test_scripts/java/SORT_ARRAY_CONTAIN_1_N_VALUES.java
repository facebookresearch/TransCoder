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
class SORT_ARRAY_CONTAIN_1_N_VALUES{
static void f_gold ( int [ ] arr , int n ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = i + 1 ;
  }
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,3,6,7,9,11,15,15,17,19,21,23,26,27,37,48,48,51,53,53,59,64,69,69,70,71,72,84,93,96});
    param0.add(new int[]{66,-28,6,25,-65,19,-86,-86,-90,40,-62});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{85,84,8,36,93,76,14,54,85,86});
    param0.add(new int[]{-90,-82,-80,-73,-67,-62,-62,-61,-58,-56,-56,-52,-50,-49,-49,-43,-43,-30,-26,-26,-15,-14,-13,-4,10,19,20,22,26,29,34,35,37,45,49,52,54,66,67,80,84,87,89,90});
    param0.add(new int[]{1,1,0,0,0,1,0,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,0,0,1,0,1,1,1});
    param0.add(new int[]{10,11,13,19,19,30,33,36,40,42,44,47,49,52,53,58,66,68,72,82,87,89,90,94});
    param0.add(new int[]{-46,-35,40,-76,-66,-47,36,-82,-43,12,-95,54,58,82,-87,-17,-71,-97,-10,4,23,86,-24});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{88,76,16,23,40,60,73,32,15,13,5,75,74,52,77,41,53,50,15,7,40,28,32,99,15,85});
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(8);
    param1.add(26);
    param1.add(9);
    param1.add(31);
    param1.add(29);
    param1.add(21);
    param1.add(12);
    param1.add(6);
    param1.add(18);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{3,3,6,7,9,11,15,15,17,19,21,23,26,27,37,48,48,51,53,53,59,64,69,69,70,71,72,84,93,96});
    filled_function_param0.add(new int[]{66,-28,6,25,-65,19,-86,-86,-90,40,-62});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{85,84,8,36,93,76,14,54,85,86});
    filled_function_param0.add(new int[]{-90,-82,-80,-73,-67,-62,-62,-61,-58,-56,-56,-52,-50,-49,-49,-43,-43,-30,-26,-26,-15,-14,-13,-4,10,19,20,22,26,29,34,35,37,45,49,52,54,66,67,80,84,87,89,90});
    filled_function_param0.add(new int[]{1,1,0,0,0,1,0,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,0,0,1,0,1,1,1});
    filled_function_param0.add(new int[]{10,11,13,19,19,30,33,36,40,42,44,47,49,52,53,58,66,68,72,82,87,89,90,94});
    filled_function_param0.add(new int[]{-46,-35,40,-76,-66,-47,36,-82,-43,12,-95,54,58,82,-87,-17,-71,-97,-10,4,23,86,-24});
    filled_function_param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{88,76,16,23,40,60,73,32,15,13,5,75,74,52,77,41,53,50,15,7,40,28,32,99,15,85});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(19);
    filled_function_param1.add(8);
    filled_function_param1.add(26);
    filled_function_param1.add(9);
    filled_function_param1.add(31);
    filled_function_param1.add(29);
    filled_function_param1.add(21);
    filled_function_param1.add(12);
    filled_function_param1.add(6);
    filled_function_param1.add(18);
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