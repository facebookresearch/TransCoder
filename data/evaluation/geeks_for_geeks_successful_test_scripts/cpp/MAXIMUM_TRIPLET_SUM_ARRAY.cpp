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
  int sum = INT_MIN;
  for ( int i = 0;
  i < n;
  i ++ ) for ( int j = i + 1;
  j < n;
  j ++ ) for ( int k = j + 1;
  k < n;
  k ++ ) if ( sum < arr [ i ] + arr [ j ] + arr [ k ] ) sum = arr [ i ] + arr [ j ] + arr [ k ];
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,10,14,19,24,29,42,43,44,47,47,55,57,59,60,61,76,76,77,81,84,92,92,93,95,97},{-98,72,52,-62,74,-26,-82,-74,90,58,94,-2,76,-28,12,64,-94,86,56,10,40,20,92,-4,-80,26,-40,36,66,-46,4,-42,-76,76,-90,-48,22,30,48,38,78},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{96,96,38,26,2,36,15,51,78,98,94,31,62,21,7,68,37,4},{-8,12,68,78,78},{0,0,0,0,1,0,0,0,1,0,1,1,1,0,1,1,0,1,1,1,1,0,1,1,1,0,0,1,1,0,1,0,0,0,0,0,0,0,0},{1,15,16,17,28,28,28,30,31,37,38,38,45,45,46,46,50,51,53,53,55,55,56,58,58,64,78,82,82,85,87,89,89,90,94,95},{-56,-72,-20,88,20,86,30,36,-44,-66,-26,-88,12,-76,78,62,62,68,-34,0,-22,64,72,56,-64,-16,-4,86,0,98,-70,98,-68,92,-84,-56,28,-74,6,-10,-82,36,-12,-26,66,-60,-68,70,2},{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},{85,31,15,68,92,89,32,56,27,70,82,58,63,83,89,95,78,9,27,34,24,42,66,6,1,71,55,23,75,26,19,58,25}};
    vector<int> param1 {15,28,22,10,4,35,29,36,11,16};
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