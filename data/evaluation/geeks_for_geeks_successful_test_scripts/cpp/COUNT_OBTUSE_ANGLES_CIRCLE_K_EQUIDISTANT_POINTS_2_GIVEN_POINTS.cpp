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
int f_gold ( int a, int b, int k ) {
  int c1 = ( b - a ) - 1;
  int c2 = ( k - b ) + ( a - 1 );
  if ( c1 == c2 ) return 0;
  return min ( c1, c2 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {83,3,11,50,40,62,40,66,6,25};
    vector<int> param1 {98,39,96,67,16,86,78,11,9,5};
    vector<int> param2 {86,87,30,48,32,76,71,74,19,5};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i]) == f_gold(param0[i],param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}