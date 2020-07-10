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
bool f_gold ( int arr [ ], int n ) {
  for ( int i = 0;
  i <= ( n - 2 ) / 2;
  i ++ ) {
    if ( arr [ 2 * i + 1 ] > arr [ i ] ) return false;
    if ( 2 * i + 2 < n && arr [ 2 * i + 2 ] > arr [ i ] ) return false;
  }
  return true;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,2,2,7,10,14,24,38,42,50,59,60,72,73,79,83,89},{-48,98,96,-56,-2,58,52,-50,58,50,62,86,-26,-98,34,20,-28,56,-36},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{91,50,37},{-80,-26,0,0,6,14,22,76,82,88,98},{1,0},{9,24,24,33,48,50,55,61,69,79,83},{30,32,-82,-48,88,-24,74,2,90,98,68,82,32,-60,2,-94,18,14,46,50,-60,-74,-76,66,-76,-34,-20,82,-44,-62,34,48,-56,2,64,-78,-64,98,-10,-28,78,-42},{0,0,1,1,1,1,1,1,1,1,1,1},{38,74,99,75,44,75,24,70,78,74,60,59,34,27,7,23,19,95,4,35,38,22,46,1,44,20,52,1,96,57,5,76,49,1,37,35}};
    vector<int> param1 {9,9,20,2,10,1,8,27,6,31};
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