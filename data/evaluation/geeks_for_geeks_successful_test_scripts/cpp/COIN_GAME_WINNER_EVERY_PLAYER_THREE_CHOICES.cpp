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
bool f_gold ( int x, int y, int n ) {
  int dp [ n + 1 ];
  dp [ 0 ] = false;
  dp [ 1 ] = true;
  for ( int i = 2;
  i <= n;
  i ++ ) {
    if ( i - 1 >= 0 and ! dp [ i - 1 ] ) dp [ i ] = true;
    else if ( i - x >= 0 and ! dp [ i - x ] ) dp [ i ] = true;
    else if ( i - y >= 0 and ! dp [ i - y ] ) dp [ i ] = true;
    else dp [ i ] = false;
  }
  return dp [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {6,32,99,22,26,67,69,39,7,91};
    vector<int> param1 {27,88,18,1,78,51,57,8,82,56};
    vector<int> param2 {51,69,48,74,95,27,91,9,41,7};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i]) == f_gold(param0[i],param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}