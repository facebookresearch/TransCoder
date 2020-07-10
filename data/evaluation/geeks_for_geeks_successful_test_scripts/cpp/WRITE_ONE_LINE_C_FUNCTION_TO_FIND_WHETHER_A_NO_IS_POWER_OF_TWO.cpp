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
bool f_gold ( int n ) {
  if ( n == 0 ) return 0;
  while ( n != 1 ) {
    if ( n % 2 != 0 ) return 0;
    n = n / 2;
  }
  return 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {1,2,8,1024,24,7,46,61,73,66};
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