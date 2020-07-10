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
unsigned int f_gold ( unsigned int x ) {
  unsigned int even_bits = x & 0xAAAAAAAA;
  unsigned int odd_bits = x & 0x55555555;
  even_bits >>= 1;
  odd_bits <<= 1;
  return ( even_bits | odd_bits );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {99,94,11,3,77,57,54,66,98,36};
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