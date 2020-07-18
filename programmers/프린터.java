import java.util.*;
class Solution {
    int count;
    public int solution(int[] pr, int location) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<pr.length;i++){
            list.add(pr[i]);
        }
        while(true){
            if(location==0) {
                if(printMax(list))
                    return ++count;
                else
                    location=list.size()-1;
            }
            if(printMax(list)) count++;
            location--;
        }

        //return count;
    }
    public boolean printMax(List<Integer> list){
        //if(list.size()==0) return true;
        int max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)>max) {
                list.remove(0);
                list.add(max);
                return false;
            }
        }
        list.remove(0);
        return true;
    }
}