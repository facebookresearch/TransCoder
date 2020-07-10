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
  if ( high >= low ) {
    int mid = ( low + high ) / 2;
    if ( mid == arr [ mid ] ) return mid;
    if ( mid > arr [ mid ] ) return f_gold ( arr, ( mid + 1 ), high );
    else return f_gold ( arr, low, ( mid - 1 ) );
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{13,20,20,27,32,35,37,51,63,64,71,75,77,80,82,82,86,90,90,92,95,97,98},
    {-10, -5, 0, 3, 7},
    {0, 2, 5, 8, 17},
    {-10, -5, 3, 4, 7, 9},
    {-10, -5, 2, 4, 7, 9},
    {1,1,0,1,1,0,1,0,0},
    {1,4,16,16,19,28,34,34,35,36,37,46,49,52,54,60,60,60,63,70,75,77,80,81,81,84,85,87,93,99},
    {30,30,-94,-10,2,58},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {72,38,91,63,30,67,39,29,96,42}};
    vector<int> param1 {0,0,0,1,2,0,0,0,0,0};
    vector<int> param2 {16,4,4,5,5,7,5,5,12,7};
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