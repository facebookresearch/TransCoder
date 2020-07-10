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
int f_gold ( string X, string Y ) {
  int m = X . length ( );
  int n = Y . length ( );
  int result = 0;
  int len [ 2 ] [ n ];
  int currRow = 0;
  for ( int i = 0;
  i <= m;
  i ++ ) {
    for ( int j = 0;
    j <= n;
    j ++ ) {
      if ( i == 0 || j == 0 ) {
        len [ currRow ] [ j ] = 0;
      }
      else if ( X [ i - 1 ] == Y [ j - 1 ] ) {
        len [ currRow ] [ j ] = len [ 1 - currRow ] [ j - 1 ] + 1;
        result = max ( result, len [ currRow ] [ j ] );
      }
      else {
        len [ currRow ] [ j ] = 0;
      }
    }
    currRow = 1 - currRow;
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"GeeksforGeeks","333940","1000","Facebook","2684247","111","abcdxyz","625330958530","01011000001111","KXm"};
    vector<string> param1 {"GeeksQuiz","390","0","nice book","1","10","xyzabcd","412511","1001010001","gF"};
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