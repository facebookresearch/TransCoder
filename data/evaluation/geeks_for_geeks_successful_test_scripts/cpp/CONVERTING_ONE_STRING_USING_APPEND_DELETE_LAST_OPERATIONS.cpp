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
bool f_gold ( string str1, string str2, int k ) {
  if ( ( str1 . length ( ) + str2 . length ( ) ) < k ) return true;
  int commonLength = 0;
  for ( int i = 0;
  i < min ( str1 . length ( ), str2 . length ( ) );
  i ++ ) {
    if ( str1 [ i ] == str2 [ i ] ) commonLength ++;
    else break;
  }
  if ( ( k - str1 . length ( ) - str2 . length ( ) + 2 * commonLength ) % 2 == 0 ) return true;
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"ZNHGro","382880806774","0","lxHTRFCTSQ","6399914758","01100011100000","WkGqlob","46974006151","1001001","IJQ"};
    vector<string> param1 {"jAdbtDUYQu","65565","00100010100","sViXYE","780990121","0100","NpQVdXzEtUZy","74438","1000010","nFOHAeYEAp"};
    vector<int> param2 {3,10,2,89,9,0,6,11,15,42};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i]) == f_gold(param0[i],param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}