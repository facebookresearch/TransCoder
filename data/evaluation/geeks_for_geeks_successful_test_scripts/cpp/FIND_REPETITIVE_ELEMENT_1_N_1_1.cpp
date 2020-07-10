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
  unordered_set < int > s;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( s . find ( arr [ i ] ) != s . end ( ) ) return arr [ i ];
    s . insert ( arr [ i ] );
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{9,10,14,17,30,37,39,42,49,56,68,74,85,85,92},{62,-18,78,-32,38,90},{0,0,0,0,1,1,1,1,1,1},{56,1,96,81,49,18,39,87,97},{-98,-94,-80,-76,-60,-56,-56,-54,-48,-28,-14,-10,26,30,40,58,64,74,78,82,86,92,96,98},{1,1,1,0,1,1,0,1,0,1,0,0,1,0,0,0,0,1,0,1,1,1,0},{5,7,19,20,22,29,33,35,35,36,37,40,44,49,50,53,60,60,61,62,68,68,69,72,72,81,81,83,85,85,90,91,92,97,98},{14},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{29,29,14,91,42,70,79,75,9,86,48,47,37,48,69,81,49,37,33,23,42,45,10,33,47,39,96,45,94,48,44,4,6,73,91}};
    vector<int> param1 {10,4,7,5,16,11,26,0,18,33};
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