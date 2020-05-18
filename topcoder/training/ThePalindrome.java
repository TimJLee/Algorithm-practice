
public class ThePalindrome {
	public static void main(String[] args) {
		String s1 = "abab";
		String s2 = "abacaba";
		String s3 = "qwerty";
		String s4 = "abdfhdyrbdbsdfghjkllkjhgfds";
		ThePalindrome th = new ThePalindrome();
		System.out.println(th.find(s4));
	}
	
	public int find(String s) {
		int mid = s.length()/2;
		for(int i=0; i<mid;i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				s = s.substring(0,s.length()-i)
						+ s.charAt(i)
						+ s.substring(s.length()-1-i);
			}
		}
		return s.length();
		
	}
}
