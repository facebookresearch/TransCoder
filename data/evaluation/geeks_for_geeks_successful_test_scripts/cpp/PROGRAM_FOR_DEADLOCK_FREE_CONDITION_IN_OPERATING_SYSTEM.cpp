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
int f_gold ( int process, int need ) {
  int minResources = 0;
  minResources = process * ( need - 1 ) + 1;
  return minResources;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {38,82,2,38,31,80,11,2,26,37};
    vector<int> param1 {37,3,26,72,85,73,9,31,59,67};
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