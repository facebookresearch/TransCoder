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
  int count = 0;
  int cummulative_sum = 0;
  sort ( arr, arr + n );
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( arr [ i ] >= cummulative_sum ) {
      count ++;
      cummulative_sum += arr [ i ];
    }
  }
  return count;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{7,33,34,42,42,45,73},{32,-10,-64,-20,92,-66,6,44,-62,-98,4,-48,44,42,12,-90,52,86,-30,-80,64,94,14},{0,0,0,0,1},{11,85,89,71,82,44},{-96,-92,-78,-72,-68,-58,-52,-50,-50,-48,-42,-32,-20,-18,-4,0,0,2,18,18,20,24,32,34,36,38,38,60,66,68,70,72,72,74,76,96,98},{0,0,1,1,0,0,1,1,1,1,0,0,1,1,1,1,0,1,0,0,1},{8,9,10,11,12,15,17,19,20,21,24,30,33,35,36,39,41,41,42,54,62,63,68,70,71,72,77,85,86,86,94,95,97,97},{96,22,-60,4,-94,-16,46,10,76,-90,4,70,-72,60,28,-24,-66,92,-70,72,36},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{90,63,16,40,28,97,20,63,42,31,57,84,10,12,59,69,47,7,53,67}};
    vector<int> param1 {5,16,2,3,21,16,31,20,13,10};
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