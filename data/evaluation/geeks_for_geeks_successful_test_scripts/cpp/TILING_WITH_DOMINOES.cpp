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
  int A [ n + 1 ], B [ n + 1 ];
  A [ 0 ] = 1, A [ 1 ] = 0, B [ 0 ] = 0, B [ 1 ] = 1;
  for ( int i = 2;
  i <= n;
  i ++ ) {
    A [ i ] = A [ i - 2 ] + 2 * B [ i - 1 ];
    B [ i ] = A [ i - 1 ] + B [ i - 2 ];
  }
  return A [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {29,13,25,65,27,42,19,50,59,13};
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