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
double f_gold ( int a, int b ) {
  double AM, GM, HM;
  AM = ( a + b ) / 2;
  GM = sqrt ( a * b );
  HM = ( GM * GM ) / AM;
  return HM;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {54,42,63,19,41,7,39,11,96,15};
    vector<int> param1 {83,56,12,76,50,26,42,64,81,54};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(abs(1 - (0.0000001 + abs(f_gold(param0[i],param1[i])) )/ (abs(f_filled(param0[i],param1[i])) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}