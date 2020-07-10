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
int f_gold ( int arr [ ], int n, int m ) {
  int max = 0, min = 0;
  sort ( arr, arr + n );
  for ( int i = 0, j = n - 1;
  i < m;
  i ++, j -- ) {
    min += arr [ i ];
    max += arr [ j ];
  }
  return ( max - min );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,3,6,16,21,22,23,27,27,28,29,29,31,31,37,37,38,40,41,43,51,52,53,55,55,56,57,63,67,67,67,72,75,79,82,84,91,92,93,96,96,97},{58,-62,24,-10,-30,-92,-50,-32,54,-18,94,-14,-40,-16,48},{0,0},{7,51,6,71,10,29,49,63,77,13,13,56,65,34,76,16,84,2,89,83,65,1,5,99,11,59,71,54,17,9,11,48,2,65,62,77,29,80,97,83,44,91,4,44,21,12,24},{-90,-58,6,16,20,34,36,38,48,66,82,84,86,90,90},{0,0,1,1,0},{7,12,15,15,21,37,40,45,50,52,53,68,68,72,75,78,86,86,88},{22,-20,94,-88,72,44},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{32,63,87,26,77,4,87,60,21,25,30,65,38,96,11,75}};
    vector<int> param1 {21,8,1,31,14,3,16,4,25,12};
    vector<int> param2 {25,12,1,34,8,2,18,3,17,15};
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