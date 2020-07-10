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
  unordered_set < int > s;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( s . find ( arr [ i ] ) == s . end ( ) ) {
      sum += arr [ i ];
      s . insert ( arr [ i ] );
    }
  }
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,6,8,10,21,22,27,32,35,36,43,44,46,48,49,55,60,61,69,69,71,72,73,78,88,94},{80,94,16,-74,32,-64,-84,-66,-10},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{99,4,96,39,39,24,15,47,25,74,7,98,88,91,62,12,31,14,48,26,37,25,11,32,34,64,72,5,80,86,6},{-86,-84,-84,-78,-78,-76,-74,-68,-66,-64,-60,-60,-56,-50,-42,-42,-38,-34,-32,-22,-16,-14,-10,-6,-6,4,4,26,36,36,54,62,64,68,70,76,76,76,84,92,92,94,96},{1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1},{3,3,5,8,32,33,35,35,42,48,67,71,71,74,77,80,94,96,96,97},{-50,-18,-66,76,-54,96,98,26,42,64,-60},{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{70,21,44,82,62,41,86}};
    vector<int> param1 {24,6,27,15,27,25,19,9,15,3};
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