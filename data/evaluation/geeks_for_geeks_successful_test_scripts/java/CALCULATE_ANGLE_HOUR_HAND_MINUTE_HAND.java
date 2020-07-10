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
public class CALCULATE_ANGLE_HOUR_HAND_MINUTE_HAND{
static int f_gold ( double h , double m ) {
  if ( h < 0 || m < 0 || h > 12 || m > 60 ) System . out . println ( "Wrong input" ) ;
  if ( h == 12 ) h = 0 ;
  if ( m == 60 ) m = 0 ;
  int hour_angle = ( int ) ( 0.5 * ( h * 60 + m ) ) ;
  int minute_angle = ( int ) ( 6 * m ) ;
  int angle = Math . abs ( hour_angle - minute_angle ) ;
  angle = Math . min ( 360 - angle , angle ) ;
  return angle ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(7322.337365895532);
    param0.add(-0.5025472034247969);
    param0.add(8735.336068205026);
    param0.add(-5478.862697905712);
    param0.add(8264.126919165505);
    param0.add(-9671.311773842834);
    param0.add(9995.328351000411);
    param0.add(-5274.574323066984);
    param0.add(1310.8711644223736);
    param0.add(-2829.678131972794);
    List<Double> param1 = new ArrayList<>();
    param1.add(6996.326968156217);
    param1.add(-2910.070017192333);
    param1.add(1910.3752934680874);
    param1.add(-9470.18148108585);
    param1.add(7058.937313484608);
    param1.add(-3867.070379361206);
    param1.add(2145.339179488316);
    param1.add(-3583.7503371694124);
    param1.add(5214.059687285893);
    param1.add(-9371.556600288217);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}