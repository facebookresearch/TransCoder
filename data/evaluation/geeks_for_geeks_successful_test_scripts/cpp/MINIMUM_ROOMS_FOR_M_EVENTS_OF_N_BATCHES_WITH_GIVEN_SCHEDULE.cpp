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
int f_gold ( string slots [ ], int n, int m ) {
  int counts [ m ] = {
    0 };
    for ( int i = 0;
    i < n;
    i ++ ) for ( int j = 0;
    j < m;
    j ++ ) if ( slots [ i ] [ j ] == '1' ) counts [ j ] ++;
    return * max_element ( counts, counts + m );
  }
  

//TOFILL

int main() {
    int n_success = 0;
    vector<vector<string>> param0 {{"pECmwnMblBFWx","CZPrc","mPCbBVdYeMOeh","yA","ZgJF","UrbTP","RPXLB","RxGMlM","ZowRSvJjB","ICedYoDz","MCvIVUr","TGg","jx","VRAXfWhuO","HMQ","mPU MBf","lcVtOPShz","BIROOQ","bgOyYX"," kjIRdPbRBQT","RCbHGtUDPztaay","w","RonaGfwzcTf","ZyUqBFCw","pFzGVsOqL","nruTMPVMBtf","zfMzqNbYugR","cJQR","YsDkmGLVbTwXWt","YD","Dy"},
    { "0101011", "0011001", "0110111" },
    {"111010011100","11001","000","0101101011010","001001011101","111010000","1011011001001","000","0","011110","01100101","0"},{"ZLateNR","S","OZNSbEUTYz","YDTheMdNJ","GzNMk","VvWKg","mtoLHJ TyC","ndLgmqCqJszZ","ibtwrzZyqMWjy","BzlRWswnqouLDs","vtLLJasQzgHJf","v iQC","Zq","mqjyrWRoAsoS","QNZpxwk","eMVDptCq","zoy","tDuUIRfZKkw","MirTJNVJBsDL","oRl","iI","T","EBSKgTpXnGfu","FfbMWAnwMu","YDy xkIdK","miBT","fAjwuz","cQIgAPGdzhtqe","i","gKJcheeq","UANMWlBdZByXJ","cEKlKKdDLP","AvaVQL","rfWl"," ","rjxtld","ezJpezsfxE","gjMvn","PZvFknERdSvC","mts","ztJ","odfbJX","NROgvhZPkbDd","yuyih","TBbuW","HwoAbBkT","uPFFgvnmuvHjaa","cEQYOmdZ"},{"173900830","265","60283247","1","6049752624619","1628","50976022265","14510333026","1708","13265","83265496483","9","400007186283","2435840","4487441836954","46181839950","58882","3771768414148","6085610","38820188080","3474438786","4905959","1028","049580401149","5418","9785441311733","3882562","0869","8574790","387","71625353213916","0","60341","3709003"},
    {"10111110000010","0010","1000100101111","010","01011001110","00001111111010","111000010011","0110","01111000100100","101","0001","101011101","10110100001010","110111000000"},
    {"BVHCVc","pRIkQw","VeZhQQXYjBJjnL","UefDs","WnkT","SERFx"},{"3589","355","0813224","6628597","03682572588540","234","78695289082","907583458","813230","39","4807","877","346162555"},
    {"100111100","0111"},{"cbXnCeRTfhMMRC","RApAMNa","YGXMAqovsBwJW","VWtUi w","gEYkNqJzJrEWI","BzfHBRUiC","lp","EG gcte","ULo","wGb","unnP"}};
    vector<int> param1 {18,3,11,46,33,8,5,7,1,7};
    vector<int> param2 {30,7,10,29,21,7,4,12,1,8};
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