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
  int mls [ n ], max = 0;
  for ( int i = 0;
  i < n;
  i ++ ) mls [ i ] = 1;
  for ( int i = 1;
  i < n;
  i ++ ) for ( int j = 0;
  j < i;
  j ++ ) if ( abs ( arr [ i ] - arr [ j ] ) <= 1 && mls [ i ] < mls [ j ] + 1 ) mls [ i ] = mls [ j ] + 1;
  for ( int i = 0;
  i < n;
  i ++ ) if ( max < mls [ i ] ) max = mls [ i ];
  return max;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,5,9,31,31,37,41,55,56,61,79,81,89,93},{-76,96,-68,-16,22,-24,-24,6,98,-82,54,-80,46,0,0,-50},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{97,93,43,51,15,33,13,96,39,89,78,25,45,6,64,54},{-98,-78,-72,-70,-68,-58,-56,-54,-46,-44,-38,-34,-30,-24,-18,-16,-14,-12,2,6,8,8,10,10,16,24,26,28,40,42,44,56,58,62,66,66,78,86},{1,1,0,1,0,0},{7,8,10,11,12,15,16,16,19,21,23,23,23,25,26,35,38,43,46,47,51,52,53,57,60,61,66,67,69,74,75,81,83,84,88,92,94,98,98,99},{14,-40},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{59,70,53}};
    vector<int> param1 {12,15,29,13,19,3,34,1,38,1};
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