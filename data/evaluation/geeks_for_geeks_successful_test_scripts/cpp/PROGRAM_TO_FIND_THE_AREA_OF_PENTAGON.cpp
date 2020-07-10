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
float f_gold ( float a ) {
  float area;
  area = ( sqrt ( 5 * ( 5 + 2 * ( sqrt ( 5 ) ) ) ) * a * a ) / 4;
  return area;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<float> param0 {2009.019461888707F,-1480.5131394215787F,357.7870347569567F,-8040.293697508038F,3821.882657293133F,-6840.635072240347F,1623.036598830132F,-9714.00706195298F,3916.454769669618F,-669.068424712943F};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(abs(1 - (0.0000001 + abs(f_gold(param0[i])) )/ (abs(f_filled(param0[i])) + 0.0000001)) < 0.001F)
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}