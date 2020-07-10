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
int f_gold ( double h, double m ) {
  if ( h < 0 || m < 0 || h > 12 || m > 60 ) printf ( "Wrong input" );
  if ( h == 12 ) h = 0;
  if ( m == 60 ) m = 0;
  int hour_angle = 0.5 * ( h * 60 + m );
  int minute_angle = 6 * m;
  int angle = abs ( hour_angle - minute_angle );
  angle = min ( 360 - angle, angle );
  return angle;
}


//TOFILL

int main() {
    int n_success = 0;
    vector<double> param0 {7322.337365895532,-0.5025472034247969,8735.336068205026,-5478.862697905712,8264.126919165505,-9671.311773842834,9995.328351000411,-5274.574323066984,1310.8711644223736,-2829.678131972794};
    vector<double> param1 {6996.326968156217,-2910.070017192333,1910.3752934680874,-9470.18148108585,7058.937313484608,-3867.070379361206,2145.339179488316,-3583.7503371694124,5214.059687285893,-9371.556600288217};
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