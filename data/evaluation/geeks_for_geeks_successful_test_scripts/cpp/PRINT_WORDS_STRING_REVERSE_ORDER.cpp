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
  int i = str . length ( ) - 1;
  int start, end = i + 1;
  string result = "";
  while ( i >= 0 ) {
    if ( str [ i ] == ' ' ) {
      start = i + 1;
      while ( start != end ) result += str [ start ++ ];
      result += ' ';
      end = i;
    }
    i --;
  }
  start = 0;
  while ( start != end ) result += str [ start ++ ];
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {
    "m Dm YZ",
    "65 48 57 71",
    "01 010",
    "mT vhByi",
    "19 44 9 1",
    "0",
    "z vUi  ",
    "7 591 36643 9 055",
    "01",
    "ti YGaijPY"
    };
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