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
int f_gold ( string s, char c ) {
  int res = 0;
  for ( int i = 0;
  i < s . length ( );
  i ++ ) if ( s [ i ] == c ) res ++;
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"mhjnKfd","716662107","01","wPHSxIbnHakGRO","721106","111","TIBFU","0","10","lqq"};
    vector<char> param1 {'l','6','1','n','8','0','Q','3','0','d'};
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