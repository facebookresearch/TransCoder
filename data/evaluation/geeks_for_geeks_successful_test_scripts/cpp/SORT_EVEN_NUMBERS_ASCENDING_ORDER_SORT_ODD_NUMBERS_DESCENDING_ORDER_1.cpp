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
void f_gold ( int arr [ ], int n ) {
  for ( int i = 0;
  i < n;
  i ++ ) if ( arr [ i ] & 1 ) arr [ i ] *= - 1;
  sort ( arr, arr + n );
  for ( int i = 0;
  i < n;
  i ++ ) if ( arr [ i ] & 1 ) arr [ i ] *= - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4},{8,-74,89,65,51,-15,68,51,23,44,89},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{51,74,43,15,38,15,5,93},{-96,-75,-64,-20,-5,-2,1,40,46,64},{0,0,1,0,0,1,0,0,0},{1,2,4,4,17,22,23,28,35,38,39,39,41,42,42,45,46,49,49,49,50,59,62,68,69,71,73,76,78,79,80,87,88,88,90,90,91,93,95,96,98},{11,68,-52,-49,-57,-2,83,77,24,-20,85,11,43,-73,96,92,58,64,95,13,-14,14,24,-51,-24,-45,-44,96,-5,-56,59},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{44,7,44,68,34,66,69,55,10,96,42,41,77,69,10,10,91,60,51}};
    vector<int> param1 {0,8,28,6,7,5,34,24,14,13};
    vector<vector<int>> filled_function_param0 {{4},{8,-74,89,65,51,-15,68,51,23,44,89},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{51,74,43,15,38,15,5,93},{-96,-75,-64,-20,-5,-2,1,40,46,64},{0,0,1,0,0,1,0,0,0},{1,2,4,4,17,22,23,28,35,38,39,39,41,42,42,45,46,49,49,49,50,59,62,68,69,71,73,76,78,79,80,87,88,88,90,90,91,93,95,96,98},{11,68,-52,-49,-57,-2,83,77,24,-20,85,11,43,-73,96,92,58,64,95,13,-14,14,24,-51,-24,-45,-44,96,-5,-56,59},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{44,7,44,68,34,66,69,55,10,96,42,41,77,69,10,10,91,60,51}};
    vector<int> filled_function_param1 {0,8,28,6,7,5,34,24,14,13};
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