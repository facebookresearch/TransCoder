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
  unordered_map < int, pair < int, int > > mp;
  for ( int i = 0;
  i < n - 1;
  i ++ ) for ( int j = i + 1;
  j < n;
  j ++ ) mp [ arr [ i ] + arr [ j ] ] = {
    i, j };
    int d = INT_MIN;
    for ( int i = 0;
    i < n - 1;
    i ++ ) {
      for ( int j = i + 1;
      j < n;
      j ++ ) {
        int abs_diff = abs ( arr [ i ] - arr [ j ] );
        if ( mp . find ( abs_diff ) != mp . end ( ) ) {
          pair < int, int > p = mp [ abs_diff ];
          if ( p . first != i && p . first != j && p . second != i && p . second != j ) d = max ( d, max ( arr [ i ], arr [ j ] ) );
        }
      }
    }
    return d;
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,1,5,7,10,35,35,45,49,50,57,58,60,64,69,83,83,87,88,89,93,94},{94,90,88,0,-90,-68,94,-2,-50,-92,66,32,10,8,-14,-96,80,-60,48,-96,46,24,64,2,-30,28},{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{83,72,91,22,96,38,71,18,58,39,7,8,65,67},{-96,-92,-88,-86,-82,-80,-78,-76,-74,-72,-62,-54,-42,-40,-38,-36,-36,-34,-32,-32,-26,-26,-22,-14,-14,2,16,24,26,32,32,34,48,48,64,66,70,74,82,90},{1,0,0,1,0,0,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,0,1,1,1,0,1,1,0,0,1,1},{2,2,4,10,11,13,15,20,32,33,33,42,46,46,50,54,55,55,56,57,58,63,68,79,87,94},{58,78,28,54,-10,46,-78,-68,-44,64,78,80,-54,-38,-54,60,26,96},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{54,55,98,18,11,55,2,95,84,14,75,12,43,54,78,34,69,24,82,65,11,49,34,60,99,71,1,17,88,12,45,46,56,28,70,34,7,55,40,12,38,56,54,53,28}};
    vector<int> param1 {12,15,17,7,28,29,18,13,28,24};
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