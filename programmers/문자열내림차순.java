import java.util.*;
class Solution {
    public String solution(String s) {
        Character[] temp = new Character[s.length()];
        for(int i=0;i<s.length();i++)
            temp[i] = s.charAt(i);
        Arrays.sort(temp,(o1,o2)->o2-o1);
        
        StringBuilder sb = new StringBuilder(temp.length); 
        for (Character c : temp) 
            sb.append(c.charValue()); 
  
        return sb.toString(); 
    }
}