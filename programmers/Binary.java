
import java.util.*;

public class Binary {
	public static void main(String[] args) {
	
		List<Integer> bin = new ArrayList<>();
		// #2 List<Long> bin = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		//입력받은 수를 2진수로 변환
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

	static long pow(int number, int exp) { // 되도록이면 Math.pow 는 쓰지 않는것이 좋음. double 형이라서 오차가 약간씩 생기며, 수가 커지면 오차가 더 벌어짐
		long result = 1;
		while (exp > 0) {
			result = result * number;
			exp--;
		}

		return result;
	}
}

/*
 * 9번째 숫자 -> 1001(2)번째 숫자 -> 1001(3) = 28(10) 비트마스크. 진수변환
 */


/*
BinaryString 이용하여 문자열에서 2진수 변환하는 풀이
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