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
  int n = s . size ( );
  int ans = - 1;
  string num;
  for ( int i = 1;
  i < ( 1 << n );
  i ++ ) {
    string str = "";
    for ( int j = 0;
    j < n;
    j ++ ) {
      if ( ( i >> j ) & 1 ) {
        str += s [ j ];
      }
    }
    if ( str [ 0 ] != '0' ) {
      int temp = 0;
      for ( int j = 0;
      j < str . size ( );
      j ++ ) temp = temp * 10 + ( int ) ( str [ j ] - '0' );
      int k = sqrt ( temp );
      if ( k * k == temp ) {
        if ( ans < ( int ) str . size ( ) ) {
          ans = ( int ) str . size ( );
          num = str;
        }
      }
    }
  }
  if ( ans == - 1 ) return ans;
  else {
    cout << num << " ";
    return n - ans;
  }
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"h","1391212","010","ksRFLRVL","5809836998","1111000","hJoDzrrBaF","6076","001010010","lU DBBVF"};
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