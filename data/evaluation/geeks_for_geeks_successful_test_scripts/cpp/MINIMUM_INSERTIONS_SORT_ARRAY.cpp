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
int f_gold ( int arr [ ], int N ) {
  int lis [ N ];
  for ( int i = 0;
  i < N;
  i ++ ) lis [ i ] = 1;
  for ( int i = 1;
  i < N;
  i ++ ) for ( int j = 0;
  j < i;
  j ++ ) if ( arr [ i ] >= arr [ j ] && lis [ i ] < lis [ j ] + 1 ) lis [ i ] = lis [ j ] + 1;
  int max = 0;
  for ( int i = 0;
  i < N;
  i ++ ) if ( max < lis [ i ] ) max = lis [ i ];
  return ( N - max );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,7,20,22,23,31,33,36,47,61,63,63,71,74,82,91,95,99},{-84,12,-42,-78,22,72,56,70,28,-72},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{29,41,4,62,77,74,30,2,14,90,93,10,78,36,66,22,48,89,36,73,70,23,90},{-80,-72,-68,-66,-58,-50,-48,-32,-28,-24,-22,-18,0,2,6,10,12,14,14,18,24,24,24,28,28,28,34,38,42,42,46,46,46,58,80,82,82,84,84,86,88,90,92,96},{1,1,0,1,0,1,0,0,1,0},{26,36,58,64,69,72,79,82,82,87,89,90,95},{-52,-40,98,40,42,-50,60,-64,-92,36,-88,72,-72,38,-80,-52,68,70,16,22,-30,-74,56,-80,62,-54,-32,-22,-86,-70,88,-76,-46,28,40,-2,-84,68,-98,-16,90,36,-38,-86,20,-40,82,98,54},{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{36,62,58,24,99,12,46,3,4,40,54,97,48,94,98,7,17,5,3,36,3}};
    vector<int> param1 {15,7,16,13,36,8,8,41,10,16};
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