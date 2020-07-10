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
long long int f_gold ( int n ) {
  int N = 10;
  long long count = 1;
  for ( int i = 1;
  i <= n;
  i ++ ) {
    count *= ( N + i - 1 );
    count /= i;
  }
  return count;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {40,11,94,73,6,73,58,40,64,66};
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