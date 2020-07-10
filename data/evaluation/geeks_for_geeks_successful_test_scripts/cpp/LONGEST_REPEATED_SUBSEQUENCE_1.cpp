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
  int n = str . length ( );
  int dp [ n + 1 ] [ n + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) for ( int j = 0;
  j <= n;
  j ++ ) dp [ i ] [ j ] = 0;
  for ( int i = 1;
  i <= n;
  i ++ ) for ( int j = 1;
  j <= n;
  j ++ ) if ( str [ i - 1 ] == str [ j - 1 ] && i != j ) dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ];
  else dp [ i ] [ j ] = max ( dp [ i ] [ j - 1 ], dp [ i - 1 ] [ j ] );
  string res = "";
  int i = n, j = n;
  while ( i > 0 && j > 0 ) {
    if ( dp [ i ] [ j ] == dp [ i - 1 ] [ j - 1 ] + 1 ) {
      res = res + str [ i - 1 ];
      i --;
      j --;
    }
    else if ( dp [ i ] [ j ] == dp [ i - 1 ] [ j ] ) i --;
    else j --;
  }
  reverse ( res . begin ( ), res . end ( ) );
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"qnQxjoRx","27473733400077","000010111111","TNVwgrWSLu","9537","1100","lYcoiQfzN","52","00100001100","Rkxe"};
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