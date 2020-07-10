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
unsigned long long f_gold ( int n ) {
  return ( n * ( n + 1 ) / 2 ) * ( 1 << ( n - 1 ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {76,26,45,35,34,22,3,25,22,78};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i]) == f_gold(param0[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}