import java.util.*;
public class HashSet_1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		/*
		 * static int parseInt(String s, int radix) // 문자열 s 를 radix진법으로 인식 & string 을 int 로 변환
		 * static Integer valueOf(String s, int radix) // 문자열 s를 radix 진법으로 인식 & string 을 Integer 로 변환 
		 * 이때, default 는 10진법
		 */
		set.add(Integer.valueOf("011")); // 11이 출력된다.
		set.add(Integer.valueOf("011",8)); // 011 을 8진수로 인식 -> 9 가 출력된다
		set.add(Integer.valueOf("11",8)); // 11을 8진수로 인식 -> 9 가 출력된다 
		set.add(011); // 앞에 0이붙으면 8진수로 인식 -> 9가 출력
		set.add(11); // 10진수로 인식 -> 11 출력
		set.add(111); // 10진수로 인식 -> 111 출력
		set.add(0x110); // 앞에 0x 붙으면 16진수로 인식 -> 272 출력 
		
		//프로그래머스 소수찾기 문제에서 사용되는 hashset 이 01 과 1, 011 과 11 을 각각 1과 11로 본 이유
		set.add(Integer.valueOf("011"));
		set.add(Integer.valueOf("11"));
		set.add(Integer.valueOf("01"));
		set.add(Integer.valueOf("1"));
		// 최종출력 1, 11 로 중복제거 됨
		
		for(int x: set)
			System.out.println(x);
	}
}
