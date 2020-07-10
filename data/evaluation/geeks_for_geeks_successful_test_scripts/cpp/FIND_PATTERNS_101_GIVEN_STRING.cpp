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
  char last = str [ 0 ];
  int i = 1, counter = 0;
  while ( i < str . size ( ) ) {
    if ( str [ i ] == '0' && last == '1' ) {
      while ( str [ i ] == '0' ) i ++;
      if ( str [ i ] == '1' ) counter ++;
    }
    last = str [ i ];
    i ++;
  }
  return counter;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"fkyso nGZSLfhj","3841","0100001110111","zXZkptcbnQot","4364264685264","10","wDgox","1215572","1","bftZvRTamdUvL"};
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