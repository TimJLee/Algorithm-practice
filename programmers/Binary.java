
import java.util.*;

public class Binary {
	public static void main(String[] args) {
	
		List<Integer> bin = new ArrayList<>();
		// #2 List<Long> bin = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		//�Է¹��� ���� 2������ ��ȯ
		while (true) {
			bin.add((int)(n % 2));
			// #2 bin.add(n%2);
			if (n == 0)
				break;
			n = n / 2;
		}
		
		long sum = 0;
		for (int i = 0; i < bin.size(); i++)
			sum += pow(3, i) * bin.get(i);

		System.out.println(sum);
	}

	static long pow(int number, int exp) { // �ǵ����̸� Math.pow �� ���� �ʴ°��� ����. double ���̶� ������ �ణ�� �����, ���� Ŀ���� ������ �� ������
		long result = 1;
		while (exp > 0) {
			result = result * number;
			exp--;
		}

		return result;
	}
}

/*
 * 9��° ���� -> 1001(2)��° ���� -> 1001(3) = 28(10) ��Ʈ����ũ. ������ȯ
 */


/*
BinaryString �̿��Ͽ� ���ڿ����� 2���� ��ȯ�ϴ� Ǯ��
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());
		long number = 0;

		String binary = Long.toBinaryString(n);
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				number = number + pow(3, binary.length() - i - 1);
			}
		}

		System.out.println(number);
	}

	static long pow(int number, int exp) {
		long result = 1;
		while (exp > 0) {
			result = result * number;
			exp--;
		}

		return result;
	}
}
*/