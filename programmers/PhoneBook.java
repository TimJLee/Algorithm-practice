
import java.util.*;
class PhoneBook {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(String p : phone_book)
        	System.out.print(p+" ");
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
    
    public static void main(String[] args) {
    	String[] t1 = {"123", "01230", "07"}; //01230 07 123
    	String[] t2 = {"97674223", "976124", "118", "9761240", "97612400"}; //118 976124 9761240 97612400 97674223 
    	String[] t3 = {"119", "97674223", "1195524421"}; // 119 1195524421 97674223
    	PhoneBook pb1 = new PhoneBook();
    	System.out.println(pb1.solution(t3));
    }
}