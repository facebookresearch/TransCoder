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
int f_gold ( int r ) {
  if ( r <= 0 ) return 0;
  int result = 4;
  for ( int x = 1;
  x < r;
  x ++ ) {
    int ySquare = r * r - x * x;
    int y = sqrt ( ySquare );
    if ( y * y == ySquare ) result += 4;
  }
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {34,56,90,47,36,63,21,76,18,75};
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