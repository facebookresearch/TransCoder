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
  int sum = 0;
  for ( int i = 1;
  i <= n;
  i ++ ) sum = sum + ( 2 * i - 1 ) * ( 2 * i - 1 );
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {14,61,37,86,47,98,70,24,76,24};
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