class Solution {
    public int solution(int n, int m, int[][] puddles) {
        int [][] dp = new int[m+1][n+1];
        dp[1][1] = 1;
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(!check(i,j,puddles) && (i != 1 || j != 1))
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1])%1000000007;
            }
        }
      
        return dp[m][n];
    }
    public boolean check(int m, int n, int [][] p){
        for(int i=0;i<p.length;i++){
            int x = p[i][1];
            int y = p[i][0];
            if(m == x && n == y) return true;
        }
        return false;
    }
}