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
  int result = 0;
  for ( int i = 0;
  i < str . size ( );
  i ++ ) if ( i == ( str [ i ] - 'a' ) || i == ( str [ i ] - 'A' ) ) result ++;
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"lLkhFeZGcb","ABcED","geeksforgeeks","Alphabetical","abababab","bcdefgxyz","cBzaqx L"," bcd","11","MqqKY"};
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