import java.lang.*;
class Solution {
    int max1,max2;
    public int solution(int[] money) {
        int dp[] = new int[money.length];
        //첫번째 집 털기 -> 마지막 집 못 텀
        dp[0]=money[0];
        dp[1]=money[1];
        dp[2]=dp[0]+money[2];
        for(int i=3;i<money.length-1;i++){
            dp[i]= Math.max(money[i]+dp[i-2],money[i]+dp[i-3]);
        }
        max1 = Math.max(dp[money.length-2],dp[money.length-3]);
        //마지막 집 털기 -> 첫번째 집 못 텀
        dp[1]=money[1];
        dp[2]=money[2];
        dp[3]=dp[1]+money[3];
        for(int i=4;i<money.length;i++){
            dp[i]= Math.max(money[i]+dp[i-2],money[i]+dp[i-3]);
        }
        max2 = Math.max(dp[money.length-1],dp[money.length-2]);
        
        int answer = Math.max(max1,max2);
        return answer;
    }
}