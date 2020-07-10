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
int f_gold ( int n ) {
  int l = sqrt ( n );
  int sq = l * l;
  if ( sq == n ) return l * 4;
  else {
    long long int row = n / l;
    long long int perimeter = 2 * ( l + row );
    if ( n % l != 0 ) perimeter += 2;
    return perimeter;
  }
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {45,80,54,48,83,68,32,20,68,66};
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