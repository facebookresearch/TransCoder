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
int f_gold ( int low, int high ) {
  int fact = 1, x = 1;
  while ( fact < low ) {
    fact = fact * x;
    x ++;
  }
  int res = 0;
  while ( fact <= high ) {
    res ++;
    fact = fact * x;
    x ++;
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {57,57,31,62,49,82,31,5,76,55};
    vector<int> param1 {79,21,37,87,98,76,45,52,43,6};
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