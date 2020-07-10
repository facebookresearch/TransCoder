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
  int m = a . length ( );
  int n = b . length ( );
  int lookup [ m + 1 ] [ n + 1 ] = {
    {
      0 }
    };
    for ( int i = 0;
    i <= n;
    ++ i ) lookup [ 0 ] [ i ] = 0;
    for ( int i = 0;
    i <= m;
    ++ i ) lookup [ i ] [ 0 ] = 1;
    for ( int i = 1;
    i <= m;
    i ++ ) {
      for ( int j = 1;
      j <= n;
      j ++ ) {
        if ( a [ i - 1 ] == b [ j - 1 ] ) lookup [ i ] [ j ] = lookup [ i - 1 ] [ j - 1 ] + lookup [ i - 1 ] [ j ];
        else lookup [ i ] [ j ] = lookup [ i - 1 ] [ j ];
      }
    }
    return lookup [ m ] [ n ];
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"fZOKCdZ Lav","2","1000001110","IAOyBzgIWHo","211806","1","CVaQTG","6265187228","10111101101000","vEi"};
    vector<string> param1 {"fKA","187012","0","oA","10","001011100","CT","628","01111","bigsvkQG"};
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