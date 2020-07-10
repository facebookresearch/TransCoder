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
float f_gold ( float l, float b, float h ) {
  float volume = ( l * b * h ) / 2;
  return volume;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<float> param0 {8448.900678262902F,-1849.728957491451F,412.667844022232F,-5954.835911765373F,8437.913444665008F,-7183.181663518317F,2340.7905920227954F,-7281.157547371143F,471.3930826982504F,-7550.426360065503F};
    vector<float> param1 {8135.461799983198F,-4240.89241631363F,9798.083992381831F,-661.8872499003203F,8182.675681595904F,-6846.746446198541F,5479.00956987109F,-615.8705455524116F,1357.3753126091392F,-2693.2262997056355F};
    vector<float> param2 {6577.239053611328F,-9953.518310747193F,1449.9204200270522F,-8049.6051526695055F,9863.296545513396F,-971.2199894221352F,7073.449591910562F,-3343.0245192607968F,1907.815700915636F,-9110.64755244532F};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(abs(1 - (0.0000001 + abs(f_gold(param0[i],param1[i],param2[i])) )/ (abs(f_filled(param0[i],param1[i],param2[i])) + 0.0000001)) < 0.001F)
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}