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
bool f_gold ( string num ) {
  int n = num . length ( );
  if ( n == 0 && num [ 0 ] == '0' ) return true;
  if ( n % 3 == 1 ) num = "00" + num;
  if ( n % 3 == 2 ) num = "0" + num;
  int gSum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    int group = 0;
    group += ( num [ i ++ ] - '0' ) * 100;
    group += ( num [ i ++ ] - '0' ) * 10;
    group += num [ i ] - '0';
    gSum += group;
  }
  if ( gSum > 1000 ) {
    num = to_string ( gSum );
    n = num . length ( );
    gSum = f_gold ( num );
  }
  return ( gSum == 999 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"235764","321308924","101111","1998","339589","0000101","264735","19570453184","000","SsHh"};
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