import java.util.*;
public class HashSet_1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		/*
		 * static int parseInt(String s, int radix) // ���ڿ� s �� radix�������� �ν� & string �� int �� ��ȯ
		 * static Integer valueOf(String s, int radix) // ���ڿ� s�� radix �������� �ν� & string �� Integer �� ��ȯ 
		 * �̶�, default �� 10����
		 */
		set.add(Integer.valueOf("011")); // 11�� ��µȴ�.
		set.add(Integer.valueOf("011",8)); // 011 �� 8������ �ν� -> 9 �� ��µȴ�
		set.add(Integer.valueOf("11",8)); // 11�� 8������ �ν� -> 9 �� ��µȴ� 
		set.add(011); // �տ� 0�̺����� 8������ �ν� -> 9�� ���
		set.add(11); // 10������ �ν� -> 11 ���
		set.add(111); // 10������ �ν� -> 111 ���
		set.add(0x110); // �տ� 0x ������ 16������ �ν� -> 272 ��� 
		
		//���α׷��ӽ� �Ҽ�ã�� �������� ���Ǵ� hashset �� 01 �� 1, 011 �� 11 �� ���� 1�� 11�� �� ����
		set.add(Integer.valueOf("011"));
		set.add(Integer.valueOf("11"));
		set.add(Integer.valueOf("01"));
		set.add(Integer.valueOf("1"));
		// ������� 1, 11 �� �ߺ����� ��
		
		for(int x: set)
			System.out.println(x);
	}
}
