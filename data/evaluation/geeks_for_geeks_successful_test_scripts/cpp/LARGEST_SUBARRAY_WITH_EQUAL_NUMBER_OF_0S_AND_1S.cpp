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
  int sum = 0;
  int maxsize = - 1, startindex;
  for ( int i = 0;
  i < n - 1;
  i ++ ) {
    sum = ( arr [ i ] == 0 ) ? - 1 : 1;
    for ( int j = i + 1;
    j < n;
    j ++ ) {
      ( arr [ j ] == 0 ) ? ( sum += - 1 ) : ( sum += 1 );
      if ( sum == 0 && maxsize < j - i + 1 ) {
        maxsize = j - i + 1;
        startindex = i;
      }
    }
  }
  if ( maxsize == - 1 ) cout << "No such subarray";
  else cout << startindex << " to " << startindex + maxsize - 1;
  return maxsize;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{56,8,67,35,19,82,81,66,10,24,82,2,42,48,18,63,48,74,60,64,64,95,95,20,95,55,63,96,54},{78,67,1,78,48,83,17,19,21,44,99,68,16,54,9},{3,69,97,21,12,67,45,53,77,70,26,43},{21,80,29,22,77,64,42,4,71,75,62,27,30,36,66,37,49,97},{18,66,9,90,21,95,74,48,44,9,43,17},{42,41,87,3,64,25,96,55,99,57,32,64,10,75,69,95,11,36,15,2,78,70,14,54,11,28,55,47,27,85,47,62,97,68,44,70,12,27,36,85,76,91,17,75,83,34,32,89,55},{44},{1,43,28,17,30,46,89,51,15,70,96,79,65,55,8},{25,91,68,4,35,49,33},{14,86,22,42,94,54,28,41,48,8,82,84,99,92,33,75,38,31,59,86,21,6,77,89,79,83,57,26,89,45,60,55,60,76,76,6,40,57,38,44,7,98,64,65,88,73,88,99}};
    vector<int> param1 {26,8,9,10,10,41,0,9,4,26};
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