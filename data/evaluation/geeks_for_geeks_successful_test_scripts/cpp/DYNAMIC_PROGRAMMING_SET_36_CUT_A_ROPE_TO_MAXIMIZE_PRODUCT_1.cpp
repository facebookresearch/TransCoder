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
  if ( n == 2 || n == 3 ) return ( n - 1 );
  int res = 1;
  while ( n > 4 ) {
    n -= 3;
    res *= 3;
  }
  return ( n * res );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {62,53,8,6,35,35,46,74,69,3};
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