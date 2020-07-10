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
  return ( float ) ( 2 * ( 1 + sqrt ( 2 ) ) * side * side );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<double> param0 {5859.798616323926,-6381.210375893524,2442.246292006922,-9624.81536339737,8679.436805247444,-2682.3245401089525,7216.9161613024435,-5881.789859815442,2497.776395789202,-9598.912195459263};
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