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
int f_gold ( int a [ ], int n ) {
  vector < int > finalSequence;
  sort ( a, a + n );
  for ( int i = 0;
  i < n / 2;
  ++ i ) {
    finalSequence . push_back ( a [ i ] );
    finalSequence . push_back ( a [ n - i - 1 ] );
  }
  int MaximumSum = 0;
  for ( int i = 0;
  i < n - 1;
  ++ i ) {
    MaximumSum = MaximumSum + abs ( finalSequence [ i ] - finalSequence [ i + 1 ] );
  }
  MaximumSum = MaximumSum + abs ( finalSequence [ n - 1 ] - finalSequence [ 0 ] );
  return MaximumSum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,5,7,7,7,9,11,13,18,20,24,24,24,31,35,35,37,41,45,46,48,48,49,51,51,58,59,61,66,71,72,77,77,80,81,82,84,85,85,87,88,89,90,91,96,97,97,98},{16,-26,-78,-88,78,-2,-44,-74,-26,24,52,-78,10,38,82,18,-70,88,-16,74,28,-10,-64,-98,-80,-70,-62,-44,-20},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{61,45,96,48,19,34,64,32,88,86,97,53,45,1,83,8,23,17,87,78,80,87,16,67,33,36},{-96,-96,-94,-92,-86,-86,-56,-48,-42,-38,-38,-28,-24,-22,-14,-6,12,20,20,24,36,38,40,50,54,66,86,88,88,96},{0,0,0,0,1,1,1,0,1},{2,10,10,12,13,14,15,19,20,20,21,24,27,29,33,34,37,38,40,42,42,44,49,55,62,63,64,65,66,68,70,74,78,79,79,83,83,84,91,93,99},{68,-66,74,12,46,-10,-88,30,-4,-98,-14,62,-78,-58,88,-68,46,72,-92,-74,-6,-78,-56,-94},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{4,63,31,56,51,53,2,26,57,20,24,45,51,45,81,66,65,62,66,14,71,76,48,58,77,25,95,31,68,11,50,38,2,66,61,46}};
    vector<int> param1 {26,17,23,19,29,4,35,23,26,28};
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