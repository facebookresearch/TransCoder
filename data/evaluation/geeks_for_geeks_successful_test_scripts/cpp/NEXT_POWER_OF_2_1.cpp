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
unsigned int f_gold ( unsigned int n ) {
  unsigned int p = 1;
  if ( n && ! ( n & ( n - 1 ) ) ) return n;
  while ( p < n ) p <<= 1;
  return p;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {8,79,31,63,18,2,6,85,29,8};
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