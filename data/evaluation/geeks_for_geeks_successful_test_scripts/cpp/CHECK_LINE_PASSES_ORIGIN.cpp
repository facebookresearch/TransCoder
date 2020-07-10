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
bool f_gold ( int x1, int y1, int x2, int y2 ) {
  return ( x1 * ( y2 - y1 ) == y1 * ( x2 - x1 ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {1,10,0,1,82,78,13,18,42,29};
    vector<int> param1 {28,0,1,1,86,86,46,29,35,17};
    vector<int> param2 {2,20,0,10,19,11,33,95,25,45};
    vector<int> param3 {56,0,17,10,4,6,33,12,36,35};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i],param3[i]) == f_gold(param0[i],param1[i],param2[i],param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}