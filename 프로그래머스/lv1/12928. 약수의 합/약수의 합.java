import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=(int)Math.sqrt(n); i++) {
            if (i*i==n) {
                answer += i;
                continue;
            }
            for (int j=n; j>=(int)Math.sqrt(n); j--) {
                if (i*j == n) {
                    answer += (i + j);
                    break;
                }
            }
        }
        
        return answer;
    }
}