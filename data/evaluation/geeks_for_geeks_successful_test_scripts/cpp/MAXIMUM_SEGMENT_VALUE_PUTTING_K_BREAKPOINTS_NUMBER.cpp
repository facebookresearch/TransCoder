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
int f_gold ( string & s, int k ) {
  int seg_len = s . length ( ) - k;
  int res = 0;
  for ( int i = 0;
  i < seg_len;
  i ++ ) res = res * 10 + ( s [ i ] - '0' );
  int seg_len_pow = pow ( 10, seg_len - 1 );
  int curr_val = res;
  for ( int i = 1;
  i <= ( s . length ( ) - seg_len );
  i ++ ) {
    curr_val = curr_val - ( s [ i - 1 ] - '0' ) * seg_len_pow;
    curr_val = curr_val * 10 + ( s [ i + seg_len - 1 ] - '0' );
    res = max ( res, curr_val );
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"kjgHiKOrCpvn","656666342","11010111010101","hTSBuAXHgWd","458794087","100000","EtbP","870292","1","DkRQuGByuhHcw"};
    vector<int> param1 {5,3,3,4,1,5,3,4,11,61};
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