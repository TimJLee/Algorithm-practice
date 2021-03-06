#include <cstdio>
#include <vector>
int main(){
  int i,N;
  scanf("%d",&N);
  std::vector<int> T(N+1);
  T[1]=1; T[2]=2;
  for(i=3;i<=N;i++){
    T[i]=T[i-1]%10007+T[i-2]%10007;
  }
  printf("%d",T[N]%10007);
}
/* 결국, 피보나치 수열로 변환됨.
동적계획에서의 핵심..은 주어진 조건(여기서는 2x1,1x2) 이를 이용하여
경우의 수를 따져야 한다. 중복되는 경우를 방지하기 위해서는,
경우의 수를 따질때, 제일 앞 부분이 1x2 일때와 2x1 로 채워지는 경우
즉, 두가지 경우로 이전 테이블을 참조하는 방식으로 문제를 해결하면 된다.
그림문제나 도형문제가 나왔을때, 당황하지 말고, 수학적 수식으로 바꾸려
하면 된다.
*/
