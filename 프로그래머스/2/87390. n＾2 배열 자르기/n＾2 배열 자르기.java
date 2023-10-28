import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];
        int index = 0;
        
        for (long i = left; i <= right; i++) {
            int col = (int) (i % n);
            int row = (int) (i / n);
            int value = Math.max(col, row) + 1;
            answer[index++] = value;
        }
        
        return answer;
    }
}