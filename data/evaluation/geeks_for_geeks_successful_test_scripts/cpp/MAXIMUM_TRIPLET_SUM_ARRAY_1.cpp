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
  sort ( arr, arr + n );
  return arr [ n - 1 ] + arr [ n - 2 ] + arr [ n - 3 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,8,18,18,27,33,33,38,42,43,44,47,52,58,64,65,67,68,71,75,85,89,91,94,94,95,95},{24,24,44,28,-88,18,34,92,-84,94,-12,30,-82,-58},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},{95,75,5,51,67,63,26,47,70,11,21,9,18,31,76,66,81,73,63,55,16,72,15,28,25,25,35,79,4,73,23,87,2,1,92,94,18,70,87,27,34,84,12},{-86,-86,-78,-56,-24,-14,-10,-6,12,12,18,22,22,26,50,50,72,78,94},{0,1,1,1,1,1,0,0,0,1,1,1,0,0,0},{2,13,17,19,20,23,28,28,29,40,45,51,52,58,58,68,70,75,79,81,92,96,97},{94,6,52,6,-78,40,-46,-20,64,76,-36,-62,50,-4,4},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{34,11,15,42,32,4,6,25,52,44,14,57,3,44,7,89,35,3,70,66,58,22,5,17,33,11}};
    vector<int> param1 {26,8,15,37,9,9,15,13,27,13};
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