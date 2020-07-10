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
int f_gold ( int arr [ ], int N, int K ) {
  sort ( arr, arr + N );
  int res = INT_MAX;
  for ( int i = 0;
  i <= ( N - K );
  i ++ ) {
    int curSeqDiff = arr [ i + K - 1 ] - arr [ i ];
    res = min ( res, curSeqDiff );
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,1,4,18,21,35,37,39,76,81,86,92,96},{-8,-6,62,52,-86,2,-94,0,-48,-38,24,-48,34},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{23,36,43,50,74,81,94,13,30,57,30,71,10,99,66,94,83,39,37,3,89,34},{-96,-94,-92,-84,-80,-72,-24,-22,-18,-14,6,8,26,28,30,36,50,58,80,84,92,92},{0,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,0,1,1,0,0,1,1},{6,7,9,27,30,42,54,55,57,57,59,76,84,84,84},{88,44,-96,-72,-80,0,-64,-64,-68,4,38,4,-38,68,-54,92,-16,62,24,54,0,54,62,-70,80,-12,84,-16,-10,88,-30,-56,48,50,-24,94,40,28,-86,-12},{0,1},{89,18,7,54,67,93,10,61,59,59,69,63,98,8,78,55,6,1,56,97,75,88,10}};
    vector<int> param1 {7,9,16,17,21,21,13,31,1,22};
    vector<int> param2 {6,12,26,20,12,22,14,26,1,14};
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