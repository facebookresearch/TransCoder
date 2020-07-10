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
string f_gold ( string n ) {
  string res = n;
  for ( int j = n . length ( ) - 1;
  j >= 0;
  -- j ) res += n [ j ];
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"lSUhEvxcgfI","77329283","010111111","Stazb","0702","01111111","a","359118754930","11011010010","rznb"};
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