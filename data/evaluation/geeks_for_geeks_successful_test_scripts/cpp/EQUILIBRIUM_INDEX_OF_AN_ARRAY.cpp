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
  int i, j;
  int leftsum, rightsum;
  for ( i = 0;
  i < n;
  ++ i ) {
    leftsum = 0;
    for ( j = 0;
    j < i;
    j ++ ) leftsum += arr [ j ];
    rightsum = 0;
    for ( j = i + 1;
    j < n;
    j ++ ) rightsum += arr [ j ];
    if ( leftsum == rightsum ) return i;
  }
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,6,7,8,15,15,19,23,27,28,29,31,37,40,41,42,50,51,57,58,63,63,64,70,71,72,78,83,85,90,90},{-68,-92},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{80,74,45,81,62,88,90,54},{-92,-84,-84,-66,-64,-50,-50,-48,-46,-44,-36,-36,-30,-24,-22,-16,-6,-2,24,48,54,62,66,74,74,80,82,88,98,98},{0,0,1,1,0,0,1,0,1,0,1,1,0,1,0,0,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,1,1,1},{2,6,11,12,14,36,45,49,52,52,58,63,70,73,74,80,82,89,89},{16,-58,-14,-58,-36,-70,36,-8,-14,-78,-26,42,16,18,0,-44,32,50,-78,58,78,16,-34,-54,50,0,46,-12,52,-74,78,-82,-26,-72,-86,-14,86,40,-8},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{58,82,79,77,84,79,39,98,53,84,19,9,93,30,6,82,8,43,17,44,62,21,34,86,98,44,81,14,82,54,44,53,36,33,2,68,19,37}};
    vector<int> param1 {25,1,26,4,27,43,17,26,33,22};
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