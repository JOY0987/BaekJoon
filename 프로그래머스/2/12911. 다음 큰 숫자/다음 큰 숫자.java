import java.util.*;

class Solution {
    private int count1(int n) {
        int cnt = 0;
        String sn = Integer.toBinaryString(n);
        for (int i = 0; i < sn.length(); i++) {
            if (sn.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
    public int solution(int n) {
        int n1 = count1(n);
        
        int answer = ++n;
        
        while (true) {
            if (n1 == count1(answer)) break;
            answer++;
        }
        
        return answer;
    }
}