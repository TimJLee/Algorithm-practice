import java.util.*;
class Solution {
    int ion; // 쇠막대기 개수
    int count; // 잘린 막대 개수
    public int solution(String arr) {
        Stack<Character> s = new Stack<>();
        s.push(arr.charAt(0));
        for(int i=1;i<arr.length();i++){
            if(arr.charAt(i)==')'){
                if(arr.charAt(i-1)=='('){
                    s.pop();
                    count+=ion;
                }else{
                    ion--; // 쇠막대기 하나 끝
                    count++; // 따라서 잘린개수 하나 추가
                }
            }else{
                if(arr.charAt(i-1)=='('){
                    ion++; //(( 인 경우 앞의 ( 를 쇠막대기로 판단
                    s.push('(');
                }else{
                    s.push('(');
                }
            }
        }

        return count;
    }
}