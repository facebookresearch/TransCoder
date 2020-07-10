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
  int dp [ m + 1 ] [ n + 1 ];
  for ( int i = 0;
  i <= m;
  i ++ ) dp [ i ] [ 0 ] = 1;
  for ( int i = 0;
  i <= m;
  i ++ ) dp [ 0 ] [ i ] = 1;
  for ( int i = 1;
  i <= m;
  i ++ ) for ( int j = 1;
  j <= n;
  j ++ ) dp [ i ] [ j ] = dp [ i - 1 ] [ j ] + dp [ i - 1 ] [ j - 1 ] + dp [ i ] [ j - 1 ];
  return dp [ m ] [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {22,80,33,31,34,3,11,70,67,91};
    vector<int> param1 {52,66,49,64,63,1,58,69,61,72};
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