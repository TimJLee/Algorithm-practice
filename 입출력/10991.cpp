#include <cstdio>

int main(){
  int i,j,N;
  scanf("%d",&N);

  for(i=0;i<N-1;i++)printf(" ");
  printf("*\n");
  for(i=1;i<N-1;i++){
    for(j=0;j<N-i-1;j++)printf(" ");
    for(j=0;j<i+1;j++) printf("* ");
    printf("\n");
  }
  if(N>1)
    for(i=0;i<N;i++) printf("* ");
}
