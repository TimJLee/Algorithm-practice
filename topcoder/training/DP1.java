
/*
 * 격자 형태의 길에서 A지점에서 B지점으로 최단거리로 이동하고 싶을 때, 이동 경로의 총 가짓수 구하기
 * dfs를 사용한 풀이 & dfs + dp 를 사용한 풀이
 * dp 의 핵심 : 한번 계산한 결과는 다시 계산하지 않는다. == first visit 몬테카를로
 * <시간복잡도>
 * 전체탐색 : 빅오 2^(h+1)*(w+1)
 * dfs + dp : O((h+1)*(w+1)) = O(h*w)
 * 수학적 풀이(조합) : O(h+w) 
 */
public class DP1 {
	final int h=5, w=4;
	int[][] dp = new int[h+1][w+1];
	
	public static void main(String[] args) {
		DP1 dp1 = new DP1();
		System.out.println(dp1.dfs(0,0));
	}
	int dfs(int nowh, int noww)
	{
		if(nowh > h || noww >w) return 0;
		if(nowh == h && noww == w) return 1;
		if(dp[nowh][noww] != 0) return dp[nowh][noww];
		//return dfs(nowh + 1, noww) + dfs(nowh, noww + 1);
		return dp[nowh][noww] = dfs(nowh + 1, noww) + dfs(nowh, noww + 1);
	}
}
