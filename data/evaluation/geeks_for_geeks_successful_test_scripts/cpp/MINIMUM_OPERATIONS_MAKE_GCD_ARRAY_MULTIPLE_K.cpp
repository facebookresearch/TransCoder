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
int f_gold ( int a [ ], int n, int k ) {
  int result = 0;
  for ( int i = 0;
  i < n;
  ++ i ) {
    if ( a [ i ] != 1 && a [ i ] > k ) {
      result = result + min ( a [ i ] % k, k - a [ i ] % k );
    }
    else {
      result = result + k - a [ i ];
    }
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,7,27,32,36,37,44,48,50,64,86},{-22,6,-20,60,-74,98,52,-22},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{77,11,51,11,84,79,43,12,14,50,15,6,85,32,74,49,7,2,58},{-90,-66,-64,-58,-46,-44,-32,-30,-30,-22,-18,-14,12,12,18,34,44,60,70,70,74,76,86,98,98},{1,1,0,0,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,0,1,1},{9,22,27,27,37,53,53,56,63,73,76,81,82},{-46,60,80,80,42,-98,30,-48,4,-32,-78,40,52,26,88,4,22,62,88,-94,2,0,58,38,52,-50,-52,58,-62,30,-38,-8,-82,-66},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{42,69,93,82,8,23,73,1,77,39,49,4,95,85}};
    vector<int> param1 {5,5,23,9,12,36,10,18,19,12};
    vector<int> param2 {10,4,29,17,22,31,11,19,22,13};
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