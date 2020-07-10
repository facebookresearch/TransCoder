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
int f_gold ( string a, string b ) {
  int n = a . size ( ), m = b . size ( );
  if ( m == 0 ) return 1;
  int dp [ m + 1 ] [ n + 1 ];
  memset ( dp, 0, sizeof ( dp ) );
  for ( int i = 0;
  i < m;
  i ++ ) {
    for ( int j = i;
    j < n;
    j ++ ) {
      if ( i == 0 ) {
        if ( j == 0 ) dp [ i ] [ j ] = ( a [ j ] == b [ i ] ) ? 1 : 0;
        else if ( a [ j ] == b [ i ] ) dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + 1;
        else dp [ i ] [ j ] = dp [ i ] [ j - 1 ];
      }
      else {
        if ( a [ j ] == b [ i ] ) dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i - 1 ] [ j - 1 ];
        else dp [ i ] [ j ] = dp [ i ] [ j - 1 ];
      }
    }
  }
  return dp [ m - 1 ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"abcccdf","aabba","aabsdfljk","IONiqV","9667771256770","10001011","fczbDtMDT","298746088","01100011000","Qk"};
    vector<string> param1 {"abccdf","ab","aa","XKbBiGZ","50915176","01","FbX","29888","0",""};
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