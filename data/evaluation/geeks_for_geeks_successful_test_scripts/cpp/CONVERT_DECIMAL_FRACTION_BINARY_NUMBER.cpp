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
string f_gold ( double num, int k_prec ) {
  string binary = "";
  int Integral = num;
  double fractional = num - Integral;
  while ( Integral ) {
    int rem = Integral % 2;
    binary . push_back ( rem + '0' );
    Integral /= 2;
  }
  reverse ( binary . begin ( ), binary . end ( ) );
  binary . push_back ( '.' );
  while ( k_prec -- ) {
    fractional *= 2;
    int fract_bit = fractional;
    if ( fract_bit == 1 ) {
      fractional -= fract_bit;
      binary . push_back ( 1 + '0' );
    }
    else binary . push_back ( 0 + '0' );
  }
  return binary;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<double> param0 {669.1814271974272,-6553.367253116433,2087.729683310425,-953.9651645597713,8433.012733502104,-173.90092987443873,5301.037770893914,-1650.793567487302,6800.282512726602,-4080.798596227304};
    vector<int> param1 {33,55,10,83,17,14,34,24,70,45};
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