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
bool f_gold ( int arr [ ], int n ) {
  if ( n == 1 ) return true;
  int i;
  for ( i = 1;
  i < n && arr [ i - 1 ] < arr [ i ];
  i ++ );
  if ( i == n ) return true;
  int j = i;
  while ( arr [ j ] < arr [ j - 1 ] ) {
    if ( i > 1 && arr [ j ] < arr [ i - 2 ] ) return false;
    j ++;
  }
  if ( j == n ) return true;
  int k = j;
  if ( arr [ k ] < arr [ i - 1 ] ) return false;
  while ( k > 1 && k < n ) {
    if ( arr [ k ] < arr [ k - 1 ] ) return false;
    k ++;
  }
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {
    {1,2,5,4,3},
    {1,2,4,5,3},
    {1,1,0,0},
    {5,99,40,33,61,4,64,92,28,27,21,35,40,79,10,20,76,87,80,15,57,39,96,98,99,72,72,50,61,39,35,70,27},
    {-98,-92,-86,-58,-22,-12,0,26},
    {0,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,0},
    {6,10,27,30,40,47,49,55,59,60,68,82,91},
    {36,56,-56,94,52,-82,88,-62,70,-94,38,10,-78,66,-94,-72,18,96,-72,88,-6,48,6,-88,64,-96,-40,8,36,36,-90,-68,-20,-76,22,-92},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {2,5,42,28,47,26,88,16,30,30,36,49,21,95,99,21,41,52,57,39,69,2,42,22,55,92,64,27,95,71,19,38,40,65,7,21,29,38,13,11,41,54,38,40,35,51,88}};
    vector<int> param1 {5,5,4,32,6,24,8,30,31,46};
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