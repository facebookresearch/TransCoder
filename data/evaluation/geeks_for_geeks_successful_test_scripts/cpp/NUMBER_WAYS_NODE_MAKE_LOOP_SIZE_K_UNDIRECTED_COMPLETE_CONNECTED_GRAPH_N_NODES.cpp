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
int f_gold ( int n, int k ) {
  int p = 1;
  if ( k % 2 ) p = - 1;
  return ( pow ( n - 1, k ) + p * ( n - 1 ) ) / n;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {27,70,77,83,16,90,39,48,56,10};
    vector<int> param1 {59,87,40,26,2,66,72,26,77,47};
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