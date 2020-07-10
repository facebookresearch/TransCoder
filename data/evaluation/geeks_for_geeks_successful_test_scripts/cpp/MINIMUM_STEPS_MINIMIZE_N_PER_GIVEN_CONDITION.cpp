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
  int table [ n + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) table [ i ] = n - i;
  for ( int i = n;
  i >= 1;
  i -- ) {
    if ( ! ( i % 2 ) ) table [ i / 2 ] = min ( table [ i ] + 1, table [ i / 2 ] );
    if ( ! ( i % 3 ) ) table [ i / 3 ] = min ( table [ i ] + 1, table [ i / 3 ] );
  }
  return table [ 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {59,7,90,78,49,15,45,56,7,70};
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