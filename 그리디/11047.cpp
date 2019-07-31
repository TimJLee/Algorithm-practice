#include <cstdio>

int main(){
  int i,j,m,co=0,N,K,A[10]={0};
  scanf("%d %d",&N,&K);
  for(i=0;i<N;i++) scanf("%d",&A[i]);

  for(i=N-1;i>=0;i--){
    if(K>=A[i]){
        m=A[i];
        co+=K/m;
        K=K%m;
    }
    if(K==0) break;
  }

  printf("%d\n",co);
}
