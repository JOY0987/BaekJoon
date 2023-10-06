import java.util.*;

class Solution {
    private int primeNum(int n) {
        int primeNum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                primeNum += 2;
                if (i == Math.sqrt(n)) primeNum -= 1;
            }
        }
        return primeNum;
    }
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int primeNum = primeNum(i);
            if (primeNum % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
}