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
bool f_gold ( int degree [ ], int n ) {
  int deg_sum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) deg_sum += degree [ i ];
  return ( 2 * ( n - 1 ) == deg_sum );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {
    {2, 3, 1, 1, 1},
    {2, 2, 1, 1, 2},
    {2, 2, 1, 1, 1},
    {0,0,0,3,3,4},
    {-10, 12, 2},
    {1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,1,0,1,0,0},
    {1,6,10,13,15,17,18,23,26,28,30,32,32,33,36,39,39,41,43,50,50,51,53,54,59,59,63,63,63,66,66,71,71,74,78,89,89,93},
    {66,-96,-14,74,-20},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {97,73,87,45,64,30,53,50,62,42,28,58,31,90}};
    vector<int> param1 {5,5,5,6,3,19,30,4,31,10};
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