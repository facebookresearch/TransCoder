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
int f_gold ( int x, int y, int z ) {
  if ( ! ( y / x ) ) return ( ! ( y / z ) ) ? y : z;
  return ( ! ( x / z ) ) ? x : z;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {48,11,50,21,94,22,3,67,59,50};
    vector<int> param1 {63,55,89,71,39,44,41,62,2,11};
    vector<int> param2 {56,84,96,74,42,86,68,94,83,1};
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