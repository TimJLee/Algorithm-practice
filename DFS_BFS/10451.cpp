#include <iostream>

using namespace std;

int main(){

}

/*
1 2 3 4 5 6 7 8
3 2 7 8 1 4 5 6
1. 배열(이차원?)
from to check
1    3  o
2    2  x
3    7  o
4    8
5    1
6    4
7    5
8    6
2. 벡터로 연결리스트
1->3->7->5->1(1,3,7,5 방문 표시)(순환이 된 걸 확인하면 종료, i++, !check 이면 실행)
2->2(2 방문 표시)(순환되었으므로 종료)
3은 체크되어있으므로 skip.. 이런식
4->8->6->4->8(4,8,6 방문 표시 후 종료)
종료 할 때 마다, 1~8 다 체크되었는지 체크(while문 안에 조건으로 !allCheck)

*/
