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
int f_gold ( int arr [ ], int n, int k ) {
  int max = * max_element ( arr, arr + n );
  int res = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( ( max - arr [ i ] ) % k != 0 ) return - 1;
    else res += ( max - arr [ i ] ) / k;
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
   vector<vector<int>> param0 {{4, 7, 19, 16},{4,4,4,4,4},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{85,36,52,8,52,15,16},{-10,-5,-5,-20,10,30},{0,1,0,0,1,1,1,0,0,0,0,1,1,0,0,1,0},{1,5,5,9,11,12,12,13,13,14,16,18,26,26,28,28,30,31,32,37,37,38,40,43,44,45,47,47,55,58,60,62,63,64,69,78,83,84,92,96,96,99},{76,-78,92,-98,16,44,86,96,-8,2,-96,74,-28,12,54,-40,-64,-12,4,48,68,-82,8,0,-4,88,48,-54,90,62,-84,76,-48,62,-80,-94,38,-4,36},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{62,99,29,23,55,30,79,63,1,88,59,8,11,80,23,51,97,32,80,48,84,36,73,59,1,34,92,10}};
    vector<int> param1 {4,5,39,5,6,10,26,34,39,18};
    vector<int> param2 {3,3,1,6,5,15,33,3,10,1};
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
