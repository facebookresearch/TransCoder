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
  int x = 0, yCount, res = 0;
  for ( yCount = 0;
  yCount * yCount < n;
  yCount ++ );
  while ( yCount != 0 ) {
    res += yCount;
    x ++;
    while ( yCount != 0 && ( x * x + ( yCount - 1 ) * ( yCount - 1 ) >= n ) ) yCount --;
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {72,75,92,30,45,40,81,17,81,99};
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