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
int f_gold ( int a, int b, int c ) {
  if ( ( a < b && b < c ) || ( c < b && b < a ) ) return b;
  else if ( ( b < a && a < c ) || ( c < a && a < b ) ) return a;
  else return c;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {56,56,36,71,3,84,30,82,90,38};
    vector<int> param1 {5,60,56,54,70,57,80,54,70,4};
    vector<int> param2 {82,17,51,6,81,47,85,32,55,5};
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