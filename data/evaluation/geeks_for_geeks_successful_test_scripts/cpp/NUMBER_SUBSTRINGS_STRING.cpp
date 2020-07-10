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
  return n * ( n + 1 ) / 2;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"gZFGZsHCimLf","505357","011011101","ovfwP Osauz","92132238746026","01100","RaOWYQRfiWKSyC","861330202","001100010","uvpKlGUBLOMba"};
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