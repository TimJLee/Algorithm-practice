
import java.util.*;
class �ùٸ���ȣ {
    boolean solution(String s) {

        List<Character> li = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(li.size()==0 && s.charAt(i)==')')
                return false;
            if(s.charAt(i)=='(')
                li.add(s.charAt(i));
            else
                li.remove(li.size()-1);
        }
        if(li.size()==0) return true;
        return false;
       
    }
}