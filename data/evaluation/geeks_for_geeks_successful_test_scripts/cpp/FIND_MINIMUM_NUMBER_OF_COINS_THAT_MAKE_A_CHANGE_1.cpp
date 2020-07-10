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
int f_gold ( int coins [ ], int m, int V ) {
  int table [ V + 1 ];
  table [ 0 ] = 0;
  for ( int i = 1;
  i <= V;
  i ++ ) table [ i ] = INT_MAX;
  for ( int i = 1;
  i <= V;
  i ++ ) {
    for ( int j = 0;
    j < m;
    j ++ ) if ( coins [ j ] <= i ) {
      int sub_res = table [ i - coins [ j ] ];
      if ( sub_res != INT_MAX && sub_res + 1 < table [ i ] ) table [ i ] = sub_res + 1;
    }
  }
  return table [ V ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,7,9,10,10,15,25,27,38,38,51,52,52,56,56,57,61,61,61,65,67,67,68,69,71,71,81,85,87,88,91,97},{42,-36,26,-46,-96,-98,-62,-10,42,22,50,-74,-20},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{87,49,10,12,82,51,34,92,61,4,70,18,13,14,86,40,36,61,66},{-88,-86,-78,-74,-68,-66,-64,-62,-60,-56,-52,-50,-50,-46,-46,-36,-34,-30,-28,-28,-6,-4,0,2,18,24,30,34,36,36,40,46,46,46,48,56,56,60,62,64,68,68,68,82,86,90,92,92},{1,0,0,1,1,0,1,0,0,0,1,1},{8,24,35,70,79},{66,52,10,-78,98,-26,48,66,74,92,30,-60,-92,-30,-82,-96},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{15,56,38,50,36,32,27,90,91,77,74,3,90,47,40,36}};
    vector<int> param1 {25,10,20,16,45,11,2,11,22,13};
    vector<int> param2 {20,11,22,15,27,11,2,13,19,12};
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