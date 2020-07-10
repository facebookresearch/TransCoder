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
  int count = 0, ans = 1;
  while ( n % 2 == 0 ) {
    count ++;
    n /= 2;
  }
  if ( count % 2 ) ans *= 2;
  for ( int i = 3;
  i <= sqrt ( n );
  i += 2 ) {
    count = 0;
    while ( n % i == 0 ) {
      count ++;
      n /= i;
    }
    if ( count % 2 ) ans *= i;
  }
  if ( n > 2 ) ans *= n;
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {95,48,3,10,82,1,77,99,23,61};
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