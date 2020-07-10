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
bool f_gold ( int n ) {
  if ( n == 0 || n == 9 ) return true;
  if ( n < 9 ) return false;
  return f_gold ( ( int ) ( n >> 3 ) - ( int ) ( n & 7 ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {96,85,54,14,47,11,49,99,28,82};
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