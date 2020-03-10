

#include <cstdio>
#include <stack>
#include <utility>

using namespace std;

int n,k;
stack<pair<int, int> > st;

int main(){

  scanf("%d",&n);
  for(int i=1;i<=n;i++){
    scanf("%d",&k);
    while (!st.empty())
    {
        if(k<st.top().second){
            printf("%d ",st.top().first);
            //cout<<st.top().first+" " 이렇게 하면 출력이 씹히는 오류가 발생한다...
            break;
        }else{
            st.pop();
        }
    }
    if(st.empty()) printf("0 ");

    st.push(make_pair(i,k));
  }
}

