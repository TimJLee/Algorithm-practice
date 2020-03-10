#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <queue>

using namespace std;

void dfs(vector<int> graph[],bool check[],int start){
  int current_node,next_node,i;
  stack<int> s;
  s.push(start);
  check[start]=true;
  cout<<start<<" ";

  while(!s.empty()){
    current_node=s.top();
    s.pop();
    for(i=0;i<graph[current_node].size();i++){
      next_node=graph[current_node][i];
      if(!check[next_node]){
        cout<<next_node<<" ";
        check[next_node]=true;
        s.push(current_node);
        s.push(next_node);
        break;
      }
    }

  }
}

void bfs(vector<int> graph[],bool check[],int start){
  int tmp,i;
  queue<int> q;
  q.push(start);
  check[start]=true;

  while(!q.empty()){
    tmp=q.front();
    q.pop();
    cout<<tmp<<" ";
    for(i=0;i<graph[tmp].size();i++){
      if(!check[graph[tmp][i]]){
        q.push(graph[tmp][i]);
        check[graph[tmp][i]]=true;
      }
    }

  }
}

int main(){
  int N,M,start,i,u,v;
  cin>>N>>M>>start;

  vector<int> graph1[N+1];
  vector<int> graph2[N+1];
  bool check[N+1];
  fill(check,check+N+1,false);

  for(i=0;i<M;i++){
    cin>>u>>v;
    graph1[u].push_back(v);
    graph1[v].push_back(u);
    graph2[u].push_back(v);
    graph2[v].push_back(u);
  }

  for(i=1;i<=N;i++){
    sort(graph1[i].begin(),graph1[i].end());
    sort(graph2[i].begin(),graph2[i].end());
  }

  dfs(graph1,check,start);
  cout<<'\n';
  fill(check,check+N+1,false);
  bfs(graph2,check,start);
}

// 참고자료: https://twpower.github.io/73-how-to-implement-dfs-and-bfs-in-cpp 