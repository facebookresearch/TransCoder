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
  int a [ n ], b [ n ];
  a [ 0 ] = b [ 0 ] = 1;
  for ( int i = 1;
  i < n;
  i ++ ) {
    a [ i ] = a [ i - 1 ] + b [ i - 1 ];
    b [ i ] = a [ i - 1 ];
  }
  return ( 1 << n ) - a [ n - 1 ] - b [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {27,72,13,83,75,33,57,51,10,1};
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