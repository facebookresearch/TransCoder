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
int f_gold ( int arr [ ], int n, int sum ) {
  int curr_sum = arr [ 0 ], start = 0, i;
  for ( i = 1;
  i <= n;
  i ++ ) {
    while ( curr_sum > sum && start < i - 1 ) {
      curr_sum = curr_sum - arr [ start ];
      start ++;
    }
    if ( curr_sum == sum ) {
      cout << "Sum found between indexes " << start << " and " << i - 1;
      return 1;
    }
    if ( i < n ) curr_sum = curr_sum + arr [ i ];
  }
  cout << "No subarray found";
  return 0;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{7,7,8,8,23,24,28,32,48,53,56,62,69,77,81,82,84,87,88,90},{-62,-62,-80,-30,-80,44,-12,-76,16,-52,-86,72,32,-60,-70,-62,-78,-96,-18,40,-4,-18,-58,30,-70,6,0,-62,-66,20,92,-64,20,-48,48,-32,64,22,16,26},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{50,25,6,87,55,86,61,97,24,30,51,43,26,1,80,47,19,36,64,62,92,5,48,27,82,76,70,59,1,43,1,36,28,9,52,22,43},{-86,-76,-64,-22,-16,-8,4,6,8,32,38,60,68,74},{0,0,0,0,1,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,0,1,0,0,0,1,0,1,0,1,1,0,0},{7,7,12,25,25,32,33,34,37,39,39,41,46,48,56,56,57,58,61,62,62,63,65,66,69,72,74,78,78,79,80,85,89,94,95,99},{98,-60},{0,0,0,0,1,1,1,1,1,1},{80,89,83,42,75,30,64,25,95,17,90,6,11,1,77,16,75,86,96,67,27,80,27}};
    vector<int> param1 {16,39,40,29,7,31,22,1,8,16};
    vector<int> param2 {31,44,7,105,2,10,39,98,0,108};

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