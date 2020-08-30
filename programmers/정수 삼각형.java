class Solution {
    public int solution(int[][] tri) {
        int dp[][] = new int[tri.length][tri.length];
        dp[0][0] = tri[0][0];
        for(int i=1;i<tri.length;i++){
            for(int k=0;k<tri[i].length;k++){
                for(int j=k-1;j<=k;j++){
                    if(j<0) j=0;
                    //if((k==0 && j==0) || (k!=0 && (j==k-1 || j==k)))
                    //if(j==k-1 || j==k)
                    dp[i][k]=Math.max(dp[i][k], dp[i-1][j]+tri[i][k]);
                    
                }
            }
        }
        int max=0;
        for(int i=0;i<tri.length;i++){
            if(max<dp[tri.length-1][i]) max = dp[tri.length-1][i];
        }
        return max;
    }
}