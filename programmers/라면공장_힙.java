import java.util.*;
class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        PriorityQueue<Integer> q = new PriorityQueue(Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();
        int limit = stock;
        int index=0,count=0;
        for(int i=0;i<k;i++){//?
            if(index<dates.length && dates[index]<=i)
                q.offer(supplies[index++]);
            if(limit==i){
                limit = i + q.poll();
                count++;
                if(limit>=k) break;
            }
        }
        return count;
    }
}