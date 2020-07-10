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
  int l = s . length ( );
  string s1 = "";
  bool isEven = ( l % 2 == 0 ) ? true : false;
  for ( int i = 0;
  i < l;
  i += 2 ) {
    if ( isEven ) {
      s1 = s [ i ] + s1;
      s1 += s [ i + 1 ];
    }
    else {
      if ( l - i > 1 ) {
        s1 += s [ i ];
        s1 = s [ i + 1 ] + s1;
      }
      else {
        s1 += s [ i ];
      }
    }
  }
  return s1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {" EgvQCeqYpZtv","488540","0000101010111","syw","402355","0","wmHMlAtq","7962","111111","UbgRGDquop"};
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