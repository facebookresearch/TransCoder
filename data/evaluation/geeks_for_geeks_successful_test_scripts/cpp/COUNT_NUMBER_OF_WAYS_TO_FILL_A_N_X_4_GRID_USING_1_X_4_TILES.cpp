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
  int dp [ n + 1 ];
  dp [ 0 ] = 0;
  for ( int i = 1;
  i <= n;
  i ++ ) {
    if ( i >= 1 && i <= 3 ) dp [ i ] = 1;
    else if ( i == 4 ) dp [ i ] = 2;
    else dp [ i ] = dp [ i - 1 ] + dp [ i - 4 ];
  }
  return dp [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {61,22,65,57,36,25,16,26,92,5};
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