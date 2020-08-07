import java.util.*;
class Solution {
    boolean solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        boolean answer = true;
        s = s.toUpperCase();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.get('P') == map.get('Y')) return true;
        return false;
    }
}