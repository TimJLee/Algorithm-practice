

import java.lang.*;
import java.util.*;
class ��ȣ��ȯ {
	public static void main(String[] args) {
		��ȣ��ȯ a = new ��ȣ��ȯ();
		System.out.println(a.solution("(()())()"));
	}
    public String solution(String p) {
        if(p.length() == 0) return p;
        return check(p);
    }
    public String check(String p){
    	if(p.length() == 0) return p;
        String u="",v="";
        
        //StringBuilder p = new StringBuilder(s);
        //u, v �� �и�
        for(int i=2;i<=p.length();i++){
            if(check����(p.substring(0,i))){
                u = p.substring(0,i);
                v = p.substring(i, p.length());
                break;
            }
        }
        
        // 3.
        if(check�ùٸ�(u)) return u+check(v); // 3-1.
        else{ // 4.
            String temp = "("; // 4-1.
            temp += check(v); // 4-2.
            temp += ")"; // 4-3.
            //4-4.
            StringBuilder uTemp = new StringBuilder(u.substring(1,u.length()-1));
            for(int k=0;k<uTemp.length();k++){
                if(uTemp.charAt(k) == '(') uTemp.setCharAt(k,')');
                else uTemp.setCharAt(k,'(');
            }
            temp += uTemp.toString();
            //4-5.
            return temp;
        }
    }
    public boolean check����(String s){
        int num���ʰ�ȣ=0;
        int num�����ʰ�ȣ=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') num���ʰ�ȣ++;
            else num�����ʰ�ȣ++;
        }
        if(num���ʰ�ȣ == num�����ʰ�ȣ) return true;
        else return false;
    }
    public boolean check�ùٸ�(String s){
        Stack<Character> st = new Stack<>();
        if(s.length()>0) st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char now = s.charAt(i);
            if(now==st.peek()) st.push(now);
            else if(st.peek()=='(' && now == ')'){
                st.pop();
            }else{
                st.push(now);
            }
        }
        if(st.size()==0) {
        	st.clear();
        	return true;
        }
        else {
        	st.clear();
        	return false;
        }
    }
}