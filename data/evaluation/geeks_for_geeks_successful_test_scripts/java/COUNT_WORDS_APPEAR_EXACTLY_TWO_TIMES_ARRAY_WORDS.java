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
public class COUNT_WORDS_APPEAR_EXACTLY_TWO_TIMES_ARRAY_WORDS{
static int f_gold ( String str [ ] , int n ) {
  HashMap < String , Integer > m = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( m . containsKey ( str [ i ] ) ) {
      int get = m . get ( str [ i ] ) ;
      m . put ( str [ i ] , get + 1 ) ;
    }
    else {
      m . put ( str [ i ] , 1 ) ;
    }
  }
  int res = 0 ;
  for ( Map . Entry < String , Integer > it : m . entrySet ( ) ) {
    if ( it . getValue ( ) == 2 ) res ++ ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String [ ]> param0 = new ArrayList<>();
    param0.add(new String[]{"hate", "love", "peace", "love", "peace", "hate", "love", "peace", "love", "peace"});
    param0.add(new String[]{"16","946613197072","532052","42780833","511552","1241934","4","3444540","47487223670074","23753","14158","4","95420017116714","16","0845","689000748","976403809728","8922","487784120896","329","611","59101","611","2131059721","53952148295020","445948587","3905249775372","4683180907","7169093","01413852276627","63","5864","40862536595","2280304422294","930028582","05","33447"});
    param0.add(new String[]{"001000100000","1010","01011","11","011","1010"});
    param0.add(new String[]{"Om", "Om", "Shankar", "Tripathi", "Tom", "Jerry", "Jerry"});
    param0.add(new String[]{"2","644","2","42484637089","81578664","0778"});
    param0.add(new String[]{"001000101","011010","1","101010011","011010","01","10111000101","0","1","00101101","0","0"});
    param0.add(new String[]{"kl","p sH","PwCPMPu","tQoIgPpk","wtsNP WjS","kl ","TXsFWgU","kl","AD","NjjTyFGwNWZcB","jpFQslbGbDI","cEpGAgvpk","EMaDkMOm","YZuNZgfwDIjG","k","hJx jHmGpQYwQP","CIETe","RH","Pj","h","DInR","AEsqOvliQtz","NwzHTALTt LS","LwLR","WvDCzlQF","soJb","WktoldCbWyTO","pIdRJxY","BmpWxjOwTXkjjL","zmtCiQ","g","yBmDW","QhaBZrQnOJaAJ","u","MGTwCKve","UxYQrONag","xsGSz","dqNPTT","U W","ygJKvCEKDClby","M","yXJQHxjyDQDLkT","oJmaREOEk YA","zUwiwhSMdiC","jYgZEktcdgLD","fwyTAAW","GENttdzeGY "});
    param0.add(new String[]{"938","074209","0949093096","218622476","71692175","0714","81217924991","74016430795374","52213147","338","939","798161500954","90528060774015","68715","75810","43450","8017","0193164","5945740","212","4589289","2912211026","0","49","8230114","0733435391403","5429","10070"});
    param0.add(new String[]{"00","0","00","0101111010100","110"});
    param0.add(new String[]{"g","h","ok","h","ok","sqozuC","ut","ZwRcG","ok","MR","jHrWyy","qaJlrokgRHuZH","LjPNzDUKszYmCq","g","ZGjLfMnyAGL","kEZoSxOMEWSFpw","IFtqNaDVnG","iJoJXl","vjrQMyWor","FTEHZqbHGlmHph","QeSdzm","nPostKHkigyJt","mOSekk"});
    List<Integer> param1 = new ArrayList<>();
    param1.add(10);
    param1.add(32);
    param1.add(6);
    param1.add(7);
    param1.add(6);
    param1.add(12);
    param1.add(43);
    param1.add(20);
    param1.add(4);
    param1.add(15);
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