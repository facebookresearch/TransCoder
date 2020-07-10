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
  int n = str . length ( );
  for ( int i = 0;
  i < n;
  i ++ ) for ( int j = i + 1;
  j < n;
  j ++ ) if ( abs ( str [ i ] - str [ j ] ) == abs ( i - j ) ) result ++;
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"smnKL","270083","0","kcZdsz","483544224","000011","WysGCirMwKBzP","3366","110","NlaMkpCjUgg"};
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