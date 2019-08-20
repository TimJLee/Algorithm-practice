#include <cstdio>

int main(){
  int i,N,T[100];
  long long P[101]={0,1,1,1,2,2,3,4,5,7,9};
  scanf("%d",&N);
  for(i=0;i<N;i++) scanf("%d",&T[i]);

  for(i=11;i<=100;i++){
    P[i]=P[i-1]+P[i-5];
  }
  for(i=0;i<N;i++) printf("%lld\n",P[T[i]]);
}
/*
idea
P[11]=P[6]+P[10]
P[12]=P[11]+P[7]
*/
