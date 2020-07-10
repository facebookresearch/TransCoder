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
bool f_gold ( unsigned int n, unsigned int k ) {
  bool oneSeen = false;
  while ( n > 0 ) {
    int digit = n % k;
    if ( digit > 1 ) return false;
    if ( digit == 1 ) {
      if ( oneSeen ) return false;
      oneSeen = true;
    }
    n /= k;
  }
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {64,16,27,81,1,69,8,31,43,54};
    vector<int> param1 {4,2,3,72,9,17,20,79,81,89};
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