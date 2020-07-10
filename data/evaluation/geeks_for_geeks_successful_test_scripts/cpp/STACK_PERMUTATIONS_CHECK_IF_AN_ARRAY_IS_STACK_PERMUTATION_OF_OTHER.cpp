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
bool f_gold ( int ip [ ], int op [ ], int n ) {
  queue < int > input;
  for ( int i = 0;
  i < n;
  i ++ ) input . push ( ip [ i ] );
  queue < int > output;
  for ( int i = 0;
  i < n;
  i ++ ) output . push ( op [ i ] );
  stack < int > tempStack;
  while ( ! input . empty ( ) ) {
    int ele = input . front ( );
    input . pop ( );
    if ( ele == output . front ( ) ) {
      output . pop ( );
      while ( ! tempStack . empty ( ) ) {
        if ( tempStack . top ( ) == output . front ( ) ) {
          tempStack . pop ( );
          output . pop ( );
        }
        else break;
      }
    }
    else tempStack . push ( ele );
  }
  return ( input . empty ( ) && tempStack . empty ( ) );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{2,3,3,3,4,5,6,9,18,20,35,39,39,45,50,55,57,61,63,65,72,73,77,77,78,87,88,91,93,95,98},{-86,10,-8,8,-24,-2,-84,-86,-54,50,56,-22,-8,-62,0,-50,-32},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{3,42,88,89,41,71,67,5,84,20,75,36,34,20,31,16,86,89,53,47,57,27,47,93,59,66,40,18,69,36,98,99,81},{-98,-94,-94,-90,-88,-82,-80,-78,-78,-68,-58,-58,-52,-36,-30,-14,-12,-6,-2,-2,2,4,10,14,22,24,26,38,38,46,46,48,50,54,58,60,64,64,66,70,74,74,86,88,96,96},{1,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1},{19,37,44,65,72,87},{88},{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},{5,8,53,60,85,94,77,53,81,54,67,48,56,49,16,1,85,6,55,98,62,36,4,7,64}};
    vector<vector<int>> param1 {{2,5,7,13,16,23,24,25,27,31,31,33,34,35,38,46,49,49,51,52,58,61,62,66,68,71,73,78,91,94,98},{-8,-46,22,-66,-94,-96,70,58,-4,-70,-96,34,-80,-26,-52,52,-76},{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{16,61,39,99,71,73,35,47,62,80,1,49,54,35,39,55,7,6,85,84,11,51,38,4,72,10,33,65,64,32,16,99,9},{-92,-92,-80,-72,-72,-72,-70,-68,-64,-56,-40,-38,-34,-24,-10,-8,-8,-2,0,2,4,6,14,14,18,20,34,36,36,38,38,42,48,56,64,70,72,76,76,76,76,78,84,90,94,96},{0,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0},{17,31,39,46,56,88},{-30},{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1},{69,37,32,5,84,14,25,9,86,85,30,82,99,92,32,43,79,58,75,90,49,54,95,76,80}};
    vector<int> param2 {23,16,21,19,27,19,4,0,13,12};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(&param0[i].front(),&param1[i].front(),param2[i]) == f_gold(&param0[i].front(),&param1[i].front(),param2[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}