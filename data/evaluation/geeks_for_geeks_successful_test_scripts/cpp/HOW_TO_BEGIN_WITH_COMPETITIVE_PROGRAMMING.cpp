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
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( arr [ i ] == x ) return i;
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,15,15,15,16,17,23,23,33,33,40,43,55,56,63,66,69,76,79,88,99},{78,-64,-20,12,96,54,16,50,-20,96,-22,-84,54,-66,-16,-78,-78,90,-46,-70,-72,12,96,-86,42,-80,8,-2,70,4,70},{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},{73,60,4,59,75,39,39,30,66,11,90,80,46,59,52,14,63,70,75,73,65,88,45,64,66,91,67,25,60,74,33,23,94,76,60,78,72},{-92,-88,-68,-64,-62,-56,-50,-48,-48,-38,-18,-16,-14,-8,-8,2,4,10,10,10,36,38,46,50,52,62,72,74,80,84,86,90,92,94,96},{1,0,0,1,1,0,0,0,1,1,1,0,0,1,0,1,1,0,1,0,1,0,1,0,1,1,0,0,0,0,1,0,0,1,1,0,1,0,0},{7,8,8,10,13,18,18,19,20,25,32,33,34,38,44,44,46,46,46,47,48,50,53,56,56,57,57,57,57,59,60,61,63,63,64,70,71,74,74,81,82,83,84,90,92,93},{-82,74,-94,68,-10,-8,-46,-4,50,-60,-70,-74,-18,50,62,-76,-50,-58,-36,-16,-36,78,12,56,-14,-48,40,22,0,16,72,-78,46,8,-50,-78,28,20,-56},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{88,89,66,28,75,81,29,26,21,39,58,94,48,85}};
    vector<int> param1 {20,17,12,20,33,33,41,26,16,9};
    vector<int> param2 {15,29,17,28,20,26,44,31,18,10};
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