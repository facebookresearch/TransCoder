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
string f_gold ( int n, int k ) {
  string res = "";
  for ( int i = 0;
  i < k;
  i ++ ) res = res + ( char ) ( 'a' + i );
  int count = 0;
  for ( int i = 0;
  i < n - k;
  i ++ ) {
    res = res + ( char ) ( 'a' + count );
    count ++;
    if ( count == k ) count = 0;
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {60,56,16,42,55,64,68,88,64,42};
    vector<int> param1 {71,17,16,60,56,59,24,2,94,79};
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