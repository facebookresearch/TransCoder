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
int f_gold ( double p ) {
  return ceil ( sqrt ( 2 * 365 * log ( 1 / ( 1 - p ) ) ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<double> param0 {0.9303713975220877,0.48126843587453595,0.48776789524757905,0.35184405927337793,0.8000415444743662,0.3528645948885943,0.33594265260473667,0.3603861267753616,7218.247044923335,-4701.904717953173};
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