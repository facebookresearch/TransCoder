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
int f_gold ( int num ) {
  int sum = 0;
  for ( int i = 2;
  i * i <= num;
  i ++ ) {
    while ( num % i == 0 ) {
      sum += i;
      num /= i;
    }
  }
  sum += num;
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {83,88,60,6,26,98,38,90,76,66};
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