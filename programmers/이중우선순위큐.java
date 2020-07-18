//효율 풀이
import java.util.*;
class Solution {
    String op1,op2;
    public int[] solution(String[] op) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> qMin = new PriorityQueue(); // 최소힙
        PriorityQueue<Integer> qMax = new PriorityQueue(Collections.reverseOrder()); // 최대힙
        for(int i=0;i<op.length;i++){
            // 빈칸 기준으로 문자열 스플릿
            op1 = op[i].split(" ")[0]; 
            op2 = op[i].split(" ")[1];
            if(op1.equals("I")){
                int temp=Integer.parseInt(op2);
                qMin.offer(temp);
                qMax.offer(temp);
            }
            else if(qMax.size()!=0 && op1.equals("D")){
                //최소값 삭제
                if(op2.charAt(0)=='-'){
                    //int min = qMin.poll();
                    qMax.remove(qMin.poll());
                }
                //최대값 삭제
                else{
                    //int max = qMax.poll();
                    qMin.remove(qMax.poll());
                }
            }
        }
        int[] answer=new int[2];
        if(qMax.size()==0) return answer;
        answer[0]=qMax.poll();
        answer[1]=qMin.poll();
        return answer;
    }
}

//내 첫 풀이
import java.util.*;
class Solution {
    public int[] solution(String[] op) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue(); // 최소힙
        for(int i=0;i<op.length;i++){
            String op1 = op[i].split(" ")[0];
            String op2 = op[i].split(" ")[1];
            if(op1.equals("I"))
                q.offer(Integer.parseInt(op2));
            else if(op1.equals("D")){
                if(op2.charAt(0)=='-'){
                    //최소값 삭제
                    if(q.size()==0) continue;
                    q.poll();
                }else{
                    //최대값 삭제
                    if(q.size()==0) continue;
                    while(q.size()!=0){
                        list.add(q.poll());
                    }
                    list.remove(list.size()-1);
                    for(int j=0;j<list.size();j++)
                    {
                        q.offer(list.get(j));
                    }
                }
            }
        }
        list.clear();
        //[최대값,최소값] 반환
         while(q.size()!=0){
            list.add(q.poll());
        }
        int[] answer = new int[2];
        if(list.size()==0) {
            answer[0]=0;
            answer[1]=0;
        }else{
            answer[0]=list.get(list.size()-1);
            answer[1]=list.get(0);
        }
        System.out.println(answer[0]+" "+answer[1]);
        return answer;
    }
}

/*
if operations[i].split("")[0] = | 
=> operations[i].split("")[1] 를 큐에삽입
if = D
 if [1] = 음수
  큐에서 최솟값 삭제
 else
  큐에서 최댓값 삭제

for 빠져나오면, 큐에서 최댓값, 최소값 [x,y]로 반환
*/