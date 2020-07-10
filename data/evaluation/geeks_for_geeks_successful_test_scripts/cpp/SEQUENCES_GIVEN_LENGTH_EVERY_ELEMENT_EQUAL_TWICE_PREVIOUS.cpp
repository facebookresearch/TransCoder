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
int f_gold ( int m, int n ) {
  if ( m < n ) return 0;
  if ( n == 0 ) return 1;
  return f_gold ( m - 1, n ) + f_gold ( m / 2, n - 1 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {38,39,24,90,44,49,58,97,99,19};
    vector<int> param1 {34,29,99,23,2,70,84,34,72,67};
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