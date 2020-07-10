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
  return ( ( side * side * side ) * ( sqrt ( 2 ) / 3 ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<double> param0 {3355.322051344013,-891.0551553192736,8242.699647177868,-9259.146104439229,7712.806145993083,-4998.858862079315,9771.127582524628,-5415.8106399098115,670.0774772280249,-7068.634369272122};
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