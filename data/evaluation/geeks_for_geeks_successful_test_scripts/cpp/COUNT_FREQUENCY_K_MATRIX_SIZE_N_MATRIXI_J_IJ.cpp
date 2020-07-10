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
int f_gold ( int n, int k ) {
  if ( n + 1 >= k ) return ( k - 1 );
  else return ( 2 * n + 1 - k );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {90,86,92,72,25,11,94,91,66,34};
    vector<int> param1 {74,36,38,71,57,53,80,75,58,88};
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