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
int f_gold ( string tree, int k ) {
  int level = - 1;
  int sum = 0;
  int n = tree . length ( );
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( tree [ i ] == '(' ) level ++;
    else if ( tree [ i ] == ')' ) level --;
    else {
      if ( level == k ) sum += ( tree [ i ] - '0' );
    }
  }
  return sum;
}


//TOFILL

int main() {
    int n_success = 0;
        vector<string> param0 {
    "(0(5(6()())(4()(9()())))(7(1()())(3()())))",
    "(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))",
    "(0(5(6()())(4()(9()())))(7(1()())(3()())))",
    "(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))",
    "(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))",
    "(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))",
    "(0(5(6()())(4()(9()())))(7(1()())(3()())))",
    "(0(5(6()())(4()(9()())))(7(1()())(3()())))",
    "0010",
    "kjtdgmy"};
    vector<int> param1 {2,3,1,2,4,100,3,0,12,97};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i],param1[i]) == f_gold(param0[i],param1[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}