class Solution {
    //int sum,beforeCol,nowCol;
    //int maxValue;
    int solution(int[][] land) {
        int [][]dp = new int[land.length][4];
        for(int i=0;i<4;i++){
            dp[0][i] = land[0][i];
        }
        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(k != j) dp[i][k] = Math.max(dp[i][k], dp[i-1][j]+land[i][k]);
                }
            }
        }
        int max=0;
        for(int i=0;i<4;i++){
            if(max < dp[land.length-1][i]) max = dp[land.length-1][i];
        }
        return max;
        /*
        //findMax, findSecondMax 후에 beforeCol 을 업데이트
        for(int i=0;i<land[0].length;i++){
            sum=land[0][i];
            beforeCol=i;
            for(int row=1;row<land.length;row++){
                nowCol = findMaxIndex(land[row]);
                int max = land[row][nowCol];
                if(nowCol==beforeCol) {
                    beforeCol = findSecondMaxIndex(land[row],nowCol);
                    max = land[row][beforeCol];
                }else{
                    beforeCol = nowCol;
                }
                sum+=max;
            }
            if(sum>maxValue) maxValue = sum;
        }
        return sum;
        */
    }
    /*
    public int findMaxIndex(int[] list){
        int max=list[0];
        int maxIndex = 0;
        for(int i=1;i<list.length;i++){
            if(list[i]>max) {
                max = list[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public int findSecondMaxIndex(int[] list, int removeIndex){
        int max=0;
        int maxIndex=0;
        for(int i=0;i<list.length;i++){
            if(i != removeIndex && list[i]>max) {
                max = list[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    */
}