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
  int ans = 0, temp = 0, num;
  for ( int i = 1;
  i <= n && temp < n;
  i ++ ) {
    temp = i - 1;
    num = 1;
    while ( temp < n ) {
      if ( temp + i <= n ) ans += ( i * num );
      else ans += ( ( n - temp ) * num );
      temp += i;
      num ++;
    }
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {35,93,7,81,80,47,7,41,59,34};
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