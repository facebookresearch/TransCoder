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
int f_gold ( int n, int m, int k ) {
  if ( m <= n - k + 1 ) return m + k - 1;
  m = m - ( n - k + 1 );
  return ( m % n == 0 ) ? n : ( m % n );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {19,23,92,9,20,68,66,77,90,26};
    vector<int> param1 {14,51,10,50,67,25,30,22,1,34};
    vector<int> param2 {34,5,24,34,20,40,24,32,71,54};
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