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
int f_gold ( int n ) {
  int result = 0;
  for ( int i = 1;
  i <= 9;
  i ++ ) {
    stack < int > s;
    if ( i <= n ) {
      s . push ( i );
      result ++;
    }
    while ( ! s . empty ( ) ) {
      int tp = s . top ( );
      s . pop ( );
      for ( int j = tp % 10;
      j <= 9;
      j ++ ) {
        int x = tp * 10 + j;
        if ( x <= n ) {
          s . push ( x );
          result ++;
        }
      }
    }
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {69,72,88,7,66,34,23,37,33,21};
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