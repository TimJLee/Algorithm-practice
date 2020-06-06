
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println("Hello Goorm! Your input is " + input);
	}
}

/*
 * 문제 아이디어 : xx 를 0으로 x0 를 1로 ox를 2로 oo를 3으로
 * 또는 x를 0으로 o를 1로 봐서 이진수로 표현하기
 * 아님 그냥 문자열로...
 * 
 
2 4
ox oo 4
ox xo 4
xx ox 1
xo oo 3
3
xo oo
oo xx
xx oo

3
-1
5


3 9
xoo oox 4
ooo xox 4
oxx xoo 5
oox ooo 3
ooo xxo 3
xox xoo 3
oxo xoo 4
ooo oox 4
ooo oxx 5
3
oxo oox
ooo oox
xxx xox

8
4
-1


3 6
xxx xxo 4
oxo ooo 5
xoo oox 5
xxo xox 2
xoo oxo 4
oxo xxo 1
4
xox xoo
oox xxo
oxx oxx
xoo ooo

-1
-1
0
9
*/