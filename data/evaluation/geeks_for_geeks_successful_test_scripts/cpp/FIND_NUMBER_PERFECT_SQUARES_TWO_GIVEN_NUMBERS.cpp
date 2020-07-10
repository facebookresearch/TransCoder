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
int f_gold ( int a, int b ) {
  int cnt = 0;
  for ( int i = a;
  i <= b;
  i ++ ) for ( int j = 1;
  j * j <= i;
  j ++ ) if ( j * j == i ) cnt ++;
  return cnt;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {48,3,20,98,96,40,9,57,28,98};
    vector<int> param1 {42,82,72,98,90,82,15,77,80,75};
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