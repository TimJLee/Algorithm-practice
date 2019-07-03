#include <iostream>
#include <vector>
using namespace std;

long long int modfun(int a, long long int b, int mod);

int main(){
  int i;
  int T;

  cin>>T;
  vector<int> a(T);
  vector<long long int> b(T);
  vector<long long int> c(T);
  for(i=0;i<T;i++)
  {
    cin>>a[i];
    cin>>b[i];
    c[i]=modfun(a[i],b[i],10);
    if(c[i]==0) c[i]=10;
  }
  for(i=0;i<T;i++)
  {
    cout<<c[i]<<endl;
  }
}

long long int modfun(int a, long long int b, int mod)
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

/*
#include <stdio.h>
int main()
{
	int T, A, B, C;
	scanf("%d", &T);
	while (T--)
	{
		scanf("%d %d", &A, &B);
		C = 1;
		while (B){
			if (B % 2) C = (C* A) % 10;
			B /= 2;
			A = (A*A) % 10;
		}
		printf("%d\n", C ? C : 10);
	}
}
*/
/*
mod 곱셈성질 이용(결합법칙)
#include <stdio.h>

int main()
{
	int n, a, b, ans;
	scanf("%d", &n);

	for(int i=1; i<=n; i++)
	{
		ans = 1;
		scanf("%d %d", &a, &b);
		for(int j=1; j<=b; j++)
			ans = (ans * a)%10;
		printf("%d\n", ans == 0 ? 10 : ans);
	}	
}
*/
/*
뭔소리? 왜 4를 나눔?
#include <stdio.h>
using namespace std;
main()
{
int n,x,y,tmp;
scanf("%d", &n);
while (n--)
{
scanf("%d %d", &x, &y);
x=x%10;
y=y%4;
if (y==0) y=4;
y-=1;
tmp=x;
while(y--) x=(tmp*x)%10;
if(x==0) x=10;
printf("%d\n", x);
}
}
*/
