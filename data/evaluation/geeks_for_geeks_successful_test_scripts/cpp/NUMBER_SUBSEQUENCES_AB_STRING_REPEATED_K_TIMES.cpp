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
int f_gold ( string s, int K ) {
  int n = s . length ( );
  int C, c1 = 0, c2 = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( s [ i ] == 'a' ) c1 ++;
    if ( s [ i ] == 'b' ) {
      c2 ++;
      C += c1;
    }
  }
  return C * K + ( K * ( K - 1 ) / 2 ) * c1 * c2;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"KdJ","031","11000","zPbB","9","1010","c","06064629743411","1111","PFXAhru"};
    vector<int> param1 {96,70,59,60,80,41,87,4,18,83};
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