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
int f_gold ( string str ) {
  int n = str . length ( );
  int oddDigSum = 0, evenDigSum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( i % 2 == 0 ) oddDigSum += ( str [ i ] - '0' );
    else evenDigSum += ( str [ i ] - '0' );
  }
  return ( ( oddDigSum - evenDigSum ) % 11 == 0 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"r","7386620","1010","rWFOLX VB","3845847974820","01001","yq","770356","0000110111001","tDMrBdHJJITDx"};
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