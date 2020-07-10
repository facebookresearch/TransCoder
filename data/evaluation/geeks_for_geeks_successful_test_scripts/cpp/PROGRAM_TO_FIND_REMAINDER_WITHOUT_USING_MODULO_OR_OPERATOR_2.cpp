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
int f_gold ( int num, int divisor ) {
  while ( num >= divisor ) num -= divisor;
  return num;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {70,77,77,88,96,6,79,44,26,82};
    vector<int> param1 {13,3,73,54,39,10,95,32,86,91};
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