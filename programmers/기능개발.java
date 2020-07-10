import java.util.*;
class Solution {
    public int[] solution(int[] p, int[] s) {
        boolean mark[] = new boolean[p.length];
        
        for(int i=0;i<p.length;i++){
            int di = 100-p[i];
            int newp = (di%s[i]==0) ? di/s[i] : di/s[i]+1;
            p[i]=newp;
        }
        List<Integer> li = new ArrayList<>();
    
        for(int i=0;i<p.length-1;i++){
            int count=1;
            if(!mark[i]){
                for(int j=i+1;j<p.length;j++){
                    if(mark[j]) continue;
                    if(p[i]>=p[j]){
                        mark[j]=true;
                        count++;
                    }else{
                        break;
                    }
                }
                li.add(count);
            }
        }
        if(!mark[p.length-1]) li.add(1);
        //System.out.println(li.toString());
        int[] answer = new int[li.size()];
        for(int i=0;i<li.size();i++){
            answer[i]=li.get(i);
        }
        return answer;
    }
}