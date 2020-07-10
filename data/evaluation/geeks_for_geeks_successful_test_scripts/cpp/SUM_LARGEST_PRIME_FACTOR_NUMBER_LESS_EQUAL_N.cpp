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
  int prime [ n + 1 ], sum = 0;
  memset ( prime, 0, sizeof ( prime ) );
  int max = n / 2;
  for ( int p = 2;
  p <= max;
  p ++ ) {
    if ( prime [ p ] == 0 ) {
      for ( int i = p * 2;
      i <= n;
      i += p ) prime [ i ] = p;
    }
  }
  for ( int p = 2;
  p <= n;
  p ++ ) {
    if ( prime [ p ] ) sum += prime [ p ];
    else sum += p;
  }
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {6,35,87,91,63,11,66,17,92,81};
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