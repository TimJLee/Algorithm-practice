#include <cstdio>
#include <vector>
int main(){
  int i,N;
  scanf("%d",&N);
  std::vector<int> T(N+1);
  T[1]=1; T[2]=3;
  for(i=3;i<=N;i++){
    T[i]=T[i-1]%10007+(T[i-2]*2)%10007;
  }
  printf("%d",T[N]%10007);
}
