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
  int a = 1, b = 2, c = 0;
  if ( n <= 2 ) {
    return n;
  }
  for ( int i = 3;
  i <= n;
  i ++ ) {
    c = b + ( i - 1 ) * a;
    a = b;
    b = c;
  }
  return c;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {24,1,91,90,89,29,3,60,75,14};
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