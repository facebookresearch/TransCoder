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
  int i, j;
  int * lis = new int [ n ];
  for ( i = 0;
  i < n;
  i ++ ) lis [ i ] = 1;
  for ( i = 1;
  i < n;
  i ++ ) for ( j = 0;
  j < i;
  j ++ ) if ( arr [ i ] > arr [ j ] && lis [ i ] < lis [ j ] + 1 ) lis [ i ] = lis [ j ] + 1;
  int * lds = new int [ n ];
  for ( i = 0;
  i < n;
  i ++ ) lds [ i ] = 1;
  for ( i = n - 2;
  i >= 0;
  i -- ) for ( j = n - 1;
  j > i;
  j -- ) if ( arr [ i ] > arr [ j ] && lds [ i ] < lds [ j ] + 1 ) lds [ i ] = lds [ j ] + 1;
  int max = lis [ 0 ] + lds [ 0 ] - 1;
  for ( i = 1;
  i < n;
  i ++ ) if ( lis [ i ] + lds [ i ] - 1 > max ) max = lis [ i ] + lds [ i ] - 1;
  return max;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{11,15,37,64,77,84},{-52},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{49,95,57,17,94,76,47,23,62,20,83,95,79,65,80,57,12,8,56,39,63,54,63,88,36,81,98,98,45},{-68,-60,-40},{0,0,1,0,0,1,1,0,1,1,0,1,0,0,0,1,0,0,1,1,1,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,1,1,1,1,1,1},{1,4,12,12,13,17,20,24,27,29,31,41,44,58,62,62,64,70,73,78,82,92,97},{-62,30},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{41,81,35,27,29,74,48,21,3,49,90,17,93,11,69,43,30,50,67,33,21,34,13,3,46,20,92,67,97,20,51,24,22,39,35,29,71}};
    vector<int> param1 {4,0,20,24,2,27,21,1,8,29};
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