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
  unordered_map < int, int > mp;
  for ( int i = 0;
  i < n;
  i ++ ) mp [ arr [ i ] ] ++;
  int ans = 0;
  for ( auto it = mp . begin ( );
  it != mp . end ( );
  it ++ ) {
    int count = it -> second;
    ans += ( count * ( count - 1 ) ) / 2;
  }
  return ans;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{5,11,18,22,40,46,50,51,53,55,64,67,73,78,86},{14,-98,98,58,-82,90,-80,-56,-30,-36,-56,-30,-58,68,72,-76,38,-90,-72,4,-32,32,-28,2,12,-72,54,2,0,-74,8,12,46,72,-84,-66,70,18,26,72,-26,44,-8,20,-32,-56,28},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{93,23,62,64,31,78,99},{-94,-94,-92,-86,-84,-76,-76,-68,-66,-56,-56,-54,-50,-46,-38,-34,-34,-30,-26,-18,-16,2,8,42,52,54,56,64,68,82,82,82,94,96,98},{0},{3,18,18,20,21,23,24,27,35,36,38,40,46,50,50,51,52,53,59,61,63,63,65,66,68,68,70,71,74,75,96,98},{-68,40,16,50,36,42,-20,-46,-92,4,-18,-12,48,0,-46,64,-74,-50,42,44,-56,28,-10,78,62,70,-60,12,-44,-78},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{31,5}};
    vector<int> param1 {14,24,13,4,19,0,19,23,30,1};
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