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
int f_gold ( int n, int a = 0, int b = 1 ) {
  if ( n == 0 ) return a;
  if ( n == 1 ) return b;
  return f_gold ( n - 1, b, a + b );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {4,60,92,73,58,82,53,57,47,83};
    vector<int> param1 {43,48,21,79,38,26,10,37,91,3};
    vector<int> param2 {24,98,69,38,30,12,17,26,99,64};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i]) == f_gold(param0[i],param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}