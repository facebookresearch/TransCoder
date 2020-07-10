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
int f_gold ( int arr [ ], int l, int r, int x ) {
  if ( r >= l ) {
    int mid = l + ( r - l ) / 2;
    if ( arr [ mid ] == x ) return mid;
    if ( arr [ mid ] > x ) return f_gold ( arr, l, mid - 1, x );
    return f_gold ( arr, mid + 1, r, x );
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,4,4,8,9,13,13,15,18,27,30,32,42,48,50,52,56,66,69,69,77,84,84,93},{52,-58,-22,-80,44,-52,-34,94,-34,-74,42,60,-62,70,98,32,10,94,26,56,-48,-50,42,2,46,28,-68,-16,-96,-12,66,-46,74,-60,-52,28,-92,-78,32,28,16,34,30,-60,-14},{0,1},{28,84,40,81},{-66,-62,-60,-56,-56,-2,40,44,50,74,82,94},{1,0,0,0,0,1,0,1,0,1,1},{15,26,31,36,36,61,68,72,75,79,82,98},{0,-82,-94,48,48,-96,14,66,76,-30,86,28,-28,-66,-64,92,-94,-66,86,26,8,94,-82,-80,4,-26,76,-46,72,88,-6,8,-30,40,-88,2,-40,-98,-22,-20,4,-12,54,-20,-36,12},{0,0,0,0,0,0,0,1,1,1,1,1,1},{81,47}};
    vector<int> param1 {19,40,1,2,8,7,6,38,12,1};
    vector<int> param2 {12,35,1,2,6,7,7,33,10,1};
    vector<int> param3 {22,44,1,2,8,10,8,39,6,1};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],param2[i],param3[i]) == f_gold(&param0[i].front(),param1[i],param2[i],param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}