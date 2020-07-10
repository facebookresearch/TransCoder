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
int f_gold ( int n ) {
  int * dp = new int [ n + 1 ];
  dp [ 0 ] = 0;
  dp [ 1 ] = 1;
  dp [ 2 ] = 2;
  dp [ 3 ] = 3;
  for ( int i = 4;
  i <= n;
  i ++ ) {
    dp [ i ] = i;
    for ( int x = 1;
    x <= ceil ( sqrt ( i ) );
    x ++ ) {
      int temp = x * x;
      if ( temp > i ) break;
      else dp [ i ] = min ( dp [ i ], 1 + dp [ i - temp ] );
    }
  }
  int res = dp [ n ];
  delete [ ] dp;
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {16,33,47,98,36,81,55,19,4,22};
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