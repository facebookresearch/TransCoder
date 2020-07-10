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
long f_gold ( int n ) {
  long dp [ 2 ] [ n + 1 ];
  dp [ 0 ] [ 1 ] = 1;
  dp [ 1 ] [ 1 ] = 2;
  for ( int i = 2;
  i <= n;
  i ++ ) {
    dp [ 0 ] [ i ] = dp [ 0 ] [ i - 1 ] + dp [ 1 ] [ i - 1 ];
    dp [ 1 ] [ i ] = dp [ 0 ] [ i - 1 ] * 2 + dp [ 1 ] [ i - 1 ];
  }
  return dp [ 0 ] [ n ] + dp [ 1 ] [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {68,91,99,79,61,48,89,20,83,1};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i]) == f_gold(param0[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}