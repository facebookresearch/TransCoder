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
  int n = str . length ( );
  int res = 0;
  int count [ 26 ] = {
    0 };
    for ( int i = 0;
    i < n;
    i ++ ) count [ str [ i ] - 'a' ] ++;
    for ( int i = 0;
    i < 26;
    i ++ ) if ( count [ i ] % 2 == 1 ) res ++;
    return ( res == 0 ) ? 0 : res - 1;
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"geeksforgeeks","58972","1110","JgQvAOhh","33","0110110","ZvxDIS","0936576628","00","cX"};
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