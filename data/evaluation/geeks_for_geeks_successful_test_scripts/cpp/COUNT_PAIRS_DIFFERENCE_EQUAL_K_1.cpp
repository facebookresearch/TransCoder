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
int f_gold ( int arr [ ], int n, int k ) {
  int count = 0;
  sort ( arr, arr + n );
  int l = 0;
  int r = 0;
  while ( r < n ) {
    if ( arr [ r ] - arr [ l ] == k ) {
      count ++;
      l ++;
      r ++;
    }
    else if ( arr [ r ] - arr [ l ] > k ) l ++;
    else r ++;
  }
  return count;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,5,10,19,29,32,40,60,65,70,72,89,92},{-38,40,8,64,-38,56,4,8,84,60,-48,-78,-82,-88,-30,58,-58,62,-52,-98,24,22,14,68,-74,48,-56,-72,-90,26,-10,58,40,36,-80,68,58,-74,-46,-62,-12,74,-58},{0,0,1},{16,80,59,29,14,44,13,76,7,65,62,1,34,49,70,96,73,71,42,73,66,96},{-98,-88,-58,-56,-48,-34,-22,-18,-14,-14,-8,-4,-2,2,18,38,42,46,54,68,70,90,94,96,98},{0,1,1},{11,43,50,58,60,68,75},{86,94,-80,0,52,-56,42,88,-10,24,6,8},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{54,99,4,14,9,34,81,36,80,50,34,9,7}};
    vector<int> param1 {7,24,1,12,23,2,4,11,29,9};
    vector<int> param2 {12,36,1,16,22,1,4,9,30,8};
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