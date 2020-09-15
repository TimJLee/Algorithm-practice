import java.lang.*;
class Solution
{
    boolean flag;
    public int solution(String sn)
    {
        StringBuilder s = new StringBuilder(sn);
        for(int i=s.length();i>0;i--){
            for(int j=0;j<s.length();j++){
                flag = true;
                if(i+j-1>=s.length()) break;
                for(int k=j;k<j+i;k++){
                    if(s.charAt(k) != s.charAt(i+2*j-k-1)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) return i;
                //if(checkPali(s.substring(j,i+j))) return i;
            }
        }
        return 1;
    }
    public boolean checkPali(String s){
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}