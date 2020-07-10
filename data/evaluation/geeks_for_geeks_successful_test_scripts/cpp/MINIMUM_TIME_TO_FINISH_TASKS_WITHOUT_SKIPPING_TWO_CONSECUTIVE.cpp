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
int f_gold ( int arr [ ], int n ) {
  if ( n <= 0 ) return 0;
  int incl = arr [ 0 ];
  int excl = 0;
  for ( int i = 1;
  i < n;
  i ++ ) {
    int incl_new = arr [ i ] + min ( excl, incl );
    int excl_new = incl;
    incl = incl_new;
    excl = excl_new;
  }
  return min ( incl, excl );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,17,25,27,29,30,34,49,72,75,90,93,93,94},{-70,-32,62,0,-10,92,-94,-86,52,6,-26,-92,-10,70,-82,28,86,58,86,-58,84,-80,-18,-92,-34,6,34,36,70,-50,-6,-54,84,22,30,-96,-84,72,2,26,-20,4,48,-98,62,-28,-68},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{34,40,92,35,29,26,12,66,7,28,86,4,35,79,1,48,41,47,15,75,45,6,3,94,39,50,20,8,58,51,83,44,53,76,19,84,68,54,36,53},{-98,-98,-92,-92,-88,-82,-74,-70,-68,-68,-64,-60,-52,-52,-42,-42,-38,-36,-36,-34,-26,-24,-22,-12,-2,-2,4,6,44,44,48,54,62,62,64,74,78,82,86,86,90,90,94},{1,1,0,0,1,0,0,1,1,1},{9,15,19,29,30,39,40,61},{92,0,46,70,-60,-50,58,-56,8,-90,84,16,40,-62,50,78,26,-42,-40,98,-52,62,16,-62,-76,-70,-60,32,4,-68,52,-64,70,12,-10},{0,0,0,1,1,1,1},{32,96,63,93,53,1,22,19,50,74,6,94,81,85,4,86,88,75,94}};
    vector<int> param1 {8,36,21,29,36,5,4,21,5,18};
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