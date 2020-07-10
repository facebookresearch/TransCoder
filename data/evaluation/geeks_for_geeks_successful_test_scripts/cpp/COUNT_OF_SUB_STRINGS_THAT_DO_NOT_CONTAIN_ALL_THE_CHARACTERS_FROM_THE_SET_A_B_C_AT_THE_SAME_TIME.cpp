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
int f_gold ( char str [ ], int n ) {
  int ans = ( n * ( n + 1 ) ) / 2;
  int a_index = 0;
  int b_index = 0;
  int c_index = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( str [ i ] == 'a' ) {
      a_index = i + 1;
      ans -= min ( b_index, c_index );
    }
    else if ( str [ i ] == 'b' ) {
      b_index = i + 1;
      ans -= min ( a_index, c_index );
    }
    else {
      c_index = i + 1;
      ans -= min ( a_index, b_index );
    }
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<char>> param0 {{'E','F','G','I','K','M','O','Q','Q','S','T','U','X','Z','a','b','c','d','e','f','h','h','i','j','l','m','s','s','t','x','y','y'},{'1','3','5','6','6','4','6','1','8','0','3','8','3','5','9','6','8','5','7','2','3','7','1','7','6','1','8','9','3','6','7','0','8','5','8','3','2','6','7','4','5','1','3','3','7','5','6'},{'0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1'},{'c','Z','s','F','v',' ','Y','e','u','I','P','y','j','o','n'},{'0','0','2','2','3','3','4','5','6','6','6','7','8','9'},{'0','1','0','1','1','1','1','0','0','0','1','1','0','0','0','0','0','0','1','1','1','1','0','1','0','1','1','1','1','1','0','0'},{'E','G','G','J','L','O','O','S','T','U','V','V','Y','c','d','e','f','g','g','j','m','n','p','q','q','r','u','u','x'},{'8','1','9','6','4','3','8','2','8','5','5','3','0','1','7','3','1','5','4','8','2','3','3','2','2','4','9','6','3','1','4','1','4','0','4','9','4','8','4','7'},{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},{'j','z','H','Q'}};
    vector<int> param1 {23,24,15,9,8,19,21,36,33,2};
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