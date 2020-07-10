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
bool f_gold ( int arr [ ], int N ) {
  if ( N < 3 ) return false;
  sort ( arr, arr + N );
  for ( int i = 0;
  i < N - 2;
  i ++ ) if ( arr [ i ] + arr [ i + 1 ] > arr [ i + 2 ] ) return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,6,8,10,14,15,16,19,21,26,26,26,28,29,30,33,33,35,36,36,41,44,45,45,45,49,51,54,57,59,61,64,68,70,70,72,73,74,76,78,87,89,89,91,92,93,94,95,97},{50,-58,-44,90,18,-26,-74,-46,96,32,72,46,-90,86,-10,82,-72,86,-64,-96,-12,-14,-36,16,38,56,54,10,74,-86,-64,-56,30,-50,46,4,88,-94,-4,-78,22,-78},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{80,24,41,90,24,95},{-90,-88,-84,-82,-82,-80,-70,-66,-62,-60,-60,-48,-46,-44,-42,-20,-16,-4,18,26,28,32,36,46,60,62,68,72,78,98},{0,0,0,1,0,0,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1,1,0,0,1,0,0,0,1,0,1,1,1,0,0},{3,9,14,16,16,26,30,31,32,37,42,42,43,49,51,56,64,69,76,77,77,79,85,88,89,91,94,95},{-60,-90,-30,-42,80,-66,94,60,-68,-74,-50,42,-38,-34,-84,-58,30,98,-52,6,-60,-60},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},{24,80,16,31,5,31,66,1,13,77,88,40,34,15,90,46,8,26,39,52,22,33,3,30,49,51,69,50,39,59}};
    vector<int> param1 {25,23,10,4,21,25,19,11,18,23};
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