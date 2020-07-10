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
int f_gold ( int x, unsigned int y, int p ) {
  int res = 1;
  x = x % p;
  while ( y > 0 ) {
    if ( y & 1 ) res = ( res * x ) % p;
    y = y >> 1;
    x = ( x * x ) % p;
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {45,67,26,33,35,68,14,5,23,37};
    vector<int> param1 {5,25,91,61,8,41,76,89,42,63};
    vector<int> param2 {68,49,44,9,13,5,20,13,45,56};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i]) == f_gold(param0[i],param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}