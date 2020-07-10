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
int f_gold ( int m, int n ) {
  int count [ m ] [ n ];
  for ( int i = 0;
  i < m;
  i ++ ) count [ i ] [ 0 ] = 1;
  for ( int j = 0;
  j < n;
  j ++ ) count [ 0 ] [ j ] = 1;
  for ( int i = 1;
  i < m;
  i ++ ) {
    for ( int j = 1;
    j < n;
    j ++ ) count [ i ] [ j ] = count [ i - 1 ] [ j ] + count [ i ] [ j - 1 ];
  }
  return count [ m - 1 ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {79,95,15,71,16,91,10,98,30,58};
    vector<int> param1 {16,62,9,18,85,52,91,81,42,69};
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