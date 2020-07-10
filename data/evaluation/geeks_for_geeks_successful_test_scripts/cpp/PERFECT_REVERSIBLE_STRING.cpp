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
  int i = 0, j = str . length ( ) - 1;
  while ( i < j ) {
    if ( str [ i ] != str [ j ] ) return false;
    i ++;
    j --;
  }
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"ab","303","11110000","aba","404","10101","abab","6366","001",""};
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