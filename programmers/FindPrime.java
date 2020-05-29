//https://programmers.co.kr/learn/courses/30/lessons/42839?language=java

import java.util.*;
class FindPrime {
    

 
    boolean flag;
    public static void main(String[] args) {
    	FindPrime s = new FindPrime();
    	System.out.println(s.solution("011"));
    }
    public int solution(String numbers) {
    	int count=0;
        HashSet<Integer> hs = new HashSet<>();
        permut("", numbers, hs);
        
        while(hs.iterator().hasNext()){
            int a = hs.iterator().next();
            //System.out.println(a);
            /*
             * 	0
				1
				101
				10
				11
				110
				2
             */
            hs.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }
    
        return count;
    }
    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public void permut(String prefix, String s, HashSet<Integer> hs){
        int n = s.length();
        
        if(!prefix.equals("")) hs.add(Integer.valueOf(prefix)); // parseInt 와 달리 integer wrapper 객체 반환
        for(int i=0;i<n;i++){
            permut(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1, n), hs);
        }
    }
}