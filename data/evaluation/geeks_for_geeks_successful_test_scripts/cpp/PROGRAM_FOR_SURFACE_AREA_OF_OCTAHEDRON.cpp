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
double f_gold ( double side ) {
  return ( 2 * ( sqrt ( 3 ) ) * ( side * side ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<double> param0 {1449.255716877097,-8772.104874265995,2948.419328234334,-1184.220109553511,7422.825800698956,-5808.280006171851,829.8963781665169,-7368.438572511732,5572.033890611617,-3998.9441642787706};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(abs(1 - (0.0000001 + abs(f_gold(param0[i])) )/ (abs(f_filled(param0[i])) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}