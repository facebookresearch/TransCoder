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
  int brr [ 2 * n + 1 ];
  for ( int i = 0;
  i < n;
  i ++ ) brr [ i ] = arr [ i ];
  for ( int i = 0;
  i < n;
  i ++ ) brr [ n + i ] = arr [ i ];
  int maxHam = 0;
  for ( int i = 1;
  i < n;
  i ++ ) {
    int currHam = 0;
    for ( int j = i, k = 0;
    j < ( i + n );
    j ++, k ++ ) if ( brr [ j ] != arr [ k ] ) currHam ++;
    if ( currHam == n ) return n;
    maxHam = max ( maxHam, currHam );
  }
  return maxHam;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,4,18,22,28,34,35,39,44,45,67,73,75,79,81,83,89,93,96},{52,-28},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{24},{-68,14,36,62},{1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,1,0,1,1,0,1,0,0},{7,10,19,22,24,28,29,39,46,55,62,66,68,73,74,76,83,84,85,99},{-38,56,86,12,24,-90,-20,-46,38,92,-44,-74,54,50,46,50,-94,64,32,-84,70},{0,0,0,0,0,0,1,1,1,1,1,1,1},{61,89,8}};
    vector<int> param1 {12,1,21,0,2,12,15,14,8,2};
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