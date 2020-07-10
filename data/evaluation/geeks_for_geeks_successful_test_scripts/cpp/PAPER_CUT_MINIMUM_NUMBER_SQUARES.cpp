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
int f_gold ( int a, int b ) {
  long long result = 0, rem = 0;
  if ( a < b ) swap ( a, b );
  while ( b > 0 ) {
    result += a / b;
    long long rem = a % b;
    a = b;
    b = rem;
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {87,18,68,80,87,64,64,65,43,97};
    vector<int> param1 {60,35,93,20,69,29,1,95,72,41};
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