import java.util.*;
class Solution {
    int max=0;
    int count=0;
    int numCount=0;
    int dx[] = {1,-1,0,0};
    int dy[] = {0,0,1,-1};
    public int[] solution(int m, int n, int[][] pic) {

        boolean[][] visit=new boolean[pic.length][pic[0].length];
        for(boolean[] a:visit)
            Arrays.fill(a, false);
        for(int i=0;i<pic.length;i++){
            for(int j=0;j<pic[0].length;j++){
                numCount=0;
                if(!visit[i][j] && pic[i][j]!=0){
                    count++;
                    visit[i][j]=true;
                    dfs(i,j,pic[i][j],visit,pic);
                }
                if(max<numCount) max=numCount;

            }
        }

        int[] answer = new int[2];
        answer[0] = count;
        answer[1] = max;
        System.out.println(answer[0]+" "+answer[1]);
        return answer;
    }

    public void dfs(int x, int y, int check, boolean visit[][], int pic[][]){
        numCount++;
        visit[x][y]=true;
        for(int i=0;i<4;i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            if(newX<0 || newY<0 || newX>=pic.length || newY >= pic[0].length) continue;
            if(!visit[newX][newY] && pic[newX][newY] == check) 
                dfs(newX,newY,check,visit,pic);
        }
    }
}