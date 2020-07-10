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
int f_gold ( string & str ) {
  int n = str . length ( );
  int res = - 1;
  for ( int i = 0;
  i < n - 1;
  i ++ ) for ( int j = i + 1;
  j < n;
  j ++ ) if ( str [ i ] == str [ j ] ) res = max ( res, abs ( j - i - 1 ) );
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"cI","76478","1","tr","10","01","Rmhzp","5784080133917","1100","OK"};
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