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
int f_gold ( string S, string T ) {
  int m = T . length ( ), n = S . length ( );
  if ( m > n ) return 0;
  int mat [ m + 1 ] [ n + 1 ];
  for ( int i = 1;
  i <= m;
  i ++ ) mat [ i ] [ 0 ] = 0;
  for ( int j = 0;
  j <= n;
  j ++ ) mat [ 0 ] [ j ] = 1;
  for ( int i = 1;
  i <= m;
  i ++ ) {
    for ( int j = 1;
    j <= n;
    j ++ ) {
      if ( T [ i - 1 ] != S [ j - 1 ] ) mat [ i ] [ j ] = mat [ i ] [ j - 1 ];
      else mat [ i ] [ j ] = mat [ i ] [ j - 1 ] + mat [ i - 1 ] [ j - 1 ];
    }
  }
  return mat [ m ] [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"banana","49597223","1000010000011","BTlzufK","3474007","0010","dKHhoTD","9123259723","11001000111110","iY WJlIZ"};
    vector<string> param1 {"ban","42","010","lf","370","00000","doT","123","0","iI"};
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