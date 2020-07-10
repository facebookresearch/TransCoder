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
    int prevDiff = INT_MIN;
    for ( int j = 1;
    j < n;
    j ++ ) {
      prevDiff = max ( prevDiff, profit [ i - 1 ] [ j - 1 ] - price [ j - 1 ] );
      profit [ i ] [ j ] = max ( profit [ i ] [ j - 1 ], price [ j ] + prevDiff );
    }
  }
  return profit [ k ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,6,16,16,19,37,47,49,74,77,86,96},{-6,-70,-26,78,98,-72,48,-94,-38,52,-50,58,84,16,-74,32,-44,-50,68,-48,28,94,-26,-96,-42,96,-24,42,-70,10,-16,-32,98,38,-2,26,-26,-78,44,-72,-56,-22},{0,0,0,0,0,0,0,1,1,1},{22,12,58,70},{-96,-96,-94,-92,-90,-88,-88,-84,-78,-76,-72,-72,-68,-62,-54,-52,-52,-36,-34,-32,-26,-20,-6,-4,-4,4,8,10,14,16,32,32,32,34,42,46,50,60,62,64,64,72,74,76,76,78,90,92,96},{1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0},{2,4,7,11,20,24,25,27,29,33,33,36,36,41,44,45,47,54,65,66,67,75,78,82,85,90},{56,2,-10,-44,68,10,-32,-2,-68,12,-34,-36,0,40,-16,-36,92,8,-40,-10,46,98,76,-2,98,-20,6,68,32,-26,-12,70,16,-34,-50,-76,-34,-18,0,-44,-76,58},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},{78,39,2,76,20,21,3,21,32,80,28,89,51,2,88,19,99,71,68,38,8,76,48,81,90,71,31}};
    vector<int> param1 {6,31,7,3,30,14,15,24,10,14};
    vector<int> param2 {6,32,8,2,36,13,22,35,8,24};
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