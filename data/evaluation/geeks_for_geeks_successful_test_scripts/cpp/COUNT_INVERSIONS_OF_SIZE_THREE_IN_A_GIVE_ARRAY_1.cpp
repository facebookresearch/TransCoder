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
  int invcount = 0;
  for ( int i = 1;
  i < n - 1;
  i ++ ) {
    int small = 0;
    for ( int j = i + 1;
    j < n;
    j ++ ) if ( arr [ i ] > arr [ j ] ) small ++;
    int great = 0;
    for ( int j = i - 1;
    j >= 0;
    j -- ) if ( arr [ i ] < arr [ j ] ) great ++;
    invcount += great * small;
  }
  return invcount;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,75,89},{84,-66,-52,34,-28,-6,20,22,-78,-26,14,24,-92,-18,32,-94,-64,-38,56,4,-10,58,-66,-58,-10,-8,-62,-60,-26},{0,0,0,1,1,1,1,1},{18,7,43,57,94,37,38,41,59,64,97,29,51,37,64,91,42,83,13,22,68},{-94,-86,-84,-84,-82,-66,-62,-58,-52,-48,-44,-40,-38,-32,-22,-22,-22,-14,-8,-6,-6,0,2,20,20,26,32,32,52,56,66,74,76,80,80,86,88,94},{0,1,1,0,0,0,0,0,1,0,0},{4,8,15,19,24,31,33,36,38,45,45,52,54,65,73,75,83,84,90,92,93},{80,-30,-44,76,-96,2,22,-30,36,-6,88,-60,-90,-52,78,90,-52},{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{74,71,28,45,14,31,17,10,82,27,45,73,93,87,57,58}};
    vector<int> param1 {1,26,7,17,34,9,19,10,7,10};
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