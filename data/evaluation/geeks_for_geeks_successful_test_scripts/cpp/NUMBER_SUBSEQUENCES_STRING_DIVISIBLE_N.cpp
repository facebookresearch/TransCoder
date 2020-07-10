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
int f_gold ( string str, int n ) {
  int len = str . length ( );
  int dp [ len ] [ n ];
  memset ( dp, 0, sizeof ( dp ) );
  dp [ 0 ] [ ( str [ 0 ] - '0' ) % n ] ++;
  for ( int i = 1;
  i < len;
  i ++ ) {
    dp [ i ] [ ( str [ i ] - '0' ) % n ] ++;
    for ( int j = 0;
    j < n;
    j ++ ) {
      dp [ i ] [ j ] += dp [ i - 1 ] [ j ];
      dp [ i ] [ ( j * 10 + ( str [ i ] - '0' ) ) % n ] += dp [ i - 1 ] [ j ];
    }
  }
  return dp [ len - 1 ] [ 0 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"fYqkPLSWBgFy","151587","111111110","JQJHaUkkTrt","736592575580","10","L","3476601","0110001001","YimayLFU"};
    vector<int> param1 {55,84,9,97,68,3,74,2,53,45};
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