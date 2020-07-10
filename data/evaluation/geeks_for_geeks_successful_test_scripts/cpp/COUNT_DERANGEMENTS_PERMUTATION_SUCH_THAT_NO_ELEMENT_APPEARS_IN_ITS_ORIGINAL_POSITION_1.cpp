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
  int der [ n + 1 ];
  der [ 0 ] = 1;
  der [ 1 ] = 0;
  der [ 2 ] = 1;
  for ( int i = 3;
  i <= n;
  ++ i ) der [ i ] = ( i - 1 ) * ( der [ i - 1 ] + der [ i - 2 ] );
  return der [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {22,91,33,93,90,59,88,41,70,63};
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