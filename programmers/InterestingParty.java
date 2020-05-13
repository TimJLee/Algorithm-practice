import java.util.*;
public class InterestingParty {
	
	public static void main(String[] args) {
		InterestingParty it = new InterestingParty();
		String[] first = {"snakes","diversity","courtesy","courtesy"};
		String[] second = {"talking", "courtesy", "discussion", "meeting"};
		String[] first2 = {"courtesy","diversity","courtesy","courtesy"};
		String[] second2 = {"talking", "courtesy", "discussion", "meeting"};
		System.out.println(it.bestInvitation(first2, second2));
	}
	public int bestInvitation(String[] first, String[] second) {
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		
		for(int i=0;i<first.length;i++) {
			dic.put(first[i], dic.getOrDefault(first[i], 0)+1);
			dic.put(second[i], dic.getOrDefault(second[i], 0)+1);
		}
		
		int ans = Collections.max(dic.values());
		return ans;
	}
}
