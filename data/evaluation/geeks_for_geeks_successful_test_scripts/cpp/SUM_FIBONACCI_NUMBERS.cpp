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
  if ( n <= 0 ) return 0;
  int fibo [ n + 1 ];
  fibo [ 0 ] = 0, fibo [ 1 ] = 1;
  int sum = fibo [ 0 ] + fibo [ 1 ];
  for ( int i = 2;
  i <= n;
  i ++ ) {
    fibo [ i ] = fibo [ i - 1 ] + fibo [ i - 2 ];
    sum += fibo [ i ];
  }
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {9,50,7,21,21,91,11,25,62,4};
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