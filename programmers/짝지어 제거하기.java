import java.lang.*;
import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        //st.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.size()==0) st.push(c);
            else if(st.peek()==c) st.pop();
            else st.push(c);
        }
        if(st.size()!=0) return 0;
        else return 1;
        /*
        if(s.length()%2!=0) return 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char i : map.keySet())
            if(map.get(i)%2!=0) return 0;
        
        boolean[] flag = new boolean[s.length()];
        StringBuilder sb = new StringBuilder(s);
        int index=0;
        while(true){
            if(sb.length()==0) return 1;
            if(index == sb.length()-1) return 0;
            if(sb.charAt(index)==sb.charAt(index+1)){
                sb.delete(index,index+2);
                index=index==0?0:index-1;
                continue;
            }
            index++;
        }
        */
    
    }
}