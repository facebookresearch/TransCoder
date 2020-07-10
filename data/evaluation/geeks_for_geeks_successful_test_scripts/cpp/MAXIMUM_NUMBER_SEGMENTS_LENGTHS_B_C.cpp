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
int f_gold ( int n, int a, int b, int c ) {
  int dp [ n + 1 ];
  memset ( dp, - 1, sizeof ( dp ) );
  dp [ 0 ] = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( dp [ i ] != - 1 ) {
      if ( i + a <= n ) dp [ i + a ] = max ( dp [ i ] + 1, dp [ i + a ] );
      if ( i + b <= n ) dp [ i + b ] = max ( dp [ i ] + 1, dp [ i + b ] );
      if ( i + c <= n ) dp [ i + c ] = max ( dp [ i ] + 1, dp [ i + c ] );
    }
  }
  return dp [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {23,62,32,82,94,44,4,53,9,23};
    vector<int> param1 {16,76,46,48,99,21,57,23,55,15};
    vector<int> param2 {23,81,1,72,62,46,2,80,26,73};
    vector<int> param3 {18,97,78,58,38,60,77,5,85,42};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i],param3[i]) == f_gold(param0[i],param1[i],param2[i],param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}