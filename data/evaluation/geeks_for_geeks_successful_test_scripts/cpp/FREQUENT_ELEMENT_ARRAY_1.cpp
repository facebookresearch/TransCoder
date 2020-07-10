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
  unordered_map < int, int > hash;
  for ( int i = 0;
  i < n;
  i ++ ) hash [ arr [ i ] ] ++;
  int max_count = 0, res = - 1;
  for ( auto i : hash ) {
    if ( max_count < i . second ) {
      res = i . first;
      max_count = i . second;
    }
  }
  return res;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{3,5,7,9,9,10,11,15,19,19,29,31,34,34,35,37,41,43,45,47,51,51,55,57,59,61,65,67,73,76,77,77,80,83,83,84,84,92,94},{14,-38,-84,24,82,-68,60,2,-22,54,90,90,-38,-8,-72,68,50,54,-32,-66,-10,-70,-28,18,58,-54,-30,60,-24,-48,22,32,-18,2,-64,-56,70,-92,-38,-70,22,-36,-64},{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},{76,18,41,46,34,41,56,76,14,82,51,87,1,92,9,2,68,82,43,98,88,62,84,25,7,87,37,7,55,98,60,99,92,56,17,82,28,43,40,1,99,79,38,75,84,61,21,11},{-92,-86,-86,-84,-70,-68,-68,-66,-62,-52,-52,-50,-48,-38,-22,-14,-6,4,8,10,10,16,22,36,38,40,50,50,70,78,80,86,96,96,98},{1,1,0,1,1,0,1,1,1,1,1,0,0,1,1,1,0,0,0,1,0,0,1,1,1,0,0,0},{3,53,56,57,66,73,76,94,97},{12,60,-94,92},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{95,93,82,73,61,24,73,21,47,91,48,42,76,12,89,21,3,30,5,49,26,54,16,70,50,21,58,36,16}};
    vector<int> param1 {24,28,18,37,21,18,8,3,21,25};
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