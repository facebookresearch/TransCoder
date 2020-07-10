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
int f_gold ( int arr [ ], int low, int high, int key ) {
  if ( high < low ) return - 1;
  int mid = ( low + high ) / 2;
  if ( key == arr [ mid ] ) return mid;
  if ( key > arr [ mid ] ) return f_gold ( arr, ( mid + 1 ), high, key );
  return f_gold ( arr, low, ( mid - 1 ), key );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,10,73,91,98},{30,24,24,-8,64,50,46,-76,26,8,-92,-78,40,-86,96,14,60,38,6,-72,-6,-20,26,-26,0,2},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{30,79,3,76,18},{-96,-90,-88,-84,-78,-78,-70,-68,-66,-66,-64,-64,-58,-56,-52,-42,-40,-38,-36,-30,-30,-28,-14,-8,0,14,16,22,24,26,36,40,40,48,48,50,52,54,54,58,64,74,82,88,94},{1,1,0,0,0,1,1,1,0,0,1,0,1,0,0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,1,1,0,1},{2,8,8,14,15,16,17,17,18,18,24,25,25,26,36,37,39,39,40,44,46,47,51,54,56,57,57,61,61,67,68,69,72,76,77,81,82,82,82,85,85,87,94,94,98,99},{-4,84,20,-84,-6,-78,20,56,40,0,98,80,-94,36,-6,-98,50,66,-12,-58,-34,68,-80,-30,-82,-76,-38,-60,92,94,48,-84,20,-66,-32,-92,16,-96,-68,94,-46,30,32,-34,96,-92,-96,-86,-22},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{71,70,13,18,70,62,88,27,17,44,89,28,74,41,20,91,95,79,40,43,38,20,5}};
    vector<int> param1 {2,20,30,3,35,25,33,34,19,21};
    vector<int> param2 {4,13,27,2,30,26,40,27,13,22};
    vector<int> param3 {4,21,29,2,40,30,26,34,19,22};
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