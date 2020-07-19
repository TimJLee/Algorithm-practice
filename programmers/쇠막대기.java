//스택으로 풀었지만, 스택 생략해도 돌아감. 
//스택을 쓴다고 가정하면, 첫번째 else 블럭이 단순해진다. push 만 하면 되기 때문이다. 
//그리고 count 대신 stack.size() 를 사용하면 되므로 코드가 좀 더 간결해지는 것은 맞다. 
//하지만, 효율성 평가를 해본결과 스택을 안쓰는게 더 빠르다. 
//import java.util.*;
class Solution {
    int ion; // 쇠막대기 개수
    int count; // 잘린 막대 개수
    public int solution(String arr) {
        //Stack<Character> s = new Stack<>();
        //s.push(arr.charAt(0));
        for(int i=1;i<arr.length();i++){
            if(arr.charAt(i)==')'){
                if(arr.charAt(i-1)=='('){
                    //s.pop(); -> 스택부분 주석처리해도 잘 돌아감
                    count+=ion;
                }else{
                    ion--; // 쇠막대기 하나 끝
                    count++; // 따라서 잘린개수 하나 추가
                }
            }else{
                if(arr.charAt(i-1)=='('){
                    ion++; //(( 인 경우 앞의 ( 를 쇠막대기로 판단
                    //s.push('(');
                }else{
                    //s.push('(');
                }
            }
        }

        return count;
    }
}
