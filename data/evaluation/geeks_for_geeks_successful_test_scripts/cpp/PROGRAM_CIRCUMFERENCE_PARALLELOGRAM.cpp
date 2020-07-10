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
float f_gold ( float a, float b ) {
  return ( ( 2 * a ) + ( 2 * b ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<float> param0 {801.0366882228715F,-7069.610056819919F,7723.966966568705F,-7935.859205856963F,6094.247432557289F,-7371.490363309265F,8368.473889617526F,-3761.921143166053F,3139.1089185587884F,-5218.286665567171F};
    vector<float> param1 {456.71190645582783F,-4226.483870778477F,5894.65405158763F,-5333.225064296693F,1660.420120702062F,-1095.4543576847332F,4735.838330834498F,-5315.871691690649F,6490.194159517967F,-8265.153014320813F};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(abs(1 - (0.0000001 + abs(f_gold(param0[i],param1[i])) )/ (abs(f_filled(param0[i],param1[i])) + 0.0000001)) < 0.001F)
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}