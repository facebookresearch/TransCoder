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
string f_gold ( string str, int k ) {
  string palin = str;
  int l = 0;
  int r = str . length ( ) - 1;
  while ( l < r ) {
    if ( str [ l ] != str [ r ] ) {
      palin [ l ] = palin [ r ] = max ( str [ l ], str [ r ] );
      k --;
    }
    l ++;
    r --;
  }
  if ( k < 0 ) return "Not possible";
  l = 0;
  r = str . length ( ) - 1;
  while ( l <= r ) {
    if ( l == r ) {
      if ( k > 0 ) palin [ l ] = '9';
    }
    if ( palin [ l ] < '9' ) {
      if ( k >= 2 && palin [ l ] == str [ l ] && palin [ r ] == str [ r ] ) {
        k -= 2;
        palin [ l ] = palin [ r ] = '9';
      }
      else if ( k >= 1 && ( palin [ l ] != str [ l ] || palin [ r ] != str [ r ] ) ) {
        k --;
        palin [ l ] = palin [ r ] = '9';
      }
    }
    l ++;
    r --;
  }
  return palin;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {"wUJmbRlwogtFv","43435","43435","12345","5032","0100000001101","sBrbNQiRwQd","7549384614","10000001","VqrTsaoD"};
    vector<int> param1 {5,3,1,1,3,5,4,3,4,4};
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