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
  unordered_map < int, int > mp;
  int max_dist = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( mp . find ( arr [ i ] ) == mp . end ( ) ) mp [ arr [ i ] ] = i;
    else max_dist = max ( max_dist, i - mp [ arr [ i ] ] );
  }
  return max_dist;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,20,25,28,29,31,34,35,38,39,41,43,46,55,56,60,65,66,74,77,79,80,81,83,84,88,88,88,90,91,99},{26,14,56,84,-56,-84,-98,12,-78,18,-42,58,46,-66,-46,66,98,34,-16,8,-20,66,74,26,42,-84,38,86,14,86,26,-42,-30,6,-54,-76,-66,18,58,66,74,-62,8,-42,62,-14,-90,98,-24},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{69,87},{-98,-88,-86,-62,-52,-26,-24,-20,-12,6,8,26,36,40,42,54,68,72,84,92,94,98,98},{1,1,1,1,0,1,0,1,1,0,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,0},{11,16,17,19,20,21,21,22,27,37,45,49,64,77,81,85,96},{-20,0,18,-96},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{54,5,98,71,9,34,60,28,58,66,28,45,4}};
    vector<int> param1 {27,34,11,1,12,29,9,2,22,10};
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