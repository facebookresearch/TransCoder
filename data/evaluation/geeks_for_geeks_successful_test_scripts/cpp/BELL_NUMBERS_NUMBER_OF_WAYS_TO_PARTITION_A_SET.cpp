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
  int bell [ n + 1 ] [ n + 1 ];
  bell [ 0 ] [ 0 ] = 1;
  for ( int i = 1;
  i <= n;
  i ++ ) {
    bell [ i ] [ 0 ] = bell [ i - 1 ] [ i - 1 ];
    for ( int j = 1;
    j <= i;
    j ++ ) bell [ i ] [ j ] = bell [ i - 1 ] [ j - 1 ] + bell [ i ] [ j - 1 ];
  }
  return bell [ n ] [ 0 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {84,78,9,73,4,53,85,38,39,6};
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