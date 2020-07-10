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
int f_gold ( int arr [ ], int n, int x, int k ) {
  int i = 0;
  while ( i < n ) {
    if ( arr [ i ] == x ) return i;
    i = i + max ( 1, abs ( arr [ i ] - x ) / k );
  }
  cout << "number is not present!";
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,5,9,11,14,18,19,21,26,32,38,38,43,47,49,52,55,61,65,67,69,73,74,79,84,90,91,91,92,93,94,99},{12,-86,-66,-50,-48,78,-92,-56,-2,66,64},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{10,87,39,87,45,33,5,37,70,69,88,78,90,3},{-78,-70,-68,-60,-52,-34,-24,-4,12,18,58,58,64,76,84,94},{0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,0},{5,5,7,11,11,15,22,23,28,38,41,53,54,57,59,68,71,89},{-4,0,60,-14,-48,54,-96,-68,-40,64,-50,-74,-20,-22,48,-48,42,62,66,84,54,-52,-52,6,46,-90,-18,90},{0,0,0,0,0,0,0,1,1,1,1,1},{30,91,34,44,3,76,43,75,49,33,74,72,68,79,26,62,23,5,32,75,82,25,7,19,32,87,87,94,34,62,3,32,59}};
    vector<int> param1 {22,5,35,9,14,26,16,18,9,32};
    vector<int> param2 {19,10,37,8,9,36,17,14,8,30};
    vector<int> param3 {26,5,43,10,13,32,16,23,9,24};
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