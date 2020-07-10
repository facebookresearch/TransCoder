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
  sort ( arr, arr + n );
  int diff = INT_MAX;
  for ( int i = 0;
  i < n - 1;
  i ++ ) if ( arr [ i + 1 ] - arr [ i ] < diff ) diff = arr [ i + 1 ] - arr [ i ];
  return diff;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,25,44,46,54,60,81},{82,68,-98,-66,-36,-42,98,-38,58,-6,-28,70,-24,18,16,10,92,44,28,-96,-72,24,28,-80,-4,38,88,76},{1,1,1},{87,25,80,45,44,20,48,47,51,54,68,47,89,95,15,29,5,45,2,64,53,96,94,22,23,43,61,75,74,50},{-74,-48,-42,-26,-16,-12,0,4,8,18,46,46,62,70,74,88,92,96,98},{0,1,1,1,0,1,1,0,0,1,1,1,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,0,0},{27,42,59,80},{-96,-94,10,-36,18,-40},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{96}};
    vector<int> param1 {3,22,2,15,18,36,2,4,12,0};
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