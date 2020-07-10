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
int f_gold ( int A [ ], int N, int M ) {
  int sum = 0;
  int ans = 0;
  for ( int i = 0;
  i < N;
  i ++ ) {
    for ( int j = i + 1;
    j < N;
    j ++ ) {
      for ( int k = j + 1;
      k < N;
      k ++ ) {
        sum = A [ i ] + A [ j ] + A [ k ];
        if ( sum % M == 0 ) ans ++;
      }
    }
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{14,35,56,70,88},{-50,-92,16,-68,-36},{0,0,0,1,1,1},{76,43,22,41,49,99,25,40,3,45,60,16,83,62,26,93,64,73,72,53,6,32,35,67,17},{-90,-86,-86,-66,-50,-48,-44,-42,-42,-38,-24,-22,-20,-18,-8,8,24,28,34,48,60,62,66,68,74,76,80,82,88},{1,1,1,0,0,1,0,1,0,1,1,0,0,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,1,0,1,1,1,0,1,1,0},{4,5,8,9,10,12,13,16,17,18,21,21,25,27,28,30,36,36,54,55,56,57,60,62,67,67,68,71,72,72,73,73,77,77,83,86,86,86,87,89,92,92,96,97,97,98},{-64,52,-32,38,8,-62,-56,20,72,-12,32,44},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{77,68,45,6,27,19,29,95,21,2,39,48,72,67,49,45,1,16,56,78,25,22,27,40,31,34,26,35,12}};
    vector<int> param1 {3,3,4,14,24,24,24,6,12,25};
    vector<int> param2 {4,4,5,21,20,30,23,6,15,25};
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