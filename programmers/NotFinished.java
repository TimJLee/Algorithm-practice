// #1

class NotFinished {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        int i=0,j=0;
        for(i=0;i<participant.length;i++){
            for(j=0;j<completion.length;j++){
                if(participant[i].equals(completion[j])) break;
                if(j==completion.length-1){
                    answer = participant[i];
                    break;
                }
            }
            if(participant[i].equals(completion[j])) continue;
            if(j==completion.length-1){
                    answer = participant[i];
                    break;
            }
        }
        
        return answer;
    }
    
}

// #1-1
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for(int i=0; i<participant.length; i++){ 
            hm.put(participant[i], 0); 
        }

        int i=0,j=0;
        for(i=0;i<participant.length;i++){
            
            for(j=0;j<completion.length;j++){
                if(participant[i].equals(completion[j]) && (hm.get(participant[i]) == 0)){
                    hm.put(participant[i], 1); 
                    break;
                } 
                if(j==completion.length-1){
                    answer = participant[i];
                    break;
                }
            }
            if(participant[i].equals(completion[j])) continue;
            if(j==completion.length-1){
                    answer = participant[i];
                    break;
            }
        }
        
        return answer;
    }
    
}

// #2
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}

// #3
public String solution(String[] participant, String[] completion) {
	String notRunner = "";
	HashMap<String, Integer> map = new HashMap<String, Integer>(); 
	for(String runner : participant) map.put(runner, map.getOrDefault(runner, 0) + 1);
	for(String runner : completion) map.put(runner, map.get(runner) - 1); 
	
	for(String runner : map.keySet()) {
		if(map.get(runner) != 0) {
			notRunner = runner; 
			break;
		}
	}
	
	return notRunner;
}