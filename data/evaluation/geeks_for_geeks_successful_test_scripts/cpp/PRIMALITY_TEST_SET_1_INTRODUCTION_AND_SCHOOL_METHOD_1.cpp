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
bool f_gold ( int n ) {
  if ( n <= 1 ) return false;
  if ( n <= 3 ) return true;
  if ( n % 2 == 0 || n % 3 == 0 ) return false;
  for ( int i = 5;
  i * i <= n;
  i = i + 6 ) if ( n % i == 0 || n % ( i + 2 ) == 0 ) return false;
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {15,90,38,65,91,16,48,74,14,47};
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