import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        int yaksu = 1;
        int baesu = max;
        
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                yaksu = Math.max(i, yaksu);
            }
        }
        
        baesu = n * m / yaksu;

        // while (true) {
        //     if (baesu % n == 0 && baesu % m == 0) {
        //         break;
        //     }
        //     baesu *= 2;
        // }
        
        int[] answer = {yaksu, baesu};
        
        return answer;
    }
}