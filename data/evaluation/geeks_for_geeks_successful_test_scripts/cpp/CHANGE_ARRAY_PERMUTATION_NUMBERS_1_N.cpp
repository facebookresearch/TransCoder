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
void f_gold ( int a [ ], int n ) {
  unordered_map < int, int > count;
  for ( int i = 0;
  i < n;
  i ++ ) count [ a [ i ] ] ++;
  int next_missing = 1;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( count [ a [ i ] ] != 1 || a [ i ] > n || a [ i ] < 1 ) {
      count [ a [ i ] ] --;
      while ( count . find ( next_missing ) != count . end ( ) ) next_missing ++;
      a [ i ] = next_missing;
      count [ next_missing ] = 1;
    }
  }
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{19},{-47,72},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{93,3,20,59,36,19,90,67,19,20,96,71,52,33,40,39},{-98,-93,-91,-89,-63,-58,-52,-52,-46,-40,-25,-16,-10,-1,-1,4,12,12,13,13,16,20,29,29,31,40,44,47,48,51,52,52,59,60,61,64,66,78,85,97},{0,1,1,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0},{4,6,8,17,19,21,22,24,27,27,28,30,30,30,32,33,35,37,38,44,46,46,48,49,51,53,54,59,60,61,63,64,64,69,76,85,86,87,92,93,93,95,97,97,97,98,99,99},{-75,-46,-42,-33,4,74,-76,14,-68,75,-14,51,94,27,55,30,-83,4},{0,0,0,0,0,1,1,1,1},{24,13,60,7,57,36,45,20,65,8,16,14,76,87,15,92,98,66,32,87,63,86,51,25,58}};
    vector<int> param1 {0,1,18,9,22,12,26,9,5,24};
    vector<vector<int>> filled_function_param0 {{19},{-47,72},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{93,3,20,59,36,19,90,67,19,20,96,71,52,33,40,39},{-98,-93,-91,-89,-63,-58,-52,-52,-46,-40,-25,-16,-10,-1,-1,4,12,12,13,13,16,20,29,29,31,40,44,47,48,51,52,52,59,60,61,64,66,78,85,97},{0,1,1,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0},{4,6,8,17,19,21,22,24,27,27,28,30,30,30,32,33,35,37,38,44,46,46,48,49,51,53,54,59,60,61,63,64,64,69,76,85,86,87,92,93,93,95,97,97,97,98,99,99},{-75,-46,-42,-33,4,74,-76,14,-68,75,-14,51,94,27,55,30,-83,4},{0,0,0,0,0,1,1,1,1},{24,13,60,7,57,36,45,20,65,8,16,14,76,87,15,92,98,66,32,87,63,86,51,25,58}};
    vector<int> filled_function_param1 {0,1,18,9,22,12,26,9,5,24};
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(&filled_function_param0[i].front(),filled_function_param1[i]);
        f_gold(&param0[i].front(),param1[i]);
        if(equal(begin(param0[i]), end(param0[i]), begin(filled_function_param0[i])) && param1[i] == filled_function_param1[i])
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}