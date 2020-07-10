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
  if ( high < low ) return arr [ 0 ];
  if ( high == low ) return arr [ low ];
  int mid = low + ( high - low ) / 2;
  if ( mid < high && arr [ mid + 1 ] < arr [ mid ] ) return arr [ mid + 1 ];
  if ( mid > low && arr [ mid ] < arr [ mid - 1 ] ) return arr [ mid ];
  if ( arr [ high ] > arr [ mid ] ) return f_gold ( arr, low, mid - 1 );
  return f_gold ( arr, mid + 1, high );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{16,22,50,64,68,79,84,88,89},{88,-38,46,24,-52,-12,-90,28,18,14,-72,58,-98,28,-84,44,-42,-32,-22,-22,-82,-30,90,18,62,62,92,6,60,28,-90,92,82,62,98,-68,48,-74,-8,50,62,24,30,-86,98,-96,-98},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{26,66,94,28,38,31,92,66,81,8,36,64,80,32,48,71,72,54,61,60,89},{-46,-26,-22,-14,46,62},{0,1,1,1},{14,81,87},{4},{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{3,41,40,53,82,9,90,43,90,59,37,21,92,98,36,99,35,67,24,29,40,31,46,12,29,8,93,67,44,83,71,29,22,32,33,11,44,97,84,44,8,10,31,50,22,8}};
    vector<int> param1 {4,42,28,19,4,2,1,0,15,42};
    vector<int> param2 {6,31,21,17,4,2,1,0,17,31};
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