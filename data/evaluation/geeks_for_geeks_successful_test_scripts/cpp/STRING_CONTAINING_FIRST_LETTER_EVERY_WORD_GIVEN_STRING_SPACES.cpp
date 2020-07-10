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
string f_gold ( string str ) {
  string result = "";
  bool v = true;
  for ( int i = 0;
  i < str . length ( );
  i ++ ) {
    if ( str [ i ] == ' ' ) v = true;
    else if ( str [ i ] != ' ' && v == true ) {
      result . push_back ( str [ i ] );
      v = false;
    }
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"t a","77 78 2 600 7","011 10 10","kVCo kV Co O iR","2","0 11","Y sT wgheC","58 824 6","00 100 001 0111","Q"};
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