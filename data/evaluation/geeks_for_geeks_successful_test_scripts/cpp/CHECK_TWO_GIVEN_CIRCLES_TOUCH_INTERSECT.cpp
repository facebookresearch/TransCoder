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
int f_gold ( int x1, int y1, int x2, int y2, int r1, int r2 ) {
  int distSq = ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 );
  int radSumSq = ( r1 + r2 ) * ( r1 + r2 );
  if ( distSq == radSumSq ) return 1;
  else if ( distSq > radSumSq ) return - 1;
  else return 0;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {11,87,51,89,64,57,65,32,73,3};
    vector<int> param1 {36,1,1,67,10,86,90,23,61,99};
    vector<int> param2 {62,62,47,9,79,99,42,28,63,6};
    vector<int> param3 {64,64,90,52,45,43,82,26,77,19};
    vector<int> param4 {50,54,14,94,67,83,77,60,92,21};
    vector<int> param5 {4,41,71,21,78,63,32,45,76,28};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i],param3[i],param4[i],param5[i]) == f_gold(param0[i],param1[i],param2[i],param3[i],param4[i],param5[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}