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
int f_gold ( int arr1 [ ], int n, int arr2 [ ], int m ) {
  int table [ m ];
  for ( int j = 0;
  j < m;
  j ++ ) table [ j ] = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    int current = 0;
    for ( int j = 0;
    j < m;
    j ++ ) {
      if ( arr1 [ i ] == arr2 [ j ] ) if ( current + 1 > table [ j ] ) table [ j ] = current + 1;
      if ( arr1 [ i ] > arr2 [ j ] ) if ( table [ j ] > current ) current = table [ j ];
    }
  }
  int result = 0;
  for ( int i = 0;
  i < m;
  i ++ ) if ( table [ i ] > result ) result = table [ i ];
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,7,9,35,43,51,51,66,88},{-52,52,-92,-46,-94,30,-36,18,-98,22,-36,96,-88,-50,50},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{5,74,29},{-84,-74,-70,-62,-56,-56,-52,-2,6,24,28,44,44,52},{0,0,0,1,0,1,0,0,1,1,1,1,0,0,1,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0},{3,4,4,7,15,15,16,22,32,32,37,39,39,41,43,46,47,47,49,75,79,80,86,88,93},{70,-64,0,52,32,-98,38,-8,34,70,98,58,-48,-60,-28,-22,-72,82,-98,-36},{0,0,1,1,1,1,1,1},{46,87,98}};
    vector<int> param1 {5,7,36,1,8,17,19,16,7,2};
    vector<vector<int>> param2 {{10,21,38,50,65,67,87,93,99},{-58,40,56,-62,-92,-94,40,18,-2,-76,-78,-14,44,84,4},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{57,33,48},{-98,-96,-88,-66,-32,-26,-24,-20,-4,20,48,74,90,96},{1,0,1,1,0,0,0,0,1,1,1,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,1,0},{9,12,15,20,22,27,28,28,30,31,35,39,47,58,58,60,73,74,76,78,80,86,95,96,98},{-18,88,-40,-52,30,-10,-18,-56,84,-22,-64,80,-14,-64,40,92,48,-8,24,82},{0,1,1,1,1,1,1,1},{67,31,54}};
    vector<int> param3 {8,10,22,1,12,15,14,12,7,2};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],&param2[i].front(),param3[i]) == f_gold(&param0[i].front(),param1[i],&param2[i].front(),param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}