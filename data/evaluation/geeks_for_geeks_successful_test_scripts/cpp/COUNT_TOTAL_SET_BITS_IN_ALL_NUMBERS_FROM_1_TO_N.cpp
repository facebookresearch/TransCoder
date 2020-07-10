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
  int i = 0;
  int ans = 0;
  while ( ( 1 << i ) <= n ) {
    bool k = 0;
    int change = 1 << i;
    for ( int j = 0;
    j <= n;
    j ++ ) {
      ans += k;
      if ( change == 1 ) {
        k = ! k;
        change = 1 << i;
      }
      else {
        change --;
      }
    }
    i ++;
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {90,56,43,31,77,35,43,66,15,95};
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