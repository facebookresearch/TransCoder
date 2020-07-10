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
  memset ( table, 0, sizeof ( table ) );
  table [ 0 ] = 1;
  for ( int i = 1;
  i < n;
  i ++ ) for ( int j = i;
  j <= n;
  j ++ ) table [ j ] += table [ j - i ];
  return table [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {66,90,8,77,44,20,34,22,50,10};
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