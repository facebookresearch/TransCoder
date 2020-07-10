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
int f_gold ( int arr [ ], int n, int x ) {
  int i = 0;
  while ( i < n ) {
    if ( arr [ i ] == x ) return i;
    i = i + abs ( arr [ i ] - x );
  }
  cout << "number is not present!";
  return - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3} ,{6,90},{1, 2, 3, 4, 5, 4},{97,35,60,96,3,67,72,95,55,9,69,28,15,91,31,59},{-84,-78,-74,-70,-68,-60,-56,-54,-48,-46,-28,-16,-6,0,0,8,8,8,12,16,26,30,32,34,36,40,46,48,70,70,72,76,78,78,80,84,84,86},{1,0,1,1,1,1,0,1,1,1,1},{55,64,76,79,93,96},{66,-90,98,-50,0,46,42,64,-96,-80,-96,20,-10,-84},{0,0,0,0,0,0,1},{94,4,34,87,32,3,92,68,57,76,24,33,3,4,30,70,49,30,72,82,16,53,6,24,92,96,89,28,21,8,36,9,40,85,51,1,63,68,74,26,40,3,9,32,67,4,6,73}};
    vector<int> param1 {12,1,6,15,22,5,4,8,6,25};
    vector<int> param2 {3,1,5,9,31,7,4,13,5,25};
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
