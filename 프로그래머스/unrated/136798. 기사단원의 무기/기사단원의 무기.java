import java.util.*;

class Solution {
    private int number(int knight) {
        int n = 0;
        if (knight == 1) return 1;
        int route = (int) Math.sqrt(knight);
    
        for(int i = 1; i <= route; i++) {
            if (knight % i == 0) {
                n += 2;
            }
        }
        
        if (route * route == knight) {
            n--;
        }
        
        return n;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int powerOfKnight = number(i);
            if (powerOfKnight > limit) {
                powerOfKnight = power;
            }
            answer += powerOfKnight;
        }
        
        return answer;
    }
}