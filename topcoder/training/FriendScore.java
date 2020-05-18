import java.util.Arrays;

public class FriendScore {
	public static void main(String[] args) {
		String s1[] = {"NNN", "NNN", "NNN"};
		String s2[] = {"NYY", "YNY", "YYN"};
		String s3[] = {"NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN"};
		
		FriendScore f = new FriendScore();
	
		System.out.println(f.highestScore(s2));
	}
	
	public int highestScore(String[] friends) {
		int n = friends[0].length();
		int count[] = new int[friends[0].length()];
		int ret[] = new int[friends[0].length()];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(friends[i].charAt(j) == 'Y') count[i]++;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(friends[i].charAt(j) == 'Y') ret[i] += count[j];
			}
		}
		
		Arrays.sort(ret);
		return ret[ret.length-1];
	}
}
