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
int f_gold ( int arr [ ], int n, int x ) {
  int i = 0;
  while ( i <= n - 1 ) {
    if ( arr [ i ] == x ) return i;
    i += abs ( arr [ i ] - x );
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {
    {5, 4, 5, 6, 5, 4, 3, 2},
    {5, 4, 5, 6, 5, 4, 3, 2},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {50,51,52,51,50,49,48},
    {-86,-68,-32,-6,6,10,30,34,58,92},
    {1,1,1,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0,0},
    {58},
    {-64,78,58,36,48,80,-80,74,-98,46,-48,24,80,72,90,-46,14,68,38,58,-54,80,44,-62,34,-28,92,84,90,44,-26,88,18,22,-32,54,58,92},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {5}};
    vector<int> param1 {8,8,15,7,6,27,0,24,35,0};
    vector<int> param2 {6,3,1,49,6,22,0,34,1,0};
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