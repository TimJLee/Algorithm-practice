import java.util.*;
class Solution {
    int count,item;
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int n = board.length;
        //System.out.println(n);
        for(int i=0;i<moves.length;i++){
            for(int j=0;j<n;j++){
                if(board[j][moves[i]-1] != 0){
                    item = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    if(basket.size()==0) {
                        basket.push(item);
                        break;
                    }
                    else if(basket.peek() != item){
                        basket.push(item);
                        break;
                    }else{
                        basket.pop();
                        count+=2;
                        break;
                    }
                }
            }
        }
        
        return count;
    }
}