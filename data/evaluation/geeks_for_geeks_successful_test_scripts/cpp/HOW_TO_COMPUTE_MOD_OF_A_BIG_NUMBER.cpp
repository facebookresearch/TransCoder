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
int f_gold ( string num, int a ) {
  int res = 0;
  for ( int i = 0;
  i < num . length ( );
  i ++ ) res = ( res * 10 + ( int ) num [ i ] - '0' ) % a;
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"RElCP","0139035510","00011110","TwanZWwLNXhFN","6247009752778","0100001011011","NCh","00714746542","101000100","MSTkXmlbPkV"};
    vector<int> param1 {13,44,86,66,55,33,75,54,93,78};
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