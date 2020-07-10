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
  int res [ n + 1 ];
  res [ 0 ] = 0;
  res [ 1 ] = 1;
  for ( int i = 2;
  i <= n;
  i ++ ) res [ i ] = max ( i, ( res [ i / 2 ] + res [ i / 3 ] + res [ i / 4 ] + res [ i / 5 ] ) );
  return res [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {3,19,39,89,96,68,48,5,3,4};
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