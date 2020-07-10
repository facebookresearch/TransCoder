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
  if ( n < 3 ) return n;
  if ( n >= 3 && n < 10 ) return n - 1;
  int po = 1;
  while ( n / po > 9 ) po = po * 10;
  int msd = n / po;
  if ( msd != 3 ) return f_gold ( msd ) * f_gold ( po - 1 ) + f_gold ( msd ) + f_gold ( n % po );
  else return f_gold ( msd * po - 1 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {85,86,3,35,59,38,33,15,75,74};
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