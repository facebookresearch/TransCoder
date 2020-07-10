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
double f_gold ( double a, double b ) {
  double mod;
  if ( a < 0 ) mod = - a;
  else mod = a;
  if ( b < 0 ) b = - b;
  while ( mod >= b ) mod = mod - b;
  if ( a < 0 ) return - mod;
  return mod;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<double> param0 {3243.229719038493,-4362.665881044217,7255.066257575837,-6929.554320261099,3569.942027998315,-6513.849053096595,7333.183189243961,-2856.1752826258803,9787.228111241662,-1722.873699288031};
    vector<double> param1 {5659.926861939672,-9196.507113304497,2623.200060506935,-3009.0234530313287,6920.809419868375,-70.95992406437102,580.3500610971768,-9625.97442825802,2419.6844962423256,-8370.700544254058};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(abs(1 - (0.0000001 + abs(f_gold(param0[i],param1[i])) )/ (abs(f_filled(param0[i],param1[i])) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}