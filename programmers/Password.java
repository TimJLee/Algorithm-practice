import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


class Password {
	char c;
	int co;
	boolean flag;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputPw = br.readLine();

		Pattern pAlphabetLow = null;
		Pattern pAlphabetUp = null;
		Pattern pNumber = null;
		Pattern pSpecialChar = null;
		Pattern pThreeChar = null;
		Matcher match;
		int nCharType = 0;
		pAlphabetLow = Pattern.compile("[a-z]");
		pAlphabetUp = Pattern.compile("[A-Z]");
		pNumber = Pattern.compile("[0-9]");
		pSpecialChar = Pattern.compile("\\p{Punct}");
		if (inputPw.length() >= 10)
			nCharType++;

		match = pAlphabetLow.matcher(inputPw);
		if (match.find())
			nCharType++;
		// 영대문자가 포함되어 있는가?
		match = pAlphabetUp.matcher(inputPw);
		if (match.find())
			nCharType++;
		// 숫자가 포함되어 있는가?
		match = pNumber.matcher(inputPw);
		if (match.find())
			nCharType++;
		// 특수문자가 포함되어 있는가?
		match = pSpecialChar.matcher(inputPw);
		if (match.find())
			nCharType++;

		System.out.println("LEVEL" + nCharType);

	}
}