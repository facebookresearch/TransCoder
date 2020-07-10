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
bool f_gold ( string str ) {
  stack < char > Stack;
  for ( char ch : str ) {
    if ( ch == ')' ) {
      char top = Stack . top ( );
      Stack . pop ( );
      int elementsInside = 0;
      while ( top != '(' ) {
        elementsInside ++;
        top = Stack . top ( );
        Stack . pop ( );
      }
      if ( elementsInside < 1 ) {
        return 1;
      }
    }
    else Stack . push ( ch );
  }
  return false;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<string> param0 {
    "((a+b)+((c+d)))",
    "(((a+(b)))+(c+d))",
    "(((a+(b))+c+d))",
    "((a+b)+(c+d))",
    "(8582007)",
    "((a+(b))+(c+d))",
    "(PylsShEdKAE)",
    "886980680541",
    "001",
    "jsVmFeOq"};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0[i]) == f_gold(param0[i]))
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}