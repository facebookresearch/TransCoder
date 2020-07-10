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
float f_gold ( float x1, float y1, float x2, float y2 ) {
  return ( y2 - y1 ) / ( x2 - x1 );
}


//TOFILL

int main() {
    int n_success = 0;
    vector<float> param0 {236.27324548309292F,-9201.144918204123F,3480.4716834445326F,-6915.538971485092F,8887.97173657486F,-3785.5177159369946F,3037.6696554256832F,-7925.458496016523F,1404.2919985268031F,-4748.744241168378F};
    vector<float> param1 {5792.493225762838F,-2716.3347716140406F,3577.9608612055613F,-4113.601103381095F,1678.4080012662428F,-3084.67461899163F,4432.445827549F,-3350.27411882042F,8971.636233373416F,-675.557388148954F};
    vector<float> param2 {7177.837879115863F,-5161.142121227645F,8611.515262945342F,-748.3462104020822F,8709.574949883017F,-7415.76208254121F,8387.304165588026F,-5619.767086756504F,3039.112051378511F,-5998.241086029875F};
    vector<float> param3 {1289.5700425822731F,-3205.784279961129F,6744.864707668983F,-9245.271700539257F,8548.492675510739F,-887.5389305564152F,611.3373507518394F,-1185.7423219907591F,1947.6756252708972F,-4236.658178504375F};
    for(int i = 0; i < param0.size(); ++i)
    {
        if(abs(1 - (0.0000001 + abs(f_gold(param0[i],param1[i],param2[i],param3[i])) )/ (abs(f_filled(param0[i],param1[i],param2[i],param3[i])) + 0.0000001)) < 0.001F)
        {
            n_success+=1;
        }
    }
    cout << "#Results:" << " " << n_success << ", " << param0.size();
    return 0;
}