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
  int res = str [ 0 ] - '0';
  for ( int i = 1;
  i < str . length ( );
  i ++ ) {
    if ( str [ i ] == '0' || str [ i ] == '1' || res < 2 ) res += ( str [ i ] - '0' );
    else res *= ( str [ i ] - '0' );
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"pR","9518","1","nNMCIXUCpRMmvO","3170487","0100101010","Z rONcUqWb","00419297","00","r"};
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