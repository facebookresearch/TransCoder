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
int f_gold ( int arr [ ], int n, int m ) {
  if ( m == 0 || n == 0 ) return 0;
  sort ( arr, arr + n );
  if ( n < m ) return - 1;
  int min_diff = INT_MAX;
  int first = 0, last = 0;
  for ( int i = 0;
  i + m - 1 < n;
  i ++ ) {
    int diff = arr [ i + m - 1 ] - arr [ i ];
    if ( diff < min_diff ) {
      min_diff = diff;
      first = i;
      last = i + m - 1;
    }
  }
  return ( arr [ last ] - arr [ first ] );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,5,11,23,33,35,39,51,52,56,74,76,76,79,85,88,93,98},{-42,76,-34,-74,16,4,88,-70,-88,-94,-24,4,-14,-56,56,-18,84,0,-48,-94,72,42,36,52,74,-84,-50,16,30},{0,0,1,1,1,1},{29,49,88,44,92,43,12,5,38,75,57,3,85,16,86,62,16,40,76,37,5,69,16,63,84,78,74,18,4,89,73,67,60},{-98,-80,-50,-44,-42,-36,-36,-28,-10,-8,-4,-2,2,10,18,18,26,32,36,56,80,86,88,90},{0,0,1,0,1,1,1,0,1,0,0,1,1,1,1,1},{13,15,62,65,87},{-50,58,78,28,4,18,-8,18,-88,-48,-26,-32,64,48,60,94,-92,48,-36,30,-80,-60,82,-62,32,-36,-76,-88,-60,22,-14,72,30},{0,0,0,0,1,1,1,1,1,1,1},{25,17,58,40,53,73,23,77,38}};
    vector<int> param1 {16,15,5,25,16,13,3,31,9,8};
    vector<int> param2 {13,28,5,18,12,14,4,17,6,6};
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