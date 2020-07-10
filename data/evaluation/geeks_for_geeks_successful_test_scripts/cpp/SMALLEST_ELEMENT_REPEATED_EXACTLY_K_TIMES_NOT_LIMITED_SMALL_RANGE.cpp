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
int f_gold ( int a [ ], int n, int k ) {
  unordered_map < int, int > m;
  for ( int i = 0;
  i < n;
  i ++ ) m [ a [ i ] ] ++;
  int res = INT_MAX;
  for ( auto it = m . begin ( );
  it != m . end ( );
  ++ it ) if ( it -> second == k ) res = min ( res, it -> first );
  return ( res != INT_MAX ) ? res : - 1;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{1,5,5,8,11,13,14,15,15,16,18,23,24,26,28,31,33,39,39,39,40,41,44,51,53,55,55,59,59,61,64,65,74,74,76,76,76,77,87,88,88,94,95,96},{-98,-64,-44,20,-46,96,-48,-54,-26,30,-42,94,58,-58,-54,50,6,-34,-44,-50,-66,-14,-96,74,4,-86,56,-46,-94,-24,-80,58,34,24},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{55,78,71,60,41,82,45,66,46,5,92,49,57,16,49,40,77,40,44,47,52,58,33,3,27,37,38,56,3,32,7,17,43,35,79,66,50,63,97,12,16},{-90,-86,-74,-68,-64,-56,-30,-24,-14,-2,0,2,8,16,18,20,24,30,32,36,42,54,62,62,62,62,76,78,90,92,94},{0,1,0,1,1,0,0,1,1,1,1,1,1,1,0,0,0,0,1,0,0,1,1},{4,5,5,5,10,13,17,17,20,20,22,25,28,36,40,42,49,51,57,59,65,66,66,68,72,74,78,81,87,88,94,95},{-12,-20,-78,-10,6,26,-94,-48,22,-2,12,-68,-90,-22,-94,-94,-10,-66,62,-20,74,-90,54,-52,90,50,60,10,56,-32,52,-12,-84,66,-82,34,24,-8,-60,-20,-94,80},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{2,57,53,3,63,29,12,99,21,26,3,35,96,84,48,61}};
    vector<int> param1 {27,26,26,32,22,18,28,28,29,10};
    vector<int> param2 {2,2,1,3,2,8,7,3,2,1};
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
