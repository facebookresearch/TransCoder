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
  int nCr = 1, res = 1;
  for ( int r = 1;
  r <= n;
  r ++ ) {
    nCr = ( nCr * ( n + 1 - r ) ) / r;
    res += nCr * nCr;
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {52,75,25,80,18,17,33,8,99,8};
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