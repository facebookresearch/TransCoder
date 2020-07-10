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
  if ( k <= 0 ) return n;
  return ( n & ~ ( 1 << ( k - 1 ) ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {49,59,76,27,61,67,63,85,90,24};
    vector<int> param1 {15,69,20,76,60,27,71,25,64,55};
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