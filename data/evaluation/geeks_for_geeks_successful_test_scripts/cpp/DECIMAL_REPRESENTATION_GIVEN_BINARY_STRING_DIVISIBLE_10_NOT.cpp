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
bool f_gold ( string bin ) {
  int n = bin . size ( );
  if ( bin [ n - 1 ] == '1' ) return false;
  int sum = 0;
  for ( int i = n - 2;
  i >= 0;
  i -- ) {
    if ( bin [ i ] == '1' ) {
      int posFromRight = n - i - 1;
      if ( posFromRight % 4 == 1 ) sum = sum + 2;
      else if ( posFromRight % 4 == 2 ) sum = sum + 4;
      else if ( posFromRight % 4 == 3 ) sum = sum + 8;
      else if ( posFromRight % 4 == 0 ) sum = sum + 6;
    }
  }
  if ( sum % 10 == 0 ) return true;
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"101000","39613456759141","11","PoiHjo","2","0000101","T  s dZKeDX gK","3944713969","1000","ifYUgdpmt"};
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