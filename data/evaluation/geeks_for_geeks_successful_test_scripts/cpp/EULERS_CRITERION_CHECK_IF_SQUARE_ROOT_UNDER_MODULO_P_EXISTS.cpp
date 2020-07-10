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
bool f_gold ( int n, int p ) {
  n = n % p;
  for ( int x = 2;
  x < p;
  x ++ ) if ( ( x * x ) % p == n ) return true;
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {71,85,4,20,71,72,36,95,83,72};
    vector<int> param1 {78,75,35,99,29,88,54,52,33,13};
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