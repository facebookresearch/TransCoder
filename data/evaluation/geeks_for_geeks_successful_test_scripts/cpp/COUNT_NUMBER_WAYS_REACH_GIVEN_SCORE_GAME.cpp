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
  int table [ n + 1 ], i;
  for ( int j = 0;
  j < n + 1;
  j ++ ) table [ j ] = 0;
  table [ 0 ] = 1;
  for ( i = 3;
  i <= n;
  i ++ ) table [ i ] += table [ i - 3 ];
  for ( i = 5;
  i <= n;
  i ++ ) table [ i ] += table [ i - 5 ];
  for ( i = 10;
  i <= n;
  i ++ ) table [ i ] += table [ i - 10 ];
  return table [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {83,29,17,12,93,55,97,75,22,52};
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