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
int f_gold ( int poly [ ], int n, int x ) {
  int result = poly [ 0 ];
  for ( int i = 1;
  i < n;
  i ++ ) result = result * x + poly [ i ];
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,18,22,27,31,33,36,36,37,37,40,48,49,49,50,58,66,71,75,85,89,91},{42,-88,28,8,30,-8,-16,86,50,84,12,-20,-70,-40,-54,-76,84,90,-40,-68,-40,36,-34,14,94,-44,70,58,-48,-72,14,-70,32},{0,0,0,0,0,0,0,1,1,1,1},{66,72,27,72,71,75,94,49,47,21,21,71,84,61,14,20,5,31,62,12,56,56,12,66,26,68,30,98,20},{-96,-96,-94,-82,-72,-54,-54,-46,-34,-30,-28,-18,-2,2,6,8,10,16,18,24,26,28,44,48,48,52,56,58,58,70,70,82,84,88,94},{0,1,0,1,0,0,0,1,0,1,1,1,0,0,0,0,1,1,0,1,1,0,0,1,0,0,1,1,1,0,1,1,0,0,1},{2,3,8,13,15,17,18,18,25,29,29,31,36,37,42,42,42,51,52,52,54,54,58,64,70,70,74,75,78,80,83,85,86,88,95,96,97,98,99},{-56,-12,-92,-48,-98,-80,-96,-42,-50,74,88,20,78,-74,-20,-32,-30,58,-22,-16,68,72,-50,-72,66,72,74,-98,-22,-40,-90,88,42,24},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{86,62,30,27,98,75,93,37,70,16,20,74,46,74,25,59,86,32,17,90,80,10,17}};
    vector<int> param1 {16,31,10,15,25,20,19,29,20,12};
    vector<int> param2 {16,20,8,26,34,25,32,23,23,12};
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