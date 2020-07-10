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
string f_gold ( string s ) {
  if ( s == "" ) return "a";
  int i = s . length ( ) - 1;
  while ( s [ i ] == 'z' && i >= 0 ) i --;
  if ( i == - 1 ) s = s + 'a';
  else s [ i ] ++;
  return s;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"amKIRzPiqLTIy","68","100","f","802205375","0111","GRjRYIvYwgua","8139910006809","100101","rw"};
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