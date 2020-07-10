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
  int f_gold [ n ];
  f_gold [ 0 ] = 1;
  for ( int i = 1;
  i < n;
  i ++ ) {
    f_gold [ i ] = 1;
    for ( int j = 0;
    j < i;
    j ++ ) if ( arr [ i ] > arr [ j ] && f_gold [ i ] < f_gold [ j ] + 1 ) f_gold [ i ] = f_gold [ j ] + 1;
  }
  return * max_element ( f_gold, f_gold + n );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{14,17,27,28,36,38,40,49,51,57,58,61,62,71,91,94,99},{-48,54,98,68,24,-46,4,-28,-34,40},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{94,74,27,59,3,71,67,91,91,87,1,79,42,33,85,37,76,86,80,84,62,8,31,54,17,48,4,12,88,63,12,51,36,20,73,48,41,88,21,98,57,3,54},{-96,-94,-90,-88,-86,-82,-76,-74,-68,-54,-54,-50,-50,-46,-46,-40,-36,-34,-34,-32,-30,-26,-26,-20,-16,-6,-4,2,10,14,22,26,26,28,28,30,30,36,54,64,68,74,78,80,84,90,92,94},{0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,1,0,1,1,0,1,0,1,1,0,0,0,0,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,0,1,0,0},{6,12,18,34,37,37,37,40,45,60,64,66,73,78,79,80,92},{64,-18,-22,96,-92,6,-46,-54,76,0,46,74,-8,22,-46,-44,-94,-88,-52,-54,2,98,-22,46,26,2,-64,-84,20,22,12,-32,-16,-96,46,-4,-8,46,-64,-58,58,92,0,-26,-58,82},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{57,34,3,67,21,69,31,49,7,70,27,53,94,23,74,24,44,53,78,46,6,29,5,41,38,22,40,38,40,59,9}};
    vector<int> param1 {14,8,17,24,36,34,11,24,33,16};
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