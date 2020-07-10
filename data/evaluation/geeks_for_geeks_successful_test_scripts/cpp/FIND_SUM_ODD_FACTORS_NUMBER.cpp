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
  int res = 1;
  while ( n % 2 == 0 ) n = n / 2;
  for ( int i = 3;
  i <= sqrt ( n );
  i ++ ) {
    int count = 0, curr_sum = 1;
    int curr_term = 1;
    while ( n % i == 0 ) {
      count ++;
      n = n / i;
      curr_term *= i;
      curr_sum += curr_term;
    }
    res *= curr_sum;
  }
  if ( n >= 2 ) res *= ( 1 + n );
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {20,6,39,80,88,7,16,27,83,6};
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