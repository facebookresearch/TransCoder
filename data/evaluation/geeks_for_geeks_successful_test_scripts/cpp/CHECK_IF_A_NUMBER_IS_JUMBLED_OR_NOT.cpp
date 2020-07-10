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
bool f_gold ( int num ) {
  if ( num / 10 == 0 ) return true;
  while ( num != 0 ) {
    if ( num / 10 == 0 ) return true;
    int digit1 = num % 10;
    int digit2 = ( num / 10 ) % 10;
    if ( abs ( digit2 - digit1 ) > 1 ) return false;
    num = num / 10;
  }
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {67,77,35,79,45,22,68,17,5,85};
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