// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class PROGRAM_DISTANCE_TWO_POINTS_EARTH{
public static double f_gold ( double lat1 , double lat2 , double lon1 , double lon2 ) {
  lon1 = Math . toRadians ( lon1 ) ;
  lon2 = Math . toRadians ( lon2 ) ;
  lat1 = Math . toRadians ( lat1 ) ;
  lat2 = Math . toRadians ( lat2 ) ;
  double dlon = lon2 - lon1 ;
  double dlat = lat2 - lat1 ;
  double a = Math . pow ( Math . sin ( dlat / 2 ) , 2 ) + Math . cos ( lat1 ) * Math . cos ( lat2 ) * Math . pow ( Math . sin ( dlon / 2 ) , 2 ) ;
  double c = 2 * Math . asin ( Math . sqrt ( a ) ) ;
  double r = 6371 ;
  return ( c * r ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(6578.099266893886);
    param0.add(-9410.77783405426);
    param0.add(6641.858718352012);
    param0.add(-4142.202863100186);
    param0.add(4181.4508741498075);
    param0.add(-7745.655002884576);
    param0.add(7725.024650172891);
    param0.add(-5881.135770052704);
    param0.add(8322.143446980337);
    param0.add(-1772.9564288056765);
    List<Double> param1 = new ArrayList<>();
    param1.add(482.6430542568438);
    param1.add(-1203.2861272633245);
    param1.add(3498.0959749989424);
    param1.add(-6286.669946106916);
    param1.add(3845.247033476332);
    param1.add(-8197.864556657836);
    param1.add(9295.96418476119);
    param1.add(-4802.015139707946);
    param1.add(1841.108539911126);
    param1.add(-8246.345733364455);
    List<Double> param2 = new ArrayList<>();
    param2.add(1342.7044674704348);
    param2.add(-1947.91060583419);
    param2.add(228.4572635598181);
    param2.add(-2742.3608603803173);
    param2.add(4909.334120366857);
    param2.add(-3667.1524343381157);
    param2.add(588.3703338670609);
    param2.add(-35.713164290259726);
    param2.add(9049.321929418034);
    param2.add(-9716.057194373958);
    List<Double> param3 = new ArrayList<>();
    param3.add(3416.2819128903197);
    param3.add(-781.7419983063755);
    param3.add(5599.787943215038);
    param3.add(-6584.987721971118);
    param3.add(5159.242793722949);
    param3.add(-8067.806767671396);
    param3.add(1220.0418662747136);
    param3.add(-4696.734461092275);
    param3.add(4470.7365519306095);
    param3.add(-8367.588380851601);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i))) )/ (Math.abs(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i))) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}