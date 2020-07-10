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
int f_gold ( int arr [ ], int n, int key ) {
  int i;
  for ( i = 0;
  i < n;
  i ++ ) if ( arr [ i ] == key ) return i;
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,8,11,23,55,57,73,74,77,79,93},{-88,12,-62,-66,-24,18,12,22,94,30,-50,-42,-94,18,76,-6,-48,-68,48,36,-78,52,-82,76,2,-44,-10,88},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},{33,9,93,70,81,70,56,66,72,81,74,32,71,72,3,81,70,22,82,2,75,18,90,29,48},{-98,-70,-62,-60,-60,-54,-48,-48,-46,-44,-34,-26,-18,-6,4,18,28,32,34,40,50,54,56,62,64,64,98},{1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,0,1},{4,6,7,10,10,12,13,18,23,29,29,34,46,54,60,61,63,67,69,70,72,76,79,79,81,82,88,90,99},{94,34,-60,-74,86,80,68,-48,78,-62,-98,-44,-44,92,-94,-86,-36,12,84,-90,52,42,-42,-66,88,76,66},{0,0,0,1},{76,59,38,83,38,93,27,11,17,80,26,28,35,53,88,10,9,75}};
    vector<int> param1 {8,27,11,24,18,17,15,21,2,12};
    vector<int> param2 {11,12,0,72,23,16,28,16,3,13};
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
