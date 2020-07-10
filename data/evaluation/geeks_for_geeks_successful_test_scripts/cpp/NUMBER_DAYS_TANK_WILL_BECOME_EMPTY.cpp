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
int f_gold ( int C, int l ) {
  if ( l >= C ) return C;
  double eq_root = ( std :: sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2;
  return std :: ceil ( eq_root ) + l;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {91,99,11,23,12,1,18,14,13,36};
    vector<int> param1 {29,55,56,56,97,64,5,37,55,99};
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