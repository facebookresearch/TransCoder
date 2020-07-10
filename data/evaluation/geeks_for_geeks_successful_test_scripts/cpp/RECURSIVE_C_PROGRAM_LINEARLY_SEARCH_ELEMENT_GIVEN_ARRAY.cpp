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
int f_gold ( int arr [ ], int l, int r, int x ) {
  if ( r < l ) return - 1;
  if ( arr [ l ] == x ) return l;
  if ( arr [ r ] == x ) return r;
  return f_gold ( arr, l + 1, r - 1, x );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{10,74,3},{-90,72,36,96,42,0,-66,4},{0},{99,70,67,5},{-98,-98,-26,-26,-24,-18,-16,80,5},{1,1,1,1,0,1,0},{1,5,12,12,17,17,12,95,96,98,4},{50,-70,-30,-54,6,-10,70,84,5},{0,1,5},{59,21,28,3,14,5}};
    vector<int> param1 {0,0,0,0,0,0,0,0,0,0};
    vector<int> param2 {2,7,1,3,8,6,10,8,2,5};
    vector<int> param3 {1,96,-1,3,80,1,12,27,14,28};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],param2[i],param3[i]) == f_gold(&param0[i].front(),param1[i],param2[i],param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}
