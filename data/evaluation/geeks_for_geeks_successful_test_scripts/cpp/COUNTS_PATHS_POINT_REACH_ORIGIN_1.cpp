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
int f_gold ( int n, int m ) {
  int dp [ n + 1 ] [ m + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) dp [ i ] [ 0 ] = 1;
  for ( int i = 0;
  i <= m;
  i ++ ) dp [ 0 ] [ i ] = 1;
  for ( int i = 1;
  i <= n;
  i ++ ) for ( int j = 1;
  j <= m;
  j ++ ) dp [ i ] [ j ] = dp [ i - 1 ] [ j ] + dp [ i ] [ j - 1 ];
  return dp [ n ] [ m ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {55,74,76,6,2,36,40,14,42,62};
    vector<int> param1 {30,15,57,90,64,1,71,56,4,12};
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