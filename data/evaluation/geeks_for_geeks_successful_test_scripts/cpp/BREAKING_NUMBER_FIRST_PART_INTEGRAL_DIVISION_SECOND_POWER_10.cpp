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
int f_gold ( string N ) {
  int len = N . length ( );
  int l = ( len ) / 2;
  int count = 0;
  for ( int i = 1;
  i <= l;
  i ++ ) {
    string s = N . substr ( 0, i );
    int l1 = s . length ( );
    string t = N . substr ( i, l1 );
    if ( s [ 0 ] == '0' || t [ 0 ] == '0' ) continue;
    if ( s . compare ( t ) == 0 ) count ++;
  }
  return count;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"ZCoQhuM","2674377254","11","LbuGlvRyWAPBpo","26382426486138","111010111010","hUInqJXNdbfP","5191","1110101101","2202200"};
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