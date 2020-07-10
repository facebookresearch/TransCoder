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
  int SubsetSum_1 = 0, SubsetSum_2 = 0;
  for ( int i = 0;
  i <= n - 1;
  i ++ ) {
    bool isSingleOccurance = true;
    for ( int j = i + 1;
    j <= n - 1;
    j ++ ) {
      if ( arr [ i ] == arr [ j ] ) {
        isSingleOccurance = false;
        arr [ i ] = arr [ j ] = 0;
        break;
      }
    }
    if ( isSingleOccurance ) {
      if ( arr [ i ] > 0 ) SubsetSum_1 += arr [ i ];
      else SubsetSum_2 += arr [ i ];
    }
  }
  return abs ( SubsetSum_1 - SubsetSum_2 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,14,15,21,42,42,42,46,46,48,48,48,52,52,53,60,62,69,69,79,82,86,96},{-54,4,-22,94,58,-28,-12,84,64,4,-34,16,-10,-32,50,-78,68,-52,-64,66,64,-28,-38,-18,-84,-66,-36,64,-12,44,48,8,42},{0,0,0,1},{63,49,18,36,21,30,45,87},{-96,-78,-78,-72,-62,-56,-52,-44,-38,-38,-28,-22,-20,-12,-6,-6,-2,2,2,4,36,44,46,50,50,54,66,92},{0,1,1,0,0,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,1,0,1,0,0,1,0,0,1,0,1,0,0,1,1,1,0},{1,2,8,12,13,13,14,17,18,27,28,31,34,37,38,42,43,45,49,52,53,56,56,58,62,66,71,74,87,93,96,99},{30,-28,-30,86,-8,-80,76,-2,28,30,82,84,-32,82,-88,-24,42,16,-32,-8,78,-8,-46,-6,-86,-86,-24,-12,-32,-72,84,-82,76,-84,80,-50,90,-50,-14,-82,78,48,-10,86,34,-20,-76,58},{0,1},{83,86,57,18,98,52,1,37,11,49,10,67,2,60,30,42,8,97,25,55,5,75,9,67}};
    vector<int> param1 {15,28,2,6,18,34,25,28,1,16};
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