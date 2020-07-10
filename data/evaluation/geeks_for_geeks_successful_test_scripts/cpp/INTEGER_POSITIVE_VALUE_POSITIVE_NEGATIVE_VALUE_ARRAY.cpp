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
  unordered_map < int, int > hash;
  int maximum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( arr [ i ] < 0 ) hash [ abs ( arr [ i ] ) ] -= 1;
    else hash [ arr [ i ] ] += 1;
  }
  for ( int i = 0;
  i < n;
  i ++ ) if ( hash [ arr [ i ] ] != 0 ) return arr [ i ];
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,7,10,14,15,24,27,32,33,38,39,40,42,42,47,58,75,76,78,79,83,85,89,96},{-36,14,-76,-70,52,18,64},{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},{35,50,36,50,82,54,10,45,13,22,1,41,13,11,4,43,50,27,94,57},{-88,-86,-84,-80,-80,-74,-72,-48,-46,-46,-44,-34,-32,-24,-22,-14,4,4,8,8,10,12,20,20,24,24,24,28,32,34,36,44,46,54,54,60,62,62,62,70,70,80,88,88,90},{0,0},{1,1,3,6,6,8,12,13,17,27,28,31,40,40,42,43,53,55,58,60,60,61,65,66,72,72,75,80,84,89,96,97,99},{52,-38,-82,30,-66,42,54,-96,-46,-30,18,-50,96,90,4,74,-22,8,34,74,-46,8,-32,88,-96,26,-80,50,92,-80,44,36},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{38,20,54,51,11,61,90,28,23,55,65,87,99,70,74,3,68,23,74,53,80,7,57,24,66,8,15,63,18,67,96,31,63,50}};
    vector<int> param1 {18,5,17,15,27,1,31,24,16,30};
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