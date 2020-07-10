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
  int LIS [ n ], len = 0;
  for ( int i = 0;
  i < n;
  i ++ ) LIS [ i ] = 1;
  for ( int i = 1;
  i < n;
  i ++ ) {
    for ( int j = 0;
    j < i;
    j ++ ) {
      if ( arr [ i ] > arr [ j ] && ( i - j ) <= ( arr [ i ] - arr [ j ] ) ) {
        LIS [ i ] = max ( LIS [ i ], LIS [ j ] + 1 );
      }
    }
    len = max ( len, LIS [ i ] );
  }
  return n - len;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,4,12,14,15,18,20,24,25,25,27,33,34,42,46,48,49,50,50,52,55,56,57,58,64,65,66,69,72,75,78,80,84,90,92,95,99},{-56,6,-74,-30,34,40,-76,-10,-12,-86,-76,36,-72,82,38,68,28,84,98,-84,6,16,-46,8,2,-18,-50,4,-96,88,-84,-38,-82,-54},{0,0,0,0,0,0,1,1,1,1,1,1},{68,79,87,44,3,99,80,6,46,67,72,40,11,18,73,48,18,72,10,38,3,39,26,76,47,15,85,69},{-96,-94,-94,-74,-68,-60,-58,-56,-56,-52,-52,-50,-44,-40,-26,-24,-10,-8,-6,-2,2,2,12,14,20,24,26,30,38,40,52,52,62,62,68,70,74,76,80,82,90,92},{1,1,1,0,1},{1,5,11,20,24,28,29,31,54,58,63,65,66,71,77,80,83,92,93,93},{-50,-46,-44,-90,2,-38,88,-26,60},{1,1},{2,1,19,26,65,47,3,65,9,12,84,59,74,59,30,83,73,67,13,5,64,83,81,92,80,14,58,84,92}};
    vector<int> param1 {21,22,6,15,31,3,12,7,1,16};
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