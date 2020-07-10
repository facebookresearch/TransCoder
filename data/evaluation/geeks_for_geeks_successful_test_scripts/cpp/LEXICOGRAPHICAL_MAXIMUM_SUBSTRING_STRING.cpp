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
string f_gold ( string str ) {
  string mx = "";
  for ( int i = 0;
  i < str . length ( );
  ++ i ) mx = max ( mx, str . substr ( i ) );
  return mx;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"HCoAefoaan","80336005","01111111110","qIH","4210598472796","10101","imqmKdatcgXjs","950509666021","10111101101","wasqgYFvz"};
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