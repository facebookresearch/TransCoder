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
  for ( int i = 0;
  i < n;
  i ++ ) {
    int j;
    for ( j = 0;
    j < n;
    j ++ ) if ( i != j && arr [ i ] == arr [ j ] ) break;
    if ( j == n ) return arr [ i ];
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,2,3,4,6,6,7,9,10,13,16,23,30,32,36,42,42,43,44,47,48,48,49,52,52,53,55,56,58,59,60,60,63,67,68,68,74,75,76,80,81,81,83,83,86,87,91,92,97},{-96,-46,-86,56,-72,50,18,8,50},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},{19,10,49,40,34,21,63,51},{-96,-96,-90,-88,-88,-84,-80,-76,-68,-64,-64,-52,-52,-52,-52,-50,-50,-48,-48,-40,-32,-26,-24,-22,-20,-14,-12,0,6,8,10,20,24,28,34,36,54,60,60,60,68,74,74,74,84,88,94},{1,0,0,1,0,1,1,1,1,0,0,1,0,0,1,0,0,1,0,1,1,0,0,0,1,1,0,1,0,0,0},{1,2,3,10,15,21,28,36,41,44,45,47,72,77,77,79,85},{42,-84,42,36,-10,24,-62,60},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{2,21,42,92,65,62,75,43,81,17,92,86,37,63,27,97,24,61,85,49,84,7,14,19,60,55,68,79,8,12,75,12,92,79,42}};
    vector<int> param1 {47,8,14,5,27,19,15,7,35,27};
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