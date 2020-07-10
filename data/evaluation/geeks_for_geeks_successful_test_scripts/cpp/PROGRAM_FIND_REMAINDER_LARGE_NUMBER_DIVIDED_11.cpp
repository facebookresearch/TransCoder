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
  int len = str . length ( );
  int num, rem = 0;
  for ( int i = 0;
  i < len;
  i ++ ) {
    num = rem * 10 + ( str [ i ] - '0' );
    rem = num % 11;
  }
  return rem;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"DvsNZVNZ","1170","10","evsPwREbSY","09219178704","1001010","SkZbWSajDKmiG","0287976763","011011000111","lUn"};
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