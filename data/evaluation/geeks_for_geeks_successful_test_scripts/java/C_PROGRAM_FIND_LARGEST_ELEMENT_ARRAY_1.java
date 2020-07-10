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
public class C_PROGRAM_FIND_LARGEST_ELEMENT_ARRAY_1{
static int f_gold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  return arr [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{10,12,14,16,17,17,20,24,26,28,37,38,41,45,49,50,59,61,63,65,65,66,69,70,70,73,73,74,81,81,83,87,94,97});
    param0.add(new int[]{-56,38,-22,84,-60,2,68,-78,62,-98,24,26,48,62,-80,-14,-84,12,-54,-12,-20,-82,10,-34,-50,-72,78,16,30,-76,72,34,6,52,44,18,-38,48,-14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{92,5,40,65,86,51,14,29,66,6,62,92,29,13,88,54,15,60,45,2,51,9,33,51,31,11,62,61,77,38,11,4,27,54,72,64,85,46,24,44,39,73,82,85});
    param0.add(new int[]{-92,-90,-84,-80,-80,-76,-70,-70,-48,-44,-38,-28,-14,-14,-12,-2,2,4,6,10,16,16,20,22,24,26,50,52,56,56,58,58,74,80,82,84,86});
    param0.add(new int[]{0,1,0,0,0,0,1,1,0,0,1,0,0,0,1,1,1,0,0,1,0,1,1,0,1,0,0,1,1,1,0,0,0,0,0,1,0});
    param0.add(new int[]{5,19,20,26,31,32,34,37,39,40,46,46,50,53,58,58,59,65,72,72,75,76,77,78,81,83,83,95,98,99});
    param0.add(new int[]{32,-84,-84,86,-24,36,-12,82,48,-12,82,-76,84,-20,-12,-18,46,-74,-14,-86});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{95,73,74,14,73,74,19,93,34,53,85,75,80,15,36,57,15,98,51,37,8,9,62,71,28,24,37,53,84,76,22,48,15,19,43,88,58,38,63,68,27,22,37,76,59,66,22});
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(25);
    param1.add(11);
    param1.add(40);
    param1.add(33);
    param1.add(29);
    param1.add(28);
    param1.add(14);
    param1.add(33);
    param1.add(34);
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