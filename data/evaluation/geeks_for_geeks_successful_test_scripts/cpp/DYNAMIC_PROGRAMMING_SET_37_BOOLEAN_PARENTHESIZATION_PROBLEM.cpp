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
int f_gold ( char symb [ ], char oper [ ], int n ) {
  int F [ n ] [ n ], T [ n ] [ n ];
  for ( int i = 0;
  i < n;
  i ++ ) {
    F [ i ] [ i ] = ( symb [ i ] == 'F' ) ? 1 : 0;
    T [ i ] [ i ] = ( symb [ i ] == 'T' ) ? 1 : 0;
  }
  for ( int gap = 1;
  gap < n;
  ++ gap ) {
    for ( int i = 0, j = gap;
    j < n;
    ++ i, ++ j ) {
      T [ i ] [ j ] = F [ i ] [ j ] = 0;
      for ( int g = 0;
      g < gap;
      g ++ ) {
        int k = i + g;
        int tik = T [ i ] [ k ] + F [ i ] [ k ];
        int tkj = T [ k + 1 ] [ j ] + F [ k + 1 ] [ j ];
        if ( oper [ k ] == '&' ) {
          T [ i ] [ j ] += T [ i ] [ k ] * T [ k + 1 ] [ j ];
          F [ i ] [ j ] += ( tik * tkj - T [ i ] [ k ] * T [ k + 1 ] [ j ] );
        }
        if ( oper [ k ] == '|' ) {
          F [ i ] [ j ] += F [ i ] [ k ] * F [ k + 1 ] [ j ];
          T [ i ] [ j ] += ( tik * tkj - F [ i ] [ k ] * F [ k + 1 ] [ j ] );
        }
        if ( oper [ k ] == '^' ) {
          T [ i ] [ j ] += F [ i ] [ k ] * T [ k + 1 ] [ j ] + T [ i ] [ k ] * F [ k + 1 ] [ j ];
          F [ i ] [ j ] += T [ i ] [ k ] * T [ k + 1 ] [ j ] + F [ i ] [ k ] * F [ k + 1 ] [ j ];
        }
      }
    }
  }
  return T [ 0 ] [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {
    "TTFT",
    "TFT",
    "TFF",
    "TTFT",
    "TTFT",
    "TTFT",
    "TTFT",
    "TTFT",
    "TTFT",
    "TTFT"
    };
    vector<string> param1 {
    "|&^",
    "^&",
    "^|",
    "|||",
    "&&&",
    "&&^",
    "^&|",
    "^^^",
    "^||",
    "|^|"
    };
    vector<int> param2 {4,3,3,4,4,4,4,4,4,4};
    for(int i = 0; i < param0.size(); ++i)
    {
         char* arr0 = new char[param0[i].length() + 1];
         arr0 = strncpy(arr0, param0[i].c_str(), sizeof(arr0));

         char* arr1 = new char[param1[i].length() + 1];
         arr1 = strncpy(arr1, param1[i].c_str(), sizeof(arr1));
         if(f_filled(arr0,arr1,param2[i]) == f_gold(arr0,arr1,param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}