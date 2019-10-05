
#include <iostream>
#include <algorithm>
using namespace std;
int main(){
  int N,A[250]={0},B[250]={0},TA[250]={0},TB[250]={0},i,result;
  cin >> N;
  for(i=0;i<N;i++) cin >> A[i] >> B[i];

  if(A[0]<B[0]) TA[0]=A[0];
  else TB[0]=B[0];
  for(i=1;i<N;i++){
    if(TA[i-1]+A[i]<TB[i-1]+B[i]) {
      TA[i]=TA[i-1]+A[i];
      TB[i]=TB[i-1];
    }
    else{
      TB[i]=TB[i-1]+B[i];
      TA[i]=TA[i-1];
    }
  }
  result=max(TA[N-1],TB[N-1]);
  printf("%d",result);
}
