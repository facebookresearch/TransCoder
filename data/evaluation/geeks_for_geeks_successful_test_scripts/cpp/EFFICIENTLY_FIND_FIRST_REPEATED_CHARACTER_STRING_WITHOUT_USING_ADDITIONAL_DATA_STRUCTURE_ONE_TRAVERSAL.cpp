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
  int checker = 0;
  for ( int i = 0;
  i < str . length ( );
  ++ i ) {
    int val = ( str [ i ] - 'a' );
    if ( ( checker & ( 1 << val ) ) > 0 ) return i;
    checker |= ( 1 << val );
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"XFGfXTDgpIuerN","5621946166","11010110","xL","2575","0100010","SZmmQ","9735892999350","1001101101101","oEXDbOU"};
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