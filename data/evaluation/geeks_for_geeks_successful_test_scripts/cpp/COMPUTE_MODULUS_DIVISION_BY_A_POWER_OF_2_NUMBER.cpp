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
unsigned int f_gold ( unsigned int n, unsigned int d ) {
  return ( n & ( d - 1 ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {54,39,35,9,62,16,93,32,39,63};
    vector<int> param1 {59,84,81,60,68,16,96,38,62,16};
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