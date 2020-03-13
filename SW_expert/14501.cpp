#include <iostream>
#define MAX_NUM 15

using namespace std;

int main(){
    int N,T[MAX_NUM],P[MAX_NUM],S[MAX_NUM]={0};
    int index;
    cin >> N;

    for(int i=0;i<N;i++){
        cin >> T[i] >> P[i];
    }

    S[T[0]-1]=P[0];
    for(int i=1;i<N;i++){
        index = i+T[i]-1;
        if(index < N){
        /*
        int k=1;
        while(S[i-1] ==0){
            if((i-1-k)<0) break;
            S[i-1]=S[i-1-k];
            k++;
        }
        k=1;
        while(S[index]==0){
            if((index-k)<0) break;
            S[index]=S[index-k];
            k++;
        }
        */
        S[index] = max(S[index],P[i]+S[i-1]);
        }
        S[i]=max(S[i],S[i-1]);
    }

    cout << S[N-1] << endl;
    /*
    for(int i=0;i<N;i++){
        cout<<S[i]<<" ";
    }
    */

}

//동적계획법은 테이블을 다 채울 생각을 해야 한다. 중간에 빈칸이 생기면 반례가 생길 가능성이 높아진다.