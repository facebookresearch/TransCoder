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
int f_gold ( int arr [ ], int n, int num, int maxLimit ) {
  int ind;
  int val;
  int dp [ n ] [ maxLimit + 1 ];
  for ( ind = 0;
  ind < n;
  ind ++ ) {
    for ( val = 0;
    val <= maxLimit;
    val ++ ) {
      if ( ind == 0 ) {
        if ( num - arr [ ind ] == val || num + arr [ ind ] == val ) {
          dp [ ind ] [ val ] = 1;
        }
        else {
          dp [ ind ] [ val ] = 0;
        }
      }
      else {
        if ( val - arr [ ind ] >= 0 && val + arr [ ind ] <= maxLimit ) {
          dp [ ind ] [ val ] = dp [ ind - 1 ] [ val - arr [ ind ] ] || dp [ ind - 1 ] [ val + arr [ ind ] ];
        }
        else if ( val - arr [ ind ] >= 0 ) {
          dp [ ind ] [ val ] = dp [ ind - 1 ] [ val - arr [ ind ] ];
        }
        else if ( val + arr [ ind ] <= maxLimit ) {
          dp [ ind ] [ val ] = dp [ ind - 1 ] [ val + arr [ ind ] ];
        }
        else {
          dp [ ind ] [ val ] = 0;
        }
      }
    }
  }
  for ( val = maxLimit;
  val >= 0;
  val -- ) {
    if ( dp [ n - 1 ] [ val ] ) {
      return val;
    }
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,4,5,8,9,10,10,11,13,15,17,19,27,31,34,35,36,36,36,38,41,46,48,49,50,53,56,57,60,62,63,64,66,67,69,69,81,82,83,89,92,93,95,99},{-44,-14,36,12,-12,-6,-84,46,72,-26,-50,-6},{0,0,0,0,0,0,0,1,1,1,1,1},{9,67,80,48,75,21,5,39,6,93,2,81,75,69,75,30,46,60,51,61},{-98,-82,-74,-70,-66,-62,-54,-52,-50,-34,-34,-30,-22,-20,-16,-16,-14,-4,-4,-2,0,6,10,10,12,12,14,16,18,32,38,38,48,54,58,66,66,68,78,82,86,86,88,92,96},{0,0,1,0,0,1,0,1,0,1,1,1,1,0,1,1,0,0,1,1,1,1,0,1,1,0,1,1,0,1,0,0,1,0,0,1,0},{5,7,8,10,15,16,16,21,25,29,31,34,36,39,41,41,44,45,48,59,64,74,78,81,85,93,97},{-28,44,-16,-42,58,-98,22,48,66,-60,74,24,-78,-62,86,-24,20,-64,74,-66,16,24,80,-4,-22,80,-88,0,54,-26,-26,-80,-96,-98,52,-32,86,-10,-82,-64,14},{0,1,1},{6,87,85,44,87,42,76,23,94,53,23,88,49,10,78,61,94,11,55,47,16,96,51,26,75,33,25,85,13,85,14,17,22,18,20,72,55}};
    vector<int> param1 {25,10,9,19,26,24,25,25,1,22};
    vector<int> param2 {39,11,6,15,23,26,25,37,1,19};
    vector<int> param3 {42,10,9,11,32,30,24,30,1,22};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],param2[i],param3[i]) == f_gold(&param0[i].front(),param1[i],param2[i],param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}