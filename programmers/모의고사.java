//https://programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;
class Solution {
    int c1,c2,c3;
    int co;
    int max;
    public int[] solution(int[] ans) {
        List<Integer> li = new ArrayList<>();

        int a[] = {1,2,3,4,5};
        int b[] = {2,1,2,3,2,4,2,5};
        int c[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0;i<ans.length;i++){
            if(a[i%5] == ans[i]) c1++;
            if(b[i%8] == ans[i]) c2++;
            if(c[i%10] == ans[i]) c3++;
        }
 
        max= Math.max(c3,Math.max(c1,c2));
     
        if(max == c1) li.add(1);
        if(max == c2) li.add(2);
        if(max == c3) li.add(3);
        int[] answer = new int[li.size()];
        for(int i=0;i<li.size();i++)
            answer[i]=li.get(i);
    
        return answer;
    }
}