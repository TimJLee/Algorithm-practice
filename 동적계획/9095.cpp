#include <iostream>

using namespace std;
int main(){
  int i,j;
  int a;
  int T[11]={0};
  int c[10];

  T[1]=1; T[2]=2; T[3]=4;
  for(i=4;i<=10;i++){
    T[i]=T[i-1]+T[i-2]+T[i-3];
  }

  cin>>a;
  for(i=0;i<a;i++){
    cin>>c[i];
  }
  for(i=0;i<a;i++){
    cout<<T[c[i]]<<endl;
  }



}
