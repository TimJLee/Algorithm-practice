class Solution {
    public int[] solution(int[] h) {
        int[] ans = new int[h.length];
        ans[0]=0;

        for(int i=1;i<h.length;i++){
            for(int j=i-1;j>=0;j--){
                if(h[j]>h[i]){
                    ans[i]=j+1;
                    break;
                }
                if(j==0) ans[i]=0;
            }
        }
        return ans;
    }
}