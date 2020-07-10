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
  if ( b == 0 ) return 1;
  int answer = a;
  int increment = a;
  int i, j;
  for ( i = 1;
  i < b;
  i ++ ) {
    for ( j = 1;
    j < a;
    j ++ ) {
      answer += increment;
    }
    increment = answer;
  }
  return answer;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {66,82,12,55,34,22,13,57,76,76};
    vector<int> param1 {4,66,38,33,26,23,98,84,94,95};
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