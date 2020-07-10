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
int f_gold ( int A [ ], int N, int M ) {
  int ans = 0;
  int h [ M ] = {
    0 };
    for ( int i = 0;
    i < N;
    i ++ ) {
      A [ i ] = A [ i ] % M;
      h [ A [ i ] ] ++;
    }
    for ( int i = 0;
    i < M;
    i ++ ) {
      for ( int j = i;
      j < M;
      j ++ ) {
        int rem = ( M - ( i + j ) % M ) % M;
        if ( rem < j ) continue;
        if ( i == j && rem == j ) ans += h [ i ] * ( h [ i ] - 1 ) * ( h [ i ] - 2 ) / 6;
        else if ( i == j ) ans += h [ i ] * ( h [ i ] - 1 ) * h [ rem ] / 2;
        else if ( i == rem ) ans += h [ i ] * ( h [ i ] - 1 ) * h [ j ] / 2;
        else if ( rem == j ) ans += h [ j ] * ( h [ j ] - 1 ) * h [ i ] / 2;
        else ans = ans + h [ i ] * h [ j ] * h [ rem ];
      }
    }
    return ans;
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,7,13,16,19,20,21,25,28,31,36,38,42,44,50,54,55,56,63,63,63,65,65,65,67,71,73,73,76,78,87,90,91,99},{28,-8,-86,-6,-28,74,82,88,-62,-24,-14,68,36,-54,-16,-52,-78,-24,68,-2,30,-56,30,-86,-54,54,62,-30,-82,66,94,12,10,4,40,-72,20,-2,-90,-90},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{45,14,91,37,91},{-88,-78,-74,-50,-44,-34,-26,-22,14,46,48,80,82,86,88},{1,1,0,0,0,0,1,0,0,0,0,0,1,0,1,1,1,1,0,1,1},{9,14,16,18,23,36,37,58,78},{-56,86,58,-58,46,-62,8,-22,80,96,-74,-94,-94,-2,-4},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{62,36,66,84,20,43,93,47,85,70,50,96,3,8,38,96,15,31,97,90,1,69,77,20,68,11,2,92,50,8,23,83,76,6,32,43,92}};
    vector<int> param1 {27,29,29,3,13,11,7,13,37,18};
    vector<int> param2 {21,21,43,4,12,15,4,14,34,35};
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