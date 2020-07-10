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
int f_gold ( int n ) {
  int nthElement = 19 + ( n - 1 ) * 9;
  int outliersCount = ( int ) log10 ( nthElement ) - 1;
  nthElement += 9 * outliersCount;
  return nthElement;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {68,70,69,93,99,44,91,8,83,51};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i]) == f_gold(param0[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}