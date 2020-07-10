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
int f_gold ( int p [ ], int n ) {
  int m [ n ] [ n ];
  int i, j, k, L, q;
  for ( i = 1;
  i < n;
  i ++ ) m [ i ] [ i ] = 0;
  for ( L = 2;
  L < n;
  L ++ ) {
    for ( i = 1;
    i < n - L + 1;
    i ++ ) {
      j = i + L - 1;
      m [ i ] [ j ] = INT_MAX;
      for ( k = i;
      k <= j - 1;
      k ++ ) {
        q = m [ i ] [ k ] + m [ k + 1 ] [ j ] + p [ i - 1 ] * p [ k ] * p [ j ];
        if ( q < m [ i ] [ j ] ) m [ i ] [ j ] = q;
      }
    }
  }
  return m [ 1 ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,4,11,17,26,33,37,51,62,70,71,73,74,74,81,82,83,90,95,98,98},{-50,74,-8,2,-24,28,-86,34,-36,92,-70,-98},{0,0,0,1,1,1,1},{4,73,3,88,79,40,25,58,39,53,32,20,95,60,60,98,23,95,42,26,95,14,43,97,30,83,29,37,74,72,37,31,32,83,57,40,56,95,8,79,67,62},{-92,-88,-88,-88,-86,-84,-80,-78,-76,-74,-72,-68,-68,-66,-62,-42,-34,-30,-28,-24,-20,-14,-12,-10,-8,-8,-8,6,10,26,26,36,38,42,46,48,48,54,54,58,60,66,70,76,78,80,82,98},{1,1,0,1,0,0,1},{8,25,38,39,41,57,71,89},{76,-28,20,62,-44,8,-46,52,26,76,22,38,-36,10,2,-86,42,-62,-68,-56,10},{0,0,0,0,1,1,1},{98,96,76,76,8,4,53,34,54,10,98,46,58,7,36,72,32,59,52,99,40,52,50,43,26,93,76,90,12,82,31,50,55,34,61,78}};
    vector<int> param1 {20,10,3,41,47,4,6,18,5,26};
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