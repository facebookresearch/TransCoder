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
int f_gold ( string n ) {
  string num = n;
  int dec_value = 0;
  int base = 1;
  int len = num . length ( );
  for ( int i = len - 1;
  i >= 0;
  i -- ) {
    if ( num [ i ] == '1' ) dec_value += base;
    base = base * 2;
  }
  return dec_value;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"uEmIAgF","753310137","010011010","kNi","04562016903312","000111101","bk","9","1","XxT nXLlk"};
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