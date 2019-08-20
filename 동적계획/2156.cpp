#include <cstdio>
#include <algorithm>
using namespace std;
int main(){
  int i,N,T[10001],D[10001]={0};
  scanf("%d",&N);
  for(i=1;i<=N;i++) scanf("%d",&T[i]);

  D[1]=T[1];
  D[2]=T[1]+T[2];

  for(i=3;i<=N;i++){
    D[i]=max(max(T[i]+D[i-2],T[i]+T[i-1]+D[i-3]),D[i-1]);
  }
  printf("%d\n",D[N]);
}
/*
idea
6 10 13 9 8 1 2

1 2  3   4   5    6      7
6 16 23  28  33 > 33(32) 35
D[3]=T[3]+D[1] or T[3]+T[2]+D[0] or D[2]
D[4]=T[4]+D[2] or T[4]+T[3]+D[1] or D[3]
*/
