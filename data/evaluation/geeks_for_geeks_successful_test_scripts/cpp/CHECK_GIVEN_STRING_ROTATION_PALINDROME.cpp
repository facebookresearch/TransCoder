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
bool f_gold ( string str ) {
  int l = 0;
  int h = str . length ( ) - 1;
  while ( h > l ) if ( str [ l ++ ] != str [ h -- ] ) return false;
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"aadaa","2674377254","11","0011000","26382426486138","111010111010","abccba","5191","1110101101","abcdecbe"};
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