#include <iostream>

using namespace std;
int main(){
  int N,M,i,j,ans=1;

  cin >> N;
  if(N%2==0) M=N/2;
  else M=N/2+1;

  for(int j=1; j<=M; j++)
    ans = (ans * 2)%16769023;
  printf("%d\n", ans == 0 ? 16769023 : ans);

  
}

/*
long long int modfun(int a, int b, int mod)
{
	long long int result = 1; // long long int 로 해야 표현 범위 넘어가지 않음
	while (b > 0)
	{
		if (b & 1) // bit and 연산. 지수가 홀수인가?(16,8,4,2,1...) 끝자리가 1이면 무조건 홀수** 그렇다면 true => 쪼개준다.
		{
			result = (result * a) % mod; // result 업데이트
		}
		b = b >> 1; // 지수를 반으로 쪼개고, 만약 홀수더라도 내림연산이므로 상관없음. 버려지는 값은 위에서 이미 처리했기 때문.
		a = (a*a) % mod; // 밑의 제곱을 수행하여 모듈러 연산.
	}
	return result;
}
*/
