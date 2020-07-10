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
  int lioes [ n ];
  int maxLen = 0;
  for ( int i = 0;
  i < n;
  i ++ ) lioes [ i ] = 1;
  for ( int i = 1;
  i < n;
  i ++ ) for ( int j = 0;
  j < i;
  j ++ ) if ( arr [ i ] > arr [ j ] && ( arr [ i ] + arr [ j ] ) % 2 != 0 && lioes [ i ] < lioes [ j ] + 1 ) lioes [ i ] = lioes [ j ] + 1;
  for ( int i = 0;
  i < n;
  i ++ ) if ( maxLen < lioes [ i ] ) maxLen = lioes [ i ];
  return maxLen;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{7,8,9,16,16,27,32,33,35,35,39,39,41,42,44,47,48,50,56,59,66,69,70,73,74,76,78,87,87,89,94,96,96,98,98},{40,76,-54,-92,-28,-96,8,60,28,-38,-62,-40,-16,16,52,28,70,-56,-50,46,68,-16,-56,46,42,70,52,-34,86,-32,-50,64,36,54,20,82,84},{0,0,0,0,1,1,1},{15,19,87,44,15,48,21,85,90,30,88,95,48,92,29,52,46,46,7,23,96,97,43},{-98,-96,-94,-94,-94,-80,-80,-78,-64,-62,-62,-46,-42,-38,-36,-36,-34,-32,-20,-18,-16,-12,-8,-4,-4,-2,-2,2,6,12,34,40,42,44,46,46,50,54,58,58,70,72,72,76,78,86},{0,0,1,1,0,1,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,0,1},{6,7,19,36,44,63,68,72,83},{-64,12,56,50,94,6,0,70,-70,46,-84,-64,4,76,28,94,-8,24,76,64,-62,-34},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{71,57,20,8,90,69,15,62,45,14,65,20,48,9}};
    vector<int> param1 {32,25,4,19,33,13,8,15,21,10};
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