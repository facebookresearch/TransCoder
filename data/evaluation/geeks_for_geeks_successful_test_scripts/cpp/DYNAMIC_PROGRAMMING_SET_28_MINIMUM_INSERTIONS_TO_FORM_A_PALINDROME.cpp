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
int f_gold ( char str [ ], int l, int h ) {
  if ( l > h ) return INT_MAX;
  if ( l == h ) return 0;
  if ( l == h - 1 ) return ( str [ l ] == str [ h ] ) ? 0 : 1;
  return ( str [ l ] == str [ h ] ) ? f_gold ( str, l + 1, h - 1 ) : ( min ( f_gold ( str, l, h - 1 ), f_gold ( str, l + 1, h ) ) + 1 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<char>> param0 {{'F','F','J','K','K','L','P','S','T','V','W','Y','b','d','j','l','t','u','x','y'},{'0','1','8','8','8','4','4','3','9','6','5','2','8','2','0','2','6','0','7','7','3','2','4','5','9','7','2','4','1','8','7','9','8','0','8','5','4','2','3'},{'1'},{'g','y','r','M','v','z',' ','k','S','P','x','p','E','z','T','K','k','B','s','P','p','e','G','t','r','M','p',' ','H','a'},{'0','1','1','1','1','1','1','2','2','2','2','3','3','3','3','3','4','4','4','5','5','5','5','5','6','6','6','6','6','6','6','7','8','8','8','9','9'},{'1','1','0','1','0','1','0','1','0','1','1','1','1','1','1','0'},{' ',' ',' ','B','C','C','D','I','K','O','P','R','T','V','W','a','b','d','j','y'},{'5','0','8','6','9','3','0','3','2','0','6','2','3','7','8','9','2','0','1','9','4','1','3','1','9','2','3','4','1','2','3','8','1'},{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},{'X','B','E','v','K','t','k','K','Q','s','V','N','l','k','T','N','J','z','f','p','J','g','S','P','M','b','H','L','v','E','A','n','D','U','c','s','M','Q','P','g','g',' '}};
    vector<int> param1 {11,19,0,24,33,13,16,31,37,26};
    vector<int> param2 {11,22,0,27,34,8,14,25,35,27};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],param2[i]) == f_gold(&param0[i].front(),param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}