#include <vector>
#include <iostream>
#include <stack>

using namespace std;
void dfs(vector<int> graph[],bool check[],int start){
  int current_node,next_node,i;
  stack<int> s;
  s.push(start);
  check[start]=true;


  while(!s.empty()){
    current_node=s.top();
    s.pop();
    for(i=0;i<graph[current_node].size();i++){
      next_node=graph[current_node][i];
      if(!check[next_node]){

        check[next_node]=true;
        s.push(current_node);
        s.push(next_node);
        break;
      }
    }

  }
}

int main(){
  int i,N,M,u,v,count=0;
  cin>>N>>M;
  vector<int> graph[N+1];
  bool check[N+1];
  fill(check,check+N+1,false);

  for(i=0;i<M;i++){
    cin>>u>>v;
    graph[u].push_back(v);
    graph[v].push_back(u);
  }
  for(i=1;i<=N;i++){
    if(!check[i]){
      count++;
      dfs(graph,check,i);
    }
  }
  cout<<count;
}
