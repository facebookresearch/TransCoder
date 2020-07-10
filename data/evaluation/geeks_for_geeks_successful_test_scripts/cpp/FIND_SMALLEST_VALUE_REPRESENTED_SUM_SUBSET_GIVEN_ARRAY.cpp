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
  int res = 1;
  for ( int i = 0;
  i < n && arr [ i ] <= res;
  i ++ ) res = res + arr [ i ];
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{16,23,24,41,48,58,72,75},{-14,-82,12,-14,-38,12,40,12,-74,42,-36,64},{0,0,1,1,1,1},{17,89,44},{-94,-92,-84,-82,-72,-58,-56,-40,-34,-34,-24,-22,-8,-8,12,14,16,16,22,22,34,46,54,58,68,72,74,78,88,96},{0,0,0,0,0,1,0,0,1,0,1,0},{2,12,13,13,13,16,28,32,34,41,41,47,49,49,50,52,58,61,63,65,67,68,68,74,80,80,84,84,89,93,94,98,99,99},{-54},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{42,50,76,45,6,63,46,73,65,70,87,5,41,63,96,75,38,76,27,7,71,9,65,44,76,37,94,52,55,3,38,68,45,15,35,90,36,46,13,92,32,22,49,35,83}};
    vector<int> param1 {4,8,5,2,25,8,23,0,33,35};
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