import java.util.*;
class Solution {
    int x,y;
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = new int[2];
        for(int i=3;i<sum;i++){
            if(sum%i==0){
                x = sum/i;
                y = sum/(x);
                if((x-2)*(y-2) == yellow){
                    answer[0]=Math.max(x,y);
                    answer[1]=Math.min(x,y);
                    
                    return answer;
                }
            }
        }
        return answer;
    }
}