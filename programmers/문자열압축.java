class Solution {
    String now,before;
    int min = Integer.MAX_VALUE;
    public int solution(String s) {
        if(s.length() == 1) return 1;
        if(s.length() == 2) return 2;
        for(int base=1;base<=s.length()/2;base++){
            int i=0, co=0, len=s.length();
            before = s.substring(i,i+base);
            i = i+base;
            while(true){
                if(i+base > s.length()){
                    if(co>0) len = len - (co*base -get자릿수(co+1));
                    break;
                }
                now = s.substring(i,i+base);
                if(before.equals(now)){
                    co++;
                }else if(co > 0){
                    len = len - (co*base -get자릿수(co+1));
                    co = 0;
                }
                i = i+base;
                before = now;
            }
            if(len<min) min = len;
        }
        return min;
    }
    public int get자릿수(int co){
        String s = String.valueOf(co);
        return s.length();
    }
}