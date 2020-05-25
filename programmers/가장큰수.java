import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];
        String answer = "";
        for(int i=0;i<num.length;i++)
            num[i] = Integer.toString(numbers[i]);
        //Arrays.sort(num, Collections.reverseOrder());
        Arrays.sort(num, new Comparator<String>() { // 330 과 303 중 큰수에 우선순위 부여
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
            
        
        for(int i=0;i<num.length;i++)
            answer += num[i];
        if (num[0].equals("0")) return "0";
        return answer;
    }
}
