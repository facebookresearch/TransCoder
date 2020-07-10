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
  unordered_map < int, int > freq;
  for ( int i = 0;
  i < n;
  i ++ ) freq [ arr [ i ] ] ++;
  int ans = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    for ( int j = 0;
    j < n;
    j ++ ) {
      if ( freq [ arr [ i ] ] > freq [ arr [ j ] ] && arr [ i ] > arr [ j ] ) ans = max ( ans, freq [ arr [ i ] ] - freq [ arr [ j ] ] );
      else if ( freq [ arr [ i ] ] < freq [ arr [ j ] ] && arr [ i ] < arr [ j ] ) ans = max ( ans, freq [ arr [ j ] ] - freq [ arr [ i ] ] );
    }
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,6,16,22,33,37,46,49,50,51,65,82,94},{-4,-16,92,-28,-44,50,54,24,-28,-32,20,-94,-78,-20,26,90,-90,10,36,-52,60,-96,-64,-34,10,-12,86,78,32,-46,92,-66,18,-78,-28,14,-26,26,4,16,-96,86,-50},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{98,54,41,62,95,18,74,57,37,90,35,45,10,14,90,88,58,8,85,58,97,59,13,94,40,3,89,62,45,90,8,31,93,5,40,78,43,75,79,74,17,38,62},{-88,-78,-76,-66,-56,-54,-54,-52,-34,-24,2,58,76,78},{1,1,1,1,1,0,0,1,0,0,1,0,1,1,0},{8,43,44,86},{54,92,-46,6,-38},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{54,47,56,2,23,40,15,18,31,48,53,77,83,29,62,86}};
    vector<int> param1 {9,25,35,40,8,12,2,4,12,9};
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