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
bool f_gold ( string str, string corner ) {
  int n = str . length ( );
  int cl = corner . length ( );
  if ( n < cl ) return false;
  return ( str . substr ( 0, cl ) . compare ( corner ) == 0 && str . substr ( n - cl, cl ) . compare ( corner ) == 0 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"geeksmanishgeeks","shreyadhatwalia","10000100","abaa","30645530","0000011011001","dkqEd","48694119324654","1101010010","Ks"};
    vector<string> param1 {"geeks","abc","100","a","30","001","d","654","11","KsFLmngGGOmHKs"};
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