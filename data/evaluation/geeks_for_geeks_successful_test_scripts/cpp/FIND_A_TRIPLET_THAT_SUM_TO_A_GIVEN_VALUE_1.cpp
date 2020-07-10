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
bool f_gold ( int A [ ], int arr_size, int sum ) {
  int l, r;
  sort ( A, A + arr_size );
  for ( int i = 0;
  i < arr_size - 2;
  i ++ ) {
    l = i + 1;
    r = arr_size - 1;
    while ( l < r ) {
      if ( A [ i ] + A [ l ] + A [ r ] == sum ) {
        printf ( "Triplet is %d, %d, %d", A [ i ], A [ l ], A [ r ] );
        return true;
      }
      else if ( A [ i ] + A [ l ] + A [ r ] < sum ) l ++;
      else r --;
    }
  }
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{28,47,65,89},{-26,-64,-2,96,-52,-14,-56,52,-70,70,-64,74,-8,18,78,14,6,-16,50,84,-90,12,-88,52,52,-40,58,-48,98,-66,46,-88,68,12,0,70,-42},{0},{49,66,22,93,52,54,80,87},{-96,-92,-86,-74,-62,-60,-56,-54,-46,-38,-32,-26,-16,-16,-8,-4,0,6,20,28,42,44,56},{1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,1,0,0,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1,0,0,1,0,0,0,0,1},{1,2,16,16,20,24,24,38,41,54,57,72,79,83,89,90,96,97,98},{52,22,78,-30},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{72,40,92,11,98,20,4,58,49,11,58,28,16,16,44,10,50,23,83,41,41,92,1,28,26,83,6,52,48,9,77,51}};
    vector<int> param1 {3,22,0,5,13,39,12,2,21,29};
    vector<int> param2 {3,24,0,7,19,39,12,3,16,27};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i],param2[i]) == f_gold(&param0[i].front(),param1[i],param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}