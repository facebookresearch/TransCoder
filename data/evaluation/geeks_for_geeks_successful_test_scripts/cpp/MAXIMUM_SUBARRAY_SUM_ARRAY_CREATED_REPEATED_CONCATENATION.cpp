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
int f_gold ( int a [ ], int n, int k ) {
  int max_so_far = INT_MIN, max_ending_here = 0;
  for ( int i = 0;
  i < n * k;
  i ++ ) {
    max_ending_here = max_ending_here + a [ i % n ];
    if ( max_so_far < max_ending_here ) max_so_far = max_ending_here;
    if ( max_ending_here < 0 ) max_ending_here = 0;
  }
  return max_so_far;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,6,12,20,23,28,33,37,47,51,53,56,63,65,65,68,69,76,76,78,83},{68,10,52,-44,34,-4,-34,2,50,-60,50,94,-98,-98,-44,-36,-4,-62,-2,-92,-70,-48,-78,-10,94},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{71,59,21,82,73,29,30,25,21,10,85,22,60,43,49,20,34,39,69,6,44,27,50,33,57,29,65,18,68,56,50,28},{-84,-74,-74,-56,-54,-48,-48,-46,-42,-34,-32,-30,-18,-16,-16,6,12,20,24,26,30,32,34,42,42,42,44,46,46,50,50,62,72,78,90},{0,1,1,1,1,1,1,1,1,0,1,1,0,0,1,1,0,1,1,1,0,1,1,0,0,0,1,1,1,0},{3,7,11,11,26,60,68,71,77,91,95},{28,48,-86,-52,6,4,30,18,-32,60,-2,16,-88,-36},{1},{76}};
    vector<int> param1 {18,22,34,23,17,16,8,8,0,0};
    vector<int> param2 {20,22,29,30,23,25,10,11,0,0};
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