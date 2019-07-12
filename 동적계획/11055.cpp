#include <cstdio>
#include <vector>
int main(){
  int i,j,k,l,result=0,sum,N;
  scanf("%d",&N);
  std::vector<int> T(N+1,0);
  for(i=1;i<=N;i++) scanf("%d",&T[i]);
  result=T[1];
  for(i=1;i<=N;i++){
    sum=T[i];
    for(l=i;l<N;l++){
      sum=T[i];
      k=i;
      for(j=l;j<N;j++){
        if(T[k]<T[j+1]) {
          sum+=T[j+1];
          k=j+1;
        }
      }
      if(sum>result) result=sum;
    }
  }
  printf("%d",result);
}
