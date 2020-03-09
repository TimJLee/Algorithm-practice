#include <iostream>

using namespace std;

void changeDice(int dice[],int f){
  int temp[7]={0};
  for(int i=1;i<=6;i++){
      temp[i]=dice[i];
  }
  if(f == 1){
      dice[1]=temp[4];
      dice[3]=temp[1];
      dice[4]=temp[6];
      dice[6]=temp[3];
  }else if(f==2){
      dice[1]=temp[3];
      dice[3]=temp[6];
      dice[4]=temp[1];
      dice[6]=temp[4];
  }else if(f==3){
      dice[1]=temp[5];
      dice[2]=temp[1];
      dice[5]=temp[6];
      dice[6]=temp[2];
  }else{
      dice[1]=temp[2];
      dice[2]=temp[6];
      dice[5]=temp[1];
      dice[6]=temp[5];
  }

}

int main(){
  int N,M,x,y,d,i,j,f;
  int newX,newY;
  int dx[]={-1,0,1,0};
  int dy[]={0,1,0,-1};
  cin>>N>>M;
  cin>>x>>y>>d;
  int map[N][M];
  for(i=0;i<N;i++){
      for(j=0;j<M;j++){
          cin>>map[i][j];
      }
  }
 
  for(i=0;i<num;i++){
      cin>>f;
      newX = x+dx[f-1];
      newY = y+dy[f-1];
      if((newX >= N) || (newY >= M) || (newX < 0) || (newY < 0)) continue;
      x = newX;
      y = newY;

      changeDice(dice,f);
      
      if(map[x][y] == 0){
          map[x][y] = dice[6];
      }else{
          dice[6] = map[x][y];
          map[x][y]=0;
      }
      cout << dice[1] <<endl;
  }
}

/*
14499 - tip) 문제 발문에서 r,c 는 각각 row, column 이며 행렬에서의 행과 열을 뜻하므로, 이 문제에서는 이차원 배열(행렬)을 사용해야 할 것 같다. 
*/