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
bool f_gold ( int a, int b, int c ) {
  if ( a + b <= c || a + c <= b || b + c <= a ) return false;
  else return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {29,83,48,59,56,68,63,95,2,11};
    vector<int> param1 {19,34,14,12,39,85,36,34,90,16};
    vector<int> param2 {52,49,65,94,22,9,41,37,27,1};
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