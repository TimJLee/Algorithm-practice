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