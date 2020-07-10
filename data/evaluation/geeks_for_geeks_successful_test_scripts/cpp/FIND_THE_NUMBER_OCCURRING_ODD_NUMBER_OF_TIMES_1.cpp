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
int f_gold ( int arr [ ], int size ) {
  unordered_map < int, int > hash;
  for ( int i = 0;
  i < size;
  i ++ ) {
    hash [ arr [ i ] ] ++;
  }
  for ( auto i : hash ) {
    if ( i . second % 2 != 0 ) {
      return i . first;
    }
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{49,90},{-96,94,92,-24,48,54,-30,-86,28,-18,12,-64,-36,68,68,-78,-6,30,-84,20,52,-36,40,-62,90,-48,86,98,12,44,98,-66,52,34,36,76,-50,-20,-20,-20},{0,1},{79,55,18,99,38,93,19,49,21,74,16,76,82,52,86,17,42,9,6,63,1,40,75,59,41,81},{-90,-84,-82,-68,-66,-66,-60,-60,-48,-44,-36,-34,-30,-16,-14,-12,-10,-6,2,10,10,14,22,26,30,34,46,50,52,62,64,64,66,72,74,78,78,82,84,88,92},{1,1,0,0,1,0,1,1,0,0,1,1,1,1,0,0,1,1,1,0,1,0,0,1,0,1},{2,4,5,7,7,18,18,23,23,25,25,31,41,43,45,46,52,52,55,64,69,69,80,81,84,90,91,93,94,94,94,94,96,98,99},{86,66,-8,2,-18,-22,38,4,-38,-54,78,64,78,20,-32,84,-70,66,-46,12,-12,8,44,14,20},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{11,4,98,38,20,41,1,8}};
    vector<int> param1 {1,39,1,23,23,18,20,20,21,7};
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