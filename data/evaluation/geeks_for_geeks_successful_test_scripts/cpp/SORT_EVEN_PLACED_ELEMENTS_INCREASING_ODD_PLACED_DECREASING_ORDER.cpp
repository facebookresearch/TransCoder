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
void f_gold ( int arr [ ], int n ) {
  vector < int > evenArr;
  vector < int > oddArr;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( ! ( i % 2 ) ) evenArr . push_back ( arr [ i ] );
    else oddArr . push_back ( arr [ i ] );
  }
  sort ( evenArr . begin ( ), evenArr . end ( ) );
  sort ( oddArr . begin ( ), oddArr . end ( ), greater < int > ( ) );
  int i = 0;
  for ( int j = 0;
  j < evenArr . size ( );
  j ++ ) arr [ i ++ ] = evenArr [ j ];
  for ( int j = 0;
  j < oddArr . size ( );
  j ++ ) arr [ i ++ ] = oddArr [ j ];
}


//TOFILL


int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,6,6,10,15,21,38,50,51,72,79,81,82,84,85,86,87},{82,-36,18,-88,-24,20,26,-52,28,2},{0,0,0,1,1,1},{81,47,38,70,35,43,94,30,57,55,78,97,72,1},{-80,-78,-72,-46,-26,-24,-20,8,16,26,38,44,54,68,68,78,86,92},{0,0,1,1,1,0,1,1,1,1,0,1,1,1,1,0,1,1,0,0,1,0,1,1,1,1,1,0,0,0},{3,4,9,12,20,30,33,34,37,38,50,51,52,54,60,69,73,74,92,93,94,97,98},{86,-32,64,-36,-36,-30,-66,-60,-76,-56,-60,-16,-60,-98,-18,72,-14},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{61,11,46,40,82,35,37,41,52,76,13,53,53,3,40,29,7,51,20,51,87,1,80,73,89,93,1,71,33,50,62,85,46,1,71,54,81,85}};
    vector<int> param1 {15,7,3,8,11,21,13,10,29,36};
    vector<vector<int>> filled_function_param0 {{6,6,6,10,15,21,38,50,51,72,79,81,82,84,85,86,87},{82,-36,18,-88,-24,20,26,-52,28,2},{0,0,0,1,1,1},{81,47,38,70,35,43,94,30,57,55,78,97,72,1},{-80,-78,-72,-46,-26,-24,-20,8,16,26,38,44,54,68,68,78,86,92},{0,0,1,1,1,0,1,1,1,1,0,1,1,1,1,0,1,1,0,0,1,0,1,1,1,1,1,0,0,0},{3,4,9,12,20,30,33,34,37,38,50,51,52,54,60,69,73,74,92,93,94,97,98},{86,-32,64,-36,-36,-30,-66,-60,-76,-56,-60,-16,-60,-98,-18,72,-14},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{61,11,46,40,82,35,37,41,52,76,13,53,53,3,40,29,7,51,20,51,87,1,80,73,89,93,1,71,33,50,62,85,46,1,71,54,81,85}};
    vector<int> filled_function_param1 {15,7,3,8,11,21,13,10,29,36};
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(&filled_function_param0[i].front(),filled_function_param1[i]);
        f_gold(&param0[i].front(),param1[i]);
        if(equal(begin(param0[i]), end(param0[i]), begin(filled_function_param0[i])) && param1[i] == filled_function_param1[i])
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}