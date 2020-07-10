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
int f_gold ( int n, int templeHeight [ ] ) {
  int sum = 0;
  for ( int i = 0;
  i < n;
  ++ i ) {
    int left = 0, right = 0;
    for ( int j = i - 1;
    j >= 0;
    -- j ) {
      if ( templeHeight [ j ] < templeHeight [ j + 1 ] ) ++ left;
      else break;
    }
    for ( int j = i + 1;
    j < n;
    ++ j ) {
      if ( templeHeight [ j ] < templeHeight [ j - 1 ] ) ++ right;
      else break;
    }
    sum += max ( right, left ) + 1;
  }
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {12,46,16,9,0,38,28,9,18,29};
    vector<vector<int>> param1 {{3,11,12,15,16,21,24,29,32,39,42,44,51,68,79,81,81,85,92,94},{76,48,88,70,-64,66,-6,-58,26,-28,-42,-94,80,-4,-56,-46,4,90,-12,-78,64,18,-38,26,56,-24,66,-18,-12,0,-94,12,-10,4,-68,-20,88,2,-58,16,46,-80,-42,44,-86,96,-44},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{2,95,20,50,2,58,20,14,65,69,78,7},{-88},{0,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0,0,0,1,1,1,0,0,0,0,1,0,1,1,0,0,0,1,1,1,0,0},{2,3,6,8,9,10,14,17,17,22,25,27,29,29,30,32,33,35,38,42,50,51,51,57,59,59,59,60,62,62,63,67,70,75,76,77,81,81,83,84},{-52,62,74,-62,-58,62,38,42,-50,20},{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},{96,15,9,9,40,34,17,4,51,49,34,66,97,28,64,65,92,56,74,48,43,17,82,8,21,39,83,35,42,37,64,34,42,59,45,61,55,93,94,29,20,96,77,66}};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],&param1[i].front()) == f_gold(param0[i],&param1[i].front()))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}