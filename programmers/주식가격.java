class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        answer[n-1] = 0;
        answer[n-2] = 1;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n;j++){
                answer[i]++;
                if(prices[i]>prices[j]) break;
            }
        }

        return answer;
    }
}