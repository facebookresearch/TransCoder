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
int f_gold ( int arr [ ], int n ) {
  int c [ 3 ] = {
    0 },
    i;
    int res = 0;
    for ( i = 0;
    i < n;
    i ++ ) c [ arr [ i ] % 3 ] ++;
    res += ( ( c [ 0 ] * ( c [ 0 ] - 1 ) ) >> 1 );
    res += c [ 1 ] * c [ 2 ];
    res += ( c [ 0 ] * ( c [ 0 ] - 1 ) * ( c [ 0 ] - 2 ) ) / 6;
    res += ( c [ 1 ] * ( c [ 1 ] - 1 ) * ( c [ 1 ] - 2 ) ) / 6;
    res += ( ( c [ 2 ] * ( c [ 2 ] - 1 ) * ( c [ 2 ] - 2 ) ) / 6 );
    res += c [ 0 ] * c [ 1 ] * c [ 2 ];
    return res;
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,3,6,12,18,31,36,43,47,59,64,64,69,69,94,98,98},{94,46,64,18,70,22,-98,52,-26,34,-22,22,40,66,-72,-66,86,84,12,-38,28,-60,-10,-30,-78,76,62,74,24,-64,0,92,-20,-66,-52},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{68,96,74,38,70,70},{-88,-74,-70,-64,-64,-64,-58,-52,-18,-10,-6,4,4,28,44,48,52,54,64,72,76,94},{0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,1,0,0,0,1,1,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,0,0,1},{9,12,14,21,27,28,45,50,54,57,58,62,78,82,91,92,95},{16,-46,-32,-36,-84,-14,-18,16,54,90,-4},{0,0,1,1},{53,32,54,84,79,37,44,30,92,53,89,95}};
    vector<int> param1 {12,23,29,5,18,36,9,8,3,8};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),param1[i]) == f_gold(&param0[i].front(),param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}