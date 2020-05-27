import java.util.Arrays;
class Solution {
    int H;
    int low,high;
    public int solution(int[] c) {
        Arrays.sort(c);
        if(c[c.length-1] == 0) return 0;
        
        for(H=c[c.length-1];H>=0;H--){
            low=0;
            high=0;
            for(int j=0;j<c.length;j++){
                if(c[j]>=H) high++;
                else low++;
            }
            if(high >= H && low <= H) break;
        }
        
        return H;
    }
}