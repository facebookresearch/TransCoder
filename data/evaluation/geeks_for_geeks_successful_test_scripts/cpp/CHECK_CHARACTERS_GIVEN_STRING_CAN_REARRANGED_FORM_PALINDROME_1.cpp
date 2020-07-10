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
bool f_gold ( string str ) {
  vector < char > list;
  for ( int i = 0;
  i < str . length ( );
  i ++ ) {
    auto pos = find ( list . begin ( ), list . end ( ), str [ i ] );
    if ( pos != list . end ( ) ) {
      auto posi = find ( list . begin ( ), list . end ( ), str [ i ] );
      list . erase ( posi );
    }
    else list . push_back ( str [ i ] );
  }
  if ( str . length ( ) % 2 == 0 && list . empty ( ) || ( str . length ( ) % 2 == 1 && list . size ( ) == 1 ) ) return true;
  else return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"abccba","2674377254","11","abcdecba","26382426486138","111010111010","hUInqJXNdbfP","5191","1110101101","NupSrU xz"};
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