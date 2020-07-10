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
class FUNCTION_COPY_STRING_ITERATIVE_RECURSIVE_1{
static void f_gold ( char s1 [ ] , char s2 [ ] , int index ) {
  s2 [ index ] = s1 [ index ] ;
  if ( index == s1 . length - 1 ) {
    return ;
  }
  f_gold ( s1 , s2 , index + 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'v'});
    param0.add(new char[]{'6','8','3','3','5','2','5','6','9','9','2','6','2','1','9','3','7'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'e','G','a','r','F','U','W','k','u','z','y','v','A','W','m','G','H','O','I','a','u','V','f','B','q','e','E','e','L','c',' ','w','K',' ','K','j','j','s','q','u','n','i','T','a','Y'});
    param0.add(new char[]{'0','0','0','0','1','1','1','2','2','2','2','2','2','3','3','3','3','4','4','4','4','5','5','6','6','6','7','7','7','7','7','7','8','8','9','9','9','9'});
    param0.add(new char[]{'1','0','0','1','0','1','1','1','0','0','0','1','0','0','0','1','1','0','0','0','0','1','1'});
    param0.add(new char[]{' ','B','D','D','D','E','E','E','G','H','J','K','K','K','L','N','O','S','V','W','Y','Z','b','c','d','d','f','f','f','f','f','f','i','k','k','o','t','u','v','x','x','z'});
    param0.add(new char[]{'4'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'D','I','u','K','e','s','n','z','d','y','S','P','y','r'});
    List<char [ ]> param1 = new ArrayList<>();
    param1.add(new char[]{'Z'});
    param1.add(new char[]{'8','6','0','2','8','0','8','7','0','5','4','5','9','4','5','4','4'});
    param1.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param1.add(new char[]{'S','m','d','a','W','N','F','H','B','E','h','M','z','H','c','X','l','a','R','e','D','D','q','V','U','w','o','K','u','n','b','k','Y','M','L','H','L','X','H','r','D','o','A','Y','H'});
    param1.add(new char[]{'0','0','0','0','0','1','1','1','2','2','2','3','3','4','4','4','5','5','5','5','6','6','7','7','7','7','7','8','8','8','8','9','9','9','9','9','9','9'});
    param1.add(new char[]{'1','1','0','0','0','1','0','1','1','0','0','0','1','0','1','0','1','1','0','1','1','0','1'});
    param1.add(new char[]{'G','G','J','K','L','N','Q','R','R','S','U','W','X','Y','Y','a','b','b','b','c','d','e','e','f','f','h','j','j','k','k','l','m','m','n','o','s','t','t','w','z','z','z'});
    param1.add(new char[]{'8'});
    param1.add(new char[]{'0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1'});
    param1.add(new char[]{'N','h','M','N','n','F','Y','L','G','w','o','G','y','q'});
    List<Integer> param2 = new ArrayList<>();
    param2.add(0);
    param2.add(11);
    param2.add(34);
    param2.add(41);
    param2.add(33);
    param2.add(13);
    param2.add(40);
    param2.add(0);
    param2.add(12);
    param2.add(7);
    List<char [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new char[]{'v'});
    filled_function_param0.add(new char[]{'6','8','3','3','5','2','5','6','9','9','2','6','2','1','9','3','7'});
    filled_function_param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    filled_function_param0.add(new char[]{'e','G','a','r','F','U','W','k','u','z','y','v','A','W','m','G','H','O','I','a','u','V','f','B','q','e','E','e','L','c',' ','w','K',' ','K','j','j','s','q','u','n','i','T','a','Y'});
    filled_function_param0.add(new char[]{'0','0','0','0','1','1','1','2','2','2','2','2','2','3','3','3','3','4','4','4','4','5','5','6','6','6','7','7','7','7','7','7','8','8','9','9','9','9'});
    filled_function_param0.add(new char[]{'1','0','0','1','0','1','1','1','0','0','0','1','0','0','0','1','1','0','0','0','0','1','1'});
    filled_function_param0.add(new char[]{' ','B','D','D','D','E','E','E','G','H','J','K','K','K','L','N','O','S','V','W','Y','Z','b','c','d','d','f','f','f','f','f','f','i','k','k','o','t','u','v','x','x','z'});
    filled_function_param0.add(new char[]{'4'});
    filled_function_param0.add(new char[]{'0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1'});
    filled_function_param0.add(new char[]{'D','I','u','K','e','s','n','z','d','y','S','P','y','r'});
    List<char [ ]> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(new char[]{'Z'});
    filled_function_param1.add(new char[]{'8','6','0','2','8','0','8','7','0','5','4','5','9','4','5','4','4'});
    filled_function_param1.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    filled_function_param1.add(new char[]{'S','m','d','a','W','N','F','H','B','E','h','M','z','H','c','X','l','a','R','e','D','D','q','V','U','w','o','K','u','n','b','k','Y','M','L','H','L','X','H','r','D','o','A','Y','H'});
    filled_function_param1.add(new char[]{'0','0','0','0','0','1','1','1','2','2','2','3','3','4','4','4','5','5','5','5','6','6','7','7','7','7','7','8','8','8','8','9','9','9','9','9','9','9'});
    filled_function_param1.add(new char[]{'1','1','0','0','0','1','0','1','1','0','0','0','1','0','1','0','1','1','0','1','1','0','1'});
    filled_function_param1.add(new char[]{'G','G','J','K','L','N','Q','R','R','S','U','W','X','Y','Y','a','b','b','b','c','d','e','e','f','f','h','j','j','k','k','l','m','m','n','o','s','t','t','w','z','z','z'});
    filled_function_param1.add(new char[]{'8'});
    filled_function_param1.add(new char[]{'0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1'});
    filled_function_param1.add(new char[]{'N','h','M','N','n','F','Y','L','G','w','o','G','y','q'});
    List<Integer> filled_function_param2 = new ArrayList<>();
    filled_function_param2.add(0);
    filled_function_param2.add(11);
    filled_function_param2.add(34);
    filled_function_param2.add(41);
    filled_function_param2.add(33);
    filled_function_param2.add(13);
    filled_function_param2.add(40);
    filled_function_param2.add(0);
    filled_function_param2.add(12);
    filled_function_param2.add(7);
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(filled_function_param0.get(i),filled_function_param1.get(i),filled_function_param2.get(i));
        f_gold(param0.get(i),param1.get(i),param2.get(i));
        if(Arrays.equals(param0.get(i), filled_function_param0.get(i)) && Arrays.equals(param1.get(i), filled_function_param1.get(i)) && param2.get(i) == filled_function_param2.get(i))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}