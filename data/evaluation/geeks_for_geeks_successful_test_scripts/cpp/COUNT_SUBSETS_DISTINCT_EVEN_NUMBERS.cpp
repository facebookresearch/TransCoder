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
  unordered_set < int > us;
  int even_count = 0;
  for ( int i = 0;
  i < n;
  i ++ ) if ( arr [ i ] % 2 == 0 ) us . insert ( arr [ i ] );
  unordered_set < int > :: iterator itr;
  for ( itr = us . begin ( );
  itr != us . end ( );
  itr ++ ) even_count ++;
  return ( pow ( 2, even_count ) - 1 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,8,14,22,24,24,26,32,33,46,50,51,51,52,53,71,76,93},{-62,30,12,30,22,6,-42,80,-62,34,32,-72,-6,-16,42,82,-78,-20,-96,44,-24,-50,-50,-94,72,-90,38,84,-86,-24,-62,86,94,6,90,12,-36,0,44,4,-78,-86,-12,-18,26,32,90,76},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{70,55,67,9,78,57,31,25},{-98,-90,-80,-80,-68,-68,-50,-44,-38,-34,-18,-16,-10,-8,14,14,16,24,26,28,30,40,44,46,52,54,58,66,74,74,74,76,80,86,94,96},{0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,1},{7,10,11,13,14,16,20,26,30,31,33,33,35,39,42,50,51,52,55,57,58,59,62,63,63,65,67,67,68,69,69,71,73,73,74,76,82,86,87,87,87,88,94,99},{-6,8,-14,2,-36,-44,-50,-4,-4,-22,94,-94,-62,4,-84,-82,88,84,28,76,-84,-72,14,-28,96,18,-56,-96,2,-66,62,-78,88,34,0,-48,-76,-84,-2,-98,58,38,56},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{75,92,42,5,53,78,42,97,99,56,23,16,90,1,79,49,63,95,12,21,82,31,10,35,34,80,22,73,68,68,48,11,15,60,24,57,74,18,30,57,66,97,78,65,79}};
    vector<int> param1 {16,47,32,6,30,11,39,23,17,29};
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