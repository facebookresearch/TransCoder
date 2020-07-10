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
void f_gold ( int arr [ ], int l, int h ) {
  if ( l >= h ) return;
  if ( arr [ l ] > arr [ h ] ) swap ( arr [ l ], arr [ h ] );
  if ( h - l + 1 > 2 ) {
    int t = ( h - l + 1 ) / 3;
    f_gold ( arr, l, h - t );
    f_gold ( arr, l + t, h );
    f_gold ( arr, l, h - t );
  }
}


//TOFILL

int main() {
    int n_success = 0;
    vector<vector<int>> param0 {{6,25,42,52,53,54,58,66,67,70},{-13,-98,50,-63,48,3,-76,12,-35,93,29,17,16,5,-97,-54,-45,-25},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{7,49,26,33,48,79,2,71,32,4,20,36},{88},{1,1,1,1,0,0,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0},{2,2,4,5,7,12,12,14,14,16,17,29,29,31,32,39,41,47,48,49,51,54,58,58,59,60,73,78,80,81,82,83,84,85,90,95,97,99,99},{-31,-55,6,37,77,61,0,46,-91,-38,85,-71,25,14,53,43,34},{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{77,68,78,97,92,52,37,8,44,98,5,69,31,45,9,32,33,67,30,76,29,3,90,57,30,9,26,2,62,3,46,68,25,51,13,44,35,55}};
    vector<int> param1 {6,16,28,9,0,20,28,15,12,27};
    vector<int> param2 {6,14,24,10,0,28,29,11,17,20};
    vector<vector<int>> filled_function_param0 {{6,25,42,52,53,54,58,66,67,70},{-13,-98,50,-63,48,3,-76,12,-35,93,29,17,16,5,-97,-54,-45,-25},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{7,49,26,33,48,79,2,71,32,4,20,36},{88},{1,1,1,1,0,0,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0},{2,2,4,5,7,12,12,14,14,16,17,29,29,31,32,39,41,47,48,49,51,54,58,58,59,60,73,78,80,81,82,83,84,85,90,95,97,99,99},{-31,-55,6,37,77,61,0,46,-91,-38,85,-71,25,14,53,43,34},{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{77,68,78,97,92,52,37,8,44,98,5,69,31,45,9,32,33,67,30,76,29,3,90,57,30,9,26,2,62,3,46,68,25,51,13,44,35,55}};
    vector<int> filled_function_param1 {6,16,28,9,0,20,28,15,12,27};
    vector<int> filled_function_param2 {6,14,24,10,0,28,29,11,17,20};
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(&filled_function_param0[i].front(),filled_function_param1[i],filled_function_param2[i]);
        f_gold(&param0[i].front(),param1[i],param2[i]);
        if(equal(begin(param0[i]), end(param0[i]), begin(filled_function_param0[i])) && param1[i] == filled_function_param1[i] && param2[i] == filled_function_param2[i])
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}