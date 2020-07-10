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
int f_gold ( int b, int m ) {
  return ( b / m - 1 ) * ( b / m ) / 2;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {40,38,47,52,21,50,8,56,93,21};
    vector<int> param1 {74,35,71,29,9,33,82,80,5,90};
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