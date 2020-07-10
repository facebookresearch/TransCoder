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
int f_gold ( int price [ ], int n, int k ) {
  int profit [ k + 1 ] [ n + 1 ];
  for ( int i = 0;
  i <= k;
  i ++ ) profit [ i ] [ 0 ] = 0;
  for ( int j = 0;
  j <= n;
  j ++ ) profit [ 0 ] [ j ] = 0;
  for ( int i = 1;
  i <= k;
  i ++ ) {
    for ( int j = 1;
    j < n;
    j ++ ) {
      int max_so_far = INT_MIN;
      for ( int m = 0;
      m < j;
      m ++ ) max_so_far = max ( max_so_far, price [ j ] - price [ m ] + profit [ i - 1 ] [ m ] );
      profit [ i ] [ j ] = max ( profit [ i ] [ j - 1 ], max_so_far );
    }
  }
  return profit [ k ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,5,9,11,18,27,46,49,60,70,83,96},{44},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},{53,72,2,6,99,56,73,2,72,14,23,5,66,73,45,38,96,35,75,48,73,68,41,53,10,18,95,68,48,70,87,53,95,26,35,37,56,35,93,3,44,38,3,16,62,63,21,65},{-98,-92,-84,-80,-78,-74,-56,-54,-52,-48,-48,-30,-26,-20,-16,-12,-10,-8,-2,0,8,26,34,36,44,46,48,56,60,60,66,68,72,72,78,80,84,84,94,96},{1,1,1,0,1,0,1,1,0,1,0,1,0},{3,3,7,8,9,13,14,14,18,19,20,22,23,23,24,25,27,30,33,34,34,35,39,40,41,43,43,47,48,50,54,55,59,64,68,70,74,74,74,76,90,90,91,94,94,94,96,99},{78,78,-12,32,-12,-12,-4,-8,12,60,12,-74,-52,-60,-62,76,12,24,32,-6,-70,-34,-44,50,62,-52,-32,18,44,-74,18,94,78,-44,-90,-32,44,-72,28,-34,56,98,66},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{50,81,12,65}};
    vector<int> param1 {10,0,18,47,30,11,24,40,44,2};
    vector<int> param2 {10,0,22,25,23,8,26,24,24,2};
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