import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int len = board[0].length;
        Stack<Integer> basket = new Stack<>();

        for (int m : moves) {
            int move = m - 1;
            for (int i = 0; i < len; i++) {
                if (board[i][move] != 0) {
                    if (!basket.isEmpty() && basket.peek() == board[i][move]) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(board[i][move]);
                    }
                    board[i][move] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}