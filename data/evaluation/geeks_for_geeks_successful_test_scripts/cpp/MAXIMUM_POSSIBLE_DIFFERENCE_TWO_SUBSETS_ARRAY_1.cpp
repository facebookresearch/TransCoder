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
  int result = 0;
  sort ( arr, arr + n );
  for ( int i = 0;
  i < n - 1;
  i ++ ) {
    if ( arr [ i ] != arr [ i + 1 ] ) result += abs ( arr [ i ] );
    else i ++;
  }
  if ( arr [ n - 2 ] != arr [ n - 1 ] ) result += abs ( arr [ n - 1 ] );
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{19,20,22,23,25,28,33,33,35,35,36,44,44,52,54,54,56,57,57,63,78,78,79,81,89,93,93,93,93,93,93,97},{-20,96,-32,-8,4,14,-26,-58,-68,-68,42,-12,-28,-68,-72,88,-94,-84,20,-58,-50,-78,-4,-22,-54,90,78,2,40,-78,98,52,-48,40,12,6,54,28,-96,-88,98,-34,-66,42,-18,4,-20,-34},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},{21,50,15,2,59,79,52,55,78,55,73,9,1,58,48,13,71,1},{-98,-74,-68,-60,-58,-56,-42,-36,-36,-34,-30,-28,-18,-16,-16,-10,-8,-6,-4,0,2,2,10,16,18,30,34,34,36,38,42,46,60,60,62,76,78,88,96},{1},{6,6,6,9,10,11,14,19,19,21,23,23,24,29,30,43,45,46,55,55,63,69,71,78,80,81,85,86,87,97,98},{86,-14,-64,88,28,40,30,92,-2,-52,-14,-96,-30,-54,-88,-8,-48,32,-60,-68,-62,52,52,-28,58,82,68,30,-24,52,74,-20,-62,-98,26,58,-30,76,48,-14,88,58,-40,-20,-50,-70,-92,-84},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{36,12,61,15,31,7,76,79,27,60,81,2,3,83,96,29,23,30,78,86,86,25,89,96,67,38,24,58,80,13,51,30,45,65,85,48,51,44,16,87,17,28,66,97,16}};
    vector<int> param1 {23,47,13,16,37,0,19,32,29,36};
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