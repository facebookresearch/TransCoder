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
int f_gold ( int n, int p ) {
  int ans = 0;
  int temp = p;
  while ( temp <= n ) {
    ans += n / temp;
    temp = temp * p;
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {49,80,10,81,11,45,86,27,80,97};
    vector<int> param1 {30,25,9,57,4,34,90,78,60,31};
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