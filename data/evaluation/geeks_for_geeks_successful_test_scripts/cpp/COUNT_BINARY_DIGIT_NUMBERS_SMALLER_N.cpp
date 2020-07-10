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
int f_gold ( int N ) {
  queue < int > q;
  q . push ( 1 );
  int cnt = 0;
  int t;
  while ( ! q . empty ( ) ) {
    t = q . front ( );
    q . pop ( );
    if ( t <= N ) {
      cnt ++;
      q . push ( t * 10 );
      q . push ( t * 10 + 1 );
    }
  }
  return cnt;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {1,3,150932532,71,44,36,88,69,53,20};
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