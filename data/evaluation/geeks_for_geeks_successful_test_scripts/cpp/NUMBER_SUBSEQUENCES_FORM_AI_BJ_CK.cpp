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
int f_gold ( string s ) {
  int aCount = 0;
  int bCount = 0;
  int cCount = 0;
  for ( unsigned int i = 0;
  i < s . size ( );
  i ++ ) {
    if ( s [ i ] == 'a' ) aCount = ( 1 + 2 * aCount );
    else if ( s [ i ] == 'b' ) bCount = ( aCount + 2 * bCount );
    else if ( s [ i ] == 'c' ) cCount = ( bCount + 2 * cCount );
  }
  return cCount;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"","abbc","abcabc","agsdbkfdc","ababab","aaaaaaa","aabaaabcc","19","1001100","DtAnuQbU"};
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