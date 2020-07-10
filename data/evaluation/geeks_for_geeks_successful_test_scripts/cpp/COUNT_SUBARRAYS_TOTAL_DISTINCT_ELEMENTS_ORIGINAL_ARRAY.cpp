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
int f_gold ( int arr [ ], int n ) {
  unordered_map < int, int > vis;
  for ( int i = 0;
  i < n;
  ++ i ) vis [ arr [ i ] ] = 1;
  int k = vis . size ( );
  vis . clear ( );
  int ans = 0, right = 0, window = 0;
  for ( int left = 0;
  left < n;
  ++ left ) {
    while ( right < n && window < k ) {
      ++ vis [ arr [ right ] ];
      if ( vis [ arr [ right ] ] == 1 ) ++ window;
      ++ right;
    }
    if ( window == k ) ans += ( n - right + 1 );
    -- vis [ arr [ left ] ];
    if ( vis [ arr [ left ] ] == 0 ) -- window;
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{13,39,49,52,53,69,72,79,83,96},{-98,-98,22,-10,-28,0,56,72,36,88,96,22,90,74,-60,-64,0,2,-42,0,94,-82,-74},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{35,23,41,58,66,92,3,33,78,70,80,86,21,21,74,19},{-98,-80,-52,-10,4,76},{1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,0,1,1,1,1},{2,7,10,17,26,36,37,85,87,88},{64,-2,-94,-84,-48,86},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{91,49,94,81,64,5,13,70,82,9,80,82}};
    vector<int> param1 {5,20,26,12,3,36,8,5,20,9};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i]) == f_gold(&param0[i].front(),param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}