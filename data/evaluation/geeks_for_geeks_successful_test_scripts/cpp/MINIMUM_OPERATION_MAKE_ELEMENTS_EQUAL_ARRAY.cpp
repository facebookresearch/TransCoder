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
  int max_count = 0;
  for ( auto i : hash ) if ( max_count < i . second ) max_count = i . second;
  return ( n - max_count );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,4,6,8,17,25,29,33,33,33,38,42,43,49,55,60,62,63,68,69,70,75,77,79,79,85,87,87,90,90,90,90,94,98},{-66,-44,72,-82,46,66,-78,-62,32,86,62,56,22,-58,46,-6,94},{0,1,1},{68,78,2,48,1,10,18,67,97,31,72,12,25,39,51,12,29,46,93,66,28,29,5,86,97,59,7,94,64,13,42,48,25,33,10,1,5,32,14,27},{-98,-96,-78,-72,-64,-62,-56,-40,-36,-14,-8,4,18,22,28,32,52,56,58,60,78,88,94},{0,0,1,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0},{3,3,7,9,14,15,15,25,25,26,28,31,37,37,47,51,53,58,58,60,63,65,68,70,70,71,77,79,81,88,89,97},{40,-64,-62,74,-10,48,-56,70,-60,54,-6,74,-8,-54,-20,-50,40,-22,-54,-76,-92,-76,36,16,-42,58,-74,-90,-54,-32,-38,-50,74,26,52,38,24,-32,78,68,82,36,64,56,86,-28,-44,48,88},{0,0,1,1,1,1,1},{87,77,76,1,59,15,98,45,62,10,87,59,13,50,58,10}};
    vector<int> param1 {33,11,1,36,18,21,23,36,4,9};
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