#include <cstdio>

int main(){
  int i,j,N;
  scanf("%d",&N);
  for(i=0;i<N;i++){
    for(j=0;j<i;j++)printf(" ");
    for(j=0;j<2*(N-i-1)+1;j++) printf("*");
    printf("\n");
  }
  for(i=1;i<N;i++){
    for(j=0;j<N-i-1;j++) printf(" ");
    for(j=0;j<2*i+1;j++) printf("*");
    printf("\n");
  }
}

/*
abs 사용(절댓값)
#include<cstdio>
#include<algorithm>
using namespace std;
int n;
int main() {
    scanf("%d", &n);
    for (int i = 0; i < 2 * n - 1; i++) {
        for (int j = 0; j < n-1-abs(n-1-i); j++)
            printf(" ");
        for (int j = 0; j <2*abs(n-1-i)+1; j++)
            printf("*");
        puts("");
    }
    return 0;
}
*/
