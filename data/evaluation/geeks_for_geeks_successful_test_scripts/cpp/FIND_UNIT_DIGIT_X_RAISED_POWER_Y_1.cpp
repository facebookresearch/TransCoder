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
  x = x % 10;
  if ( y != 0 ) y = y % 4 + 4;
  return ( ( ( int ) ( pow ( x, y ) ) ) % 10 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {37,70,26,9,82,95,43,7,19,49};
    vector<int> param1 {17,52,23,96,71,36,40,27,56,28};
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