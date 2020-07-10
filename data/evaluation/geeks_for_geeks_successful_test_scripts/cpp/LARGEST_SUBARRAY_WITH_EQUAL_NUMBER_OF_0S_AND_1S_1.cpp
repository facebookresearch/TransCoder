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
  unordered_map < int, int > hM;
  int sum = 0;
  int max_len = 0;
  int ending_index = - 1;
  for ( int i = 0;
  i < n;
  i ++ ) arr [ i ] = ( arr [ i ] == 0 ) ? - 1 : 1;
  for ( int i = 0;
  i < n;
  i ++ ) {
    sum += arr [ i ];
    if ( sum == 0 ) {
      max_len = i + 1;
      ending_index = i;
    }
    if ( hM . find ( sum + n ) != hM . end ( ) ) {
      if ( max_len < i - hM [ sum + n ] ) {
        max_len = i - hM [ sum + n ];
        ending_index = i;
      }
    }
    else hM [ sum + n ] = i;
  }
  for ( int i = 0;
  i < n;
  i ++ ) arr [ i ] = ( arr [ i ] == - 1 ) ? 0 : 1;
  printf ( "%d to %d\n", ending_index - max_len + 1, ending_index );
  return max_len;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,6,16,16,18,19,22,39,40,42,60,66,69,70,70,73,74,80,99},{-88,-66},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{85,98,67,27,98,13,96,32,26,44,32},{-96,-94,-90,-88,-86,-66,-64,-52,-46,-46,-42,-40,-38,-32,-28,-22,-16,-10,-8,-8,-4,2,10,26,26,28,28,40,40,42,50,60,66,68,72,74,86,92,94},{1,1,1,1,1,1,0,0,0},{25,64,86},{-4,78,-76,12,4,-38,-98,-26,-8,-98,56,0,-34,36,-90,-36,54,-68,12,-44,62,60,-34,-52,18},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},{2,25,45,98,71,8,58,94,53}};
    vector<int> param1 {9,1,19,8,34,4,1,17,9,8};
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