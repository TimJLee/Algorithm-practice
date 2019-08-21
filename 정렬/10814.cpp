#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
struct I{
  int age;
  int time;
  string name;
};

bool cmp(const I &a,const I &b) {
  if(a.age<b.age) return true;
  else if(a.age==b.age){
    if(a.time<b.time) return true;
  }
 }

int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int i,j,N,temp;
  string temp2;

  cin>>N;
  vector<I> T(N);

  for(i=0;i<N;i++) {
    cin>>T[i].age>>T[i].name;
    T[i].time=i;
  }

  sort(T.begin(),T.end(),cmp);

  for(i=0;i<N;i++)cout<<T[i].age<<" "<<T[i].name<<'\n';
}
