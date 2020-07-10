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
int f_gold ( int a [ ], int n, int k ) {
  unordered_map < int, int > b;
  for ( int i = 0;
  i < n;
  i ++ ) {
    int x = a [ i ];
    int d = min ( 1 + i, n - i );
    if ( b . find ( x ) == b . end ( ) ) b [ x ] = d;
    else b [ x ] = min ( d, b [ x ] );
  }
  int ans = INT_MAX;
  for ( int i = 0;
  i < n;
  i ++ ) {
    int x = a [ i ];
    if ( x != k - x && b . find ( k - x ) != b . end ( ) ) ans = min ( max ( b [ x ], b [ k - x ] ), ans );
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,27,66,89,96,96},{84,-38,-56,-20,-98,-40,-16,22,20,98,-56,-32,-44,30,-58,26,-44,-32,50,46,92},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{20,71,66,58,74,2,63,13,1,36,28,83,24,20,85,30,59,56,8,97,58,28,28,42},{-94,-88,-86,-68,-66,-64,-28,-12,4,18,22,28,32,34,34,40,44,46,60,68,72,78,80,84,88,96},{0,0,0,0,0,1,1,1,1,0,0,0,1,1,1},{8,13,54,59,61,69,89,90,92},{-58,50,-74,-8,-50,90,90,-2,-22,8,-76,16,4,56,94,36,28,-42,80,-88,88,52,74,40,12,-72,-50,50,88,-54,32,-24,-48,-66,-86,40,-6,14,10,-88,56,80,-34},{0,0,0,0,0,0,0,1,1,1,1,1,1,1},{2,60,66,39,18,60,37,75,3,64,24,16,72,95,96,44,23,58,58,33,24,96}};
    vector<int> param1 {4,13,23,23,16,8,4,27,9,21};
    vector<int> param2 {4,11,13,17,15,13,8,42,12,17};
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