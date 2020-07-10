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
  return accumulate ( arr, arr + n, 0 ) - ( ( n - 1 ) * n / 2 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,8,27,34,39,42,43,54,72},{-38,-66,-38,-48,-96,74,-32,-62,-34,-32,-88,-12,-8,-4},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},{88,86,23,81,76,16,94,64,59,50,71,62,10,89,73,64,65,96,83,40,99,40,77,33,14,62,6,89,74,96,93,29,15,93,9,58,98,76,23,23,70,99},{-96,-94,-82,-64,-56,-40,-36,-34,-32,-24,-24,-22,-20,-20,-20,-18,-18,-12,-10,-6,16,20,20,22,26,30,36,46,46,50,50,52,64,64,64,68,72,74,76,92,96,98},{0,1,1,1,1,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1},{2,6,7,13,19,23,37,39,42,42,43,45,52,53,55,56,59,63,66,71,76,85,86,89,92,94,96,99},{52,-56,-12,78,6,32,0,36,34,-54,-74,-32},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{10,42,50,5,74,81,30,76,6,34,86,4,77,71,96,22,34,50,35,16,60,11,21,38}};
    vector<int> param1 {5,9,8,31,28,25,27,11,15,13};
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