/*
 * 스킬체크 _ level1 2번째 문제
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 *  예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */

import java.util.*;
class SC_l1_2 {
	public static void main(String[] args) {
		SC_l1_2 c=new SC_l1_2();
		//System.out.println(c.solution(12345).toString());
		int answer[] = c.solution(12345);
		for(int i=0;i<answer.length;i++)
			System.out.println(answer[i]);
	}
    public int[] solution(long n) {
        //List<Integer> bin = new ArrayList<>();
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
    	for(int i=0;i<length;i++) {
    		//bin.add((int)n%10);
    		answer[i]=(int) (n%10);
    		if(n==0) break;
    		n = n/10;
    	}
        
        //int[] answer = new int[bin.size()];
        //for(int i=0;i<bin.size();i++)
         //   answer[i] = bin.get(i);
        
        return answer;
    }
}
