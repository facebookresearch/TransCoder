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
  int sum = 0;
  sort ( arr, arr + n );
  for ( int i = 0;
  i < n / 2;
  i ++ ) {
    sum -= ( 2 * arr [ i ] );
    sum += ( 2 * arr [ n - i - 1 ] );
  }
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{8,9,12,13,17,21,24,29,37,37,39,40,41,45,49,50,53,54,56,59,60,60,70,71,72,74,77,77,78,85,89,89,90,90,95,98,98},{0,48,-32,28,-84,14,30,-80,92,76,-52,-20,52,78,20,32,96,66,48,26,88,6,94,32,-40,44,-84,54,-84,-80,-80,-64,-92,-84,-16,-18},{0,0,0,1,1,1},{47,7,84,96,59,53,80},{-88,-80,-68,-62,-60,-60,-48,-46,-44,-38,-16,-16,0,0,2,8,20,36,40,40,44,54,60,68,70,82,82,84,92,94,96},{1,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,0,0,0,1,1,0,1,0,0,0,0,1,0,1,1,1,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,1},{2,5,10,11,13,14,15,17,17,23,23,24,27,27,28,29,30,40,42,43,46,47,51,52,57,64,65,73,74,75,76,77,81,81,82,87,89,93,95,95,99},{-72,-84,84,2,-76,48,12,-72,-92,-72,38,26,-38,26,50,2,20,26,-48,30,24,-12,-84,-54,20,-16,-94,26,-22,86},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{57,74,53,52,80,31,27,53,8,57,46,73,46,56,73,84,37,7,97}};
    vector<int> param1 {34,24,3,5,29,32,35,21,37,13};
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