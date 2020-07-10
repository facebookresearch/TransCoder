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
class SORT_EVEN_NUMBERS_ASCENDING_ORDER_SORT_ODD_NUMBERS_DESCENDING_ORDER_1{
static void f_gold ( int arr [ ] , int n ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( ( arr [ i ] & 1 ) != 0 ) arr [ i ] *= - 1 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( ( arr [ i ] & 1 ) != 0 ) arr [ i ] *= - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4});
    param0.add(new int[]{8,-74,89,65,51,-15,68,51,23,44,89});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{51,74,43,15,38,15,5,93});
    param0.add(new int[]{-96,-75,-64,-20,-5,-2,1,40,46,64});
    param0.add(new int[]{0,0,1,0,0,1,0,0,0});
    param0.add(new int[]{1,2,4,4,17,22,23,28,35,38,39,39,41,42,42,45,46,49,49,49,50,59,62,68,69,71,73,76,78,79,80,87,88,88,90,90,91,93,95,96,98});
    param0.add(new int[]{11,68,-52,-49,-57,-2,83,77,24,-20,85,11,43,-73,96,92,58,64,95,13,-14,14,24,-51,-24,-45,-44,96,-5,-56,59});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{44,7,44,68,34,66,69,55,10,96,42,41,77,69,10,10,91,60,51});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(8);
    param1.add(28);
    param1.add(6);
    param1.add(7);
    param1.add(5);
    param1.add(34);
    param1.add(24);
    param1.add(14);
    param1.add(13);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{4});
    filled_function_param0.add(new int[]{8,-74,89,65,51,-15,68,51,23,44,89});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{51,74,43,15,38,15,5,93});
    filled_function_param0.add(new int[]{-96,-75,-64,-20,-5,-2,1,40,46,64});
    filled_function_param0.add(new int[]{0,0,1,0,0,1,0,0,0});
    filled_function_param0.add(new int[]{1,2,4,4,17,22,23,28,35,38,39,39,41,42,42,45,46,49,49,49,50,59,62,68,69,71,73,76,78,79,80,87,88,88,90,90,91,93,95,96,98});
    filled_function_param0.add(new int[]{11,68,-52,-49,-57,-2,83,77,24,-20,85,11,43,-73,96,92,58,64,95,13,-14,14,24,-51,-24,-45,-44,96,-5,-56,59});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{44,7,44,68,34,66,69,55,10,96,42,41,77,69,10,10,91,60,51});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(0);
    filled_function_param1.add(8);
    filled_function_param1.add(28);
    filled_function_param1.add(6);
    filled_function_param1.add(7);
    filled_function_param1.add(5);
    filled_function_param1.add(34);
    filled_function_param1.add(24);
    filled_function_param1.add(14);
    filled_function_param1.add(13);
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