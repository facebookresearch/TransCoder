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
int f_gold ( int pages [ ], int n, int capacity ) {
  unordered_set < int > s;
  queue < int > indexes;
  int page_faults = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( s . size ( ) < capacity ) {
      if ( s . find ( pages [ i ] ) == s . end ( ) ) {
        s . insert ( pages [ i ] );
        page_faults ++;
        indexes . push ( pages [ i ] );
      }
    }
    else {
      if ( s . find ( pages [ i ] ) == s . end ( ) ) {
        int val = indexes . front ( );
        indexes . pop ( );
        s . erase ( val );
        s . insert ( pages [ i ] );
        indexes . push ( pages [ i ] );
        page_faults ++;
      }
    }
  }
  return page_faults;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{4,4,6,7,8,11,13,18,26,35,36,37,45,46,46,47,48,49,51,52,53,56,61,74,75,77,80,83,85,86,87,90,93,95,97,98,99,99},{78,-48,50,-20,-6,58,-8,66,72,68,4,80,58,-26,-82,-56,92,76,20,82,-46,86,38,60,-62,-48,76,8,-66,-4,-98,-96,-52,92},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{98,78,94,42,62,83,7,62,60,94,16,28,50,15,18,71,86,47,62,89},{-82,-70,-68,-56,-50,-44,4,18,28,30,30,42,66,78,80},{1,1,0,0,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,0},{4,5,13,15,18,28,32,40,46,46,55,57,61,63,65,68,77,79,79,96},{-2,82,2,-74,-6,-24,54,-74,-98,8,-94,-60,-42,-38,36,-38,-58,-70,-28,-34,70,-6,-2,-76,-40,-4,0,-4,76,48,-34,-26,-48,-58,-88,-44,20,-22,78},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{4,90,28,71,69,45,92,63,72,76,47,85,36,59,88,46,28,19,50,31,63,13}};
    vector<int> param1 {36,33,19,15,9,25,17,31,26,15};
    vector<int> param2 {37,23,13,11,11,25,18,24,24,12};
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