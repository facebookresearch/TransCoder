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
  sort ( arr, arr + n, greater < int > ( ) );
  int dimension [ 2 ] = {
    0, 0 };
    for ( int i = 0, j = 0;
    i < n - 1 && j < 2;
    i ++ ) if ( arr [ i ] == arr [ i + 1 ] ) dimension [ j ++ ] = arr [ i ++ ];
    return ( dimension [ 0 ] * dimension [ 1 ] );
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,5,6,8,9,11,12,14,16,17,24,25,36,40,44,47,49,51,51,52,67,68,72,74,81,82,83,84,92,95,95,96,99},{-54,-82,-92,-32},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1},{16,62,17,15,26,45,2,17,65,94,96,30,68,44,96,60,99},{-88,-82,-78,-52,-50,-42,-34,-28,16,46,54,56,66,66,74,82,82,94,98},{0,1,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,1,1,1,1,0},{1,6,8,8,8,10,13,14,14,23,24,25,27,28,29,30,33,38,43,44,49,52,56,58,62,63,64,65,65,68,75,85,85,87,93,96,97},{-90,-56,16,32,78,-20,76,-90,-68,-70,54,50,60,-64,78,-6,-92,6,16,70},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{55,51,90,10,14,5,57,22,75,29,7,18,31,43,84,35,71,94,4,51,94,30,94,53,82}};
    vector<int> param1 {27,2,15,8,15,18,20,19,30,22};
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