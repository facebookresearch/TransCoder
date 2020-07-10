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
int f_gold ( int weight [ ], int n, int c ) {
  int res = 0, bin_rem = c;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( weight [ i ] > bin_rem ) {
      res ++;
      bin_rem = c - weight [ i ];
    }
    else bin_rem -= weight [ i ];
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,12,14,16,19,24,29,31,33,34,41,43,47,53,53,59,64,70,70,71,72,73,74,80,81,89,90},{-88,-26,70,-92,96,84,-24,-18,84,62,-72,42,72,2,30,86},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{51,7,6,24,19,83,9,36,40,93,24,48,63,69,53,54,42,45,90,14,29,6,7,37,53,18,87,38,59,1,68,44,47,35,87,91,60,90,52,8,80,41,3,96},{-98,-90,-78,-48,-36,-20,2,8,16,40,54,54,60,92},{1,1,1,1,0,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,0,1,1,1,1,1,0,1,1,0,0,1,0,0,0,0},{8,14,16,35,40,45,54,57,58,59,87,88,93,95,97},{-46,-6,60,-88,10,94,-12,-64,-68,-76,-60,-10,28,18,86,88,80,-56,94,-6,-42,72,-10,54,-82,-52,-70,-28,-74,82,-12,42,44,56,52,-28,22,62,-20},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{48,57,21,82,99}};
    vector<int> param1 {21,11,27,26,11,32,11,19,26,4};
    vector<int> param2 {16,14,23,41,7,28,12,38,23,2};
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