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
char f_gold ( string str ) {
  for ( int i = 0;
  i < str . length ( );
  i ++ ) if ( isupper ( str [ i ] ) ) return str [ i ];
  return 0;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"pH","96544000","000010000","ujqpx","20684847994","111","rclkv","45173693434","11111011001101","f"};
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