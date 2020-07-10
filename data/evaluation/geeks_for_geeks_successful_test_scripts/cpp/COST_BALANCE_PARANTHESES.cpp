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
  if ( s . length ( ) == 0 ) cout << 0 << endl;
  int ans = 0;
  int o = 0, c = 0;
  for ( int i = 0;
  i < s . length ( );
  i ++ ) {
    if ( s [ i ] == '(' ) o ++;
    if ( s [ i ] == ')' ) c ++;
  }
  if ( o != c ) return - 1;
  int a [ s . size ( ) ];
  if ( s [ 0 ] == '(' ) a [ 0 ] = 1;
  else a [ 0 ] = - 1;
  if ( a [ 0 ] < 0 ) ans += abs ( a [ 0 ] );
  for ( int i = 1;
  i < s . length ( );
  i ++ ) {
    if ( s [ i ] == '(' ) a [ i ] = a [ i - 1 ] + 1;
    else a [ i ] = a [ i - 1 ] - 1;
    if ( a [ i ] < 0 ) ans += abs ( a [ i ] );
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"()","))((","())","(()","(()()())","))())(()(())","))(())((","49","00001111","KDahByG "};
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