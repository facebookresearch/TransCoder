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
int f_gold ( int arr [ ], int l, int r, int x ) {
  if ( r >= l ) {
    int mid = l + ( r - l ) / 2;
    if ( arr [ mid ] == x ) return mid;
    if ( mid > l && arr [ mid - 1 ] == x ) return ( mid - 1 );
    if ( mid < r && arr [ mid + 1 ] == x ) return ( mid + 1 );
    if ( arr [ mid ] > x ) return f_gold ( arr, l, mid - 2, x );
    return f_gold ( arr, mid + 2, r, x );
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,7,15,42,47,54,56,59,59,64,68,70,71,75,91,93},{6,7,15,42,47,56,54,59,59,64,68,71,70, 75,91,93},{-92,-96,-68,-40,70},{-92,-86,-68,-40,70},{-3,-1,0,30,10,45,70,60},{-3,-1,0,10,5,45,60,50},{-3,-1,0,10,30,45,60,70},{0,0,1},{1,1,1},{30,2,30,45}};
    vector<int> param1 {0,0,0,0,0,0,0,0,0,0};
    vector<int> param2 {15,15,4,4,7,7,7,2,2,3};
    vector<int> param3 {71,71,-96,20,0,12,18,20,17,28};
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
