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
int f_gold ( int a, int b, int k ) {
  int p = pow ( a, b );
  int count = 0;
  while ( p > 0 && count < k ) {
    int rem = p % 10;
    count ++;
    if ( count == k ) return rem;
    p = p / 10;
  }
  return 0;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {11,41,5,1,24,5,66,7,77,60};
    vector<int> param1 {2,3,4,2,1,2,5,10,30,50};
    vector<int> param2 {1,0,3,4,5,3,8,3,10,1};

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
