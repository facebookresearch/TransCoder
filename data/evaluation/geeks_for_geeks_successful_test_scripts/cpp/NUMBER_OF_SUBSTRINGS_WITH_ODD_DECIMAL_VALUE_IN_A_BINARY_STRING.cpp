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
int f_gold ( string s ) {
  int n = s . length ( );
  int auxArr [ n ] = {
    0 };
    if ( s [ 0 ] == '1' ) auxArr [ 0 ] = 1;
    for ( int i = 1;
    i < n;
    i ++ ) {
      if ( s [ i ] == '1' ) auxArr [ i ] = auxArr [ i - 1 ] + 1;
      else auxArr [ i ] = auxArr [ i - 1 ];
    }
    int count = 0;
    for ( int i = n - 1;
    i >= 0;
    i -- ) if ( s [ i ] == '1' ) count += auxArr [ i ];
    return count;
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"OGiOkJF","517376","11","Ze","8763644247018","00111010001","HGwkBKUOVu","652","101000011110","kvdpG "};
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