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
  int cps [ N + 1 ] [ N + 1 ];
  memset ( cps, 0, sizeof ( cps ) );
  for ( int i = 0;
  i < N;
  i ++ ) cps [ i ] [ i ] = 1;
  for ( int L = 2;
  L <= N;
  L ++ ) {
    for ( int i = 0;
    i < N;
    i ++ ) {
      int k = L + i - 1;
      if ( str [ i ] == str [ k ] ) cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] + 1;
      else cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] - cps [ i + 1 ] [ k - 1 ];
    }
  }
  return cps [ 0 ] [ N - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"R","2956350","11100111110101","TZTDLIIfAD","98","1100100001","oKwGeatf","19","00010110100","Cyq"};
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