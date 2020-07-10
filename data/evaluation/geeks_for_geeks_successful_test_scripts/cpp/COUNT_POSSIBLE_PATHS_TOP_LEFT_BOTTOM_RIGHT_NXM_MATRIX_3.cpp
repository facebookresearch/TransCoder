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
int f_gold ( int m, int n ) {
  int path = 1;
  for ( int i = n;
  i < ( m + n - 1 );
  i ++ ) {
    path *= i;
    path /= ( i - n + 1 );
  }
  return path;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {10,52,5,84,27,77,52,3,5,14};
    vector<int> param1 {3,8,23,56,30,90,50,25,75,18};
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