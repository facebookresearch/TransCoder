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
  int n = num . length ( );
  int sum = accumulate ( begin ( num ), end ( num ), 0 ) - '0' * 1;
  if ( sum % 3 == 0 ) return 0;
  if ( n == 1 ) return - 1;
  for ( int i = 0;
  i < n;
  i ++ ) if ( sum % 3 == ( num [ i ] - '0' ) % 3 ) return 1;
  if ( n == 2 ) return - 1;
  return 2;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"wVVe","850390909067","1110","NRSAazejUS","297975","1","ThYMuVOm","1874418087476","11011001001","YJ"};
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