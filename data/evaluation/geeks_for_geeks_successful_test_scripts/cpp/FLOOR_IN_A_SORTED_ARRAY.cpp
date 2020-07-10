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
int f_gold ( int arr [ ], int n, int x ) {
  if ( x >= arr [ n - 1 ] ) return n - 1;
  if ( x < arr [ 0 ] ) return - 1;
  for ( int i = 1;
  i < n;
  i ++ ) if ( arr [ i ] > x ) return ( i - 1 );
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,9,10,11,36,39,50,70,75,99},{-60,96,8,88,-98,56,-46,50,38,-62,46,36,68,88,46,94,16,2,78,-64,74,44,22,96,-52,66,86,-74,60,-4,56,-34,20,62,6,62,78,28,-72,-6,34,70,34,-38,-10,86,-28},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{54,39,73,75,10,12,99,87,99,24,91,15,7,96,97,87,80,9,6,57,29,78,80,91,74,17},{-90,-88,-86,-72,-66,-52,-48,-40,-36,-28,4,6,18,20,22,36,46,56,96},{1},{1,5,10,10,11,11,14,15,18,18,21,23,28,28,29,31,33,34,38,38,42,47,47,48,48,48,51,51,53,56,61,64,64,66,70,71,72,80,82,88,88,90,91,92,92,94,98,98},{-12,18,-92,-68,-48,-96,16,-22,-36,-24,66,-80,60,70,36,6,36,86,-10,-18,-84,2},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{39,66}};
    vector<int> param1 {8,44,37,25,18,0,25,15,26,1};
    vector<int> param2 {5,32,24,22,9,0,24,16,23,1};
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