import java.lang.*;
class Solution {
    boolean flag=true;
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)==' ') flag=true;
            else if(!Character.isLetter(sb.charAt(i))){
                flag=false;
            }else{
                if(flag) sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
                flag=false;
                //else sb.setCharAt(i,s.charAt(i).toLowerCase());
            }
        }
        return sb.toString();
    }
}