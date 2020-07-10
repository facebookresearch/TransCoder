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
int f_gold ( int a, int b ) {
  return ( a / 2 ) + ( b / 2 ) + ( ( a % 2 + b % 2 ) / 2 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {9,68,51,31,14,73,51,75,98,83};
    vector<int> param1 {81,79,2,49,10,9,13,67,51,74};
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