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
int f_gold ( char s [ ], int n ) {
  int dp [ n ] [ n ];
  memset ( dp, 0, sizeof ( dp ) );
  for ( int i = 0;
  i < n - 1;
  i ++ ) if ( s [ i ] == '(' && s [ i + 1 ] == ')' ) dp [ i ] [ i + 1 ] = 2;
  for ( int l = 2;
  l < n;
  l ++ ) {
    for ( int i = 0, j = l;
    j < n;
    i ++, j ++ ) {
      if ( s [ i ] == '(' && s [ j ] == ')' ) dp [ i ] [ j ] = 2 + dp [ i + 1 ] [ j - 1 ];
      for ( int k = i;
      k < j;
      k ++ ) dp [ i ] [ j ] = max ( dp [ i ] [ j ], dp [ i ] [ k ] + dp [ k + 1 ] [ j ] );
    }
  }
  return dp [ 0 ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"()()(()))()","(()(()))","(())()()","(())()))()","((()))(((","kjbcwkjebc","KZPNX","82050","010)()fkhj","ndPKtu"};
    vector<int> param1 {11,8,8,10,9,10,5,5,10,6};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i]) == f_gold(&param0[i].front(),param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}
