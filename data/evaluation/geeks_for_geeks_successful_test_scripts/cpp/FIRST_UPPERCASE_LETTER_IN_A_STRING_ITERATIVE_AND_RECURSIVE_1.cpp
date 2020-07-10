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
char f_gold ( string str, int i = 0 ) {
  if ( str [ i ] == '\0' ) return 0;
  if ( isupper ( str [ i ] ) ) return str [ i ];
  return f_gold ( str, i + 1 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"bqDNcKByTnd","55228579663548","011","iWPNIfEbTXSN","317256850800","01","sPohONiPM","690818686620","1","xVz IfQBHyEZMa"};
    vector<int> param1 {0,0,0,0,0,0,0,0,0,82};
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