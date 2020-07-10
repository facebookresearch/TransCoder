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
  int neg = 0, pos = 0;
  int sum = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    sum += arr [ i ];
    if ( arr [ i ] < 0 ) neg ++;
    else pos ++;
  }
  return ( sum / abs ( neg - pos ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{49,98},{82,66,-68,24,-10},{0,0,0,0,0,0,0,1,1,1,1,1,1,1},{56,3,18,5,20,56,47,29,60,98,60,40,42,2,54,56,91,8,93,14,31,27,61,49,23,12,71},{-94,-94,-92,-86,-50,-48,-6,8,28,40,44,58,62,72,94},{0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,0,0,1,1,1,0,1,0,1},{16,56,56},{74,-90,-92,30,-18,66,-66,22},{0,0,0,1,1,1,1,1,1,1,1,1,1,1},{21,64,82,78,30,34,35}};
    vector<int> param1 {1,2,8,25,12,36,1,5,7,5};
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