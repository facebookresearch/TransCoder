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
int f_gold ( int arr [ ], int low, int high ) {
  if ( low > high ) return - 1;
  int mid = ( low + high ) / 2;
  if ( arr [ mid ] != mid + 1 ) {
    if ( mid > 0 && arr [ mid ] == arr [ mid - 1 ] ) return mid;
    return f_gold ( arr, low, mid - 1 );
  }
  return f_gold ( arr, mid + 1, high );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{15,21,32,42,42,44,57,68,75,80,83,84},{-60,-90,-88,-80,-86,18,54,56,84,42,-60,-90,52,-44,-62,-56,-16,28,22,-24,-36,-56,80,68,-16},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{87,43,74},{-82,-66,-66,-62,-56,-52,-44,-42,-28,-22,-12,-6,-4,-2,18,26,26,28,42,42,56,58,78,90,92,94,96,96},{0,1,1,1,1,1,0,1,1,1,1,0,0,1,0,0,1,0,1,1,1},{6,9,14,17,22,31,32,33,36,39,42,43,46,46,46,47,49,53,60,61,67,68,72,75,77,77,84,84,85,89,94,94,95},{-88,82,-10,-10,68,-86,70,92,-54,-10,-56},{0,0,0,0,0,0,1,1,1,1,1},{35,66,47,42,95,10,84,80,23,35,21,71,39,9,38,40,22,65}};
    vector<int> param1 {6,23,33,2,20,19,23,7,8,14};
    vector<int> param2 {11,12,32,2,21,19,19,10,8,16};
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