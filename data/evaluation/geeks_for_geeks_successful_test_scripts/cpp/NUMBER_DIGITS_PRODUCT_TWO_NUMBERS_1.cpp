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
int f_gold ( int a, int b ) {
  if ( a == 0 || b == 0 ) return 1;
  return floor ( log10 ( abs ( a ) ) + log10 ( abs ( b ) ) ) + 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {97,52,95,35,40,18,92,73,10,82};
    vector<int> param1 {91,49,34,40,85,97,15,98,62,22};
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