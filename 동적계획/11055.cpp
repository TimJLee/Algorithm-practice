#include <cstdio>

int main(){
  int A[1001],T[1001];
  int N,i,j,max;
  scanf("%d",&N);
  for(i=1;i<=N;i++) scanf("%d",&A[i]);

  T[1]=A[1];
  max=T[1];
  for(i=2;i<=N;i++){
    T[i]=A[i];
    for(j=1;j<i;j++){
      if((A[i]>A[j]) && (A[i]+T[j]>T[i])){
        T[i]=A[i]+T[j];
      }
    }
    if(max<T[i]) max=T[i];
  }
  printf("%d\n",max);
}


/*
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
*/
