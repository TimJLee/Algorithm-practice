import java.util.*;
class Solution {
    int sum; // 두 사람 무게의 합
    int count; // 사람 카운팅 수
    int answer; // 구명보트 카운팅
    public int solution(int[] people, int limit) {
        //왠지 이거 투포인터 알고리즘 같다... ㅎㅎ
        int low=0; // low 값을 기준으로 
        int high=people.length-1; // high 값을 감소시키며 low 값과 비교한다. 그리디하게 최대한 limit 과 가깝게 세팅하려면 이렇게 제일 작은 값과 큰 값을 비교하며 나가야함. 
        
        Arrays.sort(people);
        while(count != people.length){
            if(low==high){
                answer++;
                break;
            }
            if(people[low]+people[high]<=limit){
                answer++;
                low++;
                high--;
                count+=2;
            }else{
                answer++;
                high--;
                count++;
            }
        }
        return answer;
        /*
        <히든케이스 때문에 틀린 풀이>
        if(people[0]*2>limit) return people.length;
        for(int i=0;i<people.length;i+=2){
            if(i == people.length-1) { // 사람이 홀수명이고, 앞에꺼 다 2명씩 타고 마지막 한명만 남을 때
                count++;
                break;
            }
            sum = people[i]+people[i+1];
            if(sum <= limit) count++;
            else{
                //count+=2;
                count = count + (people.length-i);
                break;
            }
        }
        
        return count;
        */
    }
}