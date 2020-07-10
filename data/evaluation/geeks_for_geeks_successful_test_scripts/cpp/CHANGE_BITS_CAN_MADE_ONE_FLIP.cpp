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
bool f_gold ( string str ) {
  int zeros = 0, ones = 0;
  for ( char ch : str ) ( ch == '0' ) ? ++ zeros : ++ ones;
  return ( zeros == 1 || ones == 1 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"00001","0000","11","111110","1","111010111010","hUInqJXNdbfP","5191","1110101101","NupSrU xz"};
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