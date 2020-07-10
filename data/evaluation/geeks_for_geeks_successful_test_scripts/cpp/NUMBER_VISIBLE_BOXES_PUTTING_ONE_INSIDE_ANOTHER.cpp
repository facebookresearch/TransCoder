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
  queue < int > q;
  sort ( arr, arr + n );
  q . push ( arr [ 0 ] );
  for ( int i = 1;
  i < n;
  i ++ ) {
    int now = q . front ( );
    if ( arr [ i ] >= 2 * now ) q . pop ( );
    q . push ( arr [ i ] );
  }
  return q . size ( );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,3,17,17,18,28,28,29,34,43,44,52,54,80,84,84,91,92,97},{-34,70,-90,-10,-26,64,4,28,24,-90,-78,72,74,80,82,-94},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{20,87,5,62,12,81,30,83,96,16,2,76,3,8,37,53,55,88},{-94,-92,-60,-58,-54,-42,-36,-12,-8,-2,8,14,18,20,26,32,38,56,58,60,70,78,80,86,98},{0,1,1,1,0,0,1,1,1,1,1,1,1,1,0,0},{1,1,2,3,3,11,16,18,19,21,21,22,22,24,27,28,29,43,43,52,55,57,60,62,62,63,65,66,70,70,73,77,78,79,79,80,85,85,86,88,89,90,97,98},{88,12,-22,-60,30,-30,-14,80,-58,-80,-10,86,-94,-14,4,-18,-18,54,-82,-8,-68,-6,-44,-44,50,88,-78,-42,12,52,44,14,6,48,18,-30,4},{0,0,0,0,1,1,1,1,1,1,1,1,1},{82,62,43,39,5,90,75,50,16,83,52,69,71,3,89,10,51,69,32,96,5,43,83,12,31,81,22,59,52,47,86,49,56,90,31,59}};
    vector<int> param1 {12,10,40,9,18,9,30,21,7,28};
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