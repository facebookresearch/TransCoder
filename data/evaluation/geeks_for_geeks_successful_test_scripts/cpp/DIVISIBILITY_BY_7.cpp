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
int f_gold ( int num ) {
  if ( num < 0 ) return f_gold ( - num );
  if ( num == 0 || num == 7 ) return 1;
  if ( num < 10 ) return 0;
  return f_gold ( num / 10 - 2 * ( num - num / 10 * 10 ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {0,-21,7,63,84,73,81,-10,47,23};
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