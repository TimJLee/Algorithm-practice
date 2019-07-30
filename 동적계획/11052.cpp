#include <cstdio>
int main(){
  int i,j,N,P[1001]={0},T[1001]={0},max=0;
  scanf("%d",&N);
  for(i=1;i<=N;i++) scanf("%d",&P[i]);

  T[1]=P[1];
  for(i=2;i<=N;i++){
    max=0;
    for(j=0;j<i;j++){
      if(max<P[i-j]+T[j]) max=P[i-j]+T[j];
    }
    T[i]=max;
  }
  printf("%d",T[N]);

}
/*
P1 P2 P3 P4 P5 ...
3  4  1  2 5

3/1 4/2 ...
P[i]/i = 단위 개수당 가격
그리디x 동적o

갯수 -> 무게
가격 -> 가치
카드 -> 물건(중복가능)
0/1배낭문제로 환원가능

T[i][N] ~ T[i-1][j-i]+P[i] > T[i-1][j]
i    N 0   1     2      3   4   5
1      0   P[1]  2*P[1]
2      0   P[1]
3
4
5
T[1]=P[1]
T[2]=P[2] or P[1]+T[1]
T[3]=P[3] or P[2]+T[1] or P[1]+T[2]
...
T[i]=P[i] or P[i-1]+T[1] or P[i-2]+T[2] or P[i-j]+T[j]... max
T[N]=P[N] or P[N-1]+T[1] or ..... P[1]+T[N-1]
*/
