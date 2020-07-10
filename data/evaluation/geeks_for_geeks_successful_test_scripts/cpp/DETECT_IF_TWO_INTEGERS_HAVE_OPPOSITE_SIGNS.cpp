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
bool f_gold ( int x, int y ) {
  return ( ( x ^ y ) < 0 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {59,-20,-100,54,-16,-23,93,24,-8,29};
    vector<int> param1 {-99,-21,100,-49,16,-68,37,-61,69,10};
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