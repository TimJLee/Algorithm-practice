import java.util.*;
//import java.lang.*;
class Solution {
    char max;
    public String solution(String number, int k) {
        int len = number.length();
        StringBuilder answer = new StringBuilder();
        //String answer = "";
        int count = len-k;
        int distant = count;
        int i=0;
        int index=0;

        while(answer.length() != distant){
            index=i;
            max=number.charAt(index);

            while(len-i>=count){
                if(max<number.charAt(i)){
                    index = i;
                    max = number.charAt(index);
                }
                i++;
            }
            count--;
            answer.append(Character.toString(max));
            i=index+1;

        }

        return answer.toString();
    }
}