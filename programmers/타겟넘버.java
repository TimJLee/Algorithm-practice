class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
       
    }
    public int dfs(int [] numbers, int target, int index, int num){
        if(index == numbers.length){
            if(num == target) return 1;
            else return 0;
        }
        return dfs(numbers, target, index+1, num+numbers[index])
            + dfs(numbers, target, index+1, num-numbers[index]);
    }
}

//복습 - 내 풀이
class Solution {
    int answer;
    public int solution(int[] numbers, int target) {
     
        dfs(0,0,numbers,target);
        
        return answer;
    }
    public void dfs(int sum, int count, int [] numbers, int target){
        int n = numbers.length;
        if(count == n){
            if(sum == target){
                answer++;
                return;
            }
            return;
        }
        dfs(sum+numbers[count],count+1,numbers,target);
        dfs(sum-numbers[count],count+1,numbers,target);
                
    }
}