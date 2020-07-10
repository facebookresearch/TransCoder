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
  int ans = 0;
  for ( int i = 0;
  i < n;
  i ++ ) for ( int j = i + 1;
  j < n;
  j ++ ) if ( arr [ i ] == arr [ j ] ) ans ++;
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,6,9,16,16,21,36,41,58,60,62,73,77,81,95},{-86,-72,-26,-34,18,-62,-66},{1},{16},{-88,-80,-72,-68,-64,-26,4,14,16,22,30,32,60,74,82},{0,0,1,1,1,0,1,0,0,0,1},{3,9,10,12,17,23,27,29,42,44,59,61,71,76,78,82,84,84,89,90,93,93,97,97},{68,-40,-46,-20,-64,90},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{99,17,94,43,97,17,11,58,75,94,37,22,54,31,41,4,55,69,92,80,45,97,16,33,36,17,43,82,81,64,22,65,85,44,47,14}};
    vector<int> param1 {12,3,0,0,11,9,15,5,15,23};
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