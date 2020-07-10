# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( stri , n ) :
    m = dict ( )
    for i in range ( n ) :
        m [ stri [ i ] ] = m.get ( stri [ i ] , 0 ) + 1
    res = 0
    for i in m.values ( ) :
        if i == 2 :
            res += 1
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (["hate", "love", "peace", "love", "peace", "hate", "love", "peace", "love", "peace"],10,),
    (["16","946613197072","532052","42780833","511552","1241934","4","3444540","47487223670074","23753","14158","4","95420017116714","16","0845","689000748","976403809728","8922","487784120896","329","611","59101","611","2131059721","53952148295020","445948587","3905249775372","4683180907","7169093","01413852276627","63","5864","40862536595","2280304422294","930028582","05","33447"],32,),
    (["001000100000","1010","01011","11","011","1010"],6,),
    (["Om", "Om", "Shankar", "Tripathi", "Tom", "Jerry", "Jerry"],7,),
    (["2","644","2","42484637089","81578664","0778"],6,),
    (["001000101","011010","1","101010011","011010","01","10111000101","0","1","00101101","0","0"],12,),
    (["kl","p sH","PwCPMPu","tQoIgPpk","wtsNP WjS","kl ","TXsFWgU","kl","AD","NjjTyFGwNWZcB","jpFQslbGbDI","cEpGAgvpk","EMaDkMOm","YZuNZgfwDIjG","k","hJx jHmGpQYwQP","CIETe","RH","Pj","h","DInR","AEsqOvliQtz","NwzHTALTt LS","LwLR","WvDCzlQF","soJb","WktoldCbWyTO","pIdRJxY","BmpWxjOwTXkjjL","zmtCiQ","g","yBmDW","QhaBZrQnOJaAJ","u","MGTwCKve","UxYQrONag","xsGSz","dqNPTT","U W","ygJKvCEKDClby","M","yXJQHxjyDQDLkT","oJmaREOEk YA","zUwiwhSMdiC","jYgZEktcdgLD","fwyTAAW","GENttdzeGY "],43,),
    (["938","074209","0949093096","218622476","71692175","0714","81217924991","74016430795374","52213147","338","939","798161500954","90528060774015","68715","75810","43450","8017","0193164","5945740","212","4589289","2912211026","0","49","8230114","0733435391403","5429","10070"],20,),
    (["00","0","00","0101111010100","110"],4,),
    (["g","h","ok","h","ok","sqozuC","ut","ZwRcG","ok","MR","jHrWyy","qaJlrokgRHuZH","LjPNzDUKszYmCq","g","ZGjLfMnyAGL","kEZoSxOMEWSFpw","IFtqNaDVnG","iJoJXl","vjrQMyWor","FTEHZqbHGlmHph","QeSdzm","nPostKHkigyJt","mOSekk"],15,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))