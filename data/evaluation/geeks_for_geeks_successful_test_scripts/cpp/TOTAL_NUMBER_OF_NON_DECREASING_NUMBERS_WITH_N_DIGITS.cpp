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
long long int f_gold ( int n ) {
  long long int dp [ 10 ] [ n + 1 ];
  memset ( dp, 0, sizeof dp );
  for ( int i = 0;
  i < 10;
  i ++ ) dp [ i ] [ 1 ] = 1;
  for ( int digit = 0;
  digit <= 9;
  digit ++ ) {
    for ( int len = 2;
    len <= n;
    len ++ ) {
      for ( int x = 0;
      x <= digit;
      x ++ ) dp [ digit ] [ len ] += dp [ x ] [ len - 1 ];
    }
  }
  long long int count = 0;
  for ( int i = 0;
  i < 10;
  i ++ ) count += dp [ i ] [ n ];
  return count;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {21,40,83,93,43,98,35,86,76,88};
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