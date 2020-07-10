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
  unordered_set < int > S;
  for ( int i = 0;
  i < n;
  i ++ ) S . insert ( arr [ i ] );
  int ans = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( S . find ( arr [ i ] - 1 ) == S . end ( ) ) {
      int j = arr [ i ];
      while ( S . find ( j ) != S . end ( ) ) j ++;
      ans = max ( ans, j - arr [ i ] );
    }
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,5,9,24,28,31,49,54,67,85,86,94,97,97},{-34,16,-80,-10,80,2,50,-74,-76,36,-84,-24,74,-54,-22,46,80,58,-8,70,24,-88,52,62,30,42,48,16,78,-82,64,-36,84,-72},{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{49,61,68,4,90,89,71,74,45,61,35,41,59},{-42,-8,28,56,80,96},{1,0,1,0,0,0,0,1,1,0,1,1,0,1,0,1,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,1,1},{3,4,6,6,13,27,27,29,32,36,46,50,52,65,69,70,71,83,87,91},{64,-76,28,6,56,18,32,-50,-20,18,-26,-90,32,50,-18,98,84,40,50,88,-70,-6,-24,-44,-96,-58,48,-78,-14},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{50,48,61,87,7,78,93,44,16,88,98,15,73,93,43,46,42,34,1,35,79,35,84,60,18,79,17,4,78,1,20,64}};
    vector<int> param1 {11,29,13,11,4,17,10,15,15,25};
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