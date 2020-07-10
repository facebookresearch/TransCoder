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
bool f_gold ( string s, char c ) {
  bool oneSeen = false;
  int i = 0, n = s . length ( );
  while ( i < n ) {
    if ( s [ i ] == c ) {
      if ( oneSeen == true ) return false;
      while ( i < n && s [ i ] == c ) i ++;
      oneSeen = true;
    }
    else i ++;
  }
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"gILrzLimS","307471222","110","GcAB","113","011110010","wcwob","74571582216153","100000011","ryPErkzY"};
    vector<char> param1 {'m','2','0','v','3','0','w','1','0','q'};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i]) == f_gold(param0[i],param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}