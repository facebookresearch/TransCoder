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
bool f_gold ( int arr [ ], int n, int k ) {
  int count;
  for ( int i = 0;
  i < n;
  i ++ ) {
    count = 0;
    for ( int j = 0;
    j < n;
    j ++ ) {
      if ( arr [ j ] == arr [ i ] ) count ++;
      if ( count > 2 * k ) return false;
    }
  }
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,1,2,3,1},{2,3,3,5,3,3},{0,0,1,1,1},{7,60,78,91,80,75,85,21,41,63,1,84,69,13,94,25,54,54,52,68,53,35,17,37,98,27,2,31},{-96,-94,-82,-80,-78,-66,-36,-24,-18,-12,-2,-2,6,8,10,12,36,38,42,58,64,68,82,84,86,88,94},{0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,0,1,0,1,1,0,0,0,0,1,1,0,0,0,1,0,0,1,1,1,0},{16,19,25,25,32,37,48,59,60,60,71,74,77,81,91,94},{-62,-94,72,-22,86,-80,64,98,-82,-50,12,-4,56,46,-80,2,-86,-44,-26,68,-94,-82,74,26,94,40,50,-40,-42,-10},{0,0,0,0,0,1,1,1},{83,57,2,47,70,22,49,51,25,57,32,7,8,99,6,86,24,79,42,43,1,24,68,11,24,12,43,40,14,45,11,46,12,80,66}};
    vector<int> param1 {5,6,2,24,24,34,10,20,5,21};
    vector<int> param2 {2,2,1,2,3,2,8,4,2,33};
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