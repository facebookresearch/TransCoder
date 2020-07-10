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
  long long int sum = 0;
  for ( int i = 1;
  i <= n;
  i ++ ) for ( int j = i;
  j <= n;
  j ++ ) sum = sum + i * j;
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {21,32,16,38,9,3,5,46,45,87};
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