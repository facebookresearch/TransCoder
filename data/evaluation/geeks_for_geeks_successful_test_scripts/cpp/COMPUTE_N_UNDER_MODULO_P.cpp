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
int f_gold ( int n, int p ) {
  if ( n >= p ) return 0;
  int result = 1;
  for ( int i = 1;
  i <= n;
  i ++ ) result = ( result * i ) % p;
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {85,14,83,30,96,55,82,12,38,46};
    vector<int> param1 {18,13,21,35,51,58,71,74,3,73};
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