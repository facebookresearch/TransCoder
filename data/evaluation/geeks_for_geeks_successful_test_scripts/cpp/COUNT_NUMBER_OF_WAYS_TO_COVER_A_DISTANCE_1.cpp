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
int f_gold ( int dist ) {
  int count [ dist + 1 ];
  count [ 0 ] = 1, count [ 1 ] = 1, count [ 2 ] = 2;
  for ( int i = 3;
  i <= dist;
  i ++ ) count [ i ] = count [ i - 1 ] + count [ i - 2 ] + count [ i - 3 ];
  return count [ dist ];
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {37,82,87,80,92,58,98,53,11,58};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i]) == f_gold(param0[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}