
/*
 * ���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
 * 
 * 
 */
public class SC_l1_1 {

	public String solution(int n) {
		char c1 = '��';
		char c2 = '��';
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				answer = answer + c1;
			else
				answer += c2;
		}

		return answer;
	}

}
