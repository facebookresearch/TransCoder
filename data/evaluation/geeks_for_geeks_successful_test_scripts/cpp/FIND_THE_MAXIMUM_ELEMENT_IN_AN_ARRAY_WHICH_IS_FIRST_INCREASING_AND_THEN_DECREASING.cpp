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
int f_gold ( int arr [ ], int low, int high ) {
  int max = arr [ low ];
  int i;
  for ( i = low + 1;
  i <= high;
  i ++ ) {
    if ( arr [ i ] > max ) max = arr [ i ];
    else break;
  }
  return max;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{11,15,16,19,24,25,26,28,34,34,43,61,63,66,67,72,77,79,81,83,87,94,99},{8,92},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{84,39,92,89,38,75,18,39,83,67,41,46,49,27},{-98,-94,-88,-84,-74,-72,-58,-52,-48,-48,-46,-42,-42,-32,-30,-30,-18,-10,-8,-8,-6,-4,4,6,28,30,34,38,44,48,56,58,60,64,86},{0,1,0},{5,9,10,16,18,19,23,24,26,33,37,44,46,54,55,57,58,59,63,64,70,75,77,81,83,84,85,85,88,89,96,97,99},{86,20,-50,74,-78,86},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{16,57,65,61,17,63,7,35,69,91,30,44,99,80,6,80,56,8,84,95,20,73,30,62,77,26,66,61,61,45}};
    vector<int> param1 {15,1,23,8,31,2,20,3,19,28};
    vector<int> param2 {21,1,15,13,34,2,31,5,18,22};
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