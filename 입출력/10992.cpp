#include <cstdio> // stdio.h 와 같음 iostream 도 마찬가지
int main(){
  int i,j,k,N;
  scanf("%d",&N);
  for(i=0;i<=N-2;i++){
    for(j=0;j<N-(i+1);j++)printf(" ");
    printf("*");
    if(!i) {
      printf("\n");
      continue;
    }
    for(k=0;k<2*i-1;k++)
      printf(" ");
    printf("*\n");
  }
  for(i=0;i<2*N-1;i++)
    printf("*");
}
