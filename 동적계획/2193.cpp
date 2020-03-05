
#include <cstdio>
#include <vector>
int main(){
  int i,j,N;
  scanf("%d",&N);
  std::vector<long long int> T(N+1,0); // long long int = long long ... 거의 100조까지 커버함
  T[1]=T[2]=1;
  for(i=3;i<=N;i++){
    T[i]=T[i-1]+T[i-2];

  }
  printf("%lld",T[N]); //와 미친 ... long long 형은 lld 로 출력해야함.
}

/*
1
10
100     101
1000    1001 1010
10000   10001 10010 10100 10101

0
0 1
0 1 0
0 1 0 0 1
0 1 0 0 1 0 1 0
0 1 0 0 1 0 1 0 0 1 0 0 1

피보나치
N	result
1 1
2	1
3	2
4	3
5	5
6	8
7	13
*/
