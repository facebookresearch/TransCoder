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
int f_gold ( char s [ ], int n ) {
  int invalidOpenBraces = 0;
  int invalidCloseBraces = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( s [ i ] == '(' ) {
      invalidOpenBraces ++;
    }
    else {
      if ( invalidOpenBraces == 0 ) {
        invalidCloseBraces ++;
      }
      else {
        invalidOpenBraces --;
      }
    }
  }
  return ( n - ( invalidOpenBraces + invalidCloseBraces ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"()()(()))()","(()(()))","(())()()","(())()))()","((()))(((","kjbcwkjebc","KZPNX","82050","010)()fkhj","ndPKtu"};
    vector<int> param1 {11,8,8,10,9,10,5,5,10,6};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i]) == f_gold(&param0[i].front(),param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}
