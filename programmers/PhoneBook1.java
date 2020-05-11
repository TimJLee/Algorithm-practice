import java.util.HashMap;
import java.util.Arrays;
class PhoneBook1 {
    static public boolean solution(String[] phoneBook) {
       Arrays.sort(phoneBook);
       for(int i=0; i<phoneBook.length-1;i++)
       {
           if(phoneBook[i].length() <= phoneBook[i+1].length())
           if(phoneBook[i].equals(phoneBook[i+1].substring(0, phoneBook[i].length())))
           {
               return false;
           }   
       }
       return true;
    }

    public static void main(String[] args) throws Exception {

        String[] temp = {"119", "97674223", "1195524421"};
        boolean result = solution(temp);
            System.out.println(result);
    }
}