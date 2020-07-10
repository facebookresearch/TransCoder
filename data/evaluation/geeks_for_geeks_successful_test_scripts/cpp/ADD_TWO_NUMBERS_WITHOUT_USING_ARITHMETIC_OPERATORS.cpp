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
int f_gold ( int x, int y ) {
  while ( y != 0 ) {
    int carry = x & y;
    x = x ^ y;
    y = carry << 1;
  }
  return x;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {56,17,73,75,27,61,65,22,61,97};
    vector<int> param1 {60,44,96,3,54,1,63,19,9,23};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i]) == f_gold(param0[i],param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}