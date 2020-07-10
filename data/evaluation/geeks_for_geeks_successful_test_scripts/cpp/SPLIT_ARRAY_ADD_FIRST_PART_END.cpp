// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

#include <iostream>
#include <cstdlib>
#include <string>
#include <vector>
#include <fstream>
#include <iomanip>
#include <bits/stdc++.h>
using namespace std;
void f_gold ( int arr [ ], int n, int k ) {
  for ( int i = 0;
  i < k;
  i ++ ) {
    int x = arr [ 0 ];
    for ( int j = 0;
    j < n - 1;
    ++ j ) arr [ j ] = arr [ j + 1 ];
    arr [ n - 1 ] = x;
  }
}


//TOFILL


int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{75},{-58,-60,-38,48,-2,32,-48,-46,90,-54,-18,28,72,86,0,-2,-74,12,-58,90,-30,10,-88,2,-14,82,-82,-46,2,-74},{0,0,0,0,0,1,1,1,1,1,1},{45,51,26,36,10,62,62,56,61,67,86,97,31,93,32,1,14,25,24,30,1,44,7,98,56,68,53,59,30,90,79,22},{-88,-72,-64,-46,-40,-16,-8,0,22,34,44},{0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,0,1,1,0,1,0,0,1,1,1,1,0},{8,17,20,23,31,32,37,37,44,45,48,64,64,67,69,71,75,77,78,81,83,87,89,92,94},{-8,-88,-68,48,8,50,30,-88,74,-16,6,74,36,32,22,96,-2,70,40,-46,98,34,2,94},{0,0,0,0,1,1,1,1,1},{80,14,35,25,60,86,45,95,32,29,94,6,63,66,38}};
    vector<int> param1 {0,27,7,23,6,23,21,23,5,9};
    vector<int> param2 {0,17,7,24,6,30,20,13,8,7};
    vector<vector<int>> filled_function_param0 {{75},{-58,-60,-38,48,-2,32,-48,-46,90,-54,-18,28,72,86,0,-2,-74,12,-58,90,-30,10,-88,2,-14,82,-82,-46,2,-74},{0,0,0,0,0,1,1,1,1,1,1},{45,51,26,36,10,62,62,56,61,67,86,97,31,93,32,1,14,25,24,30,1,44,7,98,56,68,53,59,30,90,79,22},{-88,-72,-64,-46,-40,-16,-8,0,22,34,44},{0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,0,1,1,0,1,0,0,1,1,1,1,0},{8,17,20,23,31,32,37,37,44,45,48,64,64,67,69,71,75,77,78,81,83,87,89,92,94},{-8,-88,-68,48,8,50,30,-88,74,-16,6,74,36,32,22,96,-2,70,40,-46,98,34,2,94},{0,0,0,0,1,1,1,1,1},{80,14,35,25,60,86,45,95,32,29,94,6,63,66,38}};
    vector<int> filled_function_param1 {0,27,7,23,6,23,21,23,5,9};
    vector<int> filled_function_param2 {0,17,7,24,6,30,20,13,8,7};
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(&filled_function_param0[i].front(),filled_function_param1[i],filled_function_param2[i]);
        f_gold(&param0[i].front(),param1[i],param2[i]);
        if(equal(begin(param0[i]), end(param0[i]), begin(filled_function_param0[i])) && param1[i] == filled_function_param1[i] && param2[i] == filled_function_param2[i])
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}