class Solution {
    int que[]= new int[3];
    int ans[]= new int[3];
    public int solution(int[][] baseball) {
   
        int answer = 0;
        for(int i=123;i<=987;i++)
        {
            int count = 0;
            que[0]=i/100;
            que[1]=i/10%10;
            que[2]=i%10;
            if(que[1]==0 || que[2]==0 || que[0] ==que[1] || que[1] ==que[2] || que[2] == que[0]) continue;
            for(int j=0;j<baseball.length;j++)
            {
                int strike = 0;
                int ball = 0;
                int num = baseball[j][0];
                ans[0]=num/100;
                ans[1]=num/10%10;
                ans[2]=num%10;
                for(int k=0;k<3;k++)
                {
                    if(que[k]==ans[k]) strike++;
                    if(que[k]==ans[(k+1)%3] || que[k] == ans[(k+2)%3]) ball++;
                }
                if(strike == baseball[j][1] && ball == baseball[j][2]) count++;
            }
            if(count==baseball.length)
                answer++;
        }
        return answer;
    }
  }