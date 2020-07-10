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
bool f_gold ( string str1, string str2 ) {
  if ( str1 . length ( ) != str2 . length ( ) ) return false;
  string clock_rot = "";
  string anticlock_rot = "";
  int len = str2 . length ( );
  anticlock_rot = anticlock_rot + str2 . substr ( len - 2, 2 ) + str2 . substr ( 0, len - 2 );
  clock_rot = clock_rot + str2 . substr ( 2 ) + str2 . substr ( 0, 2 );
  return ( str1 . compare ( clock_rot ) == 0 || str1 . compare ( anticlock_rot ) == 0 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"amazon","onamaz","amazon","ab","737009","000110","l","4420318628","11011111000000"," pvFHANc"};
    vector<string> param1 {"azonam","amazon","azoman","ab","239119","01111","YVo hqvnGxow","52856","10","xBIDFbiGb"};
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