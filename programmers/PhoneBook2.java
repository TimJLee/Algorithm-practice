
import java.util.*;
public class PhoneBook2 {
    public boolean solution(String[] phoneBook) {
    	Arrays.sort(phoneBook);
       for(int i=0; i<phoneBook.length-1; i++) {
    	     if(phoneBook[i].length() <= phoneBook[i+1].length()) {
    	    	 if(phoneBook[i+1].startsWith(phoneBook[i])) return false;
    	     }
        }
        return true;
    }
    
    public static void main(String[] args) throws Exception {

        String[] temp = {"119", "97674223", "1195524421"};
        PhoneBook2 pb2 = new PhoneBook2();
        System.out.println(pb2.solution(temp));
    }
}
