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
  unordered_map < int, int > um;
  int mod_arr [ n ], max = 0;
  int curr_sum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    curr_sum += arr [ i ];
    mod_arr [ i ] = ( ( curr_sum % k ) + k ) % k;
  }
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( mod_arr [ i ] == 0 ) max = i + 1;
    else if ( um . find ( mod_arr [ i ] ) == um . end ( ) ) um [ mod_arr [ i ] ] = i;
    else if ( max < ( i - um [ mod_arr [ i ] ] ) ) max = i - um [ mod_arr [ i ] ];
  }
  return max;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{14,16,17,17,31,32,34,35,37,38,39,46,47,52,57,58,60,61,69,75,76,77,81,88,97},{-16,64,-62,-86,10,-40,52,50,-42,34,-32,-32,90,72,-96,-46,-6,92,14,98,-66,96,-48,-80,-22,-82,-50,-60,-70,82,-78,-68,88,-56,24,-52},{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{33,1,92,27,17,46,79,78,95,34,3,56,12,26,24,60,58,63,98,8,76,73,26,58,38,49,43,59,83,21,13,99,3,89,32,21,14,95,8,7,99,83,59,2,69,44,66},{-92,-76,-58,-56,-54,-20,-18,-16,-14,8,20,52,72,82,82,84},{1,0,1,1,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1,0,0,0,0,1,1,0,0,1,0,1,0,0,0,0},{7,7,8,9,13,14,16,18,19,20,24,24,30,32,32,45,49,55,62,62,84,90,90,93,95,98},{-28,-52,-84,-98,48,74,48,-34,-38,54},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{30,44,9,92,82,11,66,22,87,20}};
    vector<int> param1 {23,35,13,40,15,34,22,7,28,9};
    vector<int> param2 {23,21,13,37,15,26,14,8,37,9};
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