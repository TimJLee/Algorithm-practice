#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int i,N,K;
  cin>>N>>K;
  vector<int> T(N);
  for(i=0;i<N;i++) cin>>T[i];
  sort(T.begin(),T.end());
  cout<<T[K-1];
}
