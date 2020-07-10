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
int f_gold ( int arr [ ], int n, int x, int y ) {
  int i, j;
  int min_dist = INT_MAX;
  for ( i = 0;
  i < n;
  i ++ ) {
    for ( j = i + 1;
    j < n;
    j ++ ) {
      if ( ( x == arr [ i ] && y == arr [ j ] || y == arr [ i ] && x == arr [ j ] ) && min_dist > abs ( i - j ) ) {
        min_dist = abs ( i - j );
      }
    }
  }
  return min_dist;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,7,7,8,11,14,16,25,34,35,36,36,38,40,41,43,45,47,57,60,64,72,73,74,75,82,83,83,84,84,84,92},{96,70,88,-64,-42,58,92,66,-14,90,-66,12,88,-12,48,-4,90,24,98,14,32,38,98,78,2,26,12,-36,90,80,40,58,88,64,16},{0,0,1},{46,96,82,73,30,36,56,20,5,36,4,7,89,63,54,97,80,56,93,34,90,56,25,27,75,68,14,90},{-96,-88,-82,-66,-62,-52,-52,-46,-46,-40,-40,-28,-24,-12,0,4,10,24,42,46,48,48,50,60,62,64,64,70,92,98},{0,0,1,0,1,1,0,1,1,1,1},{1,2,2,6,10,14,15,18,19,22,23,29,30,37,40,40,41,41,42,42,44,46,46,54,56,72,73,81,83,83,86,88,93},{46,86,-52,18,-32,86,2,38,72,72,-60,70,-58,66,-66,-72,-74,58,52,58,16,64,62,-62,80,-70,-96,-44,-20,-74,-10,14,-32,48,30,76,-16,80,66,-46,-92,26,-86,28,-76,-24,-98,54,50},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{32,65,10,72,17,58,79,28,67,36,18,35}};
    vector<int> param1 {22,25,1,26,24,10,27,30,38,7};
    vector<int> param2 {7,58,1,54,0,0,1,25,0,10};
    vector<int> param3 {40,70,1,82,4,1,42,45,0,7};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],param2[i],param3[i]) == f_gold(&param0[i].front(),param1[i],param2[i],param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}