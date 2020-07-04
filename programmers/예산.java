import java.util.*;
class Solution {
    long sum;
    int count;
    public int solution(int[] budgets, int M) {
        int low=0;
        int high=M;
        int mid=M/2;
        for(int i=0;i<budgets.length;i++){
            sum += budgets[i];
        }
        
        if(sum <= M) {
            Arrays.sort(budgets);
            return budgets[budgets.length-1];
        }
        while(true){ // 수렴할 때까지 최대한 돌리기.. 100번정도로 일단 시도
            count++;
            sum=0;
            mid=(low+high)/2;
            for(int i=0;i<budgets.length;i++){
                if(budgets[i]<=mid) sum+=budgets[i];
                else sum+=mid;
            }
            if(M<sum){
                if(count==30) return low;
                high=mid;
                //mid=(low+high)/2;
            }else if(M>sum){
                if(count==30) return mid;
                low=mid;
                //mid=(low+high)/2;
            }else{
                return mid;
            }
            //count++;
            //if(sum<M && count==30) return mid;
        }
      
        //return mid;
    }
}