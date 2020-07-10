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
  int i, j, max = 0;
  int msis [ n ];
  for ( i = 0;
  i < n;
  i ++ ) msis [ i ] = arr [ i ];
  for ( i = 1;
  i < n;
  i ++ ) for ( j = 0;
  j < i;
  j ++ ) if ( arr [ i ] > arr [ j ] && msis [ i ] < msis [ j ] + arr [ i ] ) msis [ i ] = msis [ j ] + arr [ i ];
  for ( i = 0;
  i < n;
  i ++ ) if ( max < msis [ i ] ) max = msis [ i ];
  return max;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,5,7,12,23,31,31,45,47,60,67,70,84,85,91,96},{-88,-38,-50,-14,36,-32,0,-8,-12,-62,-46,66,-46,-26,6,-44,14,-74,-84,52,-28},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{85,42,7,35,35,21,97,59,88,50,12,44,85,22,38,23,42,61,44,63,23,69,28,17,73,20,71,80,15,42,28,10,56,77,43},{-92,-82,-82,-74,-72,-68,-68,-66,-60,-54,-42,-38,-36,-32,-30,-16,-14,-12,-10,14,24,28,34,34,38,42,44,52,70,72,80,84,86,94},{0,1,1,1,1,1,0,1,1,0,1,0,0,0},{33},{76,86,46,-70,92,6,70,-66,64,46,86,-42,-46,-24,8,76,4,-96,-86,18,70,-72,-56,-88,-96,62,22,20,42},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{25,46,41,61,93,29,65,24,10,89,22,51,18,65,70,59,87,82,97,99,15,64,20,97,12,23,76}};
    vector<int> param1 {11,18,39,26,32,8,0,21,24,20};
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