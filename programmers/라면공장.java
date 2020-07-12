import java.util.*;
class Solution {
    //List<Integer> list = new ArrayList<>();
    int min=Integer.MAX_VALUE;
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        
        dfs(0,stock,0,0,dates,supplies,k);
        //Collections.sort(list);
        //System.out.println(list.toString());
        //return list.get(0);
        return min;
       
    }
    
    public void dfs(int date, int sum, int index, int count,int[] dates, int[] supplies, int k){
        //System.out.println(count);
        int min_date=sum+date;
        if(min_date>=k){
            if(count<min) min=count;
            //list.add(count);
            return;
        }
        for(int i=index;i<dates.length;i++){
            if(min_date<dates[i]) return;
            else{
                dfs(date+dates[i],sum+supplies[i]-dates[i],i+1,count+1,dates,supplies,k);
            }
        }
    }
}