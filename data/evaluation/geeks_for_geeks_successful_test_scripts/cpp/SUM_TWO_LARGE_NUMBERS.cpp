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
string f_gold ( string str1, string str2 ) {
  if ( str1 . length ( ) > str2 . length ( ) ) swap ( str1, str2 );
  string str = "";
  int n1 = str1 . length ( ), n2 = str2 . length ( );
  reverse ( str1 . begin ( ), str1 . end ( ) );
  reverse ( str2 . begin ( ), str2 . end ( ) );
  int carry = 0;
  for ( int i = 0;
  i < n1;
  i ++ ) {
    int sum = ( ( str1 [ i ] - '0' ) + ( str2 [ i ] - '0' ) + carry );
    str . push_back ( sum % 10 + '0' );
    carry = sum / 10;
  }
  for ( int i = n1;
  i < n2;
  i ++ ) {
    int sum = ( ( str2 [ i ] - '0' ) + carry );
    str . push_back ( sum % 10 + '0' );
    carry = sum / 10;
  }
  if ( carry ) str . push_back ( carry + '0' );
  reverse ( str . begin ( ), str . end ( ) );
  return str;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"VkfzrPG","0526110506447","011010010","sPAwZACc ","3","0101","VTtNu","2317170","111111000010","Ktt"};
    vector<string> param1 {"rKZ","903","110100000","liYMsojPiinOV","611","01110101011","Wsmc","898421173423","01100001110111","CTbbVX wGBkE"};
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