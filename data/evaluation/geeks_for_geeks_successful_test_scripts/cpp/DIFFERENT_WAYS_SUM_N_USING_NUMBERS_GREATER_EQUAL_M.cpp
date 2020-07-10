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
  int dp [ n + 2 ] [ n + 2 ];
  memset ( dp, 0, sizeof ( dp ) );
  dp [ 0 ] [ n + 1 ] = 1;
  for ( int k = n;
  k >= m;
  k -- ) {
    for ( int i = 0;
    i <= n;
    i ++ ) {
      dp [ i ] [ k ] = dp [ i ] [ k + 1 ];
      if ( i - k >= 0 ) dp [ i ] [ k ] = ( dp [ i ] [ k ] + dp [ i - k ] [ k ] );
    }
  }
  return dp [ n ] [ m ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {20,77,59,5,41,39,23,7,82,11};
    vector<int> param1 {18,74,85,76,62,40,58,1,45,66};
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