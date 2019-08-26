#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int i,N,M;
  cin>>N>>M;
  vector<int> A(N);
  vector<int> B(M);
  for(i=0;i<N;i++) cin>>A[i];
  for(i=0;i<M;i++) cin>>B[i];
  A.insert(A.end(),B.begin(),B.end());
  sort(A.begin(),A.end());
  for(i=0;i<A.size();i++) cout<<A[i]<<" ";
}
