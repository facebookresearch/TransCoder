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
int f_gold ( int a [ ], int n ) {
  if ( n == 1 ) return a [ 0 ];
  int max_neg = INT_MIN;
  int min_pos = INT_MAX;
  int count_neg = 0, count_zero = 0;
  int prod = 1;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( a [ i ] == 0 ) {
      count_zero ++;
      continue;
    }
    if ( a [ i ] < 0 ) {
      count_neg ++;
      max_neg = max ( max_neg, a [ i ] );
    }
    if ( a [ i ] > 0 ) min_pos = min ( min_pos, a [ i ] );
    prod = prod * a [ i ];
  }
  if ( count_zero == n || ( count_neg == 0 && count_zero > 0 ) ) return 0;
  if ( count_neg == 0 ) return min_pos;
  if ( ! ( count_neg & 1 ) && count_neg != 0 ) {
    prod = prod / max_neg;
  }
  return prod;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,6,7,8,8,9,12,12,12,13,15,15,15,16,18,18,18,19,20,21,22,22,23,28,29,30,30,33,33,35,35,36,40,43,58,63,73,78,82,83,84,87,89,89,92,94},{18,-6,-8,98,66,-86,24,6,58,74,82},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{97,79,93,41,76,34,94,57,63,98,52,62,96,7,63,44,55,43,36,66,35,14,24,40,26,16,67,19,31,86,64,93,85,86,66,24,73,86,45,99,25,98,38,57},{-58,-48,-46,-36,0,18},{1,1,1,0,0,0,1,0,1,0,0,1,1,0,1,0,0,0,0,0,1,0,0,1,1,0,1,1,0,0,1,0,1,0,0,1,0},{1,3,5,15,18,19,21,23,29,29,33,33,34,37,39,43,43,68,73,74,75,84,87,88,89,90,93},{74,70,-36,16,10,60,-82,96,-30,58,56,-54,-14,94,10,-82,-80,-40,-72,-68,8,38,-50,-76,34,2,-66,-30,26},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},{74,74,8,74,85,41,31,3,84,46,73,39,64,72,28,83,98,27,64,7,95,37,10,38,77,32,69,72,62,96,5,81,34,96,80,25,38}};
    vector<int> param1 {23,10,25,30,3,36,18,15,20,33};
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