#include <iostream>
#include <cmath>
using namespace std;
void hanoi(int n,int a,int b,int c,int *count){
  if(n==1) {
    (*count)++;
    return;
  }
  hanoi(n-1,a,c,b,count);
  (*count)++;
  hanoi(n-1,b,a,c,count);
}
void hanoi(int n,int a,int b,int c){
  if(n==1) {
    cout<<a<<" "<<c<<'\n';
    return;
  }
  hanoi(n-1,a,c,b);
  cout<<a<<" "<<c<<'\n';
  hanoi(n-1,b,a,c);
}

int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int N,count=0;
  cin>>N;
  hanoi(N,1,2,3,&count);
  cout<<count<<'\n';
  hanoi(N,1,2,3);

}
