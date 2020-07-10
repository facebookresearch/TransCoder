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
int f_gold ( int N, int K ) {
  int ans = 0;
  for ( int i = 1;
  i <= N;
  i ++ ) ans += ( i % K );
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {11,36,71,74,66,38,2,73,79,30};
    vector<int> param1 {5,69,28,1,84,14,11,87,11,55};
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