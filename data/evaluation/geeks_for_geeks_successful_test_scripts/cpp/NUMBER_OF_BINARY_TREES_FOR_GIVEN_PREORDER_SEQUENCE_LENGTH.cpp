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
  int BT [ n + 1 ];
  memset ( BT, 0, sizeof ( BT ) );
  BT [ 0 ] = BT [ 1 ] = 1;
  for ( int i = 2;
  i <= n;
  ++ i ) for ( int j = 0;
  j < i;
  j ++ ) BT [ i ] += BT [ j ] * BT [ i - j - 1 ];
  return BT [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {87,69,15,11,11,15,47,65,50,58};
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