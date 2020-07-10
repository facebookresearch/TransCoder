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
int f_gold ( string num ) {
  int series [ ] = {
    1, 3, 2, - 1, - 3, - 2 };
    int series_index = 0;
    int result = 0;
    for ( int i = num . size ( ) - 1;
    i >= 0;
    i -- ) {
      int digit = num [ i ] - '0';
      result += digit * series [ series_index ];
      series_index = ( series_index + 1 ) % 6;
      result %= 7;
    }
    if ( result < 0 ) result = ( result + 7 ) % 7;
    return result;
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"K","850076","00111","X","1","10010001100"," pgPeLz","53212456821275","101","V"};
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