import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] c) {
        int[] answer = new int[c.length];
        for(int i=0;i<c.length;i++){
            int[] newArray = Arrays.copyOfRange(array, c[i][0]-1, c[i][1]); 
            Arrays.sort(newArray);
            answer[i]=newArray[c[i][2]-1];
        }

        return answer;
    }
}