import java.util.*;
class Solution {
    List<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        boolean visit[] = new boolean[tickets.length];
        int index=0;
        String[] answer = new String[tickets.length+1];
        dfs("ICN",0,"ICN",visit, tickets);
        Collections.sort(list);
        //System.out.println(list.get(0));
        
        String temp = list.get(0);
        for(int i=0;i<temp.length();i=i+3){
            answer[index++]=temp.substring(i,i+3);
            //System.out.print(temp.substring(i,i+3)+" ");
        }
        
        //String[] answer = {"java","trash"};
        return answer;
    }
    
    public void dfs(String start, int count, String str,boolean [] visit, String[][] tickets){
    
        if(count==tickets.length){//
            list.add(str);
            return;
        }
        for(int i=0;i<tickets.length;i++){
            if(start.equals(tickets[i][0])&&!visit[i]){
                visit[i]=true;
                //count=count+1;
                
                dfs(tickets[i][1],count+1,str+tickets[i][1],visit,tickets);
                visit[i]=false;
                //--count;
            }
        }
    }
}