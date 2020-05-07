//큰그림 설계
// ["123", "01230"] 에서 
//java.lang.StringIndexOutOfBoundsException: begin 0, end 5, length 3 에러가 뜬다.

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            for(int j=i+1;j<phone_book.length;j++){
                if(phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))) 
                   return false;
            }
        }
        boolean answer = true;
        return answer;
    }
}

// 
/* 총 38분 경과... 해결완료! 978점 획득!! */

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            for(int j=i+1;j<phone_book.length;j++){
                if(phone_book[i].length() <= phone_book[j].length()){ //@1
                    if(phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))) 
                       return false;
                }
            }
        }
        boolean answer = true;
        return answer;
    }
}