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
int f_gold ( long long int A, long long int B ) {
  int variable = 1;
  if ( A == B ) return 1;
  else if ( ( B - A ) >= 5 ) return 0;
  else {
    for ( long long int i = A + 1;
    i <= B;
    i ++ ) variable = ( variable * ( i % 10 ) ) % 10;
    return variable % 10;
  }
}


//TOFILL

int main() {
    int n_success = 0;
    vector<long> param0 {79,61,39,39,61,86,7,86,86,11};
    vector<long> param1 {84,29,77,65,78,73,92,50,63,2};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i]) == f_gold(param0[i],param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}