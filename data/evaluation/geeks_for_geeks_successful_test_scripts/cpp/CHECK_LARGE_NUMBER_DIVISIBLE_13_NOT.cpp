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
bool f_gold ( string num ) {
  int length = num . size ( );
  if ( length == 1 && num [ 0 ] == '0' ) return true;
  if ( length % 3 == 1 ) {
    num += "00";
    length += 2;
  }
  else if ( length % 3 == 2 ) {
    num += "0";
    length += 1;
  }
  int sum = 0, p = 1;
  for ( int i = length - 1;
  i >= 0;
  i -- ) {
    int group = 0;
    group += num [ i -- ] - '0';
    group += ( num [ i -- ] - '0' ) * 10;
    group += ( num [ i ] - '0' ) * 100;
    sum = sum + group * p;
    p *= ( - 1 );
  }
  sum = abs ( sum );
  return ( sum % 13 == 0 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"vzTUaItpCpLnjY","33855","0011110101011","MMQ","439340517954","000000000","UugAuRRJbjEgl","6406553695441","011001","yjFqEEvgiNjEX"};
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