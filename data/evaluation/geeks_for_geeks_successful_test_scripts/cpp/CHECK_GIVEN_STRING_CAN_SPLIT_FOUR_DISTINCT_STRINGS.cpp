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
bool f_gold ( string s ) {
  if ( s . size ( ) >= 10 ) return true;
  for ( int i = 1;
  i < s . size ( );
  i ++ ) {
    for ( int j = i + 1;
    j < s . size ( );
    j ++ ) {
      for ( int k = j + 1;
      k < s . size ( );
      k ++ ) {
        string s1 = s . substr ( 0, i );
        string s2 = s . substr ( i, j - i );
        string s3 = s . substr ( j, k - j );
        string s4 = s . substr ( k, s . size ( ) - k );
        if ( s1 != s2 && s1 != s3 && s1 != s4 && s2 != s3 && s2 != s4 && s3 != s4 ) return true;
      }
    }
  }
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"WKTj Nw","8235021","0101","BLMhiQsQcFla","00363175722","10000","aqEYWNd bqgye","83","000011110111","E"};
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