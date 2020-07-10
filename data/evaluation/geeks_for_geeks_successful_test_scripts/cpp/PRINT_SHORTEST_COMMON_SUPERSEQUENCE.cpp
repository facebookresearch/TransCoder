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
string f_gold ( string X, string Y ) {
  int m = X . length ( );
  int n = Y . length ( );
  int dp [ m + 1 ] [ n + 1 ];
  for ( int i = 0;
  i <= m;
  i ++ ) {
    for ( int j = 0;
    j <= n;
    j ++ ) {
      if ( i == 0 ) dp [ i ] [ j ] = j;
      else if ( j == 0 ) dp [ i ] [ j ] = i;
      else if ( X [ i - 1 ] == Y [ j - 1 ] ) dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ];
      else dp [ i ] [ j ] = 1 + min ( dp [ i - 1 ] [ j ], dp [ i ] [ j - 1 ] );
    }
  }
  int index = dp [ m ] [ n ];
  string str;
  int i = m, j = n;
  while ( i > 0 && j > 0 ) {
    if ( X [ i - 1 ] == Y [ j - 1 ] ) {
      str . push_back ( X [ i - 1 ] );
      i --, j --, index --;
    }
    else if ( dp [ i - 1 ] [ j ] > dp [ i ] [ j - 1 ] ) {
      str . push_back ( Y [ j - 1 ] );
      j --, index --;
    }
    else {
      str . push_back ( X [ i - 1 ] );
      i --, index --;
    }
  }
  while ( i > 0 ) {
    str . push_back ( X [ i - 1 ] );
    i --, index --;
  }
  while ( j > 0 ) {
    str . push_back ( Y [ j - 1 ] );
    j --, index --;
  }
  reverse ( str . begin ( ), str . end ( ) );
  return str;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"TDqjbbdzRkA","1071","0","yqLp","22508607","11000010","fcOw","0089872133806","000010000110","aeQVc"};
    vector<string> param1 {"Y","6273318333","100","oXDzdBmOmTHkM","736179592","01001","muMFduA","73","0011111100","fWZsG"};
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