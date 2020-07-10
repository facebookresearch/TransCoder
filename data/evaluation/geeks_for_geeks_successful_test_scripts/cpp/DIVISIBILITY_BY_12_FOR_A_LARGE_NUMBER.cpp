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
  if ( num . length ( ) >= 3 ) {
    int d1 = ( int ) num [ num . length ( ) - 1 ];
    if ( d1 % 2 != 0 ) return ( 0 );
    int d2 = ( int ) num [ num . length ( ) - 2 ];
    int sum = 0;
    for ( int i = 0;
    i < num . length ( );
    i ++ ) sum += num [ i ];
    return ( sum % 3 == 0 && ( d2 * 10 + d1 ) % 4 == 0 );
  }
  else {
    int number = stoi ( num );
    return ( number % 12 == 0 );
  }
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"12244824607284961224","392603977949","11101001111","92387493287593874594898678979792","2233244912","10101","12","254535361","1","hMPxVMpOBt"};
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