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
  while ( n % 2 == 0 ) {
    k --;
    n = n / 2;
    if ( k == 0 ) return 2;
  }
  for ( int i = 3;
  i <= sqrt ( n );
  i = i + 2 ) {
    while ( n % i == 0 ) {
      if ( k == 1 ) return i;
      k --;
      n = n / i;
    }
  }
  if ( n > 2 && k == 1 ) return n;
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {94,99,64,27,24,84,69,69,22,39};
    vector<int> param1 {0,1,3,3,4,6,98,39,60,57};
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
