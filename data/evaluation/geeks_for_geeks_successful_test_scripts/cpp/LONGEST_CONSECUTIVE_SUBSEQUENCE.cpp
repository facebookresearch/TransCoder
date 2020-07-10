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
  unordered_set < int > S;
  int ans = 0;
  for ( int i = 0;
  i < n;
  i ++ ) S . insert ( arr [ i ] );
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( S . find ( arr [ i ] - 1 ) == S . end ( ) ) {
      int j = arr [ i ];
      while ( S . find ( j ) != S . end ( ) ) j ++;
      ans = max ( ans, j - arr [ i ] );
    }
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,28,31,64,73},{46,26,-84,-24,50,94,-14,74,-52,-62,2,46,62,54,-30,-70,-76,74,60,10,60,98,-92,98,-96,34,30,58,-60,-52,-66,-40,-78,-26,80,-58,-26,80,92,66,90,4,46,-78,80,62,30,0,38},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{24,72,87,81,90,59,18,29,12,24,78,59,93,80,79,26,17,28,43,85,85,76,83,71,28,99,80,14,9,92,46,59,66,34},{-94,-94,-94,-76,-68,-64,-64,-56,-48,-46,-36,-26,-12,-6,-6,-2,-2,6,6,24,46,48,50,52,58,76,88},{1},{1,8,22,27,28,58,80,89,95},{46,38,-50,98,-22,92,84,-48},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{74,2,85,72,1,49,53,48,46,44,98,75,5,13,98,69,65,68,37,38,77,69,14,17,46,54,55,20,23,59,98,44,22,12,71,18,94,49,57,82,7,64,33,7,29,58,45,98}};
    vector<int> param1 {3,29,38,32,19,0,5,6,19,36};
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