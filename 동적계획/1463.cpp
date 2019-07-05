#include <cstdio>
#include <vector>
#define inf 1000000
int main(){
  int i,j,N,a[3],tmp;
  scanf("%d",&N);
  std::vector<int> T(N+1);
  T[1]=0; T[2]=1; T[3]=1;
  for(i=4;i<=N;i++){
    a[0]=a[1]=a[2]=inf;
    a[0]=1+T[i-1];
    if(i%2==0) a[1]=1+T[i/2];
    if(i%3==0) a[2]=1+T[i/3];
    T[i]=std::min(std::min(a[0], a[1]), a[2]);
  }
  printf("%d",T[N]);
  return 0;
}

/*
위에껀 내풀이. 동적계획으로 테이블생성하여, 상향식으로 품
아래는 분할정복. 하향식으로 푼 방식. 재귀 호출 이용
이번에 깨달은 것은, <algorithm> 을 이용하면, min() 함수 사용 가능하다는 것
하지만, 이건 매개변수 2개만 됨 ... 오 하지만
int smallest(int x, int y, int z){
    return std::min(std::min(x, y), z);
}
위와같이 하면 됨을 알아냄
/*
for(j=0;j<2;j++){
  if(a[j]<a[j+1]){
    tmp=a[j+1];
    a[j+1]=a[j];
    a[j]=tmp;
  }
}

T[i]=a[2];
즉, 원래는 이렇게 긴 코드가 위와 같이 한줄로 줄어든다! std:: 를 쓰면,
header 가 필요없는듯...?
#include<cstdio>
#include<algorithm>
int f(int n) {
	int a,b;
	if(n<2)
		return 0;
	a=f(n/2)+n%2+1;
	b=f(n/3)+n%3+1;
	return std::min(a,b);
}
main(){
	int n;
	scanf("%d",&n);
	printf("%d",f(n));
}
*/
