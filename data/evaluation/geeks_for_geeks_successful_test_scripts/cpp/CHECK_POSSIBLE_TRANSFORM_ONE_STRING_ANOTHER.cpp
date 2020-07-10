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
bool f_gold ( string s1, string s2 ) {
  int n = s1 . length ( );
  int m = s2 . length ( );
  bool dp [ n + 1 ] [ m + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) {
    for ( int j = 0;
    j <= m;
    j ++ ) {
      dp [ i ] [ j ] = false;
    }
  }
  dp [ 0 ] [ 0 ] = true;
  for ( int i = 0;
  i < s1 . length ( );
  i ++ ) {
    for ( int j = 0;
    j <= s2 . length ( );
    j ++ ) {
      if ( dp [ i ] [ j ] ) {
        if ( j < s2 . length ( ) && ( toupper ( s1 [ i ] ) == s2 [ j ] ) ) dp [ i + 1 ] [ j + 1 ] = true;
        if ( ! isupper ( s1 [ i ] ) ) dp [ i + 1 ] [ j ] = true;
      }
    }
  }
  return ( dp [ n ] [ m ] );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"daBcd","417514","010000","ZcKYguiMrdyn","argaju","1110101101","ySOCoSaygi","204","10011100000010","nMAioozPmY"};
    vector<string> param1 {"ABC","9","1111011010","iz","RAJ","110101001","aRhxkYqh","6986871066","0","WZFdDKw"};
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