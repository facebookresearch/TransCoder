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
int f_gold ( int price [ ], int n ) {
  int * profit = new int [ n ];
  for ( int i = 0;
  i < n;
  i ++ ) profit [ i ] = 0;
  int max_price = price [ n - 1 ];
  for ( int i = n - 2;
  i >= 0;
  i -- ) {
    if ( price [ i ] > max_price ) max_price = price [ i ];
    profit [ i ] = max ( profit [ i + 1 ], max_price - price [ i ] );
  }
  int min_price = price [ 0 ];
  for ( int i = 1;
  i < n;
  i ++ ) {
    if ( price [ i ] < min_price ) min_price = price [ i ];
    profit [ i ] = max ( profit [ i - 1 ], profit [ i ] + ( price [ i ] - min_price ) );
  }
  int result = profit [ n - 1 ];
  delete [ ] profit;
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{9,10,10,12,17,18,23,32,41,44,47,50,59,69,69,75,82,84,87,89,97,99},{6,6,60,40,32,-70,-92,88,10,-8,-54,4,16,8,-44,80,-70,36,36,-74,-94,18,-64,-66,-46,0,-54,-84,16,-88,-34,-24,92,84,62},{0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{2,67,50,8,20,42,37,69,86,74,85,96,78,89,91},{-68,-52,-14,-2,18,22,30,34,64,64,70},{1,1,0,0,0,1,0,0,1,1,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,1,0,1},{4,17,19,28,29,30,30,30,35,36,36,38,40,40,42,43,45,51,55,57,58,59,64,65,66,82,84,85,87,91,92,94,98,98},{52,88,-40,60,30,8,-96,66,-96,-28,-56,-14,76,-92,56,58,64,-60,-90,26,64,-2,54,-24,54,-46,-44},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{82,14,51,12,5,15,50,88,91,82,16,98,23,58,86,91,30,81,7,73,67,47,10,50,43,31,19,2,22}};
    vector<int> param1 {20,34,13,8,9,21,25,14,22,18};
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