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
int f_gold ( int k, string s1, string s2 ) {
  int n = s1 . length ( );
  int m = s2 . length ( );
  int lcs [ n + 1 ] [ m + 1 ];
  int cnt [ n + 1 ] [ m + 1 ];
  memset ( lcs, 0, sizeof ( lcs ) );
  memset ( cnt, 0, sizeof ( cnt ) );
  for ( int i = 1;
  i <= n;
  i ++ ) {
    for ( int j = 1;
    j <= m;
    j ++ ) {
      lcs [ i ] [ j ] = max ( lcs [ i - 1 ] [ j ], lcs [ i ] [ j - 1 ] );
      if ( s1 [ i - 1 ] == s2 [ j - 1 ] ) cnt [ i ] [ j ] = cnt [ i - 1 ] [ j - 1 ] + 1;
      if ( cnt [ i ] [ j ] >= k ) {
        for ( int a = k;
        a <= cnt [ i ] [ j ];
        a ++ ) lcs [ i ] [ j ] = max ( lcs [ i ] [ j ], lcs [ i - a ] [ j - a ] + a );
      }
    }
  }
  return lcs [ n ] [ m ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {4,2,3,5,2,3,3,1,2,2};
    vector<string> param1 {"aggayxysdfa","55571659965107","01011011100","aggasdfa","5710246551","0100010","aabcaaaa","1219","111000011","wiC oD"};
    vector<string> param2 {"aggajxaaasdfa","390286654154","0000110001000","aggajasdfaxy","79032504084062","10100000","baaabcd","3337119582","011","csiuGOUwE"};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i]) == f_gold(param0[i],param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}