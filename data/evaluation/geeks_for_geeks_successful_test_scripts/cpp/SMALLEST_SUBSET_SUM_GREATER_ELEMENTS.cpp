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
  int halfSum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) halfSum = halfSum + arr [ i ];
  halfSum = halfSum / 2;
  sort ( arr, arr + n, greater < int > ( ) );
  int res = 0, curr_sum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    curr_sum += arr [ i ];
    res ++;
    if ( curr_sum > halfSum ) return res;
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{48,82},{-28,66,78,70,-24,-20,-76,-42,42,-42,92,50,-26,58,80,32,24,-42,36,96,98,48,96,76,88},{0,0,0,1,1},{55,17,45,65,56,70,52,61,94,61,35},{-54},{1,0,1,0,1,0,0,0,0,1,0,0,0},{8,10,11,13,17,18,21,24,26,32,36,41,46,51,56,58,60,82,90,95,97},{46,-90,12,18,-72,-10,50,2,16,90,42,-22,70,14,-42,50,-74,-12,-20,-14,78,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{75,45,8,98,26,21,52,50,24,96,82,26,41,51,16,41,52,57,84,51,59,79,68,40,16,76,35,26,73,80,59,79,84,3,5,40,55,77,48,93,71,53,72,27,73,96,36,36,39}};
    vector<int> param1 {1,16,4,9,0,12,13,18,19,34};
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