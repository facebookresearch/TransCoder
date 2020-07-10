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
int f_gold ( int n, int k ) {
  int eggFloor [ n + 1 ] [ k + 1 ];
  int res;
  int i, j, x;
  for ( i = 1;
  i <= n;
  i ++ ) {
    eggFloor [ i ] [ 1 ] = 1;
    eggFloor [ i ] [ 0 ] = 0;
  }
  for ( j = 1;
  j <= k;
  j ++ ) eggFloor [ 1 ] [ j ] = j;
  for ( i = 2;
  i <= n;
  i ++ ) {
    for ( j = 2;
    j <= k;
    j ++ ) {
      eggFloor [ i ] [ j ] = INT_MAX;
      for ( x = 1;
      x <= j;
      x ++ ) {
        res = 1 + max ( eggFloor [ i - 1 ] [ x - 1 ], eggFloor [ i ] [ j - x ] );
        if ( res < eggFloor [ i ] [ j ] ) eggFloor [ i ] [ j ] = res;
      }
    }
  }
  return eggFloor [ n ] [ k ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {42,16,24,95,49,39,63,17,45,40};
    vector<int> param1 {34,18,3,58,98,92,68,80,41,91};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i]) == f_gold(param0[i],param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}