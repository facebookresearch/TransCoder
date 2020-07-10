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
int f_gold ( int n, int r, int p ) {
  int C [ r + 1 ];
  memset ( C, 0, sizeof ( C ) );
  C [ 0 ] = 1;
  for ( int i = 1;
  i <= n;
  i ++ ) {
    for ( int j = min ( i, r );
    j > 0;
    j -- ) C [ j ] = ( C [ j ] + C [ j - 1 ] ) % p;
  }
  return C [ r ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {82,45,44,88,90,98,80,60,52,71};
    vector<int> param1 {5,24,68,24,75,55,54,75,73,26};
    vector<int> param2 {94,95,61,43,57,43,88,65,86,45};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i]) == f_gold(param0[i],param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}