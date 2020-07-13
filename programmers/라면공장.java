// 테스트케이스 만든거 5개 통과, 제출 시 시간초과뜸.
// dfs 풀이
import java.util.*;
class Solution {
    
    int min=Integer.MAX_VALUE;
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        
        dfs(0,stock,0,0,dates,supplies,k);
        return min;
    }
    
    public void dfs(int date, int sum, int index, int count,int[] dates, int[] supplies, int k){
        int min_date=sum+date;
        if(min_date>=k){
            if(count<min) min=count;
            return;
        }
        for(int i=index;i<dates.length;i++){
            if(min_date<dates[i]) {
                return;
            }
            else{
                dfs(dates[i],sum+supplies[i]-(dates[i]-date),i+1,count+1,dates,supplies,k);
            }
        }
    }
}