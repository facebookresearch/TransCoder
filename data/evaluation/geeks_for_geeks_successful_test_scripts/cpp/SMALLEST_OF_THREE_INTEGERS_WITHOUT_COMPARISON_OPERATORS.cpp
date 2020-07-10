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
int f_gold ( int x, int y, int z ) {
  int c = 0;
  while ( x && y && z ) {
    x --;
    y --;
    z --;
    c ++;
  }
  return c;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {23,87,35,25,93,52,95,91,75,96};
    vector<int> param1 {98,55,90,9,22,42,88,64,1,44};
    vector<int> param2 {25,94,29,41,39,96,26,51,6,76};
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