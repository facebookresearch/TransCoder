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
bool f_gold ( int arr [ ], int n, int sum ) {
  bool subset [ 2 ] [ sum + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) {
    for ( int j = 0;
    j <= sum;
    j ++ ) {
      if ( j == 0 ) subset [ i % 2 ] [ j ] = true;
      else if ( i == 0 ) subset [ i % 2 ] [ j ] = false;
      else if ( arr [ i - 1 ] <= j ) subset [ i % 2 ] [ j ] = subset [ ( i + 1 ) % 2 ] [ j - arr [ i - 1 ] ] || subset [ ( i + 1 ) % 2 ] [ j ];
      else subset [ i % 2 ] [ j ] = subset [ ( i + 1 ) % 2 ] [ j ];
    }
  }
  return subset [ n % 2 ] [ sum ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,6,7,9,11,23,25,33,55,81,82,90,93,98},{-44,-96,48,90,-26,66,-82,16,80,96,64,64,-78,-8,20,-74,-32,62,88,-62,28,-46,-40,-62,18,-46,50,-32,-26,-68,66,20,6,34,-20,-96,-26,-76,-64,46,-38},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{78,36,15,81,56,57,73,78,88,11,93,89,68,96,32,67,6,19,17,48,64,5,74,91,36,96,57,85,96,43,98,79,73,2},{-84,-60,-56,-32,70,82},{0,1,0,0,1,1,1,0,1},{42,57,77,85,87,89,90},{-82,68,70,-18,44,-48,-24,82,8,74,90,-72,-66,24,44,24,26,-80,-70,16,90,-54,-32,-54,70,48,-56,-16,-42},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{3,30,94,96,95,21,84,76,35,52,18,87,60,28,78,72,80,58,65,5}};
    vector<int> param1 {10,36,29,23,4,8,3,14,23,16};
    vector<int> param2 {7,40,39,29,4,5,6,14,24,14};
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