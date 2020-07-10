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
int f_gold ( int arr [ ], int n, int k ) {
  int result = INT_MAX;
  sort ( arr, arr + n );
  for ( int i = 0;
  i <= n - k;
  i ++ ) result = min ( result, arr [ i + k - 1 ] - arr [ i ] );
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,1,2,7,8,14,16,20,20,23,24,24,29,30,32,34,35,37,38,43,44,46,50,52,55,57,61,71,79,86,86,89,91,91,95},{78,-4,76,0,-62,54,-70,62,90,-80,-68,90,-34,-66,-46,34,-18,-74,-66,34,34,-28,6,80,58,-50,-60,54,8,-52,-60,68,42,16,42,72,54,88,44,46,84,-34},{0,0,0,0,0,0,0,0,1,1,1,1,1,1},{32},{-96,-78,-76,-72,-72,-70,-54,-46,-40,-34,-30,-26,-24,-22,-18,-16,-6,-4,-4,2,6,14,16,18,30,30,36,54,54,58,66,72,78,80,80,82,88,98},{0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,1,0,1,0,1,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,0,1},{3,13,14,18,23,32,67,72,75,76,87,95},{8,30},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{31,15,19,41,73,29,67,36,87,74,95,27,36,83,37,33,30,86,94,93,9,42,3,95,3,69,67,63,16,53,35,52,2,57,57,25,21,7,72,52,78,40}};
    vector<int> param1 {33,33,8,0,26,39,10,1,27,36};
    vector<int> param2 {17,33,13,0,25,41,8,1,33,37};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],param2[i]) == f_gold(&param0[i].front(),param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}