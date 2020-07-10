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
int f_gold ( int notes [ ], int n ) {
  int fiveCount = 0;
  int tenCount = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( notes [ i ] == 5 ) fiveCount ++;
    else if ( notes [ i ] == 10 ) {
      if ( fiveCount > 0 ) {
        fiveCount --;
        tenCount ++;
      }
      else return 0;
    }
    else {
      if ( fiveCount > 0 && tenCount > 0 ) {
        fiveCount --;
        tenCount --;
      }
      else if ( fiveCount >= 3 ) {
        fiveCount -= 3;
      }
      else return 0;
    }
  }
  return 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {
    {5, 5, 5, 10, 20},
    {5,5,5,20,10},
    {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,10,10,10,10,10,10,10,10,10,10,10,10,10},
    {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,18},
    {5,5,20},
    {10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
    {5,10,20,5,5,5,5,5,5,5,5,5,5,5,5},
    {-82,-10,-78,-84,68,62,10,20,-86,-98,92,70,40,-12,-20,-36,8,-70,6,8,44,-24,8,-18,76,-54,-14,-94,-68,-62,-24,-36,-74,92,92,-80,48,56,94},
    {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
    {46,46,93,57,82,34,83,80,77,36,80,85,69,28,9,56,49,27,83,25,1,80,99,14,69,82,79,71,74,34}};
    vector<int> param1 {4,5,27,12,2,17,7,31,25,20};
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