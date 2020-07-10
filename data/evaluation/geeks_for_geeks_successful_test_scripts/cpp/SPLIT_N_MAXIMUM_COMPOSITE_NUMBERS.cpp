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
  if ( n < 4 ) return - 1;
  int rem = n % 4;
  if ( rem == 0 ) return n / 4;
  if ( rem == 1 ) {
    if ( n < 9 ) return - 1;
    return ( n - 9 ) / 4 + 1;
  }
  if ( rem == 2 ) return ( n - 6 ) / 4 + 1;
  if ( rem == 3 ) {
    if ( n < 15 ) return - 1;
    return ( n - 15 ) / 4 + 2;
  }
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {55,35,24,75,5,7,50,28,67,59};
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