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
int f_gold ( string str ) {
  int N = str . length ( );
  int dp [ N + 1 ] [ N + 1 ];
  for ( int i = 0;
  i <= N;
  i ++ ) for ( int j = 0;
  j <= N;
  j ++ ) dp [ i ] [ j ] = 0;
  for ( int len = 1;
  len <= N;
  len ++ ) {
    for ( int i = 0, j = len - 1;
    j < N;
    i ++, j ++ ) {
      if ( len == 1 ) dp [ i ] [ j ] = 1;
      else {
        dp [ i ] [ j ] = 1 + dp [ i + 1 ] [ j ];
        if ( str [ i ] == str [ i + 1 ] ) dp [ i ] [ j ] = min ( 1 + dp [ i + 2 ] [ j ], dp [ i ] [ j ] );
        for ( int K = i + 2;
        K <= j;
        K ++ ) if ( str [ i ] == str [ K ] ) dp [ i ] [ j ] = min ( dp [ i + 1 ] [ K - 1 ] + dp [ K + 1 ] [ j ], dp [ i ] [ j ] );
      }
    }
  }
  return dp [ 0 ] [ N - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"YCtLQtHLwr","47713514383248","0100101001111","XfdIYVn","45499225407","000100111001","ZoUQhQwoap","18579027952","00000001111","JD"};
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