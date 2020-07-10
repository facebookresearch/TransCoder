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
int f_gold ( int a, int b, int d ) {
  int temp = a;
  a = min ( a, b );
  b = max ( temp, b );
  if ( d >= b ) return ( d + b - 1 ) / b;
  if ( d == 0 ) return 0;
  if ( d == a ) return 1;
  return 2;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {35,85,22,8,12,58,65,10,23,5};
    vector<int> param1 {8,55,23,43,64,25,4,95,13,50};
    vector<int> param2 {77,33,64,29,11,26,28,55,54,71};
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