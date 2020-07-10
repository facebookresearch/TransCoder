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
  int a [ n + 1 ] [ 10 ];
  for ( int i = 0;
  i <= 9;
  i ++ ) a [ 0 ] [ i ] = 1;
  for ( int i = 1;
  i <= n;
  i ++ ) a [ i ] [ 9 ] = 1;
  for ( int i = 1;
  i <= n;
  i ++ ) for ( int j = 8;
  j >= 0;
  j -- ) a [ i ] [ j ] = a [ i - 1 ] [ j ] + a [ i ] [ j + 1 ];
  return a [ n ] [ 0 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {2,19,79,62,93,39,7,31,3,21};
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