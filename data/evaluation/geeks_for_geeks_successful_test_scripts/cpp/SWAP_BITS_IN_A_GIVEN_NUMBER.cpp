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
int f_gold ( unsigned int x, unsigned int p1, unsigned int p2, unsigned int n ) {
  unsigned int set1 = ( x >> p1 ) & ( ( 1U << n ) - 1 );
  unsigned int set2 = ( x >> p2 ) & ( ( 1U << n ) - 1 );
  unsigned int Xor = ( set1 ^ set2 );
  Xor = ( Xor << p1 ) | ( Xor << p2 );
  unsigned int result = x ^ Xor;
  return result;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<int> param0 {95,16,55,75,90,58,69,5,36,62};
    vector<int> param1 {88,26,56,35,12,65,64,1,33,69};
    vector<int> param2 {97,59,40,79,59,25,17,59,97,66};
    vector<int> param3 {92,42,41,30,34,19,94,38,44,9};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i],param2[i],param3[i]) == f_gold(param0[i],param1[i],param2[i],param3[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}