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
  int f [ n + 1 ];
  int i;
  f [ 0 ] = 0;
  f [ 1 ] = 1;
  f [ 2 ] = 1;
  for ( i = 3;
  i <= n;
  i ++ ) f [ i ] = f [ f [ i - 1 ] ] + f [ i - f [ i - 1 ] ];
  return f [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {39,93,3,28,23,95,41,31,46,29};
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