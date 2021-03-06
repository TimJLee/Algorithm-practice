//https://programmers.co.kr/learn/courses/30/lessons/42839?language=java

import java.util.*;
class FindPrime {
    

 
    boolean flag;
    public static void main(String[] args) {
    	FindPrime s = new FindPrime();
    	System.out.println(s.solution("012"));
    }
    public int solution(String numbers) {
    	int count=0;
        HashSet<Integer> hs = new HashSet<>();
        permut("", numbers, hs);
        System.out.println(hs); // [0, 1, 101, 10, 11, 110]
        Iterator it = hs.iterator();
        while(it.hasNext()){
            int a = (int)it.next();
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
            //hs.remove(a);
            if(a==2) count++; // 짝수 중 유일하게 2는 소수임
            if(a%2!=0 && isPrime(a)){ //짝수는 소수가 아님
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
    
    public void permut(String prefix, String s, HashSet<Integer> hs){ // 순열과 조합에서 순열=P = permutation
        int n = s.length();
        
        if(!prefix.equals("")) hs.add(Integer.valueOf(prefix)); // parseInt 와 달리 integer wrapper 객체 반환
        System.out.println(hs);
        for(int i=0;i<n;i++){
            permut(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1, n), hs);
        }
    }
}