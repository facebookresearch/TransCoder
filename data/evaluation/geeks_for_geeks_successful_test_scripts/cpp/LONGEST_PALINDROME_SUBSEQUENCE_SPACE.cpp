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
int f_gold ( string & s ) {
  int n = s . length ( );
  int a [ n ];
  for ( int i = n - 1;
  i >= 0;
  i -- ) {
    int back_up = 0;
    for ( int j = i;
    j < n;
    j ++ ) {
      if ( j == i ) a [ j ] = 1;
      else if ( s [ i ] == s [ j ] ) {
        int temp = a [ j ];
        a [ j ] = back_up + 2;
        back_up = temp;
      }
      else {
        back_up = a [ j ];
        a [ j ] = max ( a [ j - 1 ], a [ j ] );
      }
    }
  }
  return a [ n - 1 ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {" E","0845591950","00101011","pLSvlwrACvFaoT","7246","1010101100000","obPkcLSFp","914757557818","1","PKvUWIQ"};
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