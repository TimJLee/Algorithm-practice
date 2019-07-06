#include <cstdio>
#define m 1000000000
int main(){
  int i,j,N;
  long long int sum=0;
  scanf("%d",&N);
  int A[10],B[10];
  for(i=1;i<=9;i++) A[i]=1;
  A[0]=0;
  for(i=0;i<N-1;i++){
    B[0]=A[1]%m;
    B[9]=A[8]%m;
    for(j=1;j<=8;j++) B[j]=(A[j-1]+A[j+1])%m;
    for(j=0;j<=9;j++) A[j]=B[j];
  }
  for(i=0;i<10;i++) sum=(sum+A[i])%m;

  printf("%d",sum);
}
