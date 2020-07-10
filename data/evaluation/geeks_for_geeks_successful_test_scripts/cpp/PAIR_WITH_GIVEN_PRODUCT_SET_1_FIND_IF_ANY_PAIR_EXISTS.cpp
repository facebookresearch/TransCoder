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
bool f_gold ( int arr [ ], int n, int x ) {
  for ( int i = 0;
  i < n - 1;
  i ++ ) for ( int j = i + 1;
  i < n;
  i ++ ) if ( arr [ i ] * arr [ j ] == x ) return true;
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,4,5,5,6,11,18,29,29,30,35,36,38,38,40,43,43,43,50,53,58,61,62,63,64,64,65,72,73,77,78,78,84,90,94,96},{-72,16,0,68,-58,58,46,38,-28,-56,-28,-14,-56,40,30,80,94,-52,0,-88,8,-96,-52,-96,48,-10,-32,-74,88,18,70},{0,0,0,0,0,1,1,1,1},{78,49,30,28,71,70,29,43,91,56,51,47,21,57,69,28,68,78,38,31,35,33,55,18,88,15,69,7,51,75,8,64,6,84,79,23,62,10,71,52,77},{-90,-86,-76,-72,-70,-62,-56,-50,-18,-12,-10,4,16,26,42,48,52,54,54,70,84,86,88,98},{1},{4,7,14,14,16,18,19,20,22,24,29,38,38,38,40,40,46,46,47,51,51,52,55,56,56,62,62,62,78,79,81,84,86,88,89,89,89},{72,80,-82,24,-98,90,-32,-56,-22,8,-12,8,-78,60,-62,50,12,-60,10,-54,74,98,26,56,24},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},{93,40,48,99,95,59,43,58,79,70,28}};
    vector<int> param1 {28,25,7,35,23,0,23,21,22,9};
    vector<int> param2 {26,16,8,25,23,0,32,19,18,5};
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