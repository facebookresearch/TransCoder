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
int f_gold ( int low, int high ) {
  int f1 = 0, f2 = 1, f3 = 1;
  int result = 0;
  while ( f1 <= high ) {
    if ( f1 >= low ) result ++;
    f1 = f2;
    f2 = f3;
    f3 = f1 + f2;
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {76,96,19,36,60,20,76,63,2,41};
    vector<int> param1 {43,52,79,2,11,15,4,93,25,39};
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