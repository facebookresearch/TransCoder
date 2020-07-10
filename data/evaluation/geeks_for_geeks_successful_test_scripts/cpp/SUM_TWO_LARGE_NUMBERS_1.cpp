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
  int diff = n2 - n1;
  int carry = 0;
  for ( int i = n1 - 1;
  i >= 0;
  i -- ) {
    int sum = ( ( str1 [ i ] - '0' ) + ( str2 [ i + diff ] - '0' ) + carry );
    str . push_back ( sum % 10 + '0' );
    carry = sum / 10;
  }
  for ( int i = n2 - n1 - 1;
  i >= 0;
  i -- ) {
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
    vector<string> param0 {"G","48578","010","KkGp","48928969618416","0101011010","X","10073867","01110000000","k "};
    vector<string> param1 {"FcAiuKhw","5117561223135","00000","nSE","88497275","11","MomtbuxLRR","28","0110","aSSlhOYp"};
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