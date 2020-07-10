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
int f_gold ( int p [ ], int i, int j ) {
  if ( i == j ) return 0;
  int k;
  int min = INT_MAX;
  int count;
  for ( k = i;
  k < j;
  k ++ ) {
    count = f_gold ( p, i, k ) + f_gold ( p, k + 1, j ) + p [ i - 1 ] * p [ k ] * p [ j ];
    if ( count < min ) min = count;
  }
  return min;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,12,16,30,31,31,33,34,45,48,57,63,81,83},{30,-78,42,-6,42,56,-38,28,-96,-96,84,-18,0,20,-56,-40,-58,-74,64,62,-22,78,10,-22,16,-48,2,14,82,-92,-64,-18,42,24,22,-50,12,-76,38,-30,-86,-58,-6,-4,10,28},{0,0,0,0,0,0,1,1,1,1,1,1,1},{54,46},{-80,-76,-68,-66,-54,-12,-10,-6,6,8,20,20,22,60,66,78,78,82,98},{0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,1,1,1,0,1,0},{14,21,29,31,37,50,51,54,57,62,64,72,85,98},{-86,98,90,-20,90,68,70,-24,-10,-80,70,-42,14,56,-26,-42,2,-62,24,10,-46,-66,-82,-98,-84,-2,-52,-50,0,-18,90,-32,98,86},{0,0,1,1,1,1},{52,15,61,73,45,5,15,54,69,90,5,56,13,54,27,72,58,21,35,2,59,55,64,92,54,63,50,95,38,53,38,53,73,27,86,86,99,42,85,80,43,32,80,57,78}};
    vector<int> param1 {10,30,7,1,13,20,7,23,5,26};
    vector<int> param2 {9,27,7,1,10,17,11,26,4,42};
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