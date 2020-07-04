import java.lang.*;
class Solution {
    int count;
    public int solution(int n, int[] lost, int[] reserve) {
        boolean check[] = new boolean[reserve.length];
        boolean check1[] = new boolean[lost.length];
        count = n - lost.length;
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    count++;
                    check1[i]=true;
                    check[j]=true;
                }
            }
        }
        
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                int abst = reserve[j]-lost[i];
                if(!check[j] && !check1[i] && Math.abs(abst)==1){
                    check[j]=true;
                    check1[i]=true;
                    count++;
                }
                //System.out.println(count);
            }
        }
        return count;
    }
}