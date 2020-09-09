import java.util.*;
class Solution {
    int count=0;
    public String[] solution(String[] record) {
        Map<String,String> map = new HashMap<>();
        int n = record.length;
    
        for(int i=0;i<n;i++){
            if(record[i].split(" ")[0].equals("Enter")) {
                map.put(record[i].split(" ")[1],record[i].split(" ")[2]);
                count++;
            }
            else if(record[i].split(" ")[0].equals("Change")){
                map.put(record[i].split(" ")[1],record[i].split(" ")[2]);
            }else{
                count++;
            }
        }
        
        String[] answer = new String[count];
        
        int index = 0;
        
        for(int i=0;i<n;i++){
            if(record[i].split(" ")[0].equals("Enter"))
                answer[index++] = map.get(record[i].split(" ")[1])+"님이 들어왔습니다.";
            else if(record[i].split(" ")[0].equals("Leave"))
                answer[index++] = map.get(record[i].split(" ")[1])+"님이 나갔습니다.";
        }
        
   
        return answer;
    }
}