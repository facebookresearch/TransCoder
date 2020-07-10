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
bool f_gold ( int arr [ ], int n, int x ) {
  int i;
  for ( i = 0;
  i < n - 1;
  i ++ ) if ( arr [ i ] > arr [ i + 1 ] ) break;
  int l = ( i + 1 ) % n;
  int r = i;
  while ( l != r ) {
    if ( arr [ l ] + arr [ r ] == x ) return true;
    if ( arr [ l ] + arr [ r ] < x ) l = ( l + 1 ) % n;
    else r = ( n + r - 1 ) % n;
  }
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {
    {3,8,10,15,18,19,20,20,21,22,26,30,32,34,43,45,50,50,51,52,53,56,57,58,62,63,65,82,86,91,91,92,92,93,97},
    {30,-34,86,-30,-26,2,90,8,26,-8,-8,0,-86,68,22,72,-76,48,-24,90,-22,-58,-54,90,-12,-12,88,72,-58,68,84,22,60,66,-52,-38,-90,62,30,-26,88,-36,92,32,-32,-42,-90,-40,-10},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {20,68,40,19,74,69},
    {-98,-94,-94,-94,-90,-88,-88,-78,-74,-70,-68,-66,-64,-62,-54,-50,-40,-40,-40,-40,-28,-22,-22,-18,-14,-12,0,6,6,8,12,20,22,26,28,36,42,44,48,52,56,60,68,84},
    {1,1,0},
    {12,22,38,76,80,86},
    {-36,-10,-26,34,-50,66,-2,-14,-62,60,-48,94,-70,6,-60,-90,28,-4,-20,-52,40,-76,-92,-14,54,4,-58,38,-74,-96,-88,86,-54,98,48,68,78,-28,-80,-46},
    {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},
    {69,99,25,52,41,51,7,33,42,91,85,57,91,89,86,11,70,67,30,92,81,23,51,98,85,5,50,44}};
    vector<int> param1 {17,41,26,4,28,2,4,26,17,21};
    vector<int> param2 {30,10,1,88,-94,60,3,37,20,27};
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