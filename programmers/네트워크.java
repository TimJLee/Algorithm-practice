class Solution {
    int count;
    public int solution(int n, int[][] node) {
        int len = node.length;
        int[] visited = new int[len];
       
        for(int i=0;i<len;i++){
            if(visited[i] == 0){
                count++;
                dfs(node,visited,i);
            }
        }
        
        return count;
    }
    
    void dfs(int[][] node, int[] visited, int i){
        int len = node.length;
        visited[i] = count; // 정점 v의 방문 표시
        for(int j=0;j<len;j++){
            if(node[i][j]==1 && visited[j]==0){
                dfs(node,visited,j);
            }
        }
        
    }
}