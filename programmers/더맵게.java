import java.util.*;
class Solution {
    int ns; // 뉴 스코빌 값
    int i;
    int count;
    public int solution(int[] s, int K) {
        PriorityQueue<Integer> sc = new PriorityQueue();
        for (int temp : s) {
            sc.offer(temp);
        }
        while(sc.peek()<K){
            if(sc.size() == 1){
                  return -1;
            }
            count++;
            ns = sc.poll()+2*sc.poll();
            sc.offer(ns);
        }
        return count;
        /*
        Arrays.sort(s);
        if(s[0]>=K) return 0;
        List<Integer> sc = new ArrayList<>();

        for(int temp : s){
          sc.add(temp);
        }

        while(true){
            if(sc.get(i)<K){
                if(sc.size() == 1){
                    count = -1;
                    break;
                }
                count++;
                ns = sc.get(i)+2*sc.get(i+1);
                sc.remove(i);
                sc.remove(i);
                sc.add(i,ns);
                Collections.sort(sc);
            }else{
                break;
            }
        }
        
        return count;
        */
    }
}