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
int f_gold ( char str [ ], int n ) {
  int dp [ n ] [ n ];
  memset ( dp, 0, sizeof ( dp ) );
  bool P [ n ] [ n ];
  memset ( P, false, sizeof ( P ) );
  for ( int i = 0;
  i < n;
  i ++ ) P [ i ] [ i ] = true;
  for ( int i = 0;
  i < n - 1;
  i ++ ) {
    if ( str [ i ] == str [ i + 1 ] ) {
      P [ i ] [ i + 1 ] = true;
      dp [ i ] [ i + 1 ] = 1;
    }
  }
  for ( int gap = 2;
  gap < n;
  gap ++ ) {
    for ( int i = 0;
    i < n - gap;
    i ++ ) {
      int j = gap + i;
      if ( str [ i ] == str [ j ] && P [ i + 1 ] [ j - 1 ] ) P [ i ] [ j ] = true;
      if ( P [ i ] [ j ] == true ) dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i + 1 ] [ j ] + 1 - dp [ i + 1 ] [ j - 1 ];
      else dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i + 1 ] [ j ] - dp [ i + 1 ] [ j - 1 ];
    }
  }
  return dp [ 0 ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<char>> param0 {{'E','E','J','P','T','U','X','Y','Z','e','f','h','l','m','n','o','z'},{'8','7','3','4','9','5','3','1','4','0','6','8','2','5','8','3','5','2','8','6','6','3','5','7','5','5','3','7'},{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},{'f','E','e','z','B','o','i','v','K','u','P','C','z','f','k','J','t','R','t','A','f','G','D','X','H','e','p','l','l','k','Z','Y','u','g','H','C','f','J','H','W'},{'0','0','0','1','1','1','1','1','1','2','2','2','3','3','3','3','3','4','4','4','4','4','4','5','5','5','5','6','6','7','7','9','9','9','9','9','9'},{'1','0','1','1','0','0','1','1','1','0','1','0','1','1','0','1','0','1','1','1','1','1','0','1','1','0','1','0','1','1','0','0','1','0','1','0','0','0','0','0','1','1','0','1','0','1'},{'C','C','D','F','L','M','P','X','a','f','i','j','w'},{'7','9','0','2','8','0','7','5','9','4','5','4','8','1','9','5','3','2','4','1','2'},{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},{'m','X','N','M'}};
    vector<int> param1 {11,27,23,27,35,43,9,16,32,3};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i]) == f_gold(&param0[i].front(),param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}