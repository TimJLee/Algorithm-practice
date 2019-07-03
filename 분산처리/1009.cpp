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
