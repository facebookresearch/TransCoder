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
int f_gold ( int a [ ], int n ) {
  int result = 1;
  for ( int i = 1;
  i <= n;
  ++ i ) {
    long long y = ( i * ( i + 1 ) ) / 2;
    if ( y < n ) result = i;
    else break;
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{8,10,11,14,14,17,20,20,22,22,22,23,25,30,33,39,39,41,43,45,46,46,46,50,51,53,57,59,60,64,64,66,72,72,75,77,85,85,87,88,90,91,93,94,94,95},{-44,-90,20,4,-56,-50,-80,74,-82,20,62,-26,-10,-14,-76,82,-88,92,30,44,-62,-86,-20,-96,-60,-88,-78,-40,-48,-92,62,58,94,68,68,44,80,4,48,-92,30,-76,-46,-20,4},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{8,34,48,10,5,12,80,7,67,1,79,59,63,13,16,23,62,56,99,89,7,80},{-88,-46,-40,-40,38},{1,0,0,1,0,1,1,0,1,0,0,0,0,1,1,0,0,1,0,1,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1},{8,15,35,39,49,81,86,91},{-24,56,-74,-76,-80,86,90,0,-26,18,72,78,-66,-28,22,22,72,78,-50,-12,20,12,-68,-2,-58,-44,28,-58,90,-28,32,-70,-48,-66,-94,-50,18,-12,80,12,82,56,-64,10,-22},{0,0},{62,93,69,40,26,2,29,83,66,68,67,73,12,65,89,57,38,99,42,27,38,24,43,4,4,54,72,47,52,46,53,24,3,41,64,33,88,3,1,7,17,31,20,33,69,21,9,24,59}};
    vector<int> param1 {38,36,28,12,3,44,7,36,1,26};
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