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
int f_gold ( int x ) {
  if ( x == 0 || x == 1 ) return x;
  int start = 1, end = x, ans;
  while ( start <= end ) {
    int mid = ( start + end ) / 2;
    if ( mid * mid == x ) return mid;
    if ( mid * mid < x ) {
      start = mid + 1;
      ans = mid;
    }
    else end = mid - 1;
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {40,10,46,54,1,67,64,10,75,11};
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