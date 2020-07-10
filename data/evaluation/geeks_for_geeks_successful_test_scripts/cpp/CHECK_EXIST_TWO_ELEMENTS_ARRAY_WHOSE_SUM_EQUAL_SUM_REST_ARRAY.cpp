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
  int sum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) sum += arr [ i ];
  if ( sum % 2 != 0 ) return false;
  sum = sum / 2;
  unordered_set < int > s;
  for ( int i = 0;
  i < n;
  i ++ ) {
    int val = sum - arr [ i ];
    if ( s . find ( val ) != s . end ( ) ) {
      printf ( "Pair elements are %d and %d\n", arr [ i ], val );
      return true;
    }
    s . insert ( arr [ i ] );
  }
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {
    {2, 11, 5, 1, 4, 7},
    {2, 4, 2, 1, 11, 15},
    {0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{69,6,24,30,75,37,61,76,19,18,90,9,49,24,58,97,18,85,24,93,71,98,92,59,75,75,75,70,35,58,50,1,64,66,33},{-94,-94,-92,-74,-60,-58,-56,-44,-42,-40,-28,-14,2,4,14,20,24,28,40,42,42,66,78,78,80,82,96},{1,0,1,1,0,0,1,1,0,0,1,1,0,1},{21,26,26,27,61,62,96},{-54,86,20,26},{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{44,35,26,15,56,6,36,53,15,66,20,53,99,96,51,12,61,19,79,40,99,42,86,8,11,54,93,46,23,47,41,26,66,5,86,52,64,51,4,21,63,14,7,53,31,8,9,63}};
    vector<int> param1 {6,6,13,18,26,10,6,3,4,31};
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