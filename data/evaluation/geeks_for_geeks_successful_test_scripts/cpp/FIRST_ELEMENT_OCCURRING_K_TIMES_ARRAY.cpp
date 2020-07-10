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
int f_gold ( int arr [ ], int n, int k ) {
  unordered_map < int, int > count_map;
  for ( int i = 0;
  i < n;
  i ++ ) count_map [ arr [ i ] ] ++;
  for ( int i = 0;
  i < n;
  i ++ ) if ( count_map [ arr [ i ] ] == k ) return arr [ i ];
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,3,4,4,7,18,20,23,27,30,31,31,32,35,36,43,45,46,49,50,53,55,59,60,64,64,65,68,78,80,80,85,95},{-26,32,36,6,64,24,-28,96},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{38,40,43,70,20,40,95,96,81,82},{-68,-8,-8,16,24,54},{1,0,1,0,0,0,1,0,1,0,0,0,1},{13,18,19,28,31,34,49,49,53,57,58,62,75,76,77,78,80,84,84,85,87,91,98,99},{-4,24,-86,-84,30,-16,12,-92,-68,22},{0,0,0,0,0,0,0,0,0,1,1,1,1},{55,44,75,97,25,65,76,53,20,78,25,59,61,29,81,35,15,78,41,44,31,33,39,93,26,67}};
    vector<int> param1 {30,6,15,9,3,6,20,6,8,23};
    vector<int> param2 {2,3,7,1,2,4,2,5,10,20};
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