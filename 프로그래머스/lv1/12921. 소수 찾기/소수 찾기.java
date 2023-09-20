import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        // 0, 1은 소수가 아니므로 true 로 변경
        isPrime[0] = true;
        isPrime[1] = true;
        int count = 0;
        
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            // i의 배수는 소수가 아니므로 true 로 변경
            if (!isPrime[i]) {
                for (int j = 2; j * i <= n; j++) {
                    isPrime[j * i] = true;    
                }  
            }
        }
        
        for(int i = 2; i <= n; i++) {
            if (!isPrime[i]) count++;
        }
        
        return count;
    }
}