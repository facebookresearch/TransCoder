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
  int count = 0, max_count = 0, min_count = n;
  for ( int i = 0;
  i < ( n - 1 );
  i ++ ) {
    if ( arr [ i ] == arr [ i + 1 ] ) {
      count += 1;
      continue;
    }
    else {
      max_count = max ( max_count, count );
      min_count = min ( min_count, count );
      count = 0;
    }
  }
  return ( max_count - min_count );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,15,19,22,28,29,39,46,46,49,51,55,62,69,72,72,72,74,79,92,92,93,95,96},{-26,-54,92,76,-92,-14,-24,-70,-78,-50,-48,-22,12,2,-34,-60,4,-32,-10,52,-92,-74,18,34,6,-66,42,-10,-6,56,92},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{59,35,13,79,61,97,92,48,98,38,65,54,31,49,81,22,96,29,65,48,92,66,25,21,26,1,32,73,46,5,40,17,53,93,83,29},{-70,-34,-32,-30,-14,80,86,90},{0,1,0,1,1,0,0,0,1,1,1,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0},{9},{94,10,70,42},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{64,76,49,55,92,15,4,8,95,60,90,3,7,79,84,17,96,10,80,26,22,15}};
    vector<int> param1 {15,30,24,29,4,23,0,2,24,20};
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