
/*
 * ���� ������ �濡�� A�������� B�������� �ִܰŸ��� �̵��ϰ� ���� ��, �̵� ����� �� ������ ���ϱ�
 * dfs�� ����� Ǯ�� & dfs + dp �� ����� Ǯ��
 * dp �� �ٽ� : �ѹ� ����� ����� �ٽ� ������� �ʴ´�. == first visit ����ī����
 * <�ð����⵵>
 * ��üŽ�� : ��� 2^(h+1)*(w+1)
 * dfs + dp : O((h+1)*(w+1)) = O(h*w)
 * ������ Ǯ��(����) : O(h+w) 
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
