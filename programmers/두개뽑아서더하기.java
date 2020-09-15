import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum = numbers[i]+numbers[j];
                hs.add(sum);
            }
        }
        List<Integer> li = new ArrayList<>(hs);
        Collections.sort(li);
        int[] ans = new int[li.size()];
        int size=0;
        for(int a : li)
            ans[size++] = a;
       
        return ans;
    }
}