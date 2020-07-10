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
int f_gold ( int price [ ], int n ) {
  int val [ n + 1 ];
  val [ 0 ] = 0;
  int i, j;
  for ( i = 1;
  i <= n;
  i ++ ) {
    int max_val = INT_MIN;
    for ( j = 0;
    j < i;
    j ++ ) max_val = max ( max_val, price [ j ] + val [ i - j - 1 ] );
    val [ i ] = max_val;
  }
  return val [ n ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,7,15,16,18,22,22,30,34,35,37,41,42,42,43,47,49,52,53,55,58,60,62,62,62,65,65,67,69,73,73,73,75,78,83,84,86,90,91,91,93,94,96},{50,-30,-84,-2,-96,-54,-14,56,-48,70,38,-86,16,-48,66,34,36,40,40,36,-16,-92,30},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{79,33,54,12,53,9,29,45,85,20,6,52,8,26,43,42,17,54,8,70,5,71,1,81,42,59,42,63,8,86,29,16,72},{-78,-64,-38,-22,2,8,28,32,58,72,72,90},{1,0,1,1,1,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,0,1,1,0,0,0},{1,3,6,7,10,17,18,22,23,24,28,31,37,43,48,54,56,65,70,71,73,74,79,84,87,95,96},{-30,20,-72,-86,-8},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{96,99,20,87,17,13,45,65,33,13,59,77,35,79,20,51,69,71,55,37,23,35,82,70}};
    vector<int> param1 {37,19,29,22,11,20,21,3,21,19};
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